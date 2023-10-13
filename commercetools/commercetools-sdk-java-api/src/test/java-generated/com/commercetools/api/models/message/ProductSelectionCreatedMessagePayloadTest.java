
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
public class ProductSelectionCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionCreatedMessagePayloadBuilder builder) {
        ProductSelectionCreatedMessagePayload productSelectionCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productSelectionCreatedMessagePayload)
                .isInstanceOf(ProductSelectionCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionCreatedMessagePayload.builder()
                .productSelection(new com.commercetools.api.models.product_selection.ProductSelectionImpl()) } };
    }

    @Test
    public void productSelection() {
        ProductSelectionCreatedMessagePayload value = ProductSelectionCreatedMessagePayload.of();
        value.setProductSelection(new com.commercetools.api.models.product_selection.ProductSelectionImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionImpl());
    }
}
