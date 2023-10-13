
package com.commercetools.api.models.quote_request;

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
public class QuoteRequestReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestReferenceBuilder builder) {
        QuoteRequestReference quoteRequestReference = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestReference).isInstanceOf(QuoteRequestReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuoteRequestReference.builder()
                .obj(new com.commercetools.api.models.quote_request.QuoteRequestImpl()) } };
    }

    @Test
    public void obj() {
        QuoteRequestReference value = QuoteRequestReference.of();
        value.setObj(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
    }
}
