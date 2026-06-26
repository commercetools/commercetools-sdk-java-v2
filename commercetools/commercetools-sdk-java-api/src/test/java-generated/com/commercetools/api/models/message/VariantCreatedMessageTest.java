
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantCreatedMessageBuilder builder) {
        VariantCreatedMessage variantCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(variantCreatedMessage).isInstanceOf(VariantCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", VariantCreatedMessage.builder().id("id") },
                new Object[] { "productId", VariantCreatedMessage.builder().productId("productId") },
                new Object[] { "variantId", VariantCreatedMessage.builder().variantId(5) },
                new Object[] { "key", VariantCreatedMessage.builder().key("key") },
                new Object[] { "sku", VariantCreatedMessage.builder().sku("sku") },
                new Object[] { "attributes",
                        VariantCreatedMessage.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { "assets", VariantCreatedMessage.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl())) },
                new Object[] { "images", VariantCreatedMessage.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "publish", VariantCreatedMessage.builder().publish(true) } };
    }

    @Test
    public void id() {
        VariantCreatedMessage value = VariantCreatedMessage.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void productId() {
        VariantCreatedMessage value = VariantCreatedMessage.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        VariantCreatedMessage value = VariantCreatedMessage.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void key() {
        VariantCreatedMessage value = VariantCreatedMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        VariantCreatedMessage value = VariantCreatedMessage.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void attributes() {
        VariantCreatedMessage value = VariantCreatedMessage.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }

    @Test
    public void assets() {
        VariantCreatedMessage value = VariantCreatedMessage.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
    }

    @Test
    public void images() {
        VariantCreatedMessage value = VariantCreatedMessage.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void publish() {
        VariantCreatedMessage value = VariantCreatedMessage.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }
}
