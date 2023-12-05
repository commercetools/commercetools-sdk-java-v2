
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
public class StoreAddProductSelectionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreAddProductSelectionActionBuilder builder) {
        StoreAddProductSelectionAction storeAddProductSelectionAction = builder.buildUnchecked();
        Assertions.assertThat(storeAddProductSelectionAction).isInstanceOf(StoreAddProductSelectionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StoreAddProductSelectionAction.builder()
                .productSelection(
                    new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl()) },
                new Object[] { StoreAddProductSelectionAction.builder().active(true) } };
    }

    @Test
    public void productSelection() {
        StoreAddProductSelectionAction value = StoreAddProductSelectionAction.of();
        value.setProductSelection(
            new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
    }

    @Test
    public void active() {
        StoreAddProductSelectionAction value = StoreAddProductSelectionAction.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
