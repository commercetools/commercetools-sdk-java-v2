
package com.commercetools.api.models.order;

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
public class OrderFromCartDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderFromCartDraftBuilder builder) {
        OrderFromCartDraft orderFromCartDraft = builder.buildUnchecked();
        Assertions.assertThat(orderFromCartDraft).isInstanceOf(OrderFromCartDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderFromCartDraft.builder().id("id") },
                new Object[] { OrderFromCartDraft.builder()
                        .cart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl()) },
                new Object[] { OrderFromCartDraft.builder().version(2L) },
                new Object[] { OrderFromCartDraft.builder().orderNumber("orderNumber") },
                new Object[] { OrderFromCartDraft.builder().purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { OrderFromCartDraft.builder()
                        .paymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) },
                new Object[] { OrderFromCartDraft.builder()
                        .shipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) },
                new Object[] { OrderFromCartDraft.builder()
                        .orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) },
                new Object[] { OrderFromCartDraft.builder()
                        .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { OrderFromCartDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void id() {
        OrderFromCartDraft value = OrderFromCartDraft.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void cart() {
        OrderFromCartDraft value = OrderFromCartDraft.of();
        value.setCart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
        Assertions.assertThat(value.getCart())
                .isEqualTo(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
    }

    @Test
    public void version() {
        OrderFromCartDraft value = OrderFromCartDraft.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void orderNumber() {
        OrderFromCartDraft value = OrderFromCartDraft.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }

    @Test
    public void purchaseOrderNumber() {
        OrderFromCartDraft value = OrderFromCartDraft.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void paymentState() {
        OrderFromCartDraft value = OrderFromCartDraft.of();
        value.setPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }

    @Test
    public void shipmentState() {
        OrderFromCartDraft value = OrderFromCartDraft.of();
        value.setShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
    }

    @Test
    public void orderState() {
        OrderFromCartDraft value = OrderFromCartDraft.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }

    @Test
    public void state() {
        OrderFromCartDraft value = OrderFromCartDraft.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void custom() {
        OrderFromCartDraft value = OrderFromCartDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
