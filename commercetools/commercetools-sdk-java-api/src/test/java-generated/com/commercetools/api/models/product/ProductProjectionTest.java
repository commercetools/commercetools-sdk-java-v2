
package com.commercetools.api.models.product;

import java.time.ZonedDateTime;
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
public class ProductProjectionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductProjectionBuilder builder) {
        ProductProjection productProjection = builder.buildUnchecked();
        Assertions.assertThat(productProjection).isInstanceOf(ProductProjection.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductProjection.builder().id("id") },
                new Object[] { ProductProjection.builder().version(2L) },
                new Object[] { ProductProjection.builder().key("key") },
                new Object[] { ProductProjection.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ProductProjection.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ProductProjection.builder()
                        .productType(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl()) },
                new Object[] { ProductProjection.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductProjection.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductProjection.builder()
                        .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductProjection.builder()
                        .categories(Collections
                                .singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl())) },
                new Object[] { ProductProjection.builder()
                        .categoryOrderHints(new com.commercetools.api.models.product.CategoryOrderHintsImpl()) },
                new Object[] { ProductProjection.builder()
                        .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductProjection.builder()
                        .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductProjection.builder()
                        .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductProjection.builder()
                        .searchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl()) },
                new Object[] { ProductProjection.builder().hasStagedChanges(true) },
                new Object[] { ProductProjection.builder().published(true) },
                new Object[] { ProductProjection.builder()
                        .masterVariant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] {
                        ProductProjection.builder()
                                .variants(Collections.singletonList(
                                    new com.commercetools.api.models.product.ProductVariantImpl())) },
                new Object[] { ProductProjection.builder()
                        .taxCategory(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl()) },
                new Object[] { ProductProjection.builder()
                        .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { ProductProjection.builder()
                        .reviewRatingStatistics(new com.commercetools.api.models.review.ReviewRatingStatisticsImpl()) },
                new Object[] { ProductProjection.builder()
                        .priceMode(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded")) } };
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
}
