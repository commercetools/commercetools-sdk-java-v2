
package com.commercetools.api.models.product_selection;

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
public class ProductSelectionRemoveProductActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionRemoveProductActionBuilder builder) {
        ProductSelectionRemoveProductAction productSelectionRemoveProductAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionRemoveProductAction)
                .isInstanceOf(ProductSelectionRemoveProductAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionRemoveProductAction.builder()
                .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionRemoveProductAction value = ProductSelectionRemoveProductAction.of();
        value.setProduct(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
    }
}
