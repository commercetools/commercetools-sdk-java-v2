
package com.commercetools.history.models.common;

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
public class SuggestTokenizerTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SuggestTokenizerBuilder builder) {
        SuggestTokenizer suggestTokenizer = builder.buildUnchecked();
        Assertions.assertThat(suggestTokenizer).isInstanceOf(SuggestTokenizer.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SuggestTokenizer.builder().type("type") } };
    }

    @Test
    public void type() {
        SuggestTokenizer value = SuggestTokenizer.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }
}
