
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
public class RemovePaymentChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemovePaymentChangeBuilder builder) {
        RemovePaymentChange removePaymentChange = builder.buildUnchecked();
        Assertions.assertThat(removePaymentChange).isInstanceOf(RemovePaymentChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemovePaymentChange.builder().change("change") },
                new Object[] { RemovePaymentChange.builder()
                        .previousValue(new com.commercetools.history.models.common.PaymentInfoImpl()) },
                new Object[] { RemovePaymentChange.builder()
                        .nextValue(new com.commercetools.history.models.common.PaymentInfoImpl()) } };
    }

    @Test
    public void change() {
        RemovePaymentChange value = RemovePaymentChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemovePaymentChange value = RemovePaymentChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PaymentInfoImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PaymentInfoImpl());
    }

    @Test
    public void nextValue() {
        RemovePaymentChange value = RemovePaymentChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PaymentInfoImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.PaymentInfoImpl());
    }
}
