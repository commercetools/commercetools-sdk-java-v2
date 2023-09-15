
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
public class PaymentStatusTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentStatusBuilder builder) {
        PaymentStatus paymentStatus = builder.buildUnchecked();
        Assertions.assertThat(paymentStatus).isInstanceOf(PaymentStatus.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentStatus.builder().interfaceCode("interfaceCode") },
                new Object[] { PaymentStatus.builder().interfaceText("interfaceText") }, new Object[] {
                        PaymentStatus.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) } };
    }

    @Test
    public void interfaceCode() {
        PaymentStatus value = PaymentStatus.of();
        value.setInterfaceCode("interfaceCode");
        Assertions.assertThat(value.getInterfaceCode()).isEqualTo("interfaceCode");
    }

    @Test
    public void interfaceText() {
        PaymentStatus value = PaymentStatus.of();
        value.setInterfaceText("interfaceText");
        Assertions.assertThat(value.getInterfaceText()).isEqualTo("interfaceText");
    }

    @Test
    public void state() {
        PaymentStatus value = PaymentStatus.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }
}
