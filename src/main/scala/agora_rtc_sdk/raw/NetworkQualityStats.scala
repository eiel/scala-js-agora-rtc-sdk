package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.networkqualitystats.html
  */
@js.native
trait NetworkQualityStats extends js.Object {
  val downlinkNetworkQuality: js.UndefOr[String] = js.undefined
  val uplinkNetworkQuality: js.UndefOr[String] = js.undefined
}
