
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
public class QuoteRenegotiationRequestedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRenegotiationRequestedMessagePayloadBuilder builder) {
        QuoteRenegotiationRequestedMessagePayload quoteRenegotiationRequestedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteRenegotiationRequestedMessagePayload)
                .isInstanceOf(QuoteRenegotiationRequestedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { QuoteRenegotiationRequestedMessagePayload.builder().buyerComment("buyerComment") } };
    }

    @Test
    public void buyerComment() {
        QuoteRenegotiationRequestedMessagePayload value = QuoteRenegotiationRequestedMessagePayload.of();
        value.setBuyerComment("buyerComment");
        Assertions.assertThat(value.getBuyerComment()).isEqualTo("buyerComment");
    }
}
