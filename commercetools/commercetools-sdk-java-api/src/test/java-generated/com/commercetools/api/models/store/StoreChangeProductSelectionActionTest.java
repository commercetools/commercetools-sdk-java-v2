
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
public class StoreChangeProductSelectionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreChangeProductSelectionActionBuilder builder) {
        StoreChangeProductSelectionAction storeChangeProductSelectionAction = builder.buildUnchecked();
        Assertions.assertThat(storeChangeProductSelectionAction).isInstanceOf(StoreChangeProductSelectionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StoreChangeProductSelectionAction.builder()
                .productSelection(
                    new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl()) },
                new Object[] { StoreChangeProductSelectionAction.builder().active(true) } };
    }

    @Test
    public void productSelection() {
        StoreChangeProductSelectionAction value = StoreChangeProductSelectionAction.of();
        value.setProductSelection(
            new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
    }

    @Test
    public void active() {
        StoreChangeProductSelectionAction value = StoreChangeProductSelectionAction.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
