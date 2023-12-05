
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
public class StagedOrderSetLineItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetLineItemCustomFieldActionBuilder builder) {
        StagedOrderSetLineItemCustomFieldAction stagedOrderSetLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemCustomFieldAction)
                .isInstanceOf(StagedOrderSetLineItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetLineItemCustomFieldAction.builder().lineItemId("lineItemId") },
                new Object[] { StagedOrderSetLineItemCustomFieldAction.builder().lineItemKey("lineItemKey") },
                new Object[] { StagedOrderSetLineItemCustomFieldAction.builder().name("name") },
                new Object[] { StagedOrderSetLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemCustomFieldAction value = StagedOrderSetLineItemCustomFieldAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemCustomFieldAction value = StagedOrderSetLineItemCustomFieldAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void name() {
        StagedOrderSetLineItemCustomFieldAction value = StagedOrderSetLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetLineItemCustomFieldAction value = StagedOrderSetLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
