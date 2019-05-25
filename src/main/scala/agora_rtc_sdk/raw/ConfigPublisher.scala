package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait ConfigPublisher extends js.Object {
  val width: js.UndefOr[Int]           = js.undefined
  val height: js.UndefOr[Int]          = js.undefined
  val framerate: js.UndefOr[Int]       = js.undefined
  val bitrate: js.UndefOr[Int]         = js.undefined
  val publisherUrl: js.UndefOr[String] = js.undefined
}

object ConfigPublisher {
  @inline
  def apply(
      width: js.UndefOr[Int] = js.undefined,
      height: js.UndefOr[Int] = js.undefined,
      framerate: js.UndefOr[Int] = js.undefined,
      bitrate: js.UndefOr[Int] = js.undefined,
      publisherUrl: js.UndefOr[String] = js.undefined,
  ): ConfigPublisher = create(
    _bitrate = bitrate,
    _framerate = framerate,
    _publisherUrl = publisherUrl,
    _height = height,
    _width = width,
  )

  @inline
  def create(
      _width: js.UndefOr[Int] = js.undefined,
      _height: js.UndefOr[Int] = js.undefined,
      _framerate: js.UndefOr[Int] = js.undefined,
      _bitrate: js.UndefOr[Int] = js.undefined,
      _publisherUrl: js.UndefOr[String] = js.undefined,
  ): ConfigPublisher = new ConfigPublisher {
    override val bitrate: UndefOr[Int]         = _bitrate
    override val framerate: UndefOr[Int]       = _framerate
    override val height: UndefOr[Int]          = _height
    override val publisherUrl: UndefOr[String] = _publisherUrl
    override val width: UndefOr[Int]           = _width
  }
}
