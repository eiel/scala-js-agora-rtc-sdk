package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html
  */
@js.native
trait AgoraClient extends js.Object {
  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#addinjectstreamurl
    */
  def addInjectStreamUrl(url: String, config: InjectStreamConfig): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#configpublisher
    */
  @deprecated("use startLiveStreaming and setLiveTranscoding anhttps://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#configpublisherd stopLiveStreaming", "")
  def configPublisher(config: ConfigPublisher): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#disabledualstream
    */
  def disableDualStream(): Unit = js.native

  def disableDualStream(onSuccess: js.Function0[Unit]): Unit = js.native

  def disableDualStream(onSuccess: js.Function0[Unit], onFailure: js.Function1[String | Double | js.Error, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#enableaudiovolumeindicator
    */
  def enableAudioVolumeIndicator(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#enabledualstream
    */
  def enableDualStream(): Unit = js.native

  def enableDualStream(onSuccess: js.Function0[Unit]): Unit = js.native

  def enableDualStream(onSuccess: js.Function0[Unit], onFailure: js.Function1[String | Double | js.Error, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#getcameras
    */
  def getCameras(callback: js.Function1[js.Array[MediaDeviceInfo], Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#configpublisher
    */
  def getConnectionState(): String = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#getlocalaudiostats
    */
  def getLocalAudioStats(callback: js.Function1[LocalAudioStatsMap, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#getlocalvideostats
    */
  def getLocalVideoStats(callback: js.Function1[LocalVideoStatsMap, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#getnetworkstats
    */
  def getNetworkStats(callback: js.Function1[NetworkStats, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#getplayoutdevices
    */
  def getPlayoutDevices(callback: js.Function1[MediaDeviceInfo, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#getrecordingdevices
    */
  def getRecordingDevices(callback: js.Function1[MediaDeviceInfo, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#getremoteaudiostats
    */
  def getRemoteAudioStats(callback: js.Function1[RemoteAudioStatsMap, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#getremotevideostats
    */
  def getRemoteVideoStats(callback: js.Function1[RemoteVideoStatsMap, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#getsessionstats
    */
  def getSessionStats(callbac: js.Function1[SessionStats, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#getsystemstats
    */
  def getSystemStats(callback: js.Function1[SystemStats, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#gettransportstats
    */
  def getTransportStats(callback: js.Function1[TransportStats, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html
    */
  def init(appId: String): Unit = js.native

  def init(appId: String, onSuccess: js.Function0[Unit]): Unit = js.native

  def init(appId: String, onSuccess: js.Function0[Unit], onFailure: OnFailure): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#join
    */
  def join(tokenOrKey: String, channel: String, uid: String | Double): Unit = js.native

  def join(tokenOrKey: String, channel: String, uid: String | Double, onSuccess: js.Function1[String | Int, Unit]): Unit = js.native

  def join(tokenOrKey: String, channel: String, uid: String | Double, onSuccess: js.Function1[String | Int, Unit], onFailure: js.Function1[String | Double | js.Error, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#leave
    */
  def leave(): Unit = js.native

  def leave(onSuccess: js.Function0[Unit]): Unit = js.native

  def leave(onSuccess: js.Function0[Unit], onFailure: OnFailure): Unit = js.native

  /**
    * @param event "stream-published" | "stream-added" | "stream-removed" | "stream-subscribed" | "peer-leave" | "mute-audio" | "unmute-audio" | "mute-video" | "unmute-video" | "client-banned" | "active-speaker" | "error"
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#on
    */
  def on(event: String, callback: js.Function1[js.Any, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#publish
    */
  def publish(stream: AgoraStream): Unit = js.native

  def publish(stream: AgoraStream, onFailure: OnFailure): Unit = js.native


  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#removeinjectstreamurl
    */
  def removeInjectStreamUrl(url: String): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#renewchannelkey
    */
  def renewChannelKey(channelKey: String): Unit = js.native

  def renewChannelKey(channelKey: String, onSuccess: js.Function0[Unit]): Unit = js.native

  def renewChannelKey(channelKey: String, onSuccess: js.Function0[Unit], onFailure: OnFailure): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#renewchannelkey
    */
  def renewToken(token: String): Unit = js.native

  /**
    * @param role "audience" | "host"
    * @param callback
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#renewchannelkey
    */
  def secClientRole(role: String, callback: js.Function1[Any, Unit]): Unit = js.native

  /**
    * @param encryptionMode "aes-128-xts" | "aes-256-xts" | "aes-128-ecb"
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#setencryptionmode
    */
  def setEncryptionMode(encryptionMode: String): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#setencryptionsecret
    */
  def setEncryptionSecret(password: String): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#setencryptionsecret[j
    */
  def setLiveTranscoding(coding: LiveTranscoding): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#setlowstreamparameter
    */
  def setLowStreamParameter(param: ClientLowStreamParameter): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#setproxyserver
    */
  def setProxyServer(proxyServer: String): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#setremotevideostreamtype
    */
  def setRemoteVideoStreamType(stream: AgoraStream, streamType: Short): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#setremotevideostreamtype
    */
  def setStreamFallbackOption(stream: AgoraStream, fallbackType: Short): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#setturnserver
    */
  def setTurnServer(config: ClientConfigTurnServer)

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#startlivestreaming
    */
  def startLiveStreaming(url: String): Unit = js.native

  def startLiveStreaming(url: String, enableTranscoding: Boolean): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#stoplivestreaming
    */
  def stopLiveStreaming(url: String): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#subscribe
    */
  def subscribe(stream: AgoraStream): Unit = js.native

  def subscribe(stream: AgoraStream, options: SubscribeOptions): Unit = js.native

  def subscribe(stream: AgoraStream, options: SubscribeOptions, onFailure: OnFailure): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#unpublish
    */
  def unpublish(stream: AgoraStream): Unit = js.native

  def unpublish(stream: AgoraStream, onFailure: OnFailure): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.client.html#unsubscribe
    * @param stream
    */
  def unsubscribe(stream: AgoraStream): Unit = js.native

  def unsubscribe(stream: AgoraStream, onFailure: OnFailure): Unit = js.native

}


