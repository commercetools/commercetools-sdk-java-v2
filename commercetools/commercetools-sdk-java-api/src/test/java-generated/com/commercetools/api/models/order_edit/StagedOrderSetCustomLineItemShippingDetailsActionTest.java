
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
public class StagedOrderSetCustomLineItemShippingDetailsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetCustomLineItemShippingDetailsActionBuilder builder) {
        StagedOrderSetCustomLineItemShippingDetailsAction stagedOrderSetCustomLineItemShippingDetailsAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomLineItemShippingDetailsAction)
                .isInstanceOf(StagedOrderSetCustomLineItemShippingDetailsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetCustomLineItemShippingDetailsAction.builder()
                        .customLineItemId("customLineItemId") },
                new Object[] { StagedOrderSetCustomLineItemShippingDetailsAction.builder()
                        .customLineItemKey("customLineItemKey") },
                new Object[] { StagedOrderSetCustomLineItemShippingDetailsAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderSetCustomLineItemShippingDetailsAction value = StagedOrderSetCustomLineItemShippingDetailsAction
                .of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderSetCustomLineItemShippingDetailsAction value = StagedOrderSetCustomLineItemShippingDetailsAction
                .of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void shippingDetails() {
        StagedOrderSetCustomLineItemShippingDetailsAction value = StagedOrderSetCustomLineItemShippingDetailsAction
                .of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
