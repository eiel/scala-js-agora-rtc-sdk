package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait ClientLowStreamParameter extends js.Object {
  val bitrate: js.UndefOr[Int] = js.undefined
  val framerate: js.UndefOr[Int] = js.undefined
  val height: js.UndefOr[Int] = js.undefined
  val width: js.UndefOr[Int] = js.undefined
}

object ClientLowStreamParameter {
  @inline
  def apply(
             bitrate: js.UndefOr[Int] = js.undefined,
             framerate: js.UndefOr[Int] = js.undefined,
             height: js.UndefOr[Int] = js.undefined,
             width: js.UndefOr[Int] = js.undefined,
           ): ClientLowStreamParameter = create(
    _bitrate = bitrate,
    _framerate = framerate,
    _height = height,
    _width = width,
  )

  @inline
  def create(
              _bitrate: js.UndefOr[Int],
              _framerate: js.UndefOr[Int],
              _height: js.UndefOr[Int],
              _width: js.UndefOr[Int],
            ): ClientLowStreamParameter = new ClientLowStreamParameter {
    override val bitrate: UndefOr[Int] = _bitrate
    override val framerate: UndefOr[Int] = _framerate
    override val height: UndefOr[Int] = _height
    override val width: UndefOr[Int] = _width
  }
}
