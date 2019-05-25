package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait SubscribeOptions {
  val audio: js.UndefOr[Boolean] = js.undefined
  val video: js.UndefOr[Boolean] = js.undefined
}

object SubscribeOptions {
  @inline
  def apply(audio: js.UndefOr[Boolean], video: js.UndefOr[Boolean]): SubscribeOptions =
    create(_audio = audio, _video = video)

  @inline
  private[this] def create(_audio: js.UndefOr[Boolean], _video: js.UndefOr[Boolean]): SubscribeOptions =
    new SubscribeOptions {
      override val audio: UndefOr[Boolean] = _audio
      override val video: UndefOr[Boolean] = _video
    }
}
