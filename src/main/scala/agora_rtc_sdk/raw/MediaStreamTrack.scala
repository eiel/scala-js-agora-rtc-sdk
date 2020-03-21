package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.mediastreamtrack.html
  */
@js.native
trait MediaStreamTrack extends js.Object {
  val kind: compat.MediaStreamTrackKind
}
