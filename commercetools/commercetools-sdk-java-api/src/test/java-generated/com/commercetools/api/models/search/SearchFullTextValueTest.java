
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchFullTextValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchFullTextValueBuilder builder) {
        SearchFullTextValue searchFullTextValue = builder.buildUnchecked();
        Assertions.assertThat(searchFullTextValue).isInstanceOf(SearchFullTextValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", SearchFullTextValue.builder().value("value") },
                new Object[] { "language", SearchFullTextValue.builder().language("language") },
                new Object[] { "mustMatch", SearchFullTextValue.builder()
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
