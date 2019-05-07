package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.annotation.JSBracketAccess

/**
  * https://docs.agora.io/en/Video/API%20Reference/web/v2.5/interfaces/agorartc.localaudiostatsmap.html
  */
@js.native
@JSBracketAccess
trait LocalAudioStatsMap extends js.Object {
  def apply(uid: String): LocalAudioStats = js.native
}
