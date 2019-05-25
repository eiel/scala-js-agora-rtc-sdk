package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.UndefOr

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.streamspec.html
  */
trait StreamSpec extends js.Object {
  val audio: Boolean
  val audioProcessing: js.UndefOr[StreamSpecAudioProcessing] = js.undefined // default === true
  val audioSource: js.UndefOr[MediaStreamTrack]
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
  def apply(
      audio: Boolean,
      audioProcessing: js.UndefOr[StreamSpecAudioProcessing] = js.undefined, // default === true
      audioSource: js.UndefOr[MediaStreamTrack] = js.undefined,
      cameraId: js.UndefOr[String] = js.undefined,
      extensionId: js.UndefOr[String] = js.undefined,
      mediaSource: js.UndefOr[String] = js.undefined,
      microphoneId: js.UndefOr[String] = js.undefined,
      mirror: js.UndefOr[Boolean] = js.undefined,
      screen: Boolean,
      streamID: Double,
      video: Boolean,
      videoSource: js.UndefOr[MediaStreamTrack] = js.undefined,
  ): StreamSpec = create(
    _audio = audio,
    _audioProcessing = audioProcessing,
    _audioSource = audioSource,
    _cameraId = cameraId,
    _extensionId = extensionId,
    _mediaSource = mediaSource,
    _microphoneId = microphoneId,
    _mirror = mirror,
    _screen = screen,
    _streamID = streamID,
    _video = video,
    _videoSource = videoSource,
  )

  @inline
  def create(
      _audio: Boolean,
      _audioProcessing: js.UndefOr[StreamSpecAudioProcessing] = js.undefined, // default === true
      _audioSource: js.UndefOr[MediaStreamTrack],
      _cameraId: js.UndefOr[String] = js.undefined,
      _extensionId: js.UndefOr[String] = js.undefined,
      _mediaSource: js.UndefOr[String] = js.undefined,
      _microphoneId: js.UndefOr[String] = js.undefined,
      _mirror: js.UndefOr[Boolean] = js.undefined,
      _screen: Boolean,
      _streamID: Double,
      _video: Boolean,
      _videoSource: js.UndefOr[MediaStreamTrack] = js.undefined,
  ): StreamSpec = new StreamSpec {
    override val audio: Boolean                                      = _audio
    override val audioProcessing: UndefOr[StreamSpecAudioProcessing] = _audioProcessing
    override val audioSource: UndefOr[MediaStreamTrack]              = _audioSource
    override val cameraId: UndefOr[String]                           = _cameraId
    override val extensionId: UndefOr[String]                        = _extensionId
    override val mediaSource: UndefOr[String]                        = _mediaSource
    override val microphoneId: UndefOr[String]                       = _microphoneId
    override val mirror: UndefOr[Boolean]                            = _mirror
    override val screen: Boolean                                     = _screen
    override val streamID: Double                                    = _streamID
    override val video: Boolean                                      = _video
    override val videoSource: UndefOr[MediaStreamTrack]              = _videoSource
  }
}

trait StreamSpecAudioProcessing extends js.Object {
  val AEC: js.UndefOr[Boolean] = js.undefined
  val AGC: js.UndefOr[Boolean] = js.undefined
  val ANC: js.UndefOr[Boolean] = js.undefined
}

object StreamSpecAudioProcessing {
  @inline
  def apply(
      AEC: js.UndefOr[Boolean] = js.undefined,
      AGC: js.UndefOr[Boolean] = js.undefined,
      ANC: js.UndefOr[Boolean] = js.undefined,
  ): StreamSpecAudioProcessing = create(
    _AEC = AEC,
    _AGC = AGC,
    _ANC = ANC,
  )

  @inline
  def create(
      _AEC: js.UndefOr[Boolean] = js.undefined,
      _AGC: js.UndefOr[Boolean] = js.undefined,
      _ANC: js.UndefOr[Boolean] = js.undefined,
  ): StreamSpecAudioProcessing = new StreamSpecAudioProcessing {
    override val AEC: UndefOr[Boolean] = _AEC
    override val AGC: UndefOr[Boolean] = _AGC
    override val ANC: UndefOr[Boolean] = _ANC
  }
}
