/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.CommonResponse
import io.swagger.client.model.Inline_response_200
import io.swagger.client.model.Inline_response_200_1
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.model.TrackingReminder
import io.swagger.client.model.TrackingReminderDelete
import io.swagger.client.model.TrackingReminderNotificationSkip
import io.swagger.client.model.TrackingReminderNotificationSnooze
import io.swagger.client.model.TrackingReminderNotificationTrack
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object RemindersApi {

  /**
   * Specfic pending reminder instances that still need to be tracked.  
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param accessToken User&#39;s OAuth2 access token
   * @param userId User&#39;s id
   * @param variableCategoryName Limit tracking reminder notifications to a specific variable category
   * @param createdAt When the record was first created. Use UTC ISO 8601 \&quot;YYYY-MM-DDThh:mm:ss\&quot;  datetime format. Time zone should be UTC and not local.
   * @param updatedAt When the record was last updated. Use UTC ISO 8601 \&quot;YYYY-MM-DDThh:mm:ss\&quot;  datetime format. Time zone should be UTC and not local.
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order.
   */
  def v1TrackingReminderNotificationsGet(accessToken: Option[String] = None, userId: Option[Int] = None, variableCategoryName: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.GET, "https://app.quantimo.do/api", "/v1/trackingReminderNotifications", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("userId", userId)
      .withQueryParam("variableCategoryName", variableCategoryName)
      .withQueryParam("createdAt", createdAt)
      .withQueryParam("updatedAt", updatedAt)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_2](200)
        /**
   * Deletes the pending tracking reminder
   * 
   * Expected answers:
   *   code 200 : CommonResponse (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param body Id of the pending reminder to be skipped or deleted
   * @param accessToken User&#39;s OAuth2 access token
   * @param userId User&#39;s id
   */
  def v1TrackingReminderNotificationsSkipPost(body: TrackingReminderNotificationSkip, accessToken: Option[String] = None, userId: Option[Int] = None)(implicit apiKey: ApiKeyValue): ApiRequest[CommonResponse] =
    ApiRequest[CommonResponse](ApiMethods.POST, "https://app.quantimo.do/api", "/v1/trackingReminderNotifications/skip", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withBody(body)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("userId", userId)
      .withSuccessResponse[CommonResponse](200)
      .withErrorResponse[Unit](401)
        /**
   * Changes the reminder time to now plus one hour
   * 
   * Expected answers:
   *   code 200 : CommonResponse (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param body Id of the pending reminder to be snoozed
   * @param accessToken User&#39;s OAuth2 access token
   * @param userId User&#39;s id
   */
  def v1TrackingReminderNotificationsSnoozePost(body: TrackingReminderNotificationSnooze, accessToken: Option[String] = None, userId: Option[Int] = None)(implicit apiKey: ApiKeyValue): ApiRequest[CommonResponse] =
    ApiRequest[CommonResponse](ApiMethods.POST, "https://app.quantimo.do/api", "/v1/trackingReminderNotifications/snooze", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withBody(body)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("userId", userId)
      .withSuccessResponse[CommonResponse](200)
      .withErrorResponse[Unit](401)
        /**
   * Adds the default measurement for the pending tracking reminder with the reminder time as the measurment start time
   * 
   * Expected answers:
   *   code 200 : CommonResponse (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param body Id of the pending reminder to be tracked
   * @param accessToken User&#39;s OAuth2 access token
   * @param userId User&#39;s id
   */
  def v1TrackingReminderNotificationsTrackPost(body: TrackingReminderNotificationTrack, accessToken: Option[String] = None, userId: Option[Int] = None)(implicit apiKey: ApiKeyValue): ApiRequest[CommonResponse] =
    ApiRequest[CommonResponse](ApiMethods.POST, "https://app.quantimo.do/api", "/v1/trackingReminderNotifications/track", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withBody(body)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("userId", userId)
      .withSuccessResponse[CommonResponse](200)
      .withErrorResponse[Unit](401)
        /**
   * Delete previously created tracking reminder
   * 
   * Expected answers:
   *   code 200 : CommonResponse (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param body Id of reminder to be deleted
   * @param accessToken User&#39;s OAuth2 access token
   * @param userId User&#39;s id
   */
  def v1TrackingRemindersDeletePost(body: TrackingReminderDelete, accessToken: Option[String] = None, userId: Option[Int] = None)(implicit apiKey: ApiKeyValue): ApiRequest[CommonResponse] =
    ApiRequest[CommonResponse](ApiMethods.POST, "https://app.quantimo.do/api", "/v1/trackingReminders/delete", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withBody(body)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("userId", userId)
      .withSuccessResponse[CommonResponse](200)
      .withErrorResponse[Unit](401)
        /**
   * Users can be reminded to track certain variables at a specified frequency with a default value.
   * 
   * Expected answers:
   *   code 200 : Inline_response_200 (successful operation)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param accessToken User&#39;s OAuth2 access token
   * @param userId User&#39;s id
   * @param variableCategoryName Limit tracking reminders to a specific variable category
   * @param createdAt When the record was first created. Use UTC ISO 8601 \&quot;YYYY-MM-DDThh:mm:ss\&quot;  datetime format. Time zone should be UTC and not local.
   * @param updatedAt When the record was last updated. Use UTC ISO 8601 \&quot;YYYY-MM-DDThh:mm:ss\&quot;  datetime format. Time zone should be UTC and not local.
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order.
   */
  def v1TrackingRemindersGet(accessToken: Option[String] = None, userId: Option[Int] = None, variableCategoryName: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Inline_response_200] =
    ApiRequest[Inline_response_200](ApiMethods.GET, "https://app.quantimo.do/api", "/v1/trackingReminders", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("userId", userId)
      .withQueryParam("variableCategoryName", variableCategoryName)
      .withQueryParam("createdAt", createdAt)
      .withQueryParam("updatedAt", updatedAt)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200](200)
        /**
   * This is to enable users to create reminders to track a variable with a default value at a specified frequency
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_1 (successful operation)
   * 
   * Available security schemes:
   *   access_token (apiKey)
   * 
   * @param accessToken User&#39;s OAuth2 access token
   * @param userId User&#39;s id
   * @param body TrackingReminder that should be stored
   */
  def v1TrackingRemindersPost(accessToken: Option[String] = None, userId: Option[Int] = None, body: Option[TrackingReminder] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Inline_response_200_1] =
    ApiRequest[Inline_response_200_1](ApiMethods.POST, "https://app.quantimo.do/api", "/v1/trackingReminders", "application/json")
      .withApiKey(apiKey, "access_token", QUERY)
      .withBody(body)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("userId", userId)
      .withSuccessResponse[Inline_response_200_1](200)
      

}

