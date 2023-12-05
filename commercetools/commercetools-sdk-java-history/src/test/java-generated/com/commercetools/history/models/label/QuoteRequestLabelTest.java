
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
public class QuoteRequestLabelTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestLabelBuilder builder) {
        QuoteRequestLabel quoteRequestLabel = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestLabel).isInstanceOf(QuoteRequestLabel.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuoteRequestLabel.builder().key("key") }, new Object[] {
                QuoteRequestLabel.builder().customer(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void key() {
        QuoteRequestLabel value = QuoteRequestLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customer() {
        QuoteRequestLabel value = QuoteRequestLabel.of();
        value.setCustomer(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
