package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.transcodinguser.html
  */
trait LiveTranscodingUsers extends js.Object {
  val alpha: Double
  val height: Int
  val uid: Int | String
  val width: Int
  val x: Int
  val y: Int
  val zOrder: Byte
}
