
package com.commercetools.api.models.search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchExactValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchExactValueBuilder builder) {
        SearchExactValue searchExactValue = builder.buildUnchecked();
        Assertions.assertThat(searchExactValue).isInstanceOf(SearchExactValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", SearchExactValue.builder().value("value") },
                new Object[] { "values", SearchExactValue.builder().values(Collections.singletonList("values")) },
                new Object[] { "language", SearchExactValue.builder().language("language") },
                new Object[] { "caseInsensitive", SearchExactValue.builder().caseInsensitive(true) } };
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
