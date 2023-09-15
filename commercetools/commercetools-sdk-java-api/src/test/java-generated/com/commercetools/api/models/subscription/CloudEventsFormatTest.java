
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
public class CloudEventsFormatTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CloudEventsFormatBuilder builder) {
        CloudEventsFormat cloudEventsFormat = builder.buildUnchecked();
        Assertions.assertThat(cloudEventsFormat).isInstanceOf(CloudEventsFormat.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CloudEventsFormat.builder().cloudEventsVersion("cloudEventsVersion") } };
    }

    @Test
    public void cloudEventsVersion() {
        CloudEventsFormat value = CloudEventsFormat.of();
        value.setCloudEventsVersion("cloudEventsVersion");
        Assertions.assertThat(value.getCloudEventsVersion()).isEqualTo("cloudEventsVersion");
    }
}
