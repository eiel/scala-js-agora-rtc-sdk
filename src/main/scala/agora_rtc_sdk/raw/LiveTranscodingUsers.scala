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

object LiveTranscodingUsers {
  @inline
  def apply(
             alpha: Double,
             height: Int,
             uid: Int | String,
             width: Int,
             x: Int,
             y: Int,
             zOrder: Byte,
           ): LiveTranscodingUsers = create(
    _alpha = alpha,
    _height = height,
    _uid = uid,
    _width = width,
    _x = x,
    _y = y,
    _zOrder = zOrder,
  )

  @inline
  def create(
              _alpha: Double,
              _height: Int,
              _uid: Int | String,
              _width: Int,
              _x: Int,
              _y: Int,
              _zOrder: Byte,
            ): LiveTranscodingUsers = new LiveTranscodingUsers {
    override val alpha: Double = _alpha
    override val height: Int = _height
    override val uid: Int | String = _uid
    override val width: Int = _width
    override val x: Int = _x
    override val y: Int = _y
    override val zOrder: Volume = _zOrder
  }
}
