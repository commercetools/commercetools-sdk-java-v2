
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCustomFieldAddedMessagePayloadBuilder builder) {
        CustomerCustomFieldAddedMessagePayload customerCustomFieldAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldAddedMessagePayload)
                .isInstanceOf(CustomerCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomerCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", CustomerCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldAddedMessagePayload value = CustomerCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerCustomFieldAddedMessagePayload value = CustomerCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
