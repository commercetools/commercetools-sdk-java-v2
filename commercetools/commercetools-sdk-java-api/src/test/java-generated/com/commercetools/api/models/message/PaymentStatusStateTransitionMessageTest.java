
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
public class PaymentStatusStateTransitionMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentStatusStateTransitionMessageBuilder builder) {
        PaymentStatusStateTransitionMessage paymentStatusStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentStatusStateTransitionMessage)
                .isInstanceOf(PaymentStatusStateTransitionMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentStatusStateTransitionMessage.builder()
                        .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { PaymentStatusStateTransitionMessage.builder().force(true) } };
    }

    @Test
    public void state() {
        PaymentStatusStateTransitionMessage value = PaymentStatusStateTransitionMessage.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        PaymentStatusStateTransitionMessage value = PaymentStatusStateTransitionMessage.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
