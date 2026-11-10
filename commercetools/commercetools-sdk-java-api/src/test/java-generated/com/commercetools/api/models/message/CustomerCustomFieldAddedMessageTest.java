
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCustomFieldAddedMessageBuilder builder) {
        CustomerCustomFieldAddedMessage customerCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldAddedMessage).isInstanceOf(CustomerCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomerCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", CustomerCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldAddedMessage value = CustomerCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerCustomFieldAddedMessage value = CustomerCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
