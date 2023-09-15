
package com.commercetools.api.models.product;

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
public class SuggestionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SuggestionBuilder builder) {
        Suggestion suggestion = builder.buildUnchecked();
        Assertions.assertThat(suggestion).isInstanceOf(Suggestion.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Suggestion.builder().text("text") } };
    }

    @Test
    public void text() {
        Suggestion value = Suggestion.of();
        value.setText("text");
        Assertions.assertThat(value.getText()).isEqualTo("text");
    }
}
