
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
public class StagedOrderSetItemShippingAddressCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetItemShippingAddressCustomTypeActionBuilder builder) {
        StagedOrderSetItemShippingAddressCustomTypeAction stagedOrderSetItemShippingAddressCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetItemShippingAddressCustomTypeAction)
                .isInstanceOf(StagedOrderSetItemShippingAddressCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetItemShippingAddressCustomTypeAction.builder().addressKey("addressKey") },
                new Object[] { StagedOrderSetItemShippingAddressCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { StagedOrderSetItemShippingAddressCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void addressKey() {
        StagedOrderSetItemShippingAddressCustomTypeAction value = StagedOrderSetItemShippingAddressCustomTypeAction
                .of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void type() {
        StagedOrderSetItemShippingAddressCustomTypeAction value = StagedOrderSetItemShippingAddressCustomTypeAction
                .of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetItemShippingAddressCustomTypeAction value = StagedOrderSetItemShippingAddressCustomTypeAction
                .of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
