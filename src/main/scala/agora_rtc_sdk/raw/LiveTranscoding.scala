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
