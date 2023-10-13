
package com.commercetools.api.models.message;

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
public class PaymentStatusInterfaceCodeSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentStatusInterfaceCodeSetMessageBuilder builder) {
        PaymentStatusInterfaceCodeSetMessage paymentStatusInterfaceCodeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentStatusInterfaceCodeSetMessage)
                .isInstanceOf(PaymentStatusInterfaceCodeSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentStatusInterfaceCodeSetMessage.builder().interfaceCode("interfaceCode") } };
    }

    @Test
    public void interfaceCode() {
        PaymentStatusInterfaceCodeSetMessage value = PaymentStatusInterfaceCodeSetMessage.of();
        value.setInterfaceCode("interfaceCode");
        Assertions.assertThat(value.getInterfaceCode()).isEqualTo("interfaceCode");
    }
}
