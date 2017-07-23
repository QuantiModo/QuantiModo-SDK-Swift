/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class Update (
  /* id */
  id: Option[Int],
  /* userId */
  userId: Int,
  /* connectorId */
  connectorId: Int,
  /* numberOfMeasurements */
  numberOfMeasurements: Int,
  /* success */
  success: Boolean,
  /* message */
  message: String,
  /* When the record was first created. Use UTC ISO 8601 \"YYYY-MM-DDThh:mm:ss\"  datetime format */
  createdAt: Option[DateTime],
  /* When the record in the database was last updated. Use UTC ISO 8601 \"YYYY-MM-DDThh:mm:ss\"  datetime format */
  updatedAt: Option[DateTime]
) extends ApiModel


