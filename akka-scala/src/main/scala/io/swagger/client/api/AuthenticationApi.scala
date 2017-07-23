/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object AuthenticationApi {

  /**
   *  Here is the flow for how social authentication works with a JWT Token 1.**Client:** The client needs to open popup with social auth url (&#x60;https://app/quantimo.do/api/v2/auth/social/login?provider&#x3D;{provider}&amp;redirectUrl&#x3D;{url}&#x60;) of server with &#x60;provider&#x60; and &#x60;redirectUrl&#x60;. (Url should be registered with our social apps. Facebook is fine with any redirect url with the same domain base url but Google needs exact redirect url.) 2.**Server:** The QM server will redirect user to that provider to get access. 3.**Client:** After successful or failed authentication, it will be redirected to given &#x60;redirectUrl&#x60; with code or error. 4.**Client:** The client needs to get that code and needs to send an Ajax request to server at &#x60;https://app.quantimo.do/api/v2/auth/social/authorizeCode?provider&#x3D;{provider}&amp;code&#x3D;{authorizationCode}&#x60; 5.**Server:** The QM server will authorize that code from the social connection and will authenticate user and will retrieve user info. 6.**Server:** The QM server will try to find existing user by unique identity. If the user already exists then it will login. Otherwise, it will create new user and will then login. 7.**Server:** Once user is found/created, it will return a JWT token for that user in the response.
   * 
   * Expected answers:
   *   code 200 :  (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param code Authorization code obtained from the provider.
   * @param provider The current options are &#x60;google&#x60; and &#x60;facebook&#x60;.
   */
  def v2AuthSocialAuthorizeCodeGet(code: String, provider: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://app.quantimo.do/api", "/v2/auth/social/authorizeCode", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withQueryParam("code", code)
      .withQueryParam("provider", provider)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
        /**
   * If you are using native authentication via Facebook or Google SDKs then you should use the following flow. 1.**Client:** Using native authentication via your native mobile app, get an access token using the instructions provided by the Facebook SDK (https://developers.facebook.com/docs/facebook-login) or Google (https://developers.google.com/identity/protocols/OAuth2) 2.**Client:** Send an Ajax request with provider name and access token on &#x60;https://app.quantimo.do/api/v2/auth/social/authorizeToken?provider&#x3D;{provider}&amp;accessToken&#x3D;{accessToken}&amp;refreshToken&#x3D;{refreshToken}&#x60; (&#x60;refreshToken&#x60; is optional) 3.**Server:** Server will try to get user info and will find existing user by unique identity. If user exist then it will do a login for that or it will create new user and will do login 4.**Server:** Once user is found/created, it will return a JWT token for that user in response 5.**Client:** After getting the JWT token to get a QM access token follow these steps and include your JWT token in them as a header (Authorization: Bearer **{yourJWThere}**) or as a url parameter (https://app.quantimo.do/api/v2/oauth/authorize?token&#x3D;{yourJWThere}).
   * 
   * Expected answers:
   *   code 200 :  (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param accessToken User&#39;s OAuth2 access token obtained from Google or FB native SDK
   * @param provider The current options are &#x60;google&#x60; and &#x60;facebook&#x60;.
   * @param refreshToken Optional refresh token obtained from Google or FB native SDK
   */
  def v2AuthSocialAuthorizeTokenGet(accessToken: String, provider: String, refreshToken: Option[String] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://app.quantimo.do/api", "/v2/auth/social/authorizeToken", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withQueryParam("refreshToken", refreshToken)
      .withQueryParam("accessToken", accessToken)
      .withQueryParam("provider", provider)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
        /**
   *  Here is the flow for how social authentication works with a JWT Token 1.**Client:** The client needs to open popup with social auth url (&#x60;https://app/quantimo.do/api/v2/auth/social/login?provider&#x3D;{provider}&amp;redirectUrl&#x3D;{url}&#x60;) of server with &#x60;provider&#x60; and &#x60;redirectUrl&#x60;. (Url should be registered with our social apps. Facebook and Twitter are fine with any redirect url with the same domain base url but Google needs exact redirect url.) 2.**Server:** The QM server will redirect user to that provider to get access. 3.**Client:** After successful or failed authentication, it will be redirected to given &#x60;redirectUrl&#x60; with code or error. 4.**Client:** The client needs to get that code and needs to send an Ajax request to server at &#x60;https://app.quantimo.do/api/v2/auth/social/authorizeCode?provider&#x3D;{provider}&amp;code&#x3D;{authorizationCode}&#x60; 5.**Server:** The QM server will authorize that code from the social connection and will authenticate user and will retrieve user info. 6.**Server:** The QM server will try to find existing user by unique identity. If the user already exists then it will login. Otherwise, it will create new user and will then login. 7.**Server:** Once user is found/created, it will return a JWT token for that user in the response.
   * 
   * Expected answers:
   *   code 200 :  (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param redirectUrl The redirect URI is the URL within your client application that will receive the OAuth2 credentials. Url should be registered with our social apps. Facebook and Twitter are fine with any redirect url with the same domain base url but Google needs exact redirect url.
   * @param provider The current options are &#x60;google&#x60; and &#x60;facebook&#x60;.
   */
  def v2AuthSocialLoginGet(redirectUrl: String, provider: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://app.quantimo.do/api", "/v2/auth/social/login", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withQueryParam("redirectUrl", redirectUrl)
      .withQueryParam("provider", provider)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
        /**
   * Client provides authorization token obtained from /api/v1/oauth2/authorize to this endpoint and receives an access token. Access token can then be used to query different API endpoints of QuantiModo. ### Request Access Token After user approves your access to the given scope form the https:/app.quantimo.do/v2/oauth2/authorize endpoint, you&#39;ll receive an authorization code to request an access token. This time make a &#x60;POST&#x60; request to &#x60;/api/v2/oauth/access_token&#x60; with parameters including: * &#x60;grant_type&#x60; Can be &#x60;authorization_code&#x60; or &#x60;refresh_token&#x60; since we are getting the &#x60;access_token&#x60; for the first time we don&#39;t have a &#x60;refresh_token&#x60; so this must be &#x60;authorization_code&#x60;. * &#x60;code&#x60; Authorization code you received with the previous request. * &#x60;redirect_uri&#x60; Your application&#39;s redirect url. ### Refreshing Access Token Access tokens expire at some point, to continue using our api you need to refresh them with &#x60;refresh_token&#x60; you received along with the &#x60;access_token&#x60;. To do this make a &#x60;POST&#x60; request to &#x60;/api/v2/oauth/access_token&#x60; with correct parameters, which are: * &#x60;grant_type&#x60; This time grant type must be &#x60;refresh_token&#x60; since we have it. * &#x60;clientId&#x60; Your application&#39;s client id. * &#x60;client_secret&#x60; Your application&#39;s client secret. * &#x60;refresh_token&#x60; The refresh token you received with the &#x60;access_token&#x60;. Every request you make to this endpoint will give you a new refresh token and make the old one expired. So you can keep getting new access tokens with new refresh tokens. ### Using Access Token Currently we support 2 ways for this, you can&#39;t use both at the same time. * Adding access token to the request header as &#x60;Authorization: Bearer {access_token}&#x60; * Adding to the url as a query parameter &#x60;?access_token&#x3D;{access_token}&#x60; You can read more about OAuth2 from [here](http://oauth.net/2/)
   * 
   * Expected answers:
   *   code 200 :  (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param clientId This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by emailing info@quantimo.do.
   * @param clientSecret This is the secret for your obtained clientId. QuantiModo uses this to validate that only your application uses the clientId.
   * @param grantType Grant Type can be &#39;authorization_code&#39; or &#39;refresh_token&#39;
   * @param code Authorization code you received with the previous request.
   * @param responseType If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment.
   * @param scope Scopes include basic, readmeasurements, and writemeasurements. The \&quot;basic\&quot; scope allows you to read user info (displayname, email, etc). The \&quot;readmeasurements\&quot; scope allows one to read a user&#39;s data. The \&quot;writemeasurements\&quot; scope allows you to write user data. Separate multiple scopes by a space.
   * @param redirectUri The redirect URI is the URL within your client application that will receive the OAuth2 credentials.
   * @param state An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI
   */
  def v2Oauth2AccessTokenGet(clientId: String, clientSecret: String, grantType: String, code: String, responseType: Option[String] = None, scope: Option[String] = None, redirectUri: Option[String] = None, state: Option[String] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://app.quantimo.do/api", "/v2/oauth2/access_token", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withQueryParam("clientId", clientId)
      .withQueryParam("client_secret", clientSecret)
      .withQueryParam("grant_type", grantType)
      .withQueryParam("code", code)
      .withQueryParam("response_type", responseType)
      .withQueryParam("scope", scope)
      .withQueryParam("redirect_uri", redirectUri)
      .withQueryParam("state", state)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
        /**
   * You can implement OAuth2 authentication to your application using our **OAuth2** endpoints.  You need to redirect users to &#x60;/api/v2/oauth/authorize&#x60; endpoint to get an authorization code and include the parameters below.   This page will ask the user if they want to allow a client&#39;s application to submit or obtain data from their QM account. It will redirect the user to the url provided by the client application with the code as a query parameter or error in case of an error. See the /api/v2/oauth/access_token endpoint for the next steps.
   * 
   * Expected answers:
   *   code 200 :  (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param clientId This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by creating a free application at [https://app.quantimo.do/api/v2/apps](https://app.quantimo.do/api/v2/apps).
   * @param clientSecret This is the secret for your obtained clientId. QuantiModo uses this to validate that only your application uses the clientId.  Obtain this by creating a free application at [https://app.quantimo.do/api/v2/apps](https://app.quantimo.do/api/v2/apps).
   * @param responseType If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment.
   * @param scope Scopes include basic, readmeasurements, and writemeasurements. The \&quot;basic\&quot; scope allows you to read user info (displayname, email, etc). The \&quot;readmeasurements\&quot; scope allows one to read a user&#39;s data. The \&quot;writemeasurements\&quot; scope allows you to write user data. Separate multiple scopes by a space.
   * @param redirectUri The redirect URI is the URL within your client application that will receive the OAuth2 credentials.
   * @param state An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI
   */
  def v2OauthAuthorizeGet(clientId: String, clientSecret: String, responseType: String, scope: String, redirectUri: Option[String] = None, state: Option[String] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://app.quantimo.do/api", "/v2/oauth/authorize", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withQueryParam("clientId", clientId)
      .withQueryParam("client_secret", clientSecret)
      .withQueryParam("response_type", responseType)
      .withQueryParam("scope", scope)
      .withQueryParam("redirect_uri", redirectUri)
      .withQueryParam("state", state)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
      

}

