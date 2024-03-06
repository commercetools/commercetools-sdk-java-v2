
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
public class ProductTailoringNameSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringNameSetMessageBuilder builder) {
        ProductTailoringNameSetMessage productTailoringNameSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productTailoringNameSetMessage).isInstanceOf(ProductTailoringNameSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTailoringNameSetMessage.builder()
                        .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { ProductTailoringNameSetMessage.builder().productKey("productKey") },
                new Object[] { ProductTailoringNameSetMessage.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductTailoringNameSetMessage.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductTailoringNameSetMessage.builder()
                        .oldName(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringNameSetMessage value = ProductTailoringNameSetMessage.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringNameSetMessage value = ProductTailoringNameSetMessage.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringNameSetMessage value = ProductTailoringNameSetMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void name() {
        ProductTailoringNameSetMessage value = ProductTailoringNameSetMessage.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldName() {
        ProductTailoringNameSetMessage value = ProductTailoringNameSetMessage.of();
        value.setOldName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldName())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
