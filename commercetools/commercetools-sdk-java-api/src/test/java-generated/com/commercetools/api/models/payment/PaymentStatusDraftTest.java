
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
public class PaymentStatusDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentStatusDraftBuilder builder) {
        PaymentStatusDraft paymentStatusDraft = builder.buildUnchecked();
        Assertions.assertThat(paymentStatusDraft).isInstanceOf(PaymentStatusDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentStatusDraft.builder().interfaceCode("interfaceCode") },
                new Object[] { PaymentStatusDraft.builder().interfaceText("interfaceText") },
                new Object[] { PaymentStatusDraft.builder()
                        .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) } };
    }

    @Test
    public void interfaceCode() {
        PaymentStatusDraft value = PaymentStatusDraft.of();
        value.setInterfaceCode("interfaceCode");
        Assertions.assertThat(value.getInterfaceCode()).isEqualTo("interfaceCode");
    }

    @Test
    public void interfaceText() {
        PaymentStatusDraft value = PaymentStatusDraft.of();
        value.setInterfaceText("interfaceText");
        Assertions.assertThat(value.getInterfaceText()).isEqualTo("interfaceText");
    }

    @Test
    public void state() {
        PaymentStatusDraft value = PaymentStatusDraft.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }
}
