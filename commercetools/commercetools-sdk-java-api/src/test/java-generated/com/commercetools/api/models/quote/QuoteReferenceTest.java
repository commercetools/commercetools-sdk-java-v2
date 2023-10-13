
package com.commercetools.api.models.quote;

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
public class QuoteReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteReferenceBuilder builder) {
        QuoteReference quoteReference = builder.buildUnchecked();
        Assertions.assertThat(quoteReference).isInstanceOf(QuoteReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { QuoteReference.builder().obj(new com.commercetools.api.models.quote.QuoteImpl()) } };
    }

    @Test
    public void obj() {
        QuoteReference value = QuoteReference.of();
        value.setObj(new com.commercetools.api.models.quote.QuoteImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.quote.QuoteImpl());
    }
}
