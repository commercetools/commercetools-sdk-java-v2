
package com.commercetools.importapi.models.productdrafts;

import java.util.Collections;

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
public class ProductVariantDraftImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantDraftImportBuilder builder) {
        ProductVariantDraftImport productVariantDraftImport = builder.buildUnchecked();
        Assertions.assertThat(productVariantDraftImport).isInstanceOf(ProductVariantDraftImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantDraftImport.builder().sku("sku") },
                new Object[] { ProductVariantDraftImport.builder().key("key") },
                new Object[] { ProductVariantDraftImport.builder()
                        .prices(Collections.singletonList(
                            new com.commercetools.importapi.models.productdrafts.PriceDraftImportImpl())) },
                new Object[] { ProductVariantDraftImport.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.importapi.models.productvariants.AttributeImpl())) },
                new Object[] { ProductVariantDraftImport.builder()
                        .images(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl())) },
                new Object[] { ProductVariantDraftImport.builder()
                        .assets(
                            Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl())) } };
    }

    @Test
    public void sku() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void prices() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setPrices(
            Collections.singletonList(new com.commercetools.importapi.models.productdrafts.PriceDraftImportImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.productdrafts.PriceDraftImportImpl()));
    }

    @Test
    public void attributes() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
    }

    @Test
    public void images() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setImages(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setAssets(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
    }
}
