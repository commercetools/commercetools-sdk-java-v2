
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentChangeAmountPlannedActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentChangeAmountPlannedActionBuilder builder) {
        MyPaymentChangeAmountPlannedAction myPaymentChangeAmountPlannedAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentChangeAmountPlannedAction)
                .isInstanceOf(MyPaymentChangeAmountPlannedAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "amount", MyPaymentChangeAmountPlannedAction.builder()
                .amount(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void amount() {
        MyPaymentChangeAmountPlannedAction value = MyPaymentChangeAmountPlannedAction.of();
        value.setAmount(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
