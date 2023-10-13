
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
public class MyCartRemovePaymentActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartRemovePaymentActionBuilder builder) {
        MyCartRemovePaymentAction myCartRemovePaymentAction = builder.buildUnchecked();
        Assertions.assertThat(myCartRemovePaymentAction).isInstanceOf(MyCartRemovePaymentAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCartRemovePaymentAction.builder()
                .payment(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl()) } };
    }

    @Test
    public void payment() {
        MyCartRemovePaymentAction value = MyCartRemovePaymentAction.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl());
        Assertions.assertThat(value.getPayment())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl());
    }
}
