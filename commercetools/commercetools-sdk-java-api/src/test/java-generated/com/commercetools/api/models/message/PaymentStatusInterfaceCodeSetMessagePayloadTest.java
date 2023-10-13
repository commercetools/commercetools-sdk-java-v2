
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
public class PaymentStatusInterfaceCodeSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder) {
        PaymentStatusInterfaceCodeSetMessagePayload paymentStatusInterfaceCodeSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentStatusInterfaceCodeSetMessagePayload)
                .isInstanceOf(PaymentStatusInterfaceCodeSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentStatusInterfaceCodeSetMessagePayload.builder().interfaceCode("interfaceCode") } };
    }

    @Test
    public void interfaceCode() {
        PaymentStatusInterfaceCodeSetMessagePayload value = PaymentStatusInterfaceCodeSetMessagePayload.of();
        value.setInterfaceCode("interfaceCode");
        Assertions.assertThat(value.getInterfaceCode()).isEqualTo("interfaceCode");
    }
}
