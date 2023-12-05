
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
public class PaymentSetInterfaceIdActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentSetInterfaceIdActionBuilder builder) {
        PaymentSetInterfaceIdAction paymentSetInterfaceIdAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetInterfaceIdAction).isInstanceOf(PaymentSetInterfaceIdAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentSetInterfaceIdAction.builder().interfaceId("interfaceId") } };
    }

    @Test
    public void interfaceId() {
        PaymentSetInterfaceIdAction value = PaymentSetInterfaceIdAction.of();
        value.setInterfaceId("interfaceId");
        Assertions.assertThat(value.getInterfaceId()).isEqualTo("interfaceId");
    }
}
