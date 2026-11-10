
package com.commercetools.importapi.models.orders;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderImportBuilder builder) {
        OrderImport orderImport = builder.buildUnchecked();
        Assertions.assertThat(orderImport).isInstanceOf(OrderImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "orderNumber", OrderImport.builder().orderNumber("orderNumber") },
                new Object[] { "customer",
                        OrderImport.builder()
                                .customer(new com.commercetools.importapi.models.common.CustomerKeyReferenceImpl()) },
                new Object[] { "customerEmail", OrderImport.builder().customerEmail("customerEmail") },
                new Object[] { "lineItems",
                        OrderImport.builder()
                                .lineItems(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.LineItemImportDraftImpl())) },
                new Object[] { "customLineItems",
                        OrderImport.builder()
                                .customLineItems(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.CustomLineItemDraftImpl())) },
                new Object[] { "totalPrice",
                        OrderImport.builder()
                                .totalPrice(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { "taxedPrice",
                        OrderImport.builder()
                                .taxedPrice(new com.commercetools.importapi.models.orders.TaxedPriceImpl()) },
                new Object[] { "shippingAddress",
                        OrderImport.builder()
                                .shippingAddress(new com.commercetools.importapi.models.common.AddressImpl()) },
                new Object[] { "billingAddress",
                        OrderImport.builder()
                                .billingAddress(new com.commercetools.importapi.models.common.AddressImpl()) },
                new Object[] { "customerGroup", OrderImport.builder()
                        .customerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl()) },
                new Object[] { "country", OrderImport.builder().country("country") },
                new Object[] { "orderState",
                        OrderImport.builder()
                                .orderState(com.commercetools.importapi.models.orders.OrderState.findEnum("Open")) },
                new Object[] { "shipmentState", OrderImport.builder()
                        .shipmentState(com.commercetools.importapi.models.orders.ShipmentState.findEnum("Shipped")) },
                new Object[] { "paymentState", OrderImport.builder()
                        .paymentState(com.commercetools.importapi.models.orders.PaymentState.findEnum("BalanceDue")) },
                new Object[] { "shippingInfo", OrderImport.builder()
                        .shippingInfo(new com.commercetools.importapi.models.orders.ShippingInfoImportDraftImpl()) },
                new Object[] { "completedAt",
                        OrderImport.builder().completedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "custom",
                        OrderImport.builder()
                                .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) },
                new Object[] { "inventoryMode", OrderImport.builder()
                        .inventoryMode(com.commercetools.importapi.models.orders.InventoryMode.findEnum("TrackOnly")) },
                new Object[] { "taxRoundingMode", OrderImport.builder()
                        .taxRoundingMode(com.commercetools.importapi.models.orders.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "taxCalculationMode",
                        OrderImport.builder()
                                .taxCalculationMode(com.commercetools.importapi.models.orders.TaxCalculationMode
                                        .findEnum("LineItemLevel")) },
                new Object[] { "origin",
                        OrderImport.builder()
                                .origin(com.commercetools.importapi.models.orders.CartOrigin.findEnum("Customer")) },
                new Object[] { "itemShippingAddresses",
                        OrderImport.builder()
                                .itemShippingAddresses(Collections
                                        .singletonList(new com.commercetools.importapi.models.common.AddressImpl())) },
                new Object[] { "store",
                        OrderImport.builder()
                                .store(new com.commercetools.importapi.models.common.StoreKeyReferenceImpl()) },
                new Object[] { "state", OrderImport.builder()
                        .state(new com.commercetools.importapi.models.common.StateKeyReferenceImpl()) } };
    }

    @Test
    public void orderNumber() {
        OrderImport value = OrderImport.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }

    @Test
    public void customer() {
        OrderImport value = OrderImport.of();
        value.setCustomer(new com.commercetools.importapi.models.common.CustomerKeyReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.importapi.models.common.CustomerKeyReferenceImpl());
    }

    @Test
    public void customerEmail() {
        OrderImport value = OrderImport.of();
        value.setCustomerEmail("customerEmail");
        Assertions.assertThat(value.getCustomerEmail()).isEqualTo("customerEmail");
    }

    @Test
    public void lineItems() {
        OrderImport value = OrderImport.of();
        value.setLineItems(
            Collections.singletonList(new com.commercetools.importapi.models.orders.LineItemImportDraftImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.orders.LineItemImportDraftImpl()));
    }

    @Test
    public void customLineItems() {
        OrderImport value = OrderImport.of();
        value.setCustomLineItems(
            Collections.singletonList(new com.commercetools.importapi.models.orders.CustomLineItemDraftImpl()));
        Assertions.assertThat(value.getCustomLineItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.orders.CustomLineItemDraftImpl()));
    }

    @Test
    public void totalPrice() {
        OrderImport value = OrderImport.of();
        value.setTotalPrice(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        OrderImport value = OrderImport.of();
        value.setTaxedPrice(new com.commercetools.importapi.models.orders.TaxedPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.importapi.models.orders.TaxedPriceImpl());
    }

    @Test
    public void shippingAddress() {
        OrderImport value = OrderImport.of();
        value.setShippingAddress(new com.commercetools.importapi.models.common.AddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.importapi.models.common.AddressImpl());
    }

    @Test
    public void billingAddress() {
        OrderImport value = OrderImport.of();
        value.setBillingAddress(new com.commercetools.importapi.models.common.AddressImpl());
        Assertions.assertThat(value.getBillingAddress())
                .isEqualTo(new com.commercetools.importapi.models.common.AddressImpl());
    }

    @Test
    public void customerGroup() {
        OrderImport value = OrderImport.of();
        value.setCustomerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
    }

    @Test
    public void country() {
        OrderImport value = OrderImport.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void orderState() {
        OrderImport value = OrderImport.of();
        value.setOrderState(com.commercetools.importapi.models.orders.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.importapi.models.orders.OrderState.findEnum("Open"));
    }

    @Test
    public void shipmentState() {
        OrderImport value = OrderImport.of();
        value.setShipmentState(com.commercetools.importapi.models.orders.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.importapi.models.orders.ShipmentState.findEnum("Shipped"));
    }

    @Test
    public void paymentState() {
        OrderImport value = OrderImport.of();
        value.setPaymentState(com.commercetools.importapi.models.orders.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.importapi.models.orders.PaymentState.findEnum("BalanceDue"));
    }

    @Test
    public void shippingInfo() {
        OrderImport value = OrderImport.of();
        value.setShippingInfo(new com.commercetools.importapi.models.orders.ShippingInfoImportDraftImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.importapi.models.orders.ShippingInfoImportDraftImpl());
    }

    @Test
    public void completedAt() {
        OrderImport value = OrderImport.of();
        value.setCompletedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCompletedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        OrderImport value = OrderImport.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }

    @Test
    public void inventoryMode() {
        OrderImport value = OrderImport.of();
        value.setInventoryMode(com.commercetools.importapi.models.orders.InventoryMode.findEnum("TrackOnly"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.importapi.models.orders.InventoryMode.findEnum("TrackOnly"));
    }

    @Test
    public void taxRoundingMode() {
        OrderImport value = OrderImport.of();
        value.setTaxRoundingMode(com.commercetools.importapi.models.orders.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.importapi.models.orders.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void taxCalculationMode() {
        OrderImport value = OrderImport.of();
        value.setTaxCalculationMode(
            com.commercetools.importapi.models.orders.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getTaxCalculationMode())
                .isEqualTo(com.commercetools.importapi.models.orders.TaxCalculationMode.findEnum("LineItemLevel"));
    }

    @Test
    public void origin() {
        OrderImport value = OrderImport.of();
        value.setOrigin(com.commercetools.importapi.models.orders.CartOrigin.findEnum("Customer"));
        Assertions.assertThat(value.getOrigin())
                .isEqualTo(com.commercetools.importapi.models.orders.CartOrigin.findEnum("Customer"));
    }

    @Test
    public void itemShippingAddresses() {
        OrderImport value = OrderImport.of();
        value.setItemShippingAddresses(
            Collections.singletonList(new com.commercetools.importapi.models.common.AddressImpl()));
        Assertions.assertThat(value.getItemShippingAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.AddressImpl()));
    }

    @Test
    public void store() {
        OrderImport value = OrderImport.of();
        value.setStore(new com.commercetools.importapi.models.common.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.importapi.models.common.StoreKeyReferenceImpl());
    }

    @Test
    public void state() {
        OrderImport value = OrderImport.of();
        value.setState(new com.commercetools.importapi.models.common.StateKeyReferenceImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.importapi.models.common.StateKeyReferenceImpl());
    }
}
