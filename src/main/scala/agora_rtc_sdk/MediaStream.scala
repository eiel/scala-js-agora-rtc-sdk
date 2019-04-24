package agora_rtc_sdk

import scala.scalajs.js

/**
  * https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.mediastream.html
  */
@js.native
trait MediaStream extends js.Object {
  val activate: Boolean
  val id: String
}
