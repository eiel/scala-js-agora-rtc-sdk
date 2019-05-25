package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.desktopcapturersource.html
  */
trait DesktopCaptureSource extends js.Object {
  val id: String
  val name: String
  val thumbnail: Any
}

object DesktopCaptureSource {
  @inline
  def apply(
      id: String,
      name: String,
      thumbnail: Any,
  ): DesktopCaptureSource = create(
    _id = id,
    _name = name,
    _thumbnail = thumbnail,
  )

  @inline
  def create(
      _id: String,
      _name: String,
      _thumbnail: Any,
  ): DesktopCaptureSource = new DesktopCaptureSource {
    override val id: String     = _id
    override val name: String   = _name
    override val thumbnail: Any = _thumbnail
  }
}
