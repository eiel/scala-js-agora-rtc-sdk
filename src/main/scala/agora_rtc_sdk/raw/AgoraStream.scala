package agora_rtc_sdk.raw

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html
  */
@js.native
trait AgoraStream extends js.Object {
  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#addtrack
    * @param track
    */
  def addTrack(track: MediaStreamTrack): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html
    * @param level
    */
  def adjustAudioMixingVolume(level: Byte): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#close
    */
  def close(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html
    * @return
    */
  @deprecated("use muteAudio", "v2.5.1")
  def disableAudio(): Boolean = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#disablevideo
    * @return
    */
  @deprecated("use muteVideo", "v2.5.1")
  def disableVideo(): Boolean = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#enableaudio
    * @return
    */
  @deprecated("use unmuteAudio", "v2.5.1")
  def enableAudio(): Boolean = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#enablevideo
    * @return
    */
  @deprecated("use unmuteVideo", "v2.5.1")
  def enableVideo(): Boolean = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#getaudiolevel
    * @return
    */
  def getAudioLevel(): Int = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#getaudiomixingcurrentposition
    * @return
    */
  def getAudioMixingCurrentPosition: Int | Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#getaudiomixingduration
    * @return
    */
  def getAudioMixingDuration: Int | Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#getaudiotrack
    * @return
    */
  def getAudioTrack(): js.UndefOr[MediaStreamTrack] = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#geteffectsvolume
    * @return
    */
  def getEffectsVolume: js.Array[AudioEffectVolume]

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#getid
    * @return
    */
  def getId(): Double = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html
    * @param callback
    */
  def getStats(callback: js.Function1[LocalStreamStats | RemoteStreamStats, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html
    * @return
    */
  def getVideoTrack(): js.UndefOr[MediaStreamTrack] = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#hasaudio
    * @return
    */
  def hasAudio(): Boolean = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#hasvideo
    * @return
    */
  def hasVideo(): Boolean = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html
    * @param onSuccess
    */
  def init(onSuccess: js.Function0[Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html
    * @param onSuccess
    * @param onFailure
    */
  def init(onSuccess: js.Function0[Unit], onFailure: js.Function1[StreamInitError, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#isplaying
    * @return
    */
  def isPlaying(): Boolean = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#muteaudio
    */
  def muteAudio(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#mutevideo
    */
  def muteVideo(): Unit = js.native

  /**
    * https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#on
    *
    * @param event "accessAllowed" | "accessDenied" | "stopScreenSharing" | "audioMixingPlayed" | "audioMixingFinished"
    * @param onSuccess
    */
  def on(event: String, onSuccess: js.Function0[Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#pausealleffects
    */
  def pauseAllEffects(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#pausealleffects
    * @param callback
    */
  def pauseAllEffects(callback: OnFailure): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#pauseaudiomixing
    * @param callback
    */
  def pauseAudioMixing(callback: OnFailure): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html
    * @param soundId 1 .. 10000
    */
  def pauseEffect(soundId: SoundId): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html
    * @param soundId 1 .. 10000
    * @param callback
    */
  def pauseEffect(soundId: SoundId, callback: OnFailure): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#play
    * @param elementId
    */
  def play(elementId: String): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#play
    * @param elementId
    * @param option
    */
  def play(elementId: String, option: StreamPlayOption): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#playeffect
    * @param options
    */
  def playEffect(options: PlayEffectOptions): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#playeffect
    * @param options
    * @param callback
    */
  def playEffect(options: PlayEffectOptions, callback: OnFailure): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#preloadeffect
    * @param sonudId
    * @param filePath
    */
  def preloadEffect(sonudId: SoundId, filePath: String) : Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#preloadeffect
    * @param sonudId
    * @param filePath
    * @param callback
    */
  def preloadEffect(sonudId: SoundId, filePath: String, callback: OnFailure) : Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#removetrack
    * @param track
    */
  def removeTrack(track: MediaStreamTrack): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#replacetrack
    * @param track
    */
  def replaceTrack(track: MediaStreamTrack): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#replacetrack
    * @param track
    * @param onSuccess
    */
  def replaceTrack(track: MediaStreamTrack, onSuccess: js.Function0[Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#replacetrack
    * @param track
    * @param onSuccess
    * @param onFailure
    */
  def replaceTrack(track: MediaStreamTrack, onSuccess: js.Function0[Unit], onFailure: OnFailure): Unit = js.native


  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#resumealleffects
    */
  def resumeAllEffects(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#resumealleffects
    * @param callback
    */
  def resumeAllEffects(callback: js.Function1[String | Null, Unit]): Unit = js.native


  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#resumeaudiomixing
    */
  def resumeAudioMixing(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#resumeaudiomixing
    * @param callback
    */
  def resumeAudioMixing(callback: js.Function1[String | Null, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#resumeeffect
    * @param soundId
    */
  def resumeEffect(soundId: SoundId): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#resumeeffect
    * @param soundId
    * @param callback
    */
  def resumeEffect(soundId: SoundId, callback: js.Function1[String | Null, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#setaudiomixingposition
    * @param position range [0, 100000000]
    */
  def setAudioMixingPosition(position: Int): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#setaudiomixingposition
    * @param position
    * @param callback
    */
  def setAudioMixingPosition(position: Int, callback: js.Function0[Unit]): Unit = js.native
  def setAudioMixingPosition(position: Int, callback: js.Function0[Unit], onFailure: js.Function1[String, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#setaudiooutput
    * @param deviceId
    * @param onSuccess
    * @param onFailure
    */
  def setAudioOutput(deviceId: String, onSuccess: js.UndefOr[js.Function0[Unit]], onFailure: js.UndefOr[js.Function1[String, Unit]]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#setaudioprofile
    * @param profile "speech_low_quality" | "speech_standard" | "music_standard" | "standard_stereo" | "high_quality" | "high_quality_stereo"[
    */
  def setAudioProfile(profile: String): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#setaudiovolume
    * @param volume range [0, 100]
    */
  def setAudioVolume(volume: Volume): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#seteffectsvolume
    * @param volume
    */
  def setEffectsVolume(volume: Volume): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#seteffectsvolume
    * @param volume
    * @param callback
    */
  def setEffectsVolume(volume: Volume, callback: js.Function1[String | Null, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#setscreenprofile
    * @param profile "480p_1" | "480p_2" | "720p_1" | "720p_2" | "1080p_1" | "1080p_2"
    */
  def setScreenProfile(profile: String): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#setvideoprofile
    * @param profile
    */
  def setVideoProfile(profile: String): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#setvolumeofeffect
    * @param soundId
    * @param volume
    */
  def setVolumeOfEffect(soundId: SoundId, volume: Volume): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#setvolumeofeffect
    * @param soundId
    * @param volume
    * @param callback
    */
  def setVolumeOfEffect(soundId: SoundId, volume: Volume, callback: js.Function1[String | Null, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#startaudiomixing
    * @param options
    * @param callback
    */
  def startAudioMixing(options: StreamAudioMixing, callback: js.Function1[js.UndefOr[String], Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html
    */
  def stop(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#stopalleffects
    */
  def stopAllEffects(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#stopalleffects
    * @param callback
    */
  def stopAllEffects(callback: js.Function1[String | Null, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#stopaudiomixing
    */
  def stopAudioMixing(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#stopaudiomixing
    * @param callback
    */
  def stopAudioMixing(callback: js.Function1[String | Null, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#stopeffect
    * @param soundId
    */
  def stopEffect(soundId: SoundId): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#stopeffect
    * @param soundId
    * @param callback
    */
  def stopEffect(soundId: SoundId, callback: js.Function1[String | Null, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#switchdevice
    * @param `type` "audio" | "video"
    */
  def switchDevice(`type`: String, deviceId: String): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#switchdevice
    * @param `type` "audio" | "video"
    * @param deviceId
    * @param onSuccess
    */
  def switchDevice(`type`: String, deviceId: String, onSuccess: js.Function0[Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#switchdevice
    * @param `type` "audio" | "video"
    * @param deviceId
    * @param onSuccess
    * @param onFailure
    */
  def switchDevice(`type`: String, deviceId: String, onSuccess: js.Function0[Unit], onFailure: js.Function1[String, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#unloadeffect
    * @param soundId
    * @param callback
    */
  def unloadEffect(soundId: SoundId, callback: js.Function1[String | Null, Unit]): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#unloadeffect
    * @param soundId
    */
  def unloadEffect(soundId: SoundId): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#unmuteaudio
    */
  def unmuteAudio(): Unit = js.native

  /**
    * @see https://docs.agora.io/en/Voice/API%20Reference/web/v2.6.1/interfaces/agorartc.stream.html#unmutevideo
    */
  def unmuteVideo(): Unit = js.native
}

trait StreamAudioMixing extends js.Object {
  val cycle: js.UndefOr[Int] = js.undefined
  val filePath: String
  val loop: js.UndefOr[Boolean] = js.undefined
  val playTime: Int
  val replace: js.UndefOr[Boolean] = js.undefined
}

trait PlayEffectOptions extends js.Object {
  val cycle: js.UndefOr[Short] = js.undefined
  val fillPath: String
  val soundId: SoundId
}

trait StreamPlayOption extends js.Object {
  // type fit = "cover" | "contain"
  val fit: js.UndefOr[String] = js.undefined
  val muted: js.UndefOr[Boolean] = js.undefined
}

trait StreamInitErrorMsg extends js.Object {
  val code: String
}

trait StreamInitError extends js.Object {
  val `type`: js.UndefOr[String] = js.undefined
  val msg: js.UndefOr[StreamInitErrorMsg | String] = js.undefined
}

trait AudioEffectVolume {
  val soundID: Short // 1 .. 1000
  val volume: Byte // 0 .. 100
}

