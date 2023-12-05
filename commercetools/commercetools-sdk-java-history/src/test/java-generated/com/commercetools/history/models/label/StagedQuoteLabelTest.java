
package com.commercetools.history.models.label;

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
public class StagedQuoteLabelTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteLabelBuilder builder) {
        StagedQuoteLabel stagedQuoteLabel = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteLabel).isInstanceOf(StagedQuoteLabel.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedQuoteLabel.builder().key("key") },
                new Object[] { StagedQuoteLabel.builder()
                        .customer(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { StagedQuoteLabel.builder()
                        .quoteRequest(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void key() {
        StagedQuoteLabel value = StagedQuoteLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customer() {
        StagedQuoteLabel value = StagedQuoteLabel.of();
        value.setCustomer(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void quoteRequest() {
        StagedQuoteLabel value = StagedQuoteLabel.of();
        value.setQuoteRequest(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getQuoteRequest())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
