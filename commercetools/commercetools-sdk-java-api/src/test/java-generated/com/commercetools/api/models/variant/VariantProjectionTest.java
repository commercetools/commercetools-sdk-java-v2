
package com.commercetools.api.models.variant;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantProjectionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantProjectionBuilder builder) {
        VariantProjection variantProjection = builder.buildUnchecked();
        Assertions.assertThat(variantProjection).isInstanceOf(VariantProjection.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", VariantProjection.builder().id("id") },
                new Object[] { "version", VariantProjection.builder().version(2L) },
                new Object[] { "createdAt",
                        VariantProjection.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "staged", VariantProjection.builder().staged(true) },
                new Object[] { "variantId", VariantProjection.builder().variantId(5) },
                new Object[] { "product",
                        VariantProjection.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "name",
                        VariantProjection.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "slug",
                        VariantProjection.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        VariantProjection.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", VariantProjection.builder().key("key") },
                new Object[] { "sku", VariantProjection.builder().sku("sku") },
                new Object[] { "images", VariantProjection.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "assets", VariantProjection.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl())) },
                new Object[] { "attributes",
                        VariantProjection.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { "price",
                        VariantProjection.builder().price(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "default", VariantProjection.builder()._default(true) } };
    }

    @Test
    public void id() {
        VariantProjection value = VariantProjection.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        VariantProjection value = VariantProjection.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        VariantProjection value = VariantProjection.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void staged() {
        VariantProjection value = VariantProjection.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void variantId() {
        VariantProjection value = VariantProjection.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void product() {
        VariantProjection value = VariantProjection.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void name() {
        VariantProjection value = VariantProjection.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        VariantProjection value = VariantProjection.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        VariantProjection value = VariantProjection.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        VariantProjection value = VariantProjection.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        VariantProjection value = VariantProjection.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void images() {
        VariantProjection value = VariantProjection.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        VariantProjection value = VariantProjection.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
    }

    @Test
    public void attributes() {
        VariantProjection value = VariantProjection.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }

    @Test
    public void price() {
        VariantProjection value = VariantProjection.of();
        value.setPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void _default() {
        VariantProjection value = VariantProjection.of();
        value.setDefault(true);
        Assertions.assertThat(value.getDefault()).isEqualTo(true);
    }
}
