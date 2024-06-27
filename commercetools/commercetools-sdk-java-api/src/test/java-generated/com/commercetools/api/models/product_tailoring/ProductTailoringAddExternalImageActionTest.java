
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
public class ProductTailoringAddExternalImageActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringAddExternalImageActionBuilder builder) {
        ProductTailoringAddExternalImageAction productTailoringAddExternalImageAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringAddExternalImageAction)
                .isInstanceOf(ProductTailoringAddExternalImageAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringAddExternalImageAction.builder().variantId(5L) },
                new Object[] { ProductTailoringAddExternalImageAction.builder().sku("sku") },
                new Object[] { ProductTailoringAddExternalImageAction.builder()
                        .image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { ProductTailoringAddExternalImageAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductTailoringAddExternalImageAction value = ProductTailoringAddExternalImageAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringAddExternalImageAction value = ProductTailoringAddExternalImageAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void image() {
        ProductTailoringAddExternalImageAction value = ProductTailoringAddExternalImageAction.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }

    @Test
    public void staged() {
        ProductTailoringAddExternalImageAction value = ProductTailoringAddExternalImageAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
