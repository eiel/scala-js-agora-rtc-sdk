package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait ClientConfigTurnServer extends js.Object {
  val forceturn: js.UndefOr[Boolean]
  val password: String
  val tcpport: js.UndefOr[String] = js.undefined
  val turnServerURL: String
  val udpport: String
  val username: String
}

object ClientConfigTurnServer {
  @inline
  def apply(forceturn: js.UndefOr[Boolean], password: String, tcpport: js.UndefOr[String] = js.undefined, turnServerURL: String, udpport: String, username: String): ClientConfigTurnServer = create(
    _forceturn = forceturn,
    _password = password,
    _tcpport = tcpport,
    _turnServerURL = turnServerURL,
    _udpport = udpport,
    _username = username,
  )

  @inline
  def create(_forceturn: js.UndefOr[Boolean], _password: String, _tcpport: js.UndefOr[String], _turnServerURL: String, _udpport: String, _username: String): ClientConfigTurnServer = new ClientConfigTurnServer {
    override val forceturn: UndefOr[Boolean] = _forceturn
    override val password: String = _password
    override val tcpport: UndefOr[String] = _tcpport
    override val turnServerURL: String = _turnServerURL
    override val udpport: String = _udpport
    override val username: String = _username
  }
}
