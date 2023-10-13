
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
public class StagedOrderSetCustomerIdActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetCustomerIdActionBuilder builder) {
        StagedOrderSetCustomerIdAction stagedOrderSetCustomerIdAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomerIdAction).isInstanceOf(StagedOrderSetCustomerIdAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetCustomerIdAction.builder().customerId("customerId") } };
    }

    @Test
    public void customerId() {
        StagedOrderSetCustomerIdAction value = StagedOrderSetCustomerIdAction.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }
}
