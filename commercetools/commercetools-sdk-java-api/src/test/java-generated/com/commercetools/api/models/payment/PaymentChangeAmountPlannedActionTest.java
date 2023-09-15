
package com.commercetools.api.models.payment;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class PaymentChangeAmountPlannedActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentChangeAmountPlannedActionBuilder builder) {
        PaymentChangeAmountPlannedAction paymentChangeAmountPlannedAction = builder.buildUnchecked();
        Assertions.assertThat(paymentChangeAmountPlannedAction).isInstanceOf(PaymentChangeAmountPlannedAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentChangeAmountPlannedAction.builder()
                .amount(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void amount() {
        PaymentChangeAmountPlannedAction value = PaymentChangeAmountPlannedAction.of();
        value.setAmount(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
