package agora_rtc_sdk

import scala.scalajs.js

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.clientconfig.html
  */
trait ClientConfig extends js.Object {
  val codec: String
  val mode: String
  val proxyServer: js.UndefOr[String] = js.undefined
  val turnServer: js.UndefOr[TurnServer] = js.undefined

  trait TurnServer {
    val forceturn: js.UndefOr[Boolean] = js.undefined
    val password: String
    val tcpport: js.UndefOr[String] = js.undefined
    val turnServerURL: String
    val udpport: String
    val username: String
  }
}

