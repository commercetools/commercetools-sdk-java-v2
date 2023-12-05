
package com.commercetools.api.models.me;

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
public class MyPaymentChangeAmountPlannedActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyPaymentChangeAmountPlannedActionBuilder builder) {
        MyPaymentChangeAmountPlannedAction myPaymentChangeAmountPlannedAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentChangeAmountPlannedAction)
                .isInstanceOf(MyPaymentChangeAmountPlannedAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyPaymentChangeAmountPlannedAction.builder()
                .amount(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void amount() {
        MyPaymentChangeAmountPlannedAction value = MyPaymentChangeAmountPlannedAction.of();
        value.setAmount(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
