
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
public class StagedOrderSetBillingAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetBillingAddressCustomFieldActionBuilder builder) {
        StagedOrderSetBillingAddressCustomFieldAction stagedOrderSetBillingAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetBillingAddressCustomFieldAction)
                .isInstanceOf(StagedOrderSetBillingAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetBillingAddressCustomFieldAction.builder().name("name") },
                new Object[] { StagedOrderSetBillingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        StagedOrderSetBillingAddressCustomFieldAction value = StagedOrderSetBillingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetBillingAddressCustomFieldAction value = StagedOrderSetBillingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
