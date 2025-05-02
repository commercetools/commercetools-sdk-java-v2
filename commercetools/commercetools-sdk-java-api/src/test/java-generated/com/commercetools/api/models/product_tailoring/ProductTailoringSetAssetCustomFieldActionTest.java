
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetAssetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetAssetCustomFieldActionBuilder builder) {
        ProductTailoringSetAssetCustomFieldAction productTailoringSetAssetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetCustomFieldAction)
                .isInstanceOf(ProductTailoringSetAssetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringSetAssetCustomFieldAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringSetAssetCustomFieldAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringSetAssetCustomFieldAction.builder().staged(true) },
                new Object[] { "assetId", ProductTailoringSetAssetCustomFieldAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductTailoringSetAssetCustomFieldAction.builder().assetKey("assetKey") },
                new Object[] { "name", ProductTailoringSetAssetCustomFieldAction.builder().name("name") },
                new Object[] { "value", ProductTailoringSetAssetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
