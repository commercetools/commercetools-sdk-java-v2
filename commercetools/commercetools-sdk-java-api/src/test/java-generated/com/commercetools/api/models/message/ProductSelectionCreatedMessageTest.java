
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
public class ProductSelectionCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionCreatedMessageBuilder builder) {
        ProductSelectionCreatedMessage productSelectionCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(productSelectionCreatedMessage).isInstanceOf(ProductSelectionCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionCreatedMessage.builder()
                .productSelection(new com.commercetools.api.models.product_selection.ProductSelectionImpl()) } };
    }

    @Test
    public void productSelection() {
        ProductSelectionCreatedMessage value = ProductSelectionCreatedMessage.of();
        value.setProductSelection(new com.commercetools.api.models.product_selection.ProductSelectionImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionImpl());
    }
}
