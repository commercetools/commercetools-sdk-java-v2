
package com.commercetools.api.models.order_edit;

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
public class StagedOrderRemoveCustomLineItemActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderRemoveCustomLineItemActionBuilder builder) {
        StagedOrderRemoveCustomLineItemAction stagedOrderRemoveCustomLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderRemoveCustomLineItemAction)
                .isInstanceOf(StagedOrderRemoveCustomLineItemAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderRemoveCustomLineItemAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        StagedOrderRemoveCustomLineItemAction.builder().customLineItemKey("customLineItemKey") } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderRemoveCustomLineItemAction value = StagedOrderRemoveCustomLineItemAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderRemoveCustomLineItemAction value = StagedOrderRemoveCustomLineItemAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }
}
