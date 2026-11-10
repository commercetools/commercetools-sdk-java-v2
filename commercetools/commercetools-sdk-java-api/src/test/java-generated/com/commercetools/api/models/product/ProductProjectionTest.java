
package com.commercetools.api.models.product;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductProjectionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductProjectionBuilder builder) {
        ProductProjection productProjection = builder.buildUnchecked();
        Assertions.assertThat(productProjection).isInstanceOf(ProductProjection.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductProjection.builder().id("id") },
                new Object[] { "version", ProductProjection.builder().version(2L) },
                new Object[] { "key", ProductProjection.builder().key("key") },
                new Object[] { "createdAt",
                        ProductProjection.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        ProductProjection.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "productType", ProductProjection.builder()
                        .productType(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl()) },
                new Object[] { "name",
                        ProductProjection.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        ProductProjection.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "slug",
                        ProductProjection.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "categories",
                        ProductProjection.builder()
                                .categories(Collections.singletonList(
                                    new com.commercetools.api.models.category.CategoryReferenceImpl())) },
                new Object[] { "categoryOrderHints", ProductProjection.builder()
                        .categoryOrderHints(new com.commercetools.api.models.product.CategoryOrderHintsImpl()) },
                new Object[] { "metaTitle",
                        ProductProjection.builder()
                                .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaDescription",
                        ProductProjection.builder()
                                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaKeywords",
                        ProductProjection.builder()
                                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "searchKeywords",
                        ProductProjection.builder()
                                .searchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl()) },
                new Object[] { "hasStagedChanges", ProductProjection.builder().hasStagedChanges(true) },
                new Object[] { "published", ProductProjection.builder().published(true) },
                new Object[] { "masterVariant",
                        ProductProjection.builder()
                                .masterVariant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { "variants",
                        ProductProjection.builder()
                                .variants(Collections.singletonList(
                                    new com.commercetools.api.models.product.ProductVariantImpl())) },
                new Object[] { "taxCategory", ProductProjection.builder()
                        .taxCategory(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl()) },
                new Object[] { "state",
                        ProductProjection.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "reviewRatingStatistics", ProductProjection.builder()
                        .reviewRatingStatistics(new com.commercetools.api.models.review.ReviewRatingStatisticsImpl()) },
                new Object[] { "priceMode", ProductProjection.builder()
                        .priceMode(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded")) },
                new Object[] { "attributes", ProductProjection.builder()
                        .attributes(
                            Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl())) } };
    }

    @Test
    public void id() {
        ProductProjection value = ProductProjection.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ProductProjection value = ProductProjection.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        ProductProjection value = ProductProjection.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void createdAt() {
        ProductProjection value = ProductProjection.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ProductProjection value = ProductProjection.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void productType() {
        ProductProjection value = ProductProjection.of();
        value.setProductType(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl());
        Assertions.assertThat(value.getProductType())
                .isEqualTo(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl());
    }

    @Test
    public void name() {
        ProductProjection value = ProductProjection.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        ProductProjection value = ProductProjection.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        ProductProjection value = ProductProjection.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void categories() {
        ProductProjection value = ProductProjection.of();
        value.setCategories(
            Collections.singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl()));
        Assertions.assertThat(value.getCategories())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl()));
    }

    @Test
    public void categoryOrderHints() {
        ProductProjection value = ProductProjection.of();
        value.setCategoryOrderHints(new com.commercetools.api.models.product.CategoryOrderHintsImpl());
        Assertions.assertThat(value.getCategoryOrderHints())
                .isEqualTo(new com.commercetools.api.models.product.CategoryOrderHintsImpl());
    }

    @Test
    public void metaTitle() {
        ProductProjection value = ProductProjection.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        ProductProjection value = ProductProjection.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        ProductProjection value = ProductProjection.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void searchKeywords() {
        ProductProjection value = ProductProjection.of();
        value.setSearchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl());
        Assertions.assertThat(value.getSearchKeywords())
                .isEqualTo(new com.commercetools.api.models.product.SearchKeywordsImpl());
    }

    @Test
    public void hasStagedChanges() {
        ProductProjection value = ProductProjection.of();
        value.setHasStagedChanges(true);
        Assertions.assertThat(value.getHasStagedChanges()).isEqualTo(true);
    }

    @Test
    public void published() {
        ProductProjection value = ProductProjection.of();
        value.setPublished(true);
        Assertions.assertThat(value.getPublished()).isEqualTo(true);
    }

    @Test
    public void masterVariant() {
        ProductProjection value = ProductProjection.of();
        value.setMasterVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getMasterVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void variants() {
        ProductProjection value = ProductProjection.of();
        value.setVariants(Collections.singletonList(new com.commercetools.api.models.product.ProductVariantImpl()));
        Assertions.assertThat(value.getVariants())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.ProductVariantImpl()));
    }

    @Test
    public void taxCategory() {
        ProductProjection value = ProductProjection.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl());
    }

    @Test
    public void state() {
        ProductProjection value = ProductProjection.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void reviewRatingStatistics() {
        ProductProjection value = ProductProjection.of();
        value.setReviewRatingStatistics(new com.commercetools.api.models.review.ReviewRatingStatisticsImpl());
        Assertions.assertThat(value.getReviewRatingStatistics())
                .isEqualTo(new com.commercetools.api.models.review.ReviewRatingStatisticsImpl());
    }

    @Test
    public void priceMode() {
        ProductProjection value = ProductProjection.of();
        value.setPriceMode(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
    }

    @Test
    public void attributes() {
        ProductProjection value = ProductProjection.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }
}
