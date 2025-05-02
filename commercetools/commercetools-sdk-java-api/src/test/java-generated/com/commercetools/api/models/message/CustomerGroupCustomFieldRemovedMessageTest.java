
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupCustomFieldRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupCustomFieldRemovedMessageBuilder builder) {
        CustomerGroupCustomFieldRemovedMessage customerGroupCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupCustomFieldRemovedMessage)
                .isInstanceOf(CustomerGroupCustomFieldRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", CustomerGroupCustomFieldRemovedMessage.builder().name("name") } };
    }

    @Test
    public void name() {
        CustomerGroupCustomFieldRemovedMessage value = CustomerGroupCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
