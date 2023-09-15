
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
public class StagedOrderSetItemShippingAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetItemShippingAddressCustomFieldActionBuilder builder) {
        StagedOrderSetItemShippingAddressCustomFieldAction stagedOrderSetItemShippingAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetItemShippingAddressCustomFieldAction)
                .isInstanceOf(StagedOrderSetItemShippingAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetItemShippingAddressCustomFieldAction.builder().addressKey("addressKey") },
                new Object[] { StagedOrderSetItemShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { StagedOrderSetItemShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressKey() {
        StagedOrderSetItemShippingAddressCustomFieldAction value = StagedOrderSetItemShippingAddressCustomFieldAction
                .of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void name() {
        StagedOrderSetItemShippingAddressCustomFieldAction value = StagedOrderSetItemShippingAddressCustomFieldAction
                .of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetItemShippingAddressCustomFieldAction value = StagedOrderSetItemShippingAddressCustomFieldAction
                .of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
