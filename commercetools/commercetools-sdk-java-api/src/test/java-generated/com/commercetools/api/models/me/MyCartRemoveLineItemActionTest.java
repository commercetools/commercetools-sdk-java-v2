
package com.commercetools.api.models.me;

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
public class MyCartRemoveLineItemActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartRemoveLineItemActionBuilder builder) {
        MyCartRemoveLineItemAction myCartRemoveLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(myCartRemoveLineItemAction).isInstanceOf(MyCartRemoveLineItemAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCartRemoveLineItemAction.builder().lineItemId("lineItemId") },
                new Object[] { MyCartRemoveLineItemAction.builder().lineItemKey("lineItemKey") },
                new Object[] { MyCartRemoveLineItemAction.builder().quantity(8L) },
                new Object[] { MyCartRemoveLineItemAction.builder()
                        .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { MyCartRemoveLineItemAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) },
                new Object[] { MyCartRemoveLineItemAction.builder()
                        .shippingDetailsToRemove(
                            new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void lineItemId() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void externalPrice() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTotalPrice() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }

    @Test
    public void shippingDetailsToRemove() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setShippingDetailsToRemove(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetailsToRemove())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
