
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetAssetCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetAssetCustomTypeActionBuilder builder) {
        ProductSetAssetCustomTypeAction productSetAssetCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAssetCustomTypeAction).isInstanceOf(ProductSetAssetCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductSetAssetCustomTypeAction.builder().variantId(5L) },
                new Object[] { "sku", ProductSetAssetCustomTypeAction.builder().sku("sku") },
                new Object[] { "staged", ProductSetAssetCustomTypeAction.builder().staged(true) },
                new Object[] { "assetId", ProductSetAssetCustomTypeAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductSetAssetCustomTypeAction.builder().assetKey("assetKey") },
                new Object[] { "type",
                        ProductSetAssetCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", ProductSetAssetCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void variantId() {
        ProductSetAssetCustomTypeAction value = ProductSetAssetCustomTypeAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetAssetCustomTypeAction value = ProductSetAssetCustomTypeAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductSetAssetCustomTypeAction value = ProductSetAssetCustomTypeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductSetAssetCustomTypeAction value = ProductSetAssetCustomTypeAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductSetAssetCustomTypeAction value = ProductSetAssetCustomTypeAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void type() {
        ProductSetAssetCustomTypeAction value = ProductSetAssetCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        ProductSetAssetCustomTypeAction value = ProductSetAssetCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
