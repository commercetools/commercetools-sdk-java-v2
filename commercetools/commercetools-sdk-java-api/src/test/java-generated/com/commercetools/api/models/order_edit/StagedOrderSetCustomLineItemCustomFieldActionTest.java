
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
public class StagedOrderSetCustomLineItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetCustomLineItemCustomFieldActionBuilder builder) {
        StagedOrderSetCustomLineItemCustomFieldAction stagedOrderSetCustomLineItemCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomLineItemCustomFieldAction)
                .isInstanceOf(StagedOrderSetCustomLineItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedOrderSetCustomLineItemCustomFieldAction.builder().customLineItemId("customLineItemId") },
                new Object[] { StagedOrderSetCustomLineItemCustomFieldAction.builder()
                        .customLineItemKey("customLineItemKey") },
                new Object[] { StagedOrderSetCustomLineItemCustomFieldAction.builder().name("name") },
                new Object[] { StagedOrderSetCustomLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderSetCustomLineItemCustomFieldAction value = StagedOrderSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderSetCustomLineItemCustomFieldAction value = StagedOrderSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void name() {
        StagedOrderSetCustomLineItemCustomFieldAction value = StagedOrderSetCustomLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetCustomLineItemCustomFieldAction value = StagedOrderSetCustomLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
