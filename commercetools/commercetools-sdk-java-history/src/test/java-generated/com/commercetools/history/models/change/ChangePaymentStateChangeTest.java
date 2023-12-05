
package com.commercetools.history.models.change;

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
public class ChangePaymentStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangePaymentStateChangeBuilder builder) {
        ChangePaymentStateChange changePaymentStateChange = builder.buildUnchecked();
        Assertions.assertThat(changePaymentStateChange).isInstanceOf(ChangePaymentStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangePaymentStateChange.builder().change("change") },
                new Object[] { ChangePaymentStateChange.builder()
                        .previousValue(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue")) },
                new Object[] { ChangePaymentStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue")) } };
    }

    @Test
    public void change() {
        ChangePaymentStateChange value = ChangePaymentStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangePaymentStateChange value = ChangePaymentStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue"));
    }

    @Test
    public void nextValue() {
        ChangePaymentStateChange value = ChangePaymentStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue"));
    }
}
