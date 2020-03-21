package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.mediadeviceinfo.html
  */
@js.native
trait MediaDeviceInfo extends js.Object {
  val deviceId: String
  val label: String
  val kind: compat.MediaDeviceInfoKind
}
