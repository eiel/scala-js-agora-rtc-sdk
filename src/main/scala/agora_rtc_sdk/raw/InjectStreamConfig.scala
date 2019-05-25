package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.UndefOr

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.injectstreamconfig.html
  */
trait InjectStreamConfig extends js.Object {
  val audioBitRate: js.UndefOr[Short]  = js.undefined
  val audioChannels: js.UndefOr[Byte]  = js.undefined
  val audioSampleRate: js.UndefOr[Int] = js.undefined
  val height: js.UndefOr[Int]          = js.undefined
  val videoBitrate: js.UndefOr[Short]  = js.undefined
  val videoFramerate: js.UndefOr[Byte] = js.undefined
  val videoGop: js.UndefOr[Byte]       = js.undefined
  val width: js.UndefOr[Int]           = js.undefined
}

object InjectStreamConfig {
  @inline
  def apply(
      audioBitRate: js.UndefOr[Short] = js.undefined,
      audioChannels: js.UndefOr[Byte] = js.undefined,
      audioSampleRate: js.UndefOr[Int] = js.undefined,
      height: js.UndefOr[Int] = js.undefined,
      videoBitrate: js.UndefOr[Short] = js.undefined,
      videoFramerate: js.UndefOr[Byte] = js.undefined,
      videoGop: js.UndefOr[Byte] = js.undefined,
      width: js.UndefOr[Int] = js.undefined,
  ): InjectStreamConfig = create(
    _audioBitRate = audioBitRate,
    _audioChannels = audioChannels,
    _audioSampleRate = audioSampleRate,
    _height = height,
    _videoBitrate = videoBitrate,
    _videoFramerate = videoFramerate,
    _videoGop = videoGop,
    _width = width,
  )

  @inline
  def create(
      _audioBitRate: js.UndefOr[Short],
      _audioChannels: js.UndefOr[Byte],
      _audioSampleRate: js.UndefOr[Int],
      _height: js.UndefOr[Int],
      _videoBitrate: js.UndefOr[Short],
      _videoFramerate: js.UndefOr[Byte],
      _videoGop: js.UndefOr[Byte],
      _width: js.UndefOr[Int],
  ): InjectStreamConfig = new InjectStreamConfig {
    override val audioBitRate: UndefOr[SoundId]  = _audioBitRate
    override val audioChannels: UndefOr[Volume]  = _audioChannels
    override val audioSampleRate: UndefOr[Int]   = _audioSampleRate
    override val height: UndefOr[Int]            = _height
    override val videoBitrate: UndefOr[SoundId]  = _videoBitrate
    override val videoFramerate: UndefOr[Volume] = _videoFramerate
    override val videoGop: UndefOr[Volume]       = _videoGop
    override val width: UndefOr[Int]             = _width
  }
}
