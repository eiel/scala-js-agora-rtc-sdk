package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.remotevideostats.html
  */
@js.native
trait RemoteVideoStats extends js.Object {
  val End2EndDelay: js.UndefOr[String] = js.undefined
  val MuteState: js.UndefOr[String] = js.undefined
  val PacketLossRate: js.UndefOr[String] = js.undefined
  val RecvBitrate: js.UndefOr[String] = js.undefined
  val RecvResolutionHeight: js.UndefOr[String] = js.undefined
  val RecvResolutionWidth: js.UndefOr[String] = js.undefined
  val RenderFrameRate: js.UndefOr[String] = js.undefined
  val RenderResolutionHeight: js.UndefOr[String] = js.undefined
  val RenderResolutionWidth: js.UndefOr[String] = js.undefined
  val TotalFreezeTime: js.UndefOr[String] = js.undefined
  val  TotalPlayDuration: js.UndefOr[String] = js.undefined
  val TransportDelay: js.UndefOr[String] = js.undefined
}
