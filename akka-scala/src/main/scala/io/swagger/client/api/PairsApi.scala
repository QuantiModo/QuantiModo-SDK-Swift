/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.Pairs
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object PairsApi {

  /**
   * Pairs cause measurements with effect measurements grouped over the duration of action after the onset delay.
   * 
   * Expected answers:
   *   code 200 : Seq[Pairs] (Successful operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param cause Original variable name for the explanatory or independent variable
   * @param effect Original variable name for the outcome or dependent variable
   * @param accessToken User&#39;s OAuth2 access token
   * @param userId User&#39;s id
   * @param causeSource Name of data source that the cause measurements should come from
   * @param causeUnit Abbreviated name for the unit cause measurements to be returned in
   * @param delay The amount of time in seconds that elapses after the predictor/stimulus event before the outcome as perceived by a self-tracker is known as the “onset delay”. For example, the “onset delay” between the time a person takes an aspirin (predictor/stimulus event) and the time a person perceives a change in their headache severity (outcome) is approximately 30 minutes.
   * @param duration The amount of time over which a predictor/stimulus event can exert an observable influence on an outcome variable’s value. For instance, aspirin (stimulus/predictor) typically decreases headache severity for approximately four hours (duration of action) following the onset delay.
   * @param effectSource Name of data source that the effectmeasurements should come from
   * @param effectUnit Abbreviated name for the unit effect measurements to be returned in
   * @param endTime The most recent date (in epoch time) for which we should return measurements
   * @param startTime The earliest date (in epoch time) for which we should return measurements
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.
   * @param offset Since the maximum limit is 200 records, to get more than that you&#39;ll have to make multiple API calls and page through the results. To retrieve all the data, you can iterate through data by using the &#x60;limit&#x60; and &#x60;offset&#x60; query parameters.  For example, if you want to retrieve data from 61-80 then you can use a query with the following parameters, &#x60;imit&#x3D;20&amp;offset&#x3D;60&#x60;.
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order.
   */
  def v1PairsCsvGet(cause: String, effect: String, accessToken: Option[String] = None, userId: Option[Int] = None, causeSource: Option[String] = None, causeUnit: Option[String] = None, delay: Option[String] = None, duration: Option[String] = None, effectSource: Option[String] = None, effectUnit: Option[String] = None, endTime: Option[String] = None, startTime: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[Int] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Seq[Pairs]] =
    ApiRequest[Seq[Pairs]](ApiMethods.GET, "https://app.quantimo.do/api", "/v1/pairsCsv", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("userId", userId)
      .withQueryParam("cause", cause)
      .withQueryParam("causeSource", causeSource)
      .withQueryParam("causeUnit", causeUnit)
      .withQueryParam("delay", delay)
      .withQueryParam("duration", duration)
      .withQueryParam("effect", effect)
      .withQueryParam("effectSource", effectSource)
      .withQueryParam("effectUnit", effectUnit)
      .withQueryParam("endTime", endTime)
      .withQueryParam("startTime", startTime)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Seq[Pairs]](200)
      .withErrorResponse[Unit](401)
        /**
   * Pairs cause measurements with effect measurements grouped over the duration of action after the onset delay.
   * 
   * Expected answers:
   *   code 200 : Seq[Pairs] (Successful operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param cause Original variable name for the explanatory or independent variable
   * @param effect Original variable name for the outcome or dependent variable
   * @param accessToken User&#39;s OAuth2 access token
   * @param userId User&#39;s id
   * @param causeSource Name of data source that the cause measurements should come from
   * @param causeUnit Abbreviated name for the unit cause measurements to be returned in
   * @param delay The amount of time in seconds that elapses after the predictor/stimulus event before the outcome as perceived by a self-tracker is known as the “onset delay”. For example, the “onset delay” between the time a person takes an aspirin (predictor/stimulus event) and the time a person perceives a change in their headache severity (outcome) is approximately 30 minutes.
   * @param duration The amount of time over which a predictor/stimulus event can exert an observable influence on an outcome variable’s value. For instance, aspirin (stimulus/predictor) typically decreases headache severity for approximately four hours (duration of action) following the onset delay.
   * @param effectSource Name of data source that the effectmeasurements should come from
   * @param effectUnit Abbreviated name for the unit effect measurements to be returned in
   * @param endTime The most recent date (in epoch time) for which we should return measurements
   * @param startTime The earliest date (in epoch time) for which we should return measurements
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.
   * @param offset Since the maximum limit is 200 records, to get more than that you&#39;ll have to make multiple API calls and page through the results. To retrieve all the data, you can iterate through data by using the &#x60;limit&#x60; and &#x60;offset&#x60; query parameters.  For example, if you want to retrieve data from 61-80 then you can use a query with the following parameters, &#x60;imit&#x3D;20&amp;offset&#x3D;60&#x60;.
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order.
   */
  def v1PairsGet(cause: String, effect: String, accessToken: Option[String] = None, userId: Option[Int] = None, causeSource: Option[String] = None, causeUnit: Option[String] = None, delay: Option[String] = None, duration: Option[String] = None, effectSource: Option[String] = None, effectUnit: Option[String] = None, endTime: Option[String] = None, startTime: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[Int] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Seq[Pairs]] =
    ApiRequest[Seq[Pairs]](ApiMethods.GET, "https://app.quantimo.do/api", "/v1/pairs", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("userId", userId)
      .withQueryParam("cause", cause)
      .withQueryParam("causeSource", causeSource)
      .withQueryParam("causeUnit", causeUnit)
      .withQueryParam("delay", delay)
      .withQueryParam("duration", duration)
      .withQueryParam("effect", effect)
      .withQueryParam("effectSource", effectSource)
      .withQueryParam("effectUnit", effectUnit)
      .withQueryParam("endTime", endTime)
      .withQueryParam("startTime", startTime)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Seq[Pairs]](200)
      .withErrorResponse[Unit](401)
      

}

