
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
public class SetReturnPaymentStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetReturnPaymentStateChangeBuilder builder) {
        SetReturnPaymentStateChange setReturnPaymentStateChange = builder.buildUnchecked();
        Assertions.assertThat(setReturnPaymentStateChange).isInstanceOf(SetReturnPaymentStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetReturnPaymentStateChange.builder().change("change") },
                new Object[] {
                        SetReturnPaymentStateChange.builder()
                                .previousValue(com.commercetools.history.models.common.ReturnPaymentState
                                        .findEnum("NonRefundable")) },
                new Object[] { SetReturnPaymentStateChange.builder()
                        .nextValue(
                            com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable")) } };
    }

    @Test
    public void change() {
        SetReturnPaymentStateChange value = SetReturnPaymentStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetReturnPaymentStateChange value = SetReturnPaymentStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable"));
    }

    @Test
    public void nextValue() {
        SetReturnPaymentStateChange value = SetReturnPaymentStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable"));
    }
}
