
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
public class QuoteRenegotiationRequestedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRenegotiationRequestedMessageBuilder builder) {
        QuoteRenegotiationRequestedMessage quoteRenegotiationRequestedMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteRenegotiationRequestedMessage)
                .isInstanceOf(QuoteRenegotiationRequestedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { QuoteRenegotiationRequestedMessage.builder().buyerComment("buyerComment") } };
    }

    @Test
    public void buyerComment() {
        QuoteRenegotiationRequestedMessage value = QuoteRenegotiationRequestedMessage.of();
        value.setBuyerComment("buyerComment");
        Assertions.assertThat(value.getBuyerComment()).isEqualTo("buyerComment");
    }
}
