
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
public class ProductAddExternalImageActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductAddExternalImageActionBuilder builder) {
        ProductAddExternalImageAction productAddExternalImageAction = builder.buildUnchecked();
        Assertions.assertThat(productAddExternalImageAction).isInstanceOf(ProductAddExternalImageAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductAddExternalImageAction.builder().variantId(5L) },
                new Object[] { ProductAddExternalImageAction.builder().sku("sku") },
                new Object[] { ProductAddExternalImageAction.builder()
                        .image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { ProductAddExternalImageAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductAddExternalImageAction value = ProductAddExternalImageAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductAddExternalImageAction value = ProductAddExternalImageAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void image() {
        ProductAddExternalImageAction value = ProductAddExternalImageAction.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }

    @Test
    public void staged() {
        ProductAddExternalImageAction value = ProductAddExternalImageAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
