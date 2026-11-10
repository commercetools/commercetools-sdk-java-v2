
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupCustomFieldChangedMessageBuilder builder) {
        CustomerGroupCustomFieldChangedMessage customerGroupCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupCustomFieldChangedMessage)
                .isInstanceOf(CustomerGroupCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomerGroupCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", CustomerGroupCustomFieldChangedMessage.builder().value("value") },
                new Object[] { "oldValue", CustomerGroupCustomFieldChangedMessage.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        CustomerGroupCustomFieldChangedMessage value = CustomerGroupCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerGroupCustomFieldChangedMessage value = CustomerGroupCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        CustomerGroupCustomFieldChangedMessage value = CustomerGroupCustomFieldChangedMessage.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
