
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
public class StagedQuoteSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteSetCustomFieldActionBuilder builder) {
        StagedQuoteSetCustomFieldAction stagedQuoteSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteSetCustomFieldAction).isInstanceOf(StagedQuoteSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedQuoteSetCustomFieldAction.builder().name("name") },
                new Object[] { StagedQuoteSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        StagedQuoteSetCustomFieldAction value = StagedQuoteSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedQuoteSetCustomFieldAction value = StagedQuoteSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
