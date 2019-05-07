package agora_rtc_sdk.raw

import scala.concurrent.Future
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/globals.html
  */
@js.native
@JSImport("aroga-rtc-sdk", JSImport.Namespace)
object AgoraRTCSDK extends js.Object {
  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/globals.html#version
    */
  def VERSION: String = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/globals.html#checksystemrequirements
    */
  def checkSystemRequirements(): Boolean = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/globals.html#createclient
    */
  def createClient(mode: ClientConfig): AgoraClient = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/globals.html#createstream
    */
  def createStream(spec: StreamSpec): AgoraStream = js.native

  /**
    *  @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/globals.html#getdevices
    */
  def getDevices(callback: js.Function1[js.Array[MediaDeviceInfo], Unit]): Boolean = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/globals.html#getscreensources
    */
  def getScreenSources(callback: js.Function2[Any, Set[DesktopCaptureSource], Any]): Unit = js.native


  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/globals.html#getsupportedcodec
    */
  def getSupportedCodec(): Future[Any] = js.native

  def Logger: Logger = js.native
}
