
package com.commercetools.api.models.product;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductBuilder builder) {
        Product product = builder.buildUnchecked();
        Assertions.assertThat(product).isInstanceOf(Product.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Product.builder().id("id") },
                new Object[] { "version", Product.builder().version(2L) },
                new Object[] { "createdAt", Product.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Product.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Product.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Product.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "key", Product.builder().key("key") },
                new Object[] { "productType", Product.builder()
                        .productType(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl()) },
                new Object[] { "masterData",
                        Product.builder()
                                .masterData(new com.commercetools.api.models.product.ProductCatalogDataImpl()) },
                new Object[] { "taxCategory", Product.builder()
                        .taxCategory(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl()) },
                new Object[] { "state",
                        Product.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "reviewRatingStatistics", Product.builder()
                        .reviewRatingStatistics(new com.commercetools.api.models.review.ReviewRatingStatisticsImpl()) },
                new Object[] { "priceMode", Product.builder()
                        .priceMode(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded")) },
                new Object[] { "warnings",
                        Product.builder()
                                .warnings(Collections.singletonList(
                                    new com.commercetools.api.models.warning.WarningObjectImpl())) } };
    }

    @Test
    public void id() {
        Product value = Product.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Product value = Product.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Product value = Product.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Product value = Product.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Product value = Product.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Product value = Product.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        Product value = Product.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void productType() {
        Product value = Product.of();
        value.setProductType(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl());
        Assertions.assertThat(value.getProductType())
                .isEqualTo(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl());
    }

    @Test
    public void masterData() {
        Product value = Product.of();
        value.setMasterData(new com.commercetools.api.models.product.ProductCatalogDataImpl());
        Assertions.assertThat(value.getMasterData())
                .isEqualTo(new com.commercetools.api.models.product.ProductCatalogDataImpl());
    }

    @Test
    public void taxCategory() {
        Product value = Product.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl());
    }

    @Test
    public void state() {
        Product value = Product.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void reviewRatingStatistics() {
        Product value = Product.of();
        value.setReviewRatingStatistics(new com.commercetools.api.models.review.ReviewRatingStatisticsImpl());
        Assertions.assertThat(value.getReviewRatingStatistics())
                .isEqualTo(new com.commercetools.api.models.review.ReviewRatingStatisticsImpl());
    }

    @Test
    public void priceMode() {
        Product value = Product.of();
        value.setPriceMode(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
    }

    @Test
    public void warnings() {
        Product value = Product.of();
        value.setWarnings(Collections.singletonList(new com.commercetools.api.models.warning.WarningObjectImpl()));
        Assertions.assertThat(value.getWarnings())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.warning.WarningObjectImpl()));
    }
}
