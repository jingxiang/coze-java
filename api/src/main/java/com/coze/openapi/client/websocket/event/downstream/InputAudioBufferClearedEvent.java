package com.coze.openapi.client.websocket.event.downstream;

import com.coze.openapi.client.websocket.common.BaseEvent;
import com.coze.openapi.client.websocket.event.EventType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
// 语音清除成功
// event_type: input_audio_buffer.cleared
public class InputAudioBufferClearedEvent extends BaseEvent {
  @JsonProperty("event_type")
  @Builder.Default
  private final String eventType = EventType.INPUT_AUDIO_BUFFER_CLEARED;
}
