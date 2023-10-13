
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
public class ResourceCreatedDeliveryPayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ResourceCreatedDeliveryPayloadBuilder builder) {
        ResourceCreatedDeliveryPayload resourceCreatedDeliveryPayload = builder.buildUnchecked();
        Assertions.assertThat(resourceCreatedDeliveryPayload).isInstanceOf(ResourceCreatedDeliveryPayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ResourceCreatedDeliveryPayload.builder().version(2L) }, new Object[] {
                ResourceCreatedDeliveryPayload.builder().modifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void version() {
        ResourceCreatedDeliveryPayload value = ResourceCreatedDeliveryPayload.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void modifiedAt() {
        ResourceCreatedDeliveryPayload value = ResourceCreatedDeliveryPayload.of();
        value.setModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
