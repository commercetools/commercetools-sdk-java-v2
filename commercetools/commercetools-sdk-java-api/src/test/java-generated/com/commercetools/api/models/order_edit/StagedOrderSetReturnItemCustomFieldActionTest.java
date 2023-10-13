
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
public class StagedOrderSetReturnItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetReturnItemCustomFieldActionBuilder builder) {
        StagedOrderSetReturnItemCustomFieldAction stagedOrderSetReturnItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetReturnItemCustomFieldAction)
                .isInstanceOf(StagedOrderSetReturnItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetReturnItemCustomFieldAction.builder().returnItemId("returnItemId") },
                new Object[] { StagedOrderSetReturnItemCustomFieldAction.builder().returnItemKey("returnItemKey") },
                new Object[] { StagedOrderSetReturnItemCustomFieldAction.builder().name("name") },
                new Object[] { StagedOrderSetReturnItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void returnItemId() {
        StagedOrderSetReturnItemCustomFieldAction value = StagedOrderSetReturnItemCustomFieldAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        StagedOrderSetReturnItemCustomFieldAction value = StagedOrderSetReturnItemCustomFieldAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void name() {
        StagedOrderSetReturnItemCustomFieldAction value = StagedOrderSetReturnItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetReturnItemCustomFieldAction value = StagedOrderSetReturnItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
