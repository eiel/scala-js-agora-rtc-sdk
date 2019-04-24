package agora_rtc_sdk

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.remoteaudiostats.html
  */
@js.native
trait RemoteStreamStats extends js.Object {
  val accessDelay: String
  val audioReceiveBytes: String
  val audioReceiveDelay: String
  val audioReceivePackets: String
  val audioReceivePacketsLost: String
  val endToEndDelay: String
  val videoReceiveBytes: String
  val videoReceiveDecodeFrameRate: String
  val videoReceiveDelay: String
  val videoReceiveFrameRate: String
  val videoReceivePackets: String
  val videoReceivePacketsLost: String
  val videoReceivedResolutionHeight: js.UndefOr[String] = js.undefined
  val videoReceivedResolutionWidth: js.UndefOr[String] = js.undefined
}


