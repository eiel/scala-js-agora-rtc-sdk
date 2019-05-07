package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.UndefOr

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.streamspec.html
  */
trait StreamSpec extends js.Object {
  val audio: Boolean
  val audioProcessing: js.UndefOr[StreamSpecAudioProcessing] = js.undefined // default === true
  val audioSource: js.Object
  val cameraId: js.UndefOr[String]
  val extensionId: js.UndefOr[String]
  val mediaSource: js.UndefOr[String]
  val microphoneId: js.UndefOr[String]
  val mirror: js.UndefOr[Boolean] = js.undefined
  val screen: Boolean
  // CWのuserIdを渡す
  // Stringにして渡すとremote mute eventが飛んでこなくなるので注意
  val streamID: Double
  val video: Boolean
  val videoSource: js.UndefOr[MediaStreamTrack] = js.undefined
}

object StreamSpec {
  @inline
  def create(
              _audio: Boolean,
              _audioProcessing: js.UndefOr[StreamSpecAudioProcessing] = js.undefined, // default === true
              _audioSource: js.Object,
              _cameraId: js.UndefOr[String],
              _extensionId: js.UndefOr[String],
              _mediaSource: js.UndefOr[String],
              _microphoneId: js.UndefOr[String],
              _mirror: js.UndefOr[Boolean] = js.undefined,
              _screen: Boolean,
              _streamID: Double,
              _video: Boolean,
              _videoSource: js.UndefOr[MediaStreamTrack] = js.undefined,
            ): StreamSpec = new StreamSpec {
    override val audio: Boolean = _audio
    override val audioProcessing: UndefOr[StreamSpecAudioProcessing] = _audioProcessing
    override val audioSource: js.Object = _audioSource
    override val cameraId: UndefOr[String] = _cameraId
    override val extensionId: UndefOr[String] = _extensionId
    override val mediaSource: UndefOr[String] = _mediaSource
    override val microphoneId: UndefOr[String] = _microphoneId
    override val mirror: UndefOr[Boolean] = _mirror
    override val screen: Boolean = _screen
    override val streamID: Double = _streamID
    override val video: Boolean = _video
    override val videoSource: UndefOr[MediaStreamTrack] = _videoSource
  }
}

trait StreamSpecAudioProcessing extends js.Object {
  val AEC: js.UndefOr[Boolean] = js.undefined
  val AGC: js.UndefOr[Boolean] = js.undefined
  val ANC: js.UndefOr[Boolean] = js.undefined
}
