
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCustomFieldRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCustomFieldRemovedMessageBuilder builder) {
        CustomerCustomFieldRemovedMessage customerCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldRemovedMessage).isInstanceOf(CustomerCustomFieldRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomerCustomFieldRemovedMessage.builder().name("name") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldRemovedMessage value = CustomerCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
