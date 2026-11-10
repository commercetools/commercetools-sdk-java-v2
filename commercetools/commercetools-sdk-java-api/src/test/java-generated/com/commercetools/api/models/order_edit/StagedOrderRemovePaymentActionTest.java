
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderRemovePaymentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderRemovePaymentActionBuilder builder) {
        StagedOrderRemovePaymentAction stagedOrderRemovePaymentAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderRemovePaymentAction).isInstanceOf(StagedOrderRemovePaymentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "payment", StagedOrderRemovePaymentAction.builder()
                .payment(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl()) } };
    }

    @Test
    public void payment() {
        StagedOrderRemovePaymentAction value = StagedOrderRemovePaymentAction.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl());
        Assertions.assertThat(value.getPayment())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl());
    }
}
