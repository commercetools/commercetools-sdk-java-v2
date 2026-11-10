
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CloudEventsPayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CloudEventsPayloadBuilder builder) {
        CloudEventsPayload cloudEventsPayload = builder.buildUnchecked();
        Assertions.assertThat(cloudEventsPayload).isInstanceOf(CloudEventsPayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "specversion", CloudEventsPayload.builder().specversion("specversion") },
                new Object[] { "id", CloudEventsPayload.builder().id("id") },
                new Object[] { "type", CloudEventsPayload.builder().type("type") },
                new Object[] { "source", CloudEventsPayload.builder().source("source") },
                new Object[] { "subject", CloudEventsPayload.builder().subject("subject") },
                new Object[] { "time", CloudEventsPayload.builder().time(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "sequence", CloudEventsPayload.builder().sequence("sequence") },
                new Object[] { "sequencetype", CloudEventsPayload.builder().sequencetype("sequencetype") },
                new Object[] { "dataref", CloudEventsPayload.builder().dataref("dataref") },
                new Object[] { "data", CloudEventsPayload.builder()
                        .data(new com.commercetools.api.models.subscription.DeliveryPayloadImpl()) } };
    }

    @Test
    public void specversion() {
        CloudEventsPayload value = CloudEventsPayload.of();
        value.setSpecversion("specversion");
        Assertions.assertThat(value.getSpecversion()).isEqualTo("specversion");
    }

    @Test
    public void id() {
        CloudEventsPayload value = CloudEventsPayload.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void type() {
        CloudEventsPayload value = CloudEventsPayload.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void source() {
        CloudEventsPayload value = CloudEventsPayload.of();
        value.setSource("source");
        Assertions.assertThat(value.getSource()).isEqualTo("source");
    }

    @Test
    public void subject() {
        CloudEventsPayload value = CloudEventsPayload.of();
        value.setSubject("subject");
        Assertions.assertThat(value.getSubject()).isEqualTo("subject");
    }

    @Test
    public void time() {
        CloudEventsPayload value = CloudEventsPayload.of();
        value.setTime(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTime()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void sequence() {
        CloudEventsPayload value = CloudEventsPayload.of();
        value.setSequence("sequence");
        Assertions.assertThat(value.getSequence()).isEqualTo("sequence");
    }

    @Test
    public void sequencetype() {
        CloudEventsPayload value = CloudEventsPayload.of();
        value.setSequencetype("sequencetype");
        Assertions.assertThat(value.getSequencetype()).isEqualTo("sequencetype");
    }

    @Test
    public void dataref() {
        CloudEventsPayload value = CloudEventsPayload.of();
        value.setDataref("dataref");
        Assertions.assertThat(value.getDataref()).isEqualTo("dataref");
    }

    @Test
    public void data() {
        CloudEventsPayload value = CloudEventsPayload.of();
        value.setData(new com.commercetools.api.models.subscription.DeliveryPayloadImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.subscription.DeliveryPayloadImpl());
    }
}
