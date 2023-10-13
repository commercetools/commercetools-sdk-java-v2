
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
public class PaymentInteractionAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentInteractionAddedMessagePayloadBuilder builder) {
        PaymentInteractionAddedMessagePayload paymentInteractionAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentInteractionAddedMessagePayload)
                .isInstanceOf(PaymentInteractionAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentInteractionAddedMessagePayload.builder()
                .interaction(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void interaction() {
        PaymentInteractionAddedMessagePayload value = PaymentInteractionAddedMessagePayload.of();
        value.setInteraction(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getInteraction())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
