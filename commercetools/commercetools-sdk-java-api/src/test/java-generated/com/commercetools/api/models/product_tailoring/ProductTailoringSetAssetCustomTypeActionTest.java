
package com.commercetools.api.models.product_tailoring;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ProductTailoringSetAssetCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringSetAssetCustomTypeActionBuilder builder) {
        ProductTailoringSetAssetCustomTypeAction productTailoringSetAssetCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetCustomTypeAction)
                .isInstanceOf(ProductTailoringSetAssetCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringSetAssetCustomTypeAction.builder().variantId(5L) },
                new Object[] { ProductTailoringSetAssetCustomTypeAction.builder().sku("sku") },
                new Object[] { ProductTailoringSetAssetCustomTypeAction.builder().staged(true) },
                new Object[] { ProductTailoringSetAssetCustomTypeAction.builder().assetId("assetId") },
                new Object[] { ProductTailoringSetAssetCustomTypeAction.builder().assetKey("assetKey") },
                new Object[] { ProductTailoringSetAssetCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { ProductTailoringSetAssetCustomTypeAction.builder()
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
