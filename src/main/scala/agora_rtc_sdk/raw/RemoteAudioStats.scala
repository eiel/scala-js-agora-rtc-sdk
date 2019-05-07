package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.remoteaudiostats.html
  */
@js.native
trait RemoteAudioStats extends js.Object {
  val CodecType: js.UndefOr[String] = js.undefined
  val End2EndDelay: js.UndefOr[String] = js.undefined
  val MuteState: js.UndefOr[String] = js.undefined
  val PacketLossRate: js.UndefOr[String] = js.undefined
  val RecvBitrate: js.UndefOr[String] = js.undefined
  val RecvLevel: js.UndefOr[String] = js.undefined
  val TransportDelay: js.UndefOr[String] = js.undefined
}
