
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetCustomerActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetCustomerActionBuilder builder) {
        PaymentSetCustomerAction paymentSetCustomerAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetCustomerAction).isInstanceOf(PaymentSetCustomerAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customer", PaymentSetCustomerAction.builder()
                .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) } };
    }

    @Test
    public void customer() {
        PaymentSetCustomerAction value = PaymentSetCustomerAction.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }
}
