
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
public class SearchFullTextPrefixValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchFullTextPrefixValueBuilder builder) {
        SearchFullTextPrefixValue searchFullTextPrefixValue = builder.buildUnchecked();
        Assertions.assertThat(searchFullTextPrefixValue).isInstanceOf(SearchFullTextPrefixValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchFullTextPrefixValue.builder().value("value") },
                new Object[] { SearchFullTextPrefixValue.builder().language("language") },
                new Object[] { SearchFullTextPrefixValue.builder()
                        .mustMatch(com.commercetools.api.models.search.SearchMatchType.findEnum("any")) } };
    }

    @Test
    public void value() {
        SearchFullTextPrefixValue value = SearchFullTextPrefixValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        SearchFullTextPrefixValue value = SearchFullTextPrefixValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void mustMatch() {
        SearchFullTextPrefixValue value = SearchFullTextPrefixValue.of();
        value.setMustMatch(com.commercetools.api.models.search.SearchMatchType.findEnum("any"));
        Assertions.assertThat(value.getMustMatch())
                .isEqualTo(com.commercetools.api.models.search.SearchMatchType.findEnum("any"));
    }
}
