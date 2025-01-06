
package com.commercetools.api.models.search;

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
public class SearchExactValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchExactValueBuilder builder) {
        SearchExactValue searchExactValue = builder.buildUnchecked();
        Assertions.assertThat(searchExactValue).isInstanceOf(SearchExactValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchExactValue.builder().value("value") },
                new Object[] { SearchExactValue.builder().values(Collections.singletonList("values")) },
                new Object[] { SearchExactValue.builder().language("language") },
                new Object[] { SearchExactValue.builder().caseInsensitive(true) } };
    }

    @Test
    public void value() {
        SearchExactValue value = SearchExactValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void values() {
        SearchExactValue value = SearchExactValue.of();
        value.setValues(Collections.singletonList("values"));
        Assertions.assertThat(value.getValues()).isEqualTo(Collections.singletonList("values"));
    }

    @Test
    public void language() {
        SearchExactValue value = SearchExactValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void caseInsensitive() {
        SearchExactValue value = SearchExactValue.of();
        value.setCaseInsensitive(true);
        Assertions.assertThat(value.getCaseInsensitive()).isEqualTo(true);
    }
}
