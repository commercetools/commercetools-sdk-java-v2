
package com.commercetools.api.models.variant;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantBuilder builder) {
        Variant variant = builder.buildUnchecked();
        Assertions.assertThat(variant).isInstanceOf(Variant.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Variant.builder().id("id") },
                new Object[] { "version", Variant.builder().version(2L) },
                new Object[] { "createdAt", Variant.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Variant.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Variant.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Variant.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "key", Variant.builder().key("key") },
                new Object[] { "variantId", Variant.builder().variantId(5) },
                new Object[] { "product",
                        Variant.builder().product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "published", Variant.builder().published(true) },
                new Object[] { "current",
                        Variant.builder().current(new com.commercetools.api.models.variant.VariantDataImpl()) },
                new Object[] { "staged",
                        Variant.builder().staged(new com.commercetools.api.models.variant.VariantDataImpl()) } };
    }

    @Test
    public void id() {
        Variant value = Variant.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Variant value = Variant.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Variant value = Variant.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Variant value = Variant.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Variant value = Variant.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Variant value = Variant.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        Variant value = Variant.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void variantId() {
        Variant value = Variant.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void product() {
        Variant value = Variant.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void published() {
        Variant value = Variant.of();
        value.setPublished(true);
        Assertions.assertThat(value.getPublished()).isEqualTo(true);
    }

    @Test
    public void current() {
        Variant value = Variant.of();
        value.setCurrent(new com.commercetools.api.models.variant.VariantDataImpl());
        Assertions.assertThat(value.getCurrent()).isEqualTo(new com.commercetools.api.models.variant.VariantDataImpl());
    }

    @Test
    public void staged() {
        Variant value = Variant.of();
        value.setStaged(new com.commercetools.api.models.variant.VariantDataImpl());
        Assertions.assertThat(value.getStaged()).isEqualTo(new com.commercetools.api.models.variant.VariantDataImpl());
    }
}
