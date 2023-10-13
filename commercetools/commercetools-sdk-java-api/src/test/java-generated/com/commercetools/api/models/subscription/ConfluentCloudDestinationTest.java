
package com.commercetools.api.models.subscription;

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
public class ConfluentCloudDestinationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ConfluentCloudDestinationBuilder builder) {
        ConfluentCloudDestination confluentCloudDestination = builder.buildUnchecked();
        Assertions.assertThat(confluentCloudDestination).isInstanceOf(ConfluentCloudDestination.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ConfluentCloudDestination.builder().bootstrapServer("bootstrapServer") },
                new Object[] { ConfluentCloudDestination.builder().apiKey("apiKey") },
                new Object[] { ConfluentCloudDestination.builder().apiSecret("apiSecret") },
                new Object[] { ConfluentCloudDestination.builder().acks("acks") },
                new Object[] { ConfluentCloudDestination.builder().topic("topic") },
                new Object[] { ConfluentCloudDestination.builder().key("key") } };
    }

    @Test
    public void bootstrapServer() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setBootstrapServer("bootstrapServer");
        Assertions.assertThat(value.getBootstrapServer()).isEqualTo("bootstrapServer");
    }

    @Test
    public void apiKey() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setApiKey("apiKey");
        Assertions.assertThat(value.getApiKey()).isEqualTo("apiKey");
    }

    @Test
    public void apiSecret() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setApiSecret("apiSecret");
        Assertions.assertThat(value.getApiSecret()).isEqualTo("apiSecret");
    }

    @Test
    public void acks() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setAcks("acks");
        Assertions.assertThat(value.getAcks()).isEqualTo("acks");
    }

    @Test
    public void topic() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setTopic("topic");
        Assertions.assertThat(value.getTopic()).isEqualTo("topic");
    }

    @Test
    public void key() {
        ConfluentCloudDestination value = ConfluentCloudDestination.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
