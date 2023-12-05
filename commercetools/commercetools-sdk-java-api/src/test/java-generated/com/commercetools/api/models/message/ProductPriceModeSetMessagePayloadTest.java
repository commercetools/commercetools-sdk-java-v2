
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
public class ProductPriceModeSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceModeSetMessagePayloadBuilder builder) {
        ProductPriceModeSetMessagePayload productPriceModeSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceModeSetMessagePayload).isInstanceOf(ProductPriceModeSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceModeSetMessagePayload.builder()
                .to(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded")) } };
    }

    @Test
    public void to() {
        ProductPriceModeSetMessagePayload value = ProductPriceModeSetMessagePayload.of();
        value.setTo(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
        Assertions.assertThat(value.getTo())
                .isEqualTo(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
    }
}
