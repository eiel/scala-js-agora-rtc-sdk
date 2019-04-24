package agora_rtc_sdk

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.streamspec.html
  */
trait StreamSpec extends js.Object {
  val audio: Boolean
  var audioProcessing: js.UndefOr[StreamSpecAudioProcessing] = js.undefined // default === true
  val audioSource: js.Object
  var cameraId: js.UndefOr[String]
  var extensionId: js.UndefOr[String]
  var mediaSource: js.UndefOr[String]
  var microphoneId: js.UndefOr[String]
  var mirror: js.UndefOr[Boolean] = js.undefined
  val screen: Boolean
  // CWのuserIdを渡す
  // Stringにして渡すとremote mute eventが飛んでこなくなるので注意
  val streamID: Double
  val video: Boolean
  val videoSource: js.UndefOr[MediaStreamTrack] = js.undefined

  trait StreamSpecAudioProcessing extends js.Object {
    val AEC: js.UndefOr[Boolean] = js.undefined
    val AGC: js.UndefOr[Boolean] = js.undefined
    val ANC: js.UndefOr[Boolean] = js.undefined
  }
}
