
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;
import java.util.Collections;

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
public class OrderImportDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderImportDraftBuilder builder) {
        OrderImportDraft orderImportDraft = builder.buildUnchecked();
        Assertions.assertThat(orderImportDraft).isInstanceOf(OrderImportDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderImportDraft.builder().orderNumber("orderNumber") },
                new Object[] { OrderImportDraft.builder().purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { OrderImportDraft.builder().customerId("customerId") },
                new Object[] { OrderImportDraft.builder().customerEmail("customerEmail") },
                new Object[] { OrderImportDraft.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { OrderImportDraft.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { OrderImportDraft.builder()
                        .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) },
                new Object[] { OrderImportDraft.builder()
                        .lineItems(Collections
                                .singletonList(new com.commercetools.api.models.order.LineItemImportDraftImpl())) },
                new Object[] { OrderImportDraft.builder()
                        .customLineItems(Collections.singletonList(
                            new com.commercetools.api.models.order.CustomLineItemImportDraftImpl())) },
                new Object[] {
                        OrderImportDraft.builder().totalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { OrderImportDraft.builder()
                        .taxedPrice(new com.commercetools.api.models.cart.TaxedPriceDraftImpl()) },
                new Object[] { OrderImportDraft.builder()
                        .taxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) },
                new Object[] { OrderImportDraft.builder()
                        .taxCalculationMode(
                            com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel")) },
                new Object[] { OrderImportDraft.builder()
                        .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] { OrderImportDraft.builder()
                        .billingAddress(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { OrderImportDraft.builder()
                        .shippingAddress(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] {
                        OrderImportDraft.builder()
                                .itemShippingAddresses(Collections
                                        .singletonList(new com.commercetools.api.models.common.BaseAddressImpl())) },
                new Object[] { OrderImportDraft.builder()
                        .shippingInfo(new com.commercetools.api.models.order.ShippingInfoImportDraftImpl()) },
                new Object[] { OrderImportDraft.builder()
                        .paymentInfo(new com.commercetools.api.models.order.PaymentInfoImpl()) },
                new Object[] { OrderImportDraft.builder()
                        .paymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) },
                new Object[] { OrderImportDraft.builder()
                        .shipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) },
                new Object[] { OrderImportDraft.builder()
                        .orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) },
                new Object[] {
                        OrderImportDraft.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { OrderImportDraft.builder().country("country") },
                new Object[] { OrderImportDraft.builder()
                        .origin(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer")) },
                new Object[] { OrderImportDraft.builder().completedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { OrderImportDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void orderNumber() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }

    @Test
    public void purchaseOrderNumber() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void customerId() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void customerEmail() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setCustomerEmail("customerEmail");
        Assertions.assertThat(value.getCustomerEmail()).isEqualTo("customerEmail");
    }

    @Test
    public void customerGroup() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void businessUnit() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void store() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }

    @Test
    public void lineItems() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setLineItems(Collections.singletonList(new com.commercetools.api.models.order.LineItemImportDraftImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.LineItemImportDraftImpl()));
    }

    @Test
    public void customLineItems() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setCustomLineItems(
            Collections.singletonList(new com.commercetools.api.models.order.CustomLineItemImportDraftImpl()));
        Assertions.assertThat(value.getCustomLineItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.order.CustomLineItemImportDraftImpl()));
    }

    @Test
    public void totalPrice() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setTotalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void taxedPrice() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedPriceDraftImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedPriceDraftImpl());
    }

    @Test
    public void taxRoundingMode() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setTaxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void taxCalculationMode() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setTaxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getTaxCalculationMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
    }

    @Test
    public void inventoryMode() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void billingAddress() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setBillingAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getBillingAddress())
                .isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void shippingAddress() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setShippingAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void itemShippingAddresses() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setItemShippingAddresses(
            Collections.singletonList(new com.commercetools.api.models.common.BaseAddressImpl()));
        Assertions.assertThat(value.getItemShippingAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.BaseAddressImpl()));
    }

    @Test
    public void shippingInfo() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setShippingInfo(new com.commercetools.api.models.order.ShippingInfoImportDraftImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.api.models.order.ShippingInfoImportDraftImpl());
    }

    @Test
    public void paymentInfo() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setPaymentInfo(new com.commercetools.api.models.order.PaymentInfoImpl());
        Assertions.assertThat(value.getPaymentInfo())
                .isEqualTo(new com.commercetools.api.models.order.PaymentInfoImpl());
    }

    @Test
    public void paymentState() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }

    @Test
    public void shipmentState() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
    }

    @Test
    public void orderState() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }

    @Test
    public void state() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void country() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void origin() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setOrigin(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer"));
        Assertions.assertThat(value.getOrigin())
                .isEqualTo(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer"));
    }

    @Test
    public void completedAt() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setCompletedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCompletedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        OrderImportDraft value = OrderImportDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
