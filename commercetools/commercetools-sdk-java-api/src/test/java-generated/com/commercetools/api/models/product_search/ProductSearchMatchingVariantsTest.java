
package com.commercetools.api.models.product_search;

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
public class ProductSearchMatchingVariantsTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchMatchingVariantsBuilder builder) {
        ProductSearchMatchingVariants productSearchMatchingVariants = builder.buildUnchecked();
        Assertions.assertThat(productSearchMatchingVariants).isInstanceOf(ProductSearchMatchingVariants.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchMatchingVariants.builder().allMatched(true) },
                new Object[] { ProductSearchMatchingVariants.builder()
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
