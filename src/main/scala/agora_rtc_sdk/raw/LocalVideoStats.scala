package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.localvideostats.html
  */
@js.native
trait LocalVideoStats extends js.Object {
  val CaptureFrameRate: js.UndefOr[String]        = js.undefined
  val CaptureResolutionHeight: js.UndefOr[String] = js.undefined
  val CaptureResolutionWidth: js.UndefOr[String]  = js.undefined
  val EncodeDelay: js.UndefOr[String]             = js.undefined
  val MuteState: js.UndefOr[String]               = js.undefined
  val SendBitrate: js.UndefOr[String]             = js.undefined
  val SendFrameRate: js.UndefOr[String]           = js.undefined
  val SendResolutionHeight: js.UndefOr[String]    = js.undefined
  val SendResolutionWidth: js.UndefOr[String]     = js.undefined
  val TargetSendBitrate: js.UndefOr[String]       = js.undefined
  val TotalDuration: js.UndefOr[String]           = js.undefined
  val TotalFreezeTime: js.UndefOr[String]         = js.undefined
}
