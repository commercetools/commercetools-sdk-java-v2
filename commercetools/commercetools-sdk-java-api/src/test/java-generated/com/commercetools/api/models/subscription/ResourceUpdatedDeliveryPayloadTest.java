
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
public class ResourceUpdatedDeliveryPayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ResourceUpdatedDeliveryPayloadBuilder builder) {
        ResourceUpdatedDeliveryPayload resourceUpdatedDeliveryPayload = builder.buildUnchecked();
        Assertions.assertThat(resourceUpdatedDeliveryPayload).isInstanceOf(ResourceUpdatedDeliveryPayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ResourceUpdatedDeliveryPayload.builder().version(2L) },
                new Object[] { ResourceUpdatedDeliveryPayload.builder().oldVersion(3L) },
                new Object[] { ResourceUpdatedDeliveryPayload.builder()
                        .modifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void version() {
        ResourceUpdatedDeliveryPayload value = ResourceUpdatedDeliveryPayload.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void oldVersion() {
        ResourceUpdatedDeliveryPayload value = ResourceUpdatedDeliveryPayload.of();
        value.setOldVersion(3L);
        Assertions.assertThat(value.getOldVersion()).isEqualTo(3L);
    }

    @Test
    public void modifiedAt() {
        ResourceUpdatedDeliveryPayload value = ResourceUpdatedDeliveryPayload.of();
        value.setModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
