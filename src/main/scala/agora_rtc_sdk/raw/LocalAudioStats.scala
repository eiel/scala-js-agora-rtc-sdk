package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Video/API%20Reference/web/v2.6.1/interfaces/agorartc.localaudiostats.html
  */
@js.native
trait LocalAudioStats extends js.Object {
  val CodecType: js.UndefOr[compat.AudioCodecType] = js.undefined
  val MuteState: js.UndefOr[compat.MuteState]      = js.undefined
  val RecordingLevel: js.UndefOr[String]           = js.undefined
  val SamplingRate: js.UndefOr[String]             = js.undefined
  val SendBitrate: js.UndefOr[String]              = js.undefined
  val SendLevel: js.UndefOr[String]                = js.undefined
}
