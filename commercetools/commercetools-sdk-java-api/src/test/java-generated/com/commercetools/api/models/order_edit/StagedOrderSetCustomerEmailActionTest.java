
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
public class StagedOrderSetCustomerEmailActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetCustomerEmailActionBuilder builder) {
        StagedOrderSetCustomerEmailAction stagedOrderSetCustomerEmailAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomerEmailAction).isInstanceOf(StagedOrderSetCustomerEmailAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetCustomerEmailAction.builder().email("email") } };
    }

    @Test
    public void email() {
        StagedOrderSetCustomerEmailAction value = StagedOrderSetCustomerEmailAction.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
