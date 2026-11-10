
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCustomFieldChangedMessageBuilder builder) {
        CustomerCustomFieldChangedMessage customerCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldChangedMessage).isInstanceOf(CustomerCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomerCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", CustomerCustomFieldChangedMessage.builder().value("value") }, new Object[] {
                        "previousValue", CustomerCustomFieldChangedMessage.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldChangedMessage value = CustomerCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerCustomFieldChangedMessage value = CustomerCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        CustomerCustomFieldChangedMessage value = CustomerCustomFieldChangedMessage.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}
