
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
public class GoogleCloudPubSubDestinationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GoogleCloudPubSubDestinationBuilder builder) {
        GoogleCloudPubSubDestination googleCloudPubSubDestination = builder.buildUnchecked();
        Assertions.assertThat(googleCloudPubSubDestination).isInstanceOf(GoogleCloudPubSubDestination.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GoogleCloudPubSubDestination.builder().projectId("projectId") },
                new Object[] { GoogleCloudPubSubDestination.builder().topic("topic") } };
    }

    @Test
    public void projectId() {
        GoogleCloudPubSubDestination value = GoogleCloudPubSubDestination.of();
        value.setProjectId("projectId");
        Assertions.assertThat(value.getProjectId()).isEqualTo("projectId");
    }

    @Test
    public void topic() {
        GoogleCloudPubSubDestination value = GoogleCloudPubSubDestination.of();
        value.setTopic("topic");
        Assertions.assertThat(value.getTopic()).isEqualTo("topic");
    }
}
