
package com.commercetools.api.models.search;

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
public class SearchFullTextValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchFullTextValueBuilder builder) {
        SearchFullTextValue searchFullTextValue = builder.buildUnchecked();
        Assertions.assertThat(searchFullTextValue).isInstanceOf(SearchFullTextValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchFullTextValue.builder().value("value") },
                new Object[] { SearchFullTextValue.builder().language("language") },
                new Object[] { SearchFullTextValue.builder()
                        .mustMatch(com.commercetools.api.models.search.SearchMatchType.findEnum("any")) } };
    }

    @Test
    public void value() {
        SearchFullTextValue value = SearchFullTextValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        SearchFullTextValue value = SearchFullTextValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void mustMatch() {
        SearchFullTextValue value = SearchFullTextValue.of();
        value.setMustMatch(com.commercetools.api.models.search.SearchMatchType.findEnum("any"));
        Assertions.assertThat(value.getMustMatch())
                .isEqualTo(com.commercetools.api.models.search.SearchMatchType.findEnum("any"));
    }
}
