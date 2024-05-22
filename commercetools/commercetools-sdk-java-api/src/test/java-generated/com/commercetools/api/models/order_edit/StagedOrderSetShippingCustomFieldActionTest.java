
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
public class StagedOrderSetShippingCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetShippingCustomFieldActionBuilder builder) {
        StagedOrderSetShippingCustomFieldAction stagedOrderSetShippingCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingCustomFieldAction)
                .isInstanceOf(StagedOrderSetShippingCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetShippingCustomFieldAction.builder().shippingKey("shippingKey") },
                new Object[] { StagedOrderSetShippingCustomFieldAction.builder().name("name") },
                new Object[] { StagedOrderSetShippingCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void shippingKey() {
        StagedOrderSetShippingCustomFieldAction value = StagedOrderSetShippingCustomFieldAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void name() {
        StagedOrderSetShippingCustomFieldAction value = StagedOrderSetShippingCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetShippingCustomFieldAction value = StagedOrderSetShippingCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
