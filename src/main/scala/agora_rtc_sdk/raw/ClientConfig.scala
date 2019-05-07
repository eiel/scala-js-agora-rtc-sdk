package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.UndefOr

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.clientconfig.html
  */
trait ClientConfig extends js.Object {
  val codec: String
  val mode: String
  val proxyServer: js.UndefOr[String] = js.undefined
  val turnServer: js.UndefOr[ClientConfigTurnServer] = js.undefined
}

object ClientConfig {
  @inline
  def apply(
             codec: String,
             mode: String,
             proxyServer: js.UndefOr[String] = js.undefined,
             turnServer: js.UndefOr[ClientConfigTurnServer] = js.undefined,
           ): ClientConfig = create(
    _codec = codec,
    _mode = mode,
    _proxyServer = proxyServer,
    _turnServer = turnServer,
  )
  @inline
  def create(
              _codec: String,
              _mode: String,
              _proxyServer: js.UndefOr[String],
              _turnServer: js.UndefOr[ClientConfigTurnServer],
            ): ClientConfig = new ClientConfig {
    override val codec: String = _codec
    override val mode: String = _mode
    override val proxyServer: UndefOr[String] = _proxyServer
    override val turnServer: UndefOr[ClientConfigTurnServer] = _turnServer
  }
}
