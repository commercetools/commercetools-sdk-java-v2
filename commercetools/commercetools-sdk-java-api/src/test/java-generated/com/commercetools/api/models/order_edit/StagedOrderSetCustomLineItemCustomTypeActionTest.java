
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
public class StagedOrderSetCustomLineItemCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetCustomLineItemCustomTypeActionBuilder builder) {
        StagedOrderSetCustomLineItemCustomTypeAction stagedOrderSetCustomLineItemCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomLineItemCustomTypeAction)
                .isInstanceOf(StagedOrderSetCustomLineItemCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedOrderSetCustomLineItemCustomTypeAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        StagedOrderSetCustomLineItemCustomTypeAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { StagedOrderSetCustomLineItemCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { StagedOrderSetCustomLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderSetCustomLineItemCustomTypeAction value = StagedOrderSetCustomLineItemCustomTypeAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderSetCustomLineItemCustomTypeAction value = StagedOrderSetCustomLineItemCustomTypeAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void type() {
        StagedOrderSetCustomLineItemCustomTypeAction value = StagedOrderSetCustomLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetCustomLineItemCustomTypeAction value = StagedOrderSetCustomLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
