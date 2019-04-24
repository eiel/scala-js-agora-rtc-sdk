import scala.scalajs.js
import scala.scalajs.js.|

package object agora_rtc_sdk {
  type OnFailure = js.Function1[String | Double | js.Error, Unit]
  type SoundId = Short  // range [1, 10000]
  type Volume = Byte // range [0, 100]
}
