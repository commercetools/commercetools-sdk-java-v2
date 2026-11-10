
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupCustomFieldAddedMessageBuilder builder) {
        CustomerGroupCustomFieldAddedMessage customerGroupCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupCustomFieldAddedMessage)
                .isInstanceOf(CustomerGroupCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomerGroupCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", CustomerGroupCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerGroupCustomFieldAddedMessage value = CustomerGroupCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerGroupCustomFieldAddedMessage value = CustomerGroupCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
