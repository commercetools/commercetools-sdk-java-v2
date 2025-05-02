
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCreatedMessageBuilder builder) {
        CustomerCreatedMessage customerCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCreatedMessage).isInstanceOf(CustomerCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customer",
                CustomerCreatedMessage.builder().customer(new com.commercetools.api.models.customer.CustomerImpl()) } };
    }

    @Test
    public void customer() {
        CustomerCreatedMessage value = CustomerCreatedMessage.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerImpl());
        Assertions.assertThat(value.getCustomer()).isEqualTo(new com.commercetools.api.models.customer.CustomerImpl());
    }
}
