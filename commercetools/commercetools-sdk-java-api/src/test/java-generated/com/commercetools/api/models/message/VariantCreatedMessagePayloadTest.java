
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantCreatedMessagePayloadBuilder builder) {
        VariantCreatedMessagePayload variantCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(variantCreatedMessagePayload).isInstanceOf(VariantCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", VariantCreatedMessagePayload.builder().id("id") },
                new Object[] { "productId", VariantCreatedMessagePayload.builder().productId("productId") },
                new Object[] { "variantId", VariantCreatedMessagePayload.builder().variantId(5) },
                new Object[] { "key", VariantCreatedMessagePayload.builder().key("key") },
                new Object[] { "sku", VariantCreatedMessagePayload.builder().sku("sku") },
                new Object[] { "attributes",
                        VariantCreatedMessagePayload.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { "assets", VariantCreatedMessagePayload.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl())) },
                new Object[] { "images", VariantCreatedMessagePayload.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "publish", VariantCreatedMessagePayload.builder().publish(true) } };
    }

    @Test
    public void id() {
        VariantCreatedMessagePayload value = VariantCreatedMessagePayload.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void productId() {
        VariantCreatedMessagePayload value = VariantCreatedMessagePayload.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        VariantCreatedMessagePayload value = VariantCreatedMessagePayload.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void key() {
        VariantCreatedMessagePayload value = VariantCreatedMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        VariantCreatedMessagePayload value = VariantCreatedMessagePayload.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void attributes() {
        VariantCreatedMessagePayload value = VariantCreatedMessagePayload.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }

    @Test
    public void assets() {
        VariantCreatedMessagePayload value = VariantCreatedMessagePayload.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
    }

    @Test
    public void images() {
        VariantCreatedMessagePayload value = VariantCreatedMessagePayload.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void publish() {
        VariantCreatedMessagePayload value = VariantCreatedMessagePayload.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }
}
