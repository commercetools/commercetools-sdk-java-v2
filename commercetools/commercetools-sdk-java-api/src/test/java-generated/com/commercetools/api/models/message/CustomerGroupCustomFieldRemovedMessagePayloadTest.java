
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupCustomFieldRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupCustomFieldRemovedMessagePayloadBuilder builder) {
        CustomerGroupCustomFieldRemovedMessagePayload customerGroupCustomFieldRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerGroupCustomFieldRemovedMessagePayload)
                .isInstanceOf(CustomerGroupCustomFieldRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerGroupCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        CustomerGroupCustomFieldRemovedMessagePayload value = CustomerGroupCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
