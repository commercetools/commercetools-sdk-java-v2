
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
public class ProductSetProductPriceCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetProductPriceCustomFieldActionBuilder builder) {
        ProductSetProductPriceCustomFieldAction productSetProductPriceCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(productSetProductPriceCustomFieldAction)
                .isInstanceOf(ProductSetProductPriceCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetProductPriceCustomFieldAction.builder().priceId("priceId") },
                new Object[] { ProductSetProductPriceCustomFieldAction.builder().staged(true) },
                new Object[] { ProductSetProductPriceCustomFieldAction.builder().name("name") },
                new Object[] { ProductSetProductPriceCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void priceId() {
        ProductSetProductPriceCustomFieldAction value = ProductSetProductPriceCustomFieldAction.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void staged() {
        ProductSetProductPriceCustomFieldAction value = ProductSetProductPriceCustomFieldAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductSetProductPriceCustomFieldAction value = ProductSetProductPriceCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductSetProductPriceCustomFieldAction value = ProductSetProductPriceCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
