
package com.commercetools.api.models.message;

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
public class ProductTailoringNameSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringNameSetMessagePayloadBuilder builder) {
        ProductTailoringNameSetMessagePayload productTailoringNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productTailoringNameSetMessagePayload)
                .isInstanceOf(ProductTailoringNameSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTailoringNameSetMessagePayload.builder()
                        .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { ProductTailoringNameSetMessagePayload.builder().productKey("productKey") },
                new Object[] { ProductTailoringNameSetMessagePayload.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductTailoringNameSetMessagePayload.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductTailoringNameSetMessagePayload.builder()
                        .oldName(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringNameSetMessagePayload value = ProductTailoringNameSetMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringNameSetMessagePayload value = ProductTailoringNameSetMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringNameSetMessagePayload value = ProductTailoringNameSetMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void name() {
        ProductTailoringNameSetMessagePayload value = ProductTailoringNameSetMessagePayload.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldName() {
        ProductTailoringNameSetMessagePayload value = ProductTailoringNameSetMessagePayload.of();
        value.setOldName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldName())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
