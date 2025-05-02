
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupCustomFieldChangedMessagePayloadBuilder builder) {
        CustomerGroupCustomFieldChangedMessagePayload customerGroupCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerGroupCustomFieldChangedMessagePayload)
                .isInstanceOf(CustomerGroupCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerGroupCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", CustomerGroupCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { "oldValue",
                        CustomerGroupCustomFieldChangedMessagePayload.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        CustomerGroupCustomFieldChangedMessagePayload value = CustomerGroupCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerGroupCustomFieldChangedMessagePayload value = CustomerGroupCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        CustomerGroupCustomFieldChangedMessagePayload value = CustomerGroupCustomFieldChangedMessagePayload.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
