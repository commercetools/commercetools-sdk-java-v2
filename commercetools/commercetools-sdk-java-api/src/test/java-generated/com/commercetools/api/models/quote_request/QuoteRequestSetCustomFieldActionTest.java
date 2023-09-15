
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
public class QuoteRequestSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestSetCustomFieldActionBuilder builder) {
        QuoteRequestSetCustomFieldAction quoteRequestSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestSetCustomFieldAction).isInstanceOf(QuoteRequestSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuoteRequestSetCustomFieldAction.builder().name("name") },
                new Object[] { QuoteRequestSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        QuoteRequestSetCustomFieldAction value = QuoteRequestSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        QuoteRequestSetCustomFieldAction value = QuoteRequestSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
