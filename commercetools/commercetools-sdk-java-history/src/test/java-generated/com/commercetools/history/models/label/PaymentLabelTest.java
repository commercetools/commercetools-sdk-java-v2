
package com.commercetools.history.models.label;

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
public class PaymentLabelTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentLabelBuilder builder) {
        PaymentLabel paymentLabel = builder.buildUnchecked();
        Assertions.assertThat(paymentLabel).isInstanceOf(PaymentLabel.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentLabel.builder().key("key") }, new Object[] {
                PaymentLabel.builder().amountPlanned(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void key() {
        PaymentLabel value = PaymentLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void amountPlanned() {
        PaymentLabel value = PaymentLabel.of();
        value.setAmountPlanned(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmountPlanned())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
