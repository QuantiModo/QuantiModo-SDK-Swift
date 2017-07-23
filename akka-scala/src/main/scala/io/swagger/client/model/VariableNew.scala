/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class VariableNew (
  /* User-defined variable display name. */
  name: String,
  /* Variable category like Mood, Sleep, Physical Activity, Treatment, Symptom, etc. */
  category: String,
  /* Abbreviated name of the default unit for the variable */
  unit: String,
  /* Way to aggregate measurements over time. Options are \"MEAN\" or \"SUM\". SUM should be used for things like minutes of exercise.  If you use MEAN for exercise, then a person might exercise more minutes in one day but add separate measurements that were smaller.  So when we are doing correlational analysis, we would think that the person exercised less that day even though they exercised more.  Conversely, we must use MEAN for things such as ratings which cannot be SUMMED. */
  combinationOperation: VariableNewEnums.CombinationOperation,
  /* Parent */
  parent: String
) extends ApiModel

object VariableNewEnums {

  type CombinationOperation = CombinationOperation.Value
  object CombinationOperation extends Enumeration {
    val MEAN = Value("MEAN")
    val SUM = Value("SUM")
  }

}

