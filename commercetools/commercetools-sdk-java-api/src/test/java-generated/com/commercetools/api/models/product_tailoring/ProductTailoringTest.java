
package com.commercetools.api.models.product_tailoring;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringBuilder builder) {
        ProductTailoring productTailoring = builder.buildUnchecked();
        Assertions.assertThat(productTailoring).isInstanceOf(ProductTailoring.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductTailoring.builder().id("id") },
                new Object[] { "version", ProductTailoring.builder().version(2L) },
                new Object[] { "createdAt",
                        ProductTailoring.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        ProductTailoring.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        ProductTailoring.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        ProductTailoring.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "key", ProductTailoring.builder().key("key") },
                new Object[] { "store",
                        ProductTailoring.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "product",
                        ProductTailoring.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "published", ProductTailoring.builder().published(true) },
                new Object[] { "current", ProductTailoring.builder()
                        .current(new com.commercetools.api.models.product_tailoring.ProductTailoringDataImpl()) },
                new Object[] { "staged", ProductTailoring.builder()
                        .staged(new com.commercetools.api.models.product_tailoring.ProductTailoringDataImpl()) },
                new Object[] { "hasStagedChanges", ProductTailoring.builder().hasStagedChanges(true) },
                new Object[] { "warnings",
                        ProductTailoring.builder()
                                .warnings(Collections.singletonList(
                                    new com.commercetools.api.models.warning.WarningObjectImpl())) } };
    }

    @Test
    public void id() {
        ProductTailoring value = ProductTailoring.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ProductTailoring value = ProductTailoring.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        ProductTailoring value = ProductTailoring.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ProductTailoring value = ProductTailoring.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        ProductTailoring value = ProductTailoring.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        ProductTailoring value = ProductTailoring.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        ProductTailoring value = ProductTailoring.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void store() {
        ProductTailoring value = ProductTailoring.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void product() {
        ProductTailoring value = ProductTailoring.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void published() {
        ProductTailoring value = ProductTailoring.of();
        value.setPublished(true);
        Assertions.assertThat(value.getPublished()).isEqualTo(true);
    }

    @Test
    public void current() {
        ProductTailoring value = ProductTailoring.of();
        value.setCurrent(new com.commercetools.api.models.product_tailoring.ProductTailoringDataImpl());
        Assertions.assertThat(value.getCurrent())
                .isEqualTo(new com.commercetools.api.models.product_tailoring.ProductTailoringDataImpl());
    }

    @Test
    public void staged() {
        ProductTailoring value = ProductTailoring.of();
        value.setStaged(new com.commercetools.api.models.product_tailoring.ProductTailoringDataImpl());
        Assertions.assertThat(value.getStaged())
                .isEqualTo(new com.commercetools.api.models.product_tailoring.ProductTailoringDataImpl());
    }

    @Test
    public void hasStagedChanges() {
        ProductTailoring value = ProductTailoring.of();
        value.setHasStagedChanges(true);
        Assertions.assertThat(value.getHasStagedChanges()).isEqualTo(true);
    }

    @Test
    public void warnings() {
        ProductTailoring value = ProductTailoring.of();
        value.setWarnings(Collections.singletonList(new com.commercetools.api.models.warning.WarningObjectImpl()));
        Assertions.assertThat(value.getWarnings())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.warning.WarningObjectImpl()));
    }
}
