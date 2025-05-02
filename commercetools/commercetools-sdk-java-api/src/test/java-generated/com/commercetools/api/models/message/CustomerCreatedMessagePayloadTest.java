
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCreatedMessagePayloadBuilder builder) {
        CustomerCreatedMessagePayload customerCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCreatedMessagePayload).isInstanceOf(CustomerCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customer", CustomerCreatedMessagePayload.builder()
                .customer(new com.commercetools.api.models.customer.CustomerImpl()) } };
    }

    @Test
    public void customer() {
        CustomerCreatedMessagePayload value = CustomerCreatedMessagePayload.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerImpl());
        Assertions.assertThat(value.getCustomer()).isEqualTo(new com.commercetools.api.models.customer.CustomerImpl());
    }
}
