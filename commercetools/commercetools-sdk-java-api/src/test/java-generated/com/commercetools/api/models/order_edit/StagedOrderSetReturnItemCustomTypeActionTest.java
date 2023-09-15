
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
public class StagedOrderSetReturnItemCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetReturnItemCustomTypeActionBuilder builder) {
        StagedOrderSetReturnItemCustomTypeAction stagedOrderSetReturnItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetReturnItemCustomTypeAction)
                .isInstanceOf(StagedOrderSetReturnItemCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetReturnItemCustomTypeAction.builder().returnItemId("returnItemId") },
                new Object[] { StagedOrderSetReturnItemCustomTypeAction.builder().returnItemKey("returnItemKey") },
                new Object[] { StagedOrderSetReturnItemCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { StagedOrderSetReturnItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void returnItemId() {
        StagedOrderSetReturnItemCustomTypeAction value = StagedOrderSetReturnItemCustomTypeAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        StagedOrderSetReturnItemCustomTypeAction value = StagedOrderSetReturnItemCustomTypeAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void type() {
        StagedOrderSetReturnItemCustomTypeAction value = StagedOrderSetReturnItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetReturnItemCustomTypeAction value = StagedOrderSetReturnItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
