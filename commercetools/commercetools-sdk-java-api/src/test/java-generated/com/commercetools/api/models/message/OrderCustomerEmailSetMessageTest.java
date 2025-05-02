
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomerEmailSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomerEmailSetMessageBuilder builder) {
        OrderCustomerEmailSetMessage orderCustomerEmailSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomerEmailSetMessage).isInstanceOf(OrderCustomerEmailSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", OrderCustomerEmailSetMessage.builder().email("email") },
                new Object[] { "oldEmail", OrderCustomerEmailSetMessage.builder().oldEmail("oldEmail") } };
    }

    @Test
    public void email() {
        OrderCustomerEmailSetMessage value = OrderCustomerEmailSetMessage.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void oldEmail() {
        OrderCustomerEmailSetMessage value = OrderCustomerEmailSetMessage.of();
        value.setOldEmail("oldEmail");
        Assertions.assertThat(value.getOldEmail()).isEqualTo("oldEmail");
    }
}
