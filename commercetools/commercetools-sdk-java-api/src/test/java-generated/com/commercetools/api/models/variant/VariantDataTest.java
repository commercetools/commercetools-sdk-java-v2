
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantDataBuilder builder) {
        VariantData variantData = builder.buildUnchecked();
        Assertions.assertThat(variantData).isInstanceOf(VariantData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", VariantData.builder().sku("sku") },
                new Object[] { "images", VariantData.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "attributes",
                        VariantData.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { "assets", VariantData.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl())) } };
    }

    @Test
    public void sku() {
        VariantData value = VariantData.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void images() {
        VariantData value = VariantData.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void attributes() {
        VariantData value = VariantData.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }

    @Test
    public void assets() {
        VariantData value = VariantData.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
    }
}
