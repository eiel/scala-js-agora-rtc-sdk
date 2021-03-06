package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.annotation.JSBracketAccess

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.remoteaudiostatsmap.html
  */
@js.native
@JSBracketAccess
trait RemoteAudioStatsMap extends js.Object {
  def apply(uid: String): RemoteAudioStats = js.native
}
