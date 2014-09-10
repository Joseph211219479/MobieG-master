package people

import play.api.libs.json.Json

/**
 * Created by alex on 2014/09/02.
 */
case class FacilitatorType(id:String, name:String, description:String, facilitatorId:String)

object FacilitatorType{
  implicit lazy val facilitatortypefmt = Json.format[FacilitatorType]
}
