
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
public class PaymentSetMethodInfoMethodActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentSetMethodInfoMethodActionBuilder builder) {
        PaymentSetMethodInfoMethodAction paymentSetMethodInfoMethodAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetMethodInfoMethodAction).isInstanceOf(PaymentSetMethodInfoMethodAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentSetMethodInfoMethodAction.builder().method("method") } };
    }

    @Test
    public void method() {
        PaymentSetMethodInfoMethodAction value = PaymentSetMethodInfoMethodAction.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }
}
