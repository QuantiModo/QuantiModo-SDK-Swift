//
// OauthAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire
import PromiseKit

extension SwaggerClientAPI {
    
    class OauthAPI: APIBase {
    
        /**
         
         Access Token
         
         - GET /oauth2/accesstoken
         - Client provides authorization token obtained from /api/oauth2/authorize to this endpoint and receives an access token. Access token can then be used to query different API endpoints of QuantiModo.
         - authMethods: [io.swagger.codegen.CodegenSecurity@6c3ca931]
         
         :param: clientId (query) Client id
         :param: clientSecret (query) Client secret
         :param: grantType (query) Grant Type can be &#39;authorization_code&#39; or &#39;refresh_token&#39;
         :param: responseType (query) Response type
         :param: scope (query) Scope
         :param: redirectUri (query) Redirect uri
         :param: state (query) State
         :param: realm (query) Realm

         :returns: Promise<Response<Void>> 
         */
        func oauth2AccesstokenGet(#clientId: String, clientSecret: String, grantType: String, responseType: String?, scope: String?, redirectUri: String?, state: String?, realm: String?) -> RequestBuilder<Void> {
            let path = "/oauth2/accesstoken"
            let url = SwaggerClientAPI.basePath + path
            
            let nillableParameters: [String:AnyObject?] = [
                "clientId": clientId,
                "clientSecret": clientSecret,
                "grantType": grantType,
                "responseType": responseType,
                "scope": scope,
                "redirectUri": redirectUri,
                "state": state,
                "realm": realm
            ]
            let parameters = APIHelper.rejectNil(nillableParameters)

            let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

            return requestBuilder(method: "GET", URLString: url, parameters: parameters, isBody: false)
        }
    
        /**
         
         Authorize
         
         - GET /oauth2/authorize
         - Ask the user if they want to allow a client applications to submit or obtain data from their QM account. It will redirect the user to the url provided by the client application with the code as a query parameter or error in case of an error.
         - authMethods: [io.swagger.codegen.CodegenSecurity@16fee932]
         
         :param: clientId (query) This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by emailing info@quantimo.do.
         :param: clientSecret (query) This is the secret for your obtained clietn_id. QuantiModo uses this to validate that only your application uses the client_id.
         :param: responseType (query) If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment.
         :param: scope (query) Scopes include basic, readmeasurements, and writemeasurements. The \&quot;basic\&quot; scope allows you to read user info (displayname, email, etc). The \&quot;readmeasurements\&quot; scope allows one to read a user&#39;s data. The \&quot;writemeasurements\&quot; scope allows you to write user data. Separate multiple scopes by a space.
         :param: redirectUri (query) The redirect URI is the URL within your client application that will receive the OAuth2 credentials.
         :param: state (query) An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI
         :param: realm (query) Name of the realm representing the users of your distributed applications and services. A \&quot;realm\&quot; attribute MAY be included to indicate the scope of protection.

         :returns: Promise<Response<Void>> 
         */
        func oauth2AuthorizeGet(#clientId: String, clientSecret: String, responseType: String, scope: String, redirectUri: String?, state: String?, realm: String?) -> RequestBuilder<Void> {
            let path = "/oauth2/authorize"
            let url = SwaggerClientAPI.basePath + path
            
            let nillableParameters: [String:AnyObject?] = [
                "clientId": clientId,
                "clientSecret": clientSecret,
                "responseType": responseType,
                "scope": scope,
                "redirectUri": redirectUri,
                "state": state,
                "realm": realm
            ]
            let parameters = APIHelper.rejectNil(nillableParameters)

            let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

            return requestBuilder(method: "GET", URLString: url, parameters: parameters, isBody: false)
        }
    
    }
}
