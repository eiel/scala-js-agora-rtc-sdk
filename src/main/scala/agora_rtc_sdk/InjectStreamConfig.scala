package agora_rtc_sdk

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.injectstreamconfig.html
  */
trait InjectStreamConfig extends js.Object {
  val audioBitRate: js.UndefOr[Short] = js.undefined
  val audioChannels: js.UndefOr[Byte] = js.undefined
  val audioSampleRate: js.UndefOr[Int] = js.undefined
  val height: js.UndefOr[Int] = js.undefined
  val videoBitrate: js.UndefOr[Short] = js.undefined
  val videoFramerate: js.UndefOr[Byte] = js.undefined
  val videoGop: js.UndefOr[Byte] = js.undefined
  val width: js.UndefOr[Int] = js.undefined
}
