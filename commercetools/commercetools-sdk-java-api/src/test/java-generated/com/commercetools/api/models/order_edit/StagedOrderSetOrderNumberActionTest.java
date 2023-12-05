
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
public class StagedOrderSetOrderNumberActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetOrderNumberActionBuilder builder) {
        StagedOrderSetOrderNumberAction stagedOrderSetOrderNumberAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetOrderNumberAction).isInstanceOf(StagedOrderSetOrderNumberAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetOrderNumberAction.builder().orderNumber("orderNumber") } };
    }

    @Test
    public void orderNumber() {
        StagedOrderSetOrderNumberAction value = StagedOrderSetOrderNumberAction.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }
}
