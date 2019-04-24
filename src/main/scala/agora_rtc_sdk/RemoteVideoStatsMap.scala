package agora_rtc_sdk

import scala.scalajs.js
import scala.scalajs.js.annotation.JSBracketAccess

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.remotevideostatsmap.html
  */
@js.native
@JSBracketAccess
trait RemoteVideoStatsMap extends js.Object {
  def apply(uid: String): RemoteVideoStats = js.native
}

