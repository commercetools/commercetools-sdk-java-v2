
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
public class StagedOrderSetShippingAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetShippingAddressCustomFieldActionBuilder builder) {
        StagedOrderSetShippingAddressCustomFieldAction stagedOrderSetShippingAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingAddressCustomFieldAction)
                .isInstanceOf(StagedOrderSetShippingAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { StagedOrderSetShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        StagedOrderSetShippingAddressCustomFieldAction value = StagedOrderSetShippingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetShippingAddressCustomFieldAction value = StagedOrderSetShippingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
