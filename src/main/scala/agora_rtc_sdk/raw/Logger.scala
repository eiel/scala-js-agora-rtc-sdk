package agora_rtc_sdk.raw

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/modules/agorartc.logger.html
  */
@js.native
trait Logger extends js.Object {
  val NONE: Int
  val ERROR: Int
  val WARNING: Int
  val INFO: Int
  val DEBUG: Int

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/modules/agorartc.logger.html#disablelogupload
    */
  def disableLogUpload(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/modules/agorartc.logger.html#enablelogupload
    */
  def enableLogUpload(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/modules/agorartc.logger.html#setloglevel
    * @param logLevel
    */
  def setLogLevel(logLevel: Int): Unit = js.native
}
