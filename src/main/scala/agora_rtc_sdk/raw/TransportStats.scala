package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.transportstats.html
  */
@native
trait TransportStats extends js.Object {
  val NetworkType: js.UndefOr[compat.NetworkType]    = js.undefined
  val RTT: js.UndefOr[String]                        = js.undefined
  val OutgoingAvailableBandwidth: js.UndefOr[String] = js.undefined
}
