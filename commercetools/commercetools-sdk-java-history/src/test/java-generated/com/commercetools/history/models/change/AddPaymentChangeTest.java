
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
public class AddPaymentChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddPaymentChangeBuilder builder) {
        AddPaymentChange addPaymentChange = builder.buildUnchecked();
        Assertions.assertThat(addPaymentChange).isInstanceOf(AddPaymentChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddPaymentChange.builder().change("change") },
                new Object[] { AddPaymentChange.builder()
                        .previousValue(new com.commercetools.history.models.common.PaymentInfoImpl()) },
                new Object[] { AddPaymentChange.builder()
                        .nextValue(new com.commercetools.history.models.common.PaymentInfoImpl()) } };
    }

    @Test
    public void change() {
        AddPaymentChange value = AddPaymentChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddPaymentChange value = AddPaymentChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PaymentInfoImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PaymentInfoImpl());
    }

    @Test
    public void nextValue() {
        AddPaymentChange value = AddPaymentChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PaymentInfoImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.PaymentInfoImpl());
    }
}
