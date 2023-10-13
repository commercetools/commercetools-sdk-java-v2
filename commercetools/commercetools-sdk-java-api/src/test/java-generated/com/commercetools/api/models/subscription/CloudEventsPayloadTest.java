
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CloudEventsPayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CloudEventsPayloadBuilder builder) {
        CloudEventsPayload cloudEventsPayload = builder.buildUnchecked();
        Assertions.assertThat(cloudEventsPayload).isInstanceOf(CloudEventsPayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CloudEventsPayload.builder().specversion("specversion") },
                new Object[] { CloudEventsPayload.builder().id("id") },
                new Object[] { CloudEventsPayload.builder().type("type") },
                new Object[] { CloudEventsPayload.builder().source("source") },
                new Object[] { CloudEventsPayload.builder().subject("subject") },
                new Object[] { CloudEventsPayload.builder().time(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { CloudEventsPayload.builder().sequence("sequence") },
                new Object[] { CloudEventsPayload.builder().sequencetype("sequencetype") },
                new Object[] { CloudEventsPayload.builder().dataref("dataref") },
                new Object[] { CloudEventsPayload.builder()
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
