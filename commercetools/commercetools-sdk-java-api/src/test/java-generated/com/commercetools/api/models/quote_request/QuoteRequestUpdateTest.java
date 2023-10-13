
package com.commercetools.api.models.quote_request;

import java.util.Collections;

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
public class QuoteRequestUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestUpdateBuilder builder) {
        QuoteRequestUpdate quoteRequestUpdate = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestUpdate).isInstanceOf(QuoteRequestUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuoteRequestUpdate.builder().version(2L) },
                new Object[] { QuoteRequestUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.quote_request.QuoteRequestUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        QuoteRequestUpdate value = QuoteRequestUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        QuoteRequestUpdate value = QuoteRequestUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.quote_request.QuoteRequestUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.quote_request.QuoteRequestUpdateActionImpl()));
    }
}
