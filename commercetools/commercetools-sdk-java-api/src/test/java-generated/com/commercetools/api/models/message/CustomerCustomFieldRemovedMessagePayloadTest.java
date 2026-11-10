
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCustomFieldRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCustomFieldRemovedMessagePayloadBuilder builder) {
        CustomerCustomFieldRemovedMessagePayload customerCustomFieldRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldRemovedMessagePayload)
                .isInstanceOf(CustomerCustomFieldRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldRemovedMessagePayload value = CustomerCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
