
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
public class PaymentInteractionAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentInteractionAddedMessageBuilder builder) {
        PaymentInteractionAddedMessage paymentInteractionAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentInteractionAddedMessage).isInstanceOf(PaymentInteractionAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentInteractionAddedMessage.builder()
                .interaction(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void interaction() {
        PaymentInteractionAddedMessage value = PaymentInteractionAddedMessage.of();
        value.setInteraction(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getInteraction())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
