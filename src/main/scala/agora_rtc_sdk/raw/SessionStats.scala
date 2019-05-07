package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.sessionstats.html
  */
@js.native
trait SessionStats extends js.Object {
  val Duration: String
  val RecvBitrate: String
  val RecvBytes: String
  val SendBitrate: String
  val SendByte: String
  val UserCount: String
}
