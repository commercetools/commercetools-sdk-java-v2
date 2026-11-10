
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchMatchingVariantTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchMatchingVariantBuilder builder) {
        SearchMatchingVariant searchMatchingVariant = builder.buildUnchecked();
        Assertions.assertThat(searchMatchingVariant).isInstanceOf(SearchMatchingVariant.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", SearchMatchingVariant.builder().id(2) },
                new Object[] { "sku", SearchMatchingVariant.builder().sku("sku") } };
    }

    @Test
    public void id() {
        SearchMatchingVariant value = SearchMatchingVariant.of();
        value.setId(2);
        Assertions.assertThat(value.getId()).isEqualTo(2);
    }

    @Test
    public void sku() {
        SearchMatchingVariant value = SearchMatchingVariant.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }
}
