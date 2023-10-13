
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
public class ProductRevertStagedVariantChangesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductRevertStagedVariantChangesActionBuilder builder) {
        ProductRevertStagedVariantChangesAction productRevertStagedVariantChangesAction = builder.buildUnchecked();
        Assertions.assertThat(productRevertStagedVariantChangesAction)
                .isInstanceOf(ProductRevertStagedVariantChangesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductRevertStagedVariantChangesAction.builder().variantId(5L) } };
    }

    @Test
    public void variantId() {
        ProductRevertStagedVariantChangesAction value = ProductRevertStagedVariantChangesAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }
}
