
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupCustomFieldAddedMessagePayloadBuilder builder) {
        CustomerGroupCustomFieldAddedMessagePayload customerGroupCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerGroupCustomFieldAddedMessagePayload)
                .isInstanceOf(CustomerGroupCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerGroupCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", CustomerGroupCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerGroupCustomFieldAddedMessagePayload value = CustomerGroupCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerGroupCustomFieldAddedMessagePayload value = CustomerGroupCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
