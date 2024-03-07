
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
public class ProductTailoringDescriptionSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringDescriptionSetMessagePayloadBuilder builder) {
        ProductTailoringDescriptionSetMessagePayload productTailoringDescriptionSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productTailoringDescriptionSetMessagePayload)
                .isInstanceOf(ProductTailoringDescriptionSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTailoringDescriptionSetMessagePayload.builder()
                        .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { ProductTailoringDescriptionSetMessagePayload.builder().productKey("productKey") },
                new Object[] { ProductTailoringDescriptionSetMessagePayload.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductTailoringDescriptionSetMessagePayload.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductTailoringDescriptionSetMessagePayload.builder()
                        .oldDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringDescriptionSetMessagePayload value = ProductTailoringDescriptionSetMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringDescriptionSetMessagePayload value = ProductTailoringDescriptionSetMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringDescriptionSetMessagePayload value = ProductTailoringDescriptionSetMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void description() {
        ProductTailoringDescriptionSetMessagePayload value = ProductTailoringDescriptionSetMessagePayload.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldDescription() {
        ProductTailoringDescriptionSetMessagePayload value = ProductTailoringDescriptionSetMessagePayload.of();
        value.setOldDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
