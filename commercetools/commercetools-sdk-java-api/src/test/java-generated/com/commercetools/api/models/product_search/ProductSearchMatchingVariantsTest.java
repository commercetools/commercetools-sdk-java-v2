
package com.commercetools.api.models.product_search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchMatchingVariantsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchMatchingVariantsBuilder builder) {
        ProductSearchMatchingVariants productSearchMatchingVariants = builder.buildUnchecked();
        Assertions.assertThat(productSearchMatchingVariants).isInstanceOf(ProductSearchMatchingVariants.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "allMatched", ProductSearchMatchingVariants.builder().allMatched(true) },
                new Object[] { "matchedVariants", ProductSearchMatchingVariants.builder()
                        .matchedVariants(Collections.singletonList(
                            new com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryImpl())) } };
    }

    @Test
    public void allMatched() {
        ProductSearchMatchingVariants value = ProductSearchMatchingVariants.of();
        value.setAllMatched(true);
        Assertions.assertThat(value.getAllMatched()).isEqualTo(true);
    }

    @Test
    public void matchedVariants() {
        ProductSearchMatchingVariants value = ProductSearchMatchingVariants.of();
        value.setMatchedVariants(Collections.singletonList(
            new com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryImpl()));
        Assertions.assertThat(value.getMatchedVariants())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryImpl()));
    }
}
