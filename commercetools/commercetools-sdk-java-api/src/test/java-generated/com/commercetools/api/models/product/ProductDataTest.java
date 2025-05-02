
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDataBuilder builder) {
        ProductData productData = builder.buildUnchecked();
        Assertions.assertThat(productData).isInstanceOf(ProductData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        ProductData.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "categories",
                        ProductData.builder()
                                .categories(Collections.singletonList(
                                    new com.commercetools.api.models.category.CategoryReferenceImpl())) },
                new Object[] { "categoryOrderHints", ProductData.builder()
                        .categoryOrderHints(new com.commercetools.api.models.product.CategoryOrderHintsImpl()) },
                new Object[] { "description",
                        ProductData.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "slug",
                        ProductData.builder().slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaTitle",
                        ProductData.builder()
                                .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaDescription",
                        ProductData.builder()
                                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaKeywords",
                        ProductData.builder()
                                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "masterVariant",
                        ProductData.builder()
                                .masterVariant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { "variants",
                        ProductData.builder()
                                .variants(Collections.singletonList(
                                    new com.commercetools.api.models.product.ProductVariantImpl())) },
                new Object[] { "searchKeywords", ProductData.builder()
                        .searchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl()) } };
    }

    @Test
    public void name() {
        ProductData value = ProductData.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void categories() {
        ProductData value = ProductData.of();
        value.setCategories(
            Collections.singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl()));
        Assertions.assertThat(value.getCategories())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl()));
    }

    @Test
    public void categoryOrderHints() {
        ProductData value = ProductData.of();
        value.setCategoryOrderHints(new com.commercetools.api.models.product.CategoryOrderHintsImpl());
        Assertions.assertThat(value.getCategoryOrderHints())
                .isEqualTo(new com.commercetools.api.models.product.CategoryOrderHintsImpl());
    }

    @Test
    public void description() {
        ProductData value = ProductData.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        ProductData value = ProductData.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaTitle() {
        ProductData value = ProductData.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        ProductData value = ProductData.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        ProductData value = ProductData.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void masterVariant() {
        ProductData value = ProductData.of();
        value.setMasterVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getMasterVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void variants() {
        ProductData value = ProductData.of();
        value.setVariants(Collections.singletonList(new com.commercetools.api.models.product.ProductVariantImpl()));
        Assertions.assertThat(value.getVariants())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.ProductVariantImpl()));
    }

    @Test
    public void searchKeywords() {
        ProductData value = ProductData.of();
        value.setSearchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl());
        Assertions.assertThat(value.getSearchKeywords())
                .isEqualTo(new com.commercetools.api.models.product.SearchKeywordsImpl());
    }
}
