
package com.commercetools.api.models.order_edit;

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
public class StagedOrderImportCustomLineItemStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderImportCustomLineItemStateActionBuilder builder) {
        StagedOrderImportCustomLineItemStateAction stagedOrderImportCustomLineItemStateAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderImportCustomLineItemStateAction)
                .isInstanceOf(StagedOrderImportCustomLineItemStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedOrderImportCustomLineItemStateAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        StagedOrderImportCustomLineItemStateAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { StagedOrderImportCustomLineItemStateAction.builder()
                        .state(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl())) } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderImportCustomLineItemStateAction value = StagedOrderImportCustomLineItemStateAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderImportCustomLineItemStateAction value = StagedOrderImportCustomLineItemStateAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void state() {
        StagedOrderImportCustomLineItemStateAction value = StagedOrderImportCustomLineItemStateAction.of();
        value.setState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }
}
