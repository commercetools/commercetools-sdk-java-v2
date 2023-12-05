
package com.commercetools.api.models.message;

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
public class CustomerEmailTokenCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerEmailTokenCreatedMessagePayloadBuilder builder) {
        CustomerEmailTokenCreatedMessagePayload customerEmailTokenCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerEmailTokenCreatedMessagePayload)
                .isInstanceOf(CustomerEmailTokenCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerEmailTokenCreatedMessagePayload.builder().customerId("customerId") },
                new Object[] { CustomerEmailTokenCreatedMessagePayload.builder()
                        .expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void customerId() {
        CustomerEmailTokenCreatedMessagePayload value = CustomerEmailTokenCreatedMessagePayload.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void expiresAt() {
        CustomerEmailTokenCreatedMessagePayload value = CustomerEmailTokenCreatedMessagePayload.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
