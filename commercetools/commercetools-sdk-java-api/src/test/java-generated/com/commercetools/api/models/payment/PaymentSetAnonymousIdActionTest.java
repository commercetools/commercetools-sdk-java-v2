
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
public class PaymentSetAnonymousIdActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentSetAnonymousIdActionBuilder builder) {
        PaymentSetAnonymousIdAction paymentSetAnonymousIdAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetAnonymousIdAction).isInstanceOf(PaymentSetAnonymousIdAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentSetAnonymousIdAction.builder().anonymousId("anonymousId") } };
    }

    @Test
    public void anonymousId() {
        PaymentSetAnonymousIdAction value = PaymentSetAnonymousIdAction.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }
}
