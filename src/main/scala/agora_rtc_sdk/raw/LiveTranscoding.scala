package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Video/API%20Reference/web/v2.6.1/interfaces/agorartc.livetranscoding.html
  */
trait LiveTranscoding extends js.Object {
  val audioBitRate: Short
  val audioChannels: Byte
  val audioSampleRate: Int
  val backgroundColor: Int
  val height: Int
  val lowLatency: Boolean
  val transcodingUsers: LiveTranscodingUsers
  val userCount: Int
  val videoBitrate: Short
  val videoCodecProfile: Short
  val videoFramerate: Byte
  val videoGop: Byte
  val width: Int
}

object LiveTranscoding {
  @inline
  def apply(
             audioBitRate: Short,
             audioChannels: Byte,
             audioSampleRate: Int,
             backgroundColor: Int,
             height: Int,
             lowLatency: Boolean,
             transcodingUsers: LiveTranscodingUsers,
             userCount: Int,
             videoBitrate: Short,
             videoCodecProfile: Short,
             videoFramerate: Byte,
             videoGop: Byte,
             width: Int,
           ): LiveTranscoding = create(
    _audioBitRate = audioBitRate,
    _audioChannels = audioChannels,
    _audioSampleRate = audioSampleRate,
    _backgroundColor = backgroundColor,
    _height = height,
    _lowLatency = lowLatency,
    _transcodingUsers = transcodingUsers,
    _userCount = userCount,
    _videoBitrate = videoBitrate,
    _videoCodecProfile = videoCodecProfile,
    _videoFramerate = videoFramerate,
    _videoGop = videoGop,
    _width = width,
  )

  @inline
  def create(
              _audioBitRate: Short,
              _audioChannels: Byte,
              _audioSampleRate: Int,
              _backgroundColor: Int,
              _height: Int,
              _lowLatency: Boolean,
              _transcodingUsers: LiveTranscodingUsers,
              _userCount: Int,
              _videoBitrate: Short,
              _videoCodecProfile: Short,
              _videoFramerate: Byte,
              _videoGop: Byte,
              _width: Int,
            ): LiveTranscoding = new LiveTranscoding {
    override val audioBitRate: SoundId = _audioBitRate
    override val audioChannels: Volume = _audioChannels
    override val audioSampleRate: Int = _audioSampleRate
    override val backgroundColor: Int = _backgroundColor
    override val height: Int = _height
    override val lowLatency: Boolean = _lowLatency
    override val transcodingUsers: LiveTranscodingUsers = _transcodingUsers
    override val userCount: Int = _userCount
    override val videoBitrate: SoundId = _videoBitrate
    override val videoCodecProfile: SoundId = _videoCodecProfile
    override val videoFramerate: Volume = _videoFramerate
    override val videoGop: Volume = _videoGop
    override val width: Int = _width
  }
}