
package com.commercetools.api.models.message;

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
public class ProductTailoringImagesSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringImagesSetMessagePayloadBuilder builder) {
        ProductTailoringImagesSetMessagePayload productTailoringImagesSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productTailoringImagesSetMessagePayload)
                .isInstanceOf(ProductTailoringImagesSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTailoringImagesSetMessagePayload.builder()
                        .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { ProductTailoringImagesSetMessagePayload.builder().productKey("productKey") },
                new Object[] { ProductTailoringImagesSetMessagePayload.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductTailoringImagesSetMessagePayload.builder().variantId(5L) },
                new Object[] { ProductTailoringImagesSetMessagePayload.builder()
                        .oldImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { ProductTailoringImagesSetMessagePayload.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) } };
    }

    @Test
    public void store() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void oldImages() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setOldImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getOldImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void images() {
        ProductTailoringImagesSetMessagePayload value = ProductTailoringImagesSetMessagePayload.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }
}
