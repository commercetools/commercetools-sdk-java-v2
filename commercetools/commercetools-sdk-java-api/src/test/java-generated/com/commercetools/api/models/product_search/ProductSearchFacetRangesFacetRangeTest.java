
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetRangesFacetRangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetRangesFacetRangeBuilder builder) {
        ProductSearchFacetRangesFacetRange productSearchFacetRangesFacetRange = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetRangesFacetRange)
                .isInstanceOf(ProductSearchFacetRangesFacetRange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "from", ProductSearchFacetRangesFacetRange.builder().from("from") },
                new Object[] { "to", ProductSearchFacetRangesFacetRange.builder().to("to") },
                new Object[] { "key", ProductSearchFacetRangesFacetRange.builder().key("key") } };
    }

    @Test
    public void from() {
        ProductSearchFacetRangesFacetRange value = ProductSearchFacetRangesFacetRange.of();
        value.setFrom("from");
        Assertions.assertThat(value.getFrom()).isEqualTo("from");
    }

    @Test
    public void to() {
        ProductSearchFacetRangesFacetRange value = ProductSearchFacetRangesFacetRange.of();
        value.setTo("to");
        Assertions.assertThat(value.getTo()).isEqualTo("to");
    }

    @Test
    public void key() {
        ProductSearchFacetRangesFacetRange value = ProductSearchFacetRangesFacetRange.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
