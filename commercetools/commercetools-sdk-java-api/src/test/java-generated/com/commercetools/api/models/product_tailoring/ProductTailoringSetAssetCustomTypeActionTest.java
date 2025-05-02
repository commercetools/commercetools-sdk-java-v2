
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetAssetCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetAssetCustomTypeActionBuilder builder) {
        ProductTailoringSetAssetCustomTypeAction productTailoringSetAssetCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetCustomTypeAction)
                .isInstanceOf(ProductTailoringSetAssetCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringSetAssetCustomTypeAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringSetAssetCustomTypeAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringSetAssetCustomTypeAction.builder().staged(true) },
                new Object[] { "assetId", ProductTailoringSetAssetCustomTypeAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductTailoringSetAssetCustomTypeAction.builder().assetKey("assetKey") },
                new Object[] { "type",
                        ProductTailoringSetAssetCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", ProductTailoringSetAssetCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetAssetCustomTypeAction value = ProductTailoringSetAssetCustomTypeAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetAssetCustomTypeAction value = ProductTailoringSetAssetCustomTypeAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringSetAssetCustomTypeAction value = ProductTailoringSetAssetCustomTypeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringSetAssetCustomTypeAction value = ProductTailoringSetAssetCustomTypeAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringSetAssetCustomTypeAction value = ProductTailoringSetAssetCustomTypeAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void type() {
        ProductTailoringSetAssetCustomTypeAction value = ProductTailoringSetAssetCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        ProductTailoringSetAssetCustomTypeAction value = ProductTailoringSetAssetCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
