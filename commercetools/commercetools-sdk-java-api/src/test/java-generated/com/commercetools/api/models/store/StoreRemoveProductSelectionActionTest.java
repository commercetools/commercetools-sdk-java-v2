
package com.commercetools.api.models.store;

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
public class StoreRemoveProductSelectionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreRemoveProductSelectionActionBuilder builder) {
        StoreRemoveProductSelectionAction storeRemoveProductSelectionAction = builder.buildUnchecked();
        Assertions.assertThat(storeRemoveProductSelectionAction).isInstanceOf(StoreRemoveProductSelectionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StoreRemoveProductSelectionAction.builder()
                .productSelection(
                    new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl()) } };
    }

    @Test
    public void productSelection() {
        StoreRemoveProductSelectionAction value = StoreRemoveProductSelectionAction.of();
        value.setProductSelection(
            new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
    }
}
