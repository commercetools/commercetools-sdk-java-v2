
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
public class StagedOrderRemoveItemShippingAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderRemoveItemShippingAddressActionBuilder builder) {
        StagedOrderRemoveItemShippingAddressAction stagedOrderRemoveItemShippingAddressAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderRemoveItemShippingAddressAction)
                .isInstanceOf(StagedOrderRemoveItemShippingAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderRemoveItemShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressKey() {
        StagedOrderRemoveItemShippingAddressAction value = StagedOrderRemoveItemShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
