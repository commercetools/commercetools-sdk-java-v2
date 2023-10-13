
package com.commercetools.importapi.models.productvariants;

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
public class ProductVariantImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantImportBuilder builder) {
        ProductVariantImport productVariantImport = builder.buildUnchecked();
        Assertions.assertThat(productVariantImport).isInstanceOf(ProductVariantImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantImport.builder().sku("sku") },
                new Object[] { ProductVariantImport.builder().isMasterVariant(true) },
                new Object[] { ProductVariantImport.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.importapi.models.productvariants.AttributeImpl())) },
                new Object[] { ProductVariantImport.builder()
                        .images(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl())) },
                new Object[] { ProductVariantImport.builder()
                        .assets(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl())) },
                new Object[] { ProductVariantImport.builder().publish(true) },
                new Object[] { ProductVariantImport.builder()
                        .product(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl()) } };
    }

    @Test
    public void sku() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void isMasterVariant() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setIsMasterVariant(true);
        Assertions.assertThat(value.getIsMasterVariant()).isEqualTo(true);
    }

    @Test
    public void attributes() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
    }

    @Test
    public void images() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setImages(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setAssets(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
    }

    @Test
    public void publish() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }

    @Test
    public void product() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setProduct(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
    }
}
