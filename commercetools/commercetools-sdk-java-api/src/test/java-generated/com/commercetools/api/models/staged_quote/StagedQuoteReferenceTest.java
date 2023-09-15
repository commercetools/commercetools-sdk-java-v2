
package com.commercetools.api.models.staged_quote;

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
public class StagedQuoteReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteReferenceBuilder builder) {
        StagedQuoteReference stagedQuoteReference = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteReference).isInstanceOf(StagedQuoteReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                StagedQuoteReference.builder().obj(new com.commercetools.api.models.staged_quote.StagedQuoteImpl()) } };
    }

    @Test
    public void obj() {
        StagedQuoteReference value = StagedQuoteReference.of();
        value.setObj(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
    }
}
