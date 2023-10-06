
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
public class CustomerPasswordTokenCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerPasswordTokenCreatedMessagePayloadBuilder builder) {
        CustomerPasswordTokenCreatedMessagePayload customerPasswordTokenCreatedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerPasswordTokenCreatedMessagePayload)
                .isInstanceOf(CustomerPasswordTokenCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerPasswordTokenCreatedMessagePayload.builder().customerId("customerId") },
                new Object[] { CustomerPasswordTokenCreatedMessagePayload.builder()
                        .expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void customerId() {
        CustomerPasswordTokenCreatedMessagePayload value = CustomerPasswordTokenCreatedMessagePayload.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void expiresAt() {
        CustomerPasswordTokenCreatedMessagePayload value = CustomerPasswordTokenCreatedMessagePayload.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
