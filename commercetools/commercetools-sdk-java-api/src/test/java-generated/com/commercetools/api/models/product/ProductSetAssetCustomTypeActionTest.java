
package com.commercetools.api.models.product;

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
public class ProductSetAssetCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetAssetCustomTypeActionBuilder builder) {
        ProductSetAssetCustomTypeAction productSetAssetCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAssetCustomTypeAction).isInstanceOf(ProductSetAssetCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetAssetCustomTypeAction.builder().variantId(5L) },
                new Object[] { ProductSetAssetCustomTypeAction.builder().sku("sku") },
                new Object[] { ProductSetAssetCustomTypeAction.builder().staged(true) },
                new Object[] { ProductSetAssetCustomTypeAction.builder().assetId("assetId") },
                new Object[] { ProductSetAssetCustomTypeAction.builder().assetKey("assetKey") },
                new Object[] { ProductSetAssetCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { ProductSetAssetCustomTypeAction.builder()
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
