package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.localstreamstats.html
  */
@js.native
trait LocalStreamStats extends js.Object {
  val accessDelay: String
  val audioSendBytes: String
  val audioSendPackets: String
  val audioSendPacketsLost: String
  val videoSendBytes: String
  val videoSendFrameRate: String
  val videoSendPackets: String
  val videoSendPacketsLost: String
  val videoSendResolutionHeight: js.UndefOr[String] = js.undefined
  val videoSendResolutionWidth: js.UndefOr[String] = js.undefined
}
