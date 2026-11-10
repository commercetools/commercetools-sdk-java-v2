
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchFullTextPrefixValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchFullTextPrefixValueBuilder builder) {
        SearchFullTextPrefixValue searchFullTextPrefixValue = builder.buildUnchecked();
        Assertions.assertThat(searchFullTextPrefixValue).isInstanceOf(SearchFullTextPrefixValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", SearchFullTextPrefixValue.builder().value("value") },
                new Object[] { "language", SearchFullTextPrefixValue.builder().language("language") },
                new Object[] { "mustMatch", SearchFullTextPrefixValue.builder()
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
