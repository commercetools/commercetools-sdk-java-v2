
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchFuzzyValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchFuzzyValueBuilder builder) {
        SearchFuzzyValue searchFuzzyValue = builder.buildUnchecked();
        Assertions.assertThat(searchFuzzyValue).isInstanceOf(SearchFuzzyValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", SearchFuzzyValue.builder().value("value") },
                new Object[] { "level", SearchFuzzyValue.builder().level(2) },
                new Object[] { "language", SearchFuzzyValue.builder().language("language") },
                new Object[] { "mustMatch", SearchFuzzyValue.builder()
                        .mustMatch(com.commercetools.api.models.search.SearchMatchType.findEnum("any")) } };
    }

    @Test
    public void value() {
        SearchFuzzyValue value = SearchFuzzyValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void level() {
        SearchFuzzyValue value = SearchFuzzyValue.of();
        value.setLevel(2);
        Assertions.assertThat(value.getLevel()).isEqualTo(2);
    }

    @Test
    public void language() {
        SearchFuzzyValue value = SearchFuzzyValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void mustMatch() {
        SearchFuzzyValue value = SearchFuzzyValue.of();
        value.setMustMatch(com.commercetools.api.models.search.SearchMatchType.findEnum("any"));
        Assertions.assertThat(value.getMustMatch())
                .isEqualTo(com.commercetools.api.models.search.SearchMatchType.findEnum("any"));
    }
}
