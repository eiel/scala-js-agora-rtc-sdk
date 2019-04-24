package agora_rtc_sdk

import scala.scalajs.js
import scala.scalajs.js.annotation.JSBracketAccess

/**
  * https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.localvideostatsmap.html
  */
@js.native
@JSBracketAccess
trait LocalVideoStatsMap extends js.Object {
  def apply(uid: String): LocalVideoStats = js.native
}


