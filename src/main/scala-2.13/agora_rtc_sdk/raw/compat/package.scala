package agora_rtc_sdk.raw

import scala.scalajs.js.|

package object compat {
  type AudioChannels = 1 | // Mono
  2 | // Dual sound channels
  3 | // Three sound channels
  4 | // Four sound channels
  5   // Five sound channels
  type AudioCodecType = "1" | // Opus
  "0" // AAC
  type AudioSampleRate  = 32000 | 44100 | 48000
  type ClientConfigMode = "live" | "rtc"
  type ClientRole       = "audience" | "host"
  type EntcryptionMode  = "aes-128-xts" | "aes-256-xts" | "aes-128-ecb"
  type EventType =
    "stream-published" | "stream-added" | "stream-removed" | "stream-subscribed" | "peer-leave" | "mute-audio" | "unmute-audio" | "mute-video" | "unmute-video" | "client-banned" | "active-speaker" | "error"
  type NetworkType =
    "bluetooth" | "cellular" | "ethernet" | "none" | "wifi" | "wimax" | "other" | "unknown" | "UNSUPPORTED"
  type MuteState = "1" | // Muted
  "0" // Unmuted
  type MediaDeviceInfoKind   = "videoinput" | "audioinput" | "audiooutput"
  type MediaStreamTrackKind  = "audio" | "video"
  type StreamFallBackType    = 0 /*  disable */ | 1 /* auto */ | 2 /* Under poor network */
  type StreamSpecMediaSource = "screen" | "application" | "window"
  type VideoCodecProfile     = 66 | 77 | 100
  type VideoCodecType        = "vp8" | "h264"
  type VideoStreamType       = 0 /* Hight-bitrate */ | 1 /* Low-bitrate */
}
