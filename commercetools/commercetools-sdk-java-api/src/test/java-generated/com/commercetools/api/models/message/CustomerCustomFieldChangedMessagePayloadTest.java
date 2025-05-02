
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCustomFieldChangedMessagePayloadBuilder builder) {
        CustomerCustomFieldChangedMessagePayload customerCustomFieldChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldChangedMessagePayload)
                .isInstanceOf(CustomerCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", CustomerCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { "previousValue",
                        CustomerCustomFieldChangedMessagePayload.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldChangedMessagePayload value = CustomerCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerCustomFieldChangedMessagePayload value = CustomerCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        CustomerCustomFieldChangedMessagePayload value = CustomerCustomFieldChangedMessagePayload.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}
