
package com.commercetools.api.models.store;

import java.util.Collections;

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
public class StoreSetProductSelectionsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreSetProductSelectionsActionBuilder builder) {
        StoreSetProductSelectionsAction storeSetProductSelectionsAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetProductSelectionsAction).isInstanceOf(StoreSetProductSelectionsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StoreSetProductSelectionsAction.builder()
                .productSelections(Collections
                        .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingDraftImpl())) } };
    }

    @Test
    public void productSelections() {
        StoreSetProductSelectionsAction value = StoreSetProductSelectionsAction.of();
        value.setProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingDraftImpl()));
        Assertions.assertThat(value.getProductSelections())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingDraftImpl()));
    }
}
