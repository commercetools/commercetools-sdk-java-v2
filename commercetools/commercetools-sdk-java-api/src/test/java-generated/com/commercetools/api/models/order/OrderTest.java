
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderBuilder builder) {
        Order order = builder.buildUnchecked();
        Assertions.assertThat(order).isInstanceOf(Order.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Order.builder().id("id") },
                new Object[] { "version", Order.builder().version(2L) },
                new Object[] { "orderNumber", Order.builder().orderNumber("orderNumber") },
                new Object[] { "purchaseOrderNumber", Order.builder().purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { "customerId", Order.builder().customerId("customerId") },
                new Object[] { "customerEmail", Order.builder().customerEmail("customerEmail") },
                new Object[] { "customerGroup", Order.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "anonymousId", Order.builder().anonymousId("anonymousId") },
                new Object[] { "businessUnit", Order.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "store",
                        Order.builder().store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "lineItems", Order.builder()
                        .lineItems(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl())) },
                new Object[] { "customLineItems",
                        Order.builder()
                                .customLineItems(Collections
                                        .singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl())) },
                new Object[] { "totalPrice",
                        Order.builder().totalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "taxedPrice",
                        Order.builder().taxedPrice(new com.commercetools.api.models.cart.TaxedPriceImpl()) },
                new Object[] { "taxedShippingPrice",
                        Order.builder().taxedShippingPrice(new com.commercetools.api.models.cart.TaxedPriceImpl()) },
                new Object[] { "discountOnTotalPrice", Order.builder()
                        .discountOnTotalPrice(new com.commercetools.api.models.cart.DiscountOnTotalPriceImpl()) },
                new Object[] { "taxMode",
                        Order.builder().taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) },
                new Object[] { "taxRoundingMode",
                        Order.builder()
                                .taxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "taxCalculationMode",
                        Order.builder()
                                .taxCalculationMode(
                                    com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel")) },
                new Object[] { "inventoryMode",
                        Order.builder()
                                .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] { "billingAddress",
                        Order.builder().billingAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "shippingAddress",
                        Order.builder().shippingAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "shippingMode",
                        Order.builder()
                                .shippingMode(com.commercetools.api.models.cart.ShippingMode.findEnum("Single")) },
                new Object[] { "shippingKey", Order.builder().shippingKey("shippingKey") },
                new Object[] { "shippingInfo",
                        Order.builder().shippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) },
                new Object[] { "shippingRateInput",
                        Order.builder()
                                .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) },
                new Object[] { "shippingCustomFields",
                        Order.builder()
                                .shippingCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "shipping", Order.builder()
                        .shipping(Collections.singletonList(new com.commercetools.api.models.cart.ShippingImpl())) },
                new Object[] { "itemShippingAddresses",
                        Order.builder()
                                .itemShippingAddresses(
                                    Collections.singletonList(new com.commercetools.api.models.common.AddressImpl())) },
                new Object[] { "discountCodes",
                        Order.builder()
                                .discountCodes(Collections
                                        .singletonList(new com.commercetools.api.models.cart.DiscountCodeInfoImpl())) },
                new Object[] { "directDiscounts",
                        Order.builder()
                                .directDiscounts(Collections
                                        .singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl())) },
                new Object[] { "refusedGifts",
                        Order.builder()
                                .refusedGifts(Collections.singletonList(
                                    new com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl())) },
                new Object[] { "paymentInfo",
                        Order.builder().paymentInfo(new com.commercetools.api.models.order.PaymentInfoImpl()) },
                new Object[] { "country", Order.builder().country("country") },
                new Object[] { "locale", Order.builder().locale("locale") },
                new Object[] { "origin",
                        Order.builder().origin(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer")) },
                new Object[] { "cart",
                        Order.builder().cart(new com.commercetools.api.models.cart.CartReferenceImpl()) },
                new Object[] { "quote",
                        Order.builder().quote(new com.commercetools.api.models.quote.QuoteReferenceImpl()) },
                new Object[] { "orderState",
                        Order.builder().orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) },
                new Object[] { "shipmentState",
                        Order.builder()
                                .shipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) },
                new Object[] { "paymentState",
                        Order.builder()
                                .paymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) },
                new Object[] { "state",
                        Order.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "syncInfo", Order.builder()
                        .syncInfo(Collections.singletonList(new com.commercetools.api.models.order.SyncInfoImpl())) },
                new Object[] { "returnInfo",
                        Order.builder()
                                .returnInfo(Collections
                                        .singletonList(new com.commercetools.api.models.order.ReturnInfoImpl())) },
                new Object[] { "discountTypeCombination", Order.builder()
                        .discountTypeCombination(new com.commercetools.api.models.cart.DiscountTypeCombinationImpl()) },
                new Object[] { "lastMessageSequenceNumber", Order.builder().lastMessageSequenceNumber(8L) },
                new Object[] { "custom",
                        Order.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "completedAt", Order.builder().completedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "createdAt", Order.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Order.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Order.builder().lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Order.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) } };
    }

    @Test
    public void id() {
        Order value = Order.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Order value = Order.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void orderNumber() {
        Order value = Order.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }

    @Test
    public void purchaseOrderNumber() {
        Order value = Order.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void customerId() {
        Order value = Order.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void customerEmail() {
        Order value = Order.of();
        value.setCustomerEmail("customerEmail");
        Assertions.assertThat(value.getCustomerEmail()).isEqualTo("customerEmail");
    }

    @Test
    public void customerGroup() {
        Order value = Order.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void anonymousId() {
        Order value = Order.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void businessUnit() {
        Order value = Order.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void store() {
        Order value = Order.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void lineItems() {
        Order value = Order.of();
        value.setLineItems(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl()));
    }

    @Test
    public void customLineItems() {
        Order value = Order.of();
        value.setCustomLineItems(Collections.singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl()));
        Assertions.assertThat(value.getCustomLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl()));
    }

    @Test
    public void totalPrice() {
        Order value = Order.of();
        value.setTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        Order value = Order.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedPriceImpl());
        Assertions.assertThat(value.getTaxedPrice()).isEqualTo(new com.commercetools.api.models.cart.TaxedPriceImpl());
    }

    @Test
    public void taxedShippingPrice() {
        Order value = Order.of();
        value.setTaxedShippingPrice(new com.commercetools.api.models.cart.TaxedPriceImpl());
        Assertions.assertThat(value.getTaxedShippingPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedPriceImpl());
    }

    @Test
    public void discountOnTotalPrice() {
        Order value = Order.of();
        value.setDiscountOnTotalPrice(new com.commercetools.api.models.cart.DiscountOnTotalPriceImpl());
        Assertions.assertThat(value.getDiscountOnTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.DiscountOnTotalPriceImpl());
    }

    @Test
    public void taxMode() {
        Order value = Order.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }

    @Test
    public void taxRoundingMode() {
        Order value = Order.of();
        value.setTaxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void taxCalculationMode() {
        Order value = Order.of();
        value.setTaxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getTaxCalculationMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
    }

    @Test
    public void inventoryMode() {
        Order value = Order.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void billingAddress() {
        Order value = Order.of();
        value.setBillingAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getBillingAddress())
                .isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void shippingAddress() {
        Order value = Order.of();
        value.setShippingAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void shippingMode() {
        Order value = Order.of();
        value.setShippingMode(com.commercetools.api.models.cart.ShippingMode.findEnum("Single"));
        Assertions.assertThat(value.getShippingMode())
                .isEqualTo(com.commercetools.api.models.cart.ShippingMode.findEnum("Single"));
    }

    @Test
    public void shippingKey() {
        Order value = Order.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void shippingInfo() {
        Order value = Order.of();
        value.setShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }

    @Test
    public void shippingRateInput() {
        Order value = Order.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }

    @Test
    public void shippingCustomFields() {
        Order value = Order.of();
        value.setShippingCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getShippingCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void shipping() {
        Order value = Order.of();
        value.setShipping(Collections.singletonList(new com.commercetools.api.models.cart.ShippingImpl()));
        Assertions.assertThat(value.getShipping())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.ShippingImpl()));
    }

    @Test
    public void itemShippingAddresses() {
        Order value = Order.of();
        value.setItemShippingAddresses(
            Collections.singletonList(new com.commercetools.api.models.common.AddressImpl()));
        Assertions.assertThat(value.getItemShippingAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AddressImpl()));
    }

    @Test
    public void discountCodes() {
        Order value = Order.of();
        value.setDiscountCodes(Collections.singletonList(new com.commercetools.api.models.cart.DiscountCodeInfoImpl()));
        Assertions.assertThat(value.getDiscountCodes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.DiscountCodeInfoImpl()));
    }

    @Test
    public void directDiscounts() {
        Order value = Order.of();
        value.setDirectDiscounts(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl()));
        Assertions.assertThat(value.getDirectDiscounts())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl()));
    }

    @Test
    public void refusedGifts() {
        Order value = Order.of();
        value.setRefusedGifts(
            Collections.singletonList(new com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl()));
        Assertions.assertThat(value.getRefusedGifts())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl()));
    }

    @Test
    public void paymentInfo() {
        Order value = Order.of();
        value.setPaymentInfo(new com.commercetools.api.models.order.PaymentInfoImpl());
        Assertions.assertThat(value.getPaymentInfo())
                .isEqualTo(new com.commercetools.api.models.order.PaymentInfoImpl());
    }

    @Test
    public void country() {
        Order value = Order.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void locale() {
        Order value = Order.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void origin() {
        Order value = Order.of();
        value.setOrigin(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer"));
        Assertions.assertThat(value.getOrigin())
                .isEqualTo(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer"));
    }

    @Test
    public void cart() {
        Order value = Order.of();
        value.setCart(new com.commercetools.api.models.cart.CartReferenceImpl());
        Assertions.assertThat(value.getCart()).isEqualTo(new com.commercetools.api.models.cart.CartReferenceImpl());
    }

    @Test
    public void quote() {
        Order value = Order.of();
        value.setQuote(new com.commercetools.api.models.quote.QuoteReferenceImpl());
        Assertions.assertThat(value.getQuote()).isEqualTo(new com.commercetools.api.models.quote.QuoteReferenceImpl());
    }

    @Test
    public void orderState() {
        Order value = Order.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }

    @Test
    public void shipmentState() {
        Order value = Order.of();
        value.setShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
    }

    @Test
    public void paymentState() {
        Order value = Order.of();
        value.setPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }

    @Test
    public void state() {
        Order value = Order.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void syncInfo() {
        Order value = Order.of();
        value.setSyncInfo(Collections.singletonList(new com.commercetools.api.models.order.SyncInfoImpl()));
        Assertions.assertThat(value.getSyncInfo())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.SyncInfoImpl()));
    }

    @Test
    public void returnInfo() {
        Order value = Order.of();
        value.setReturnInfo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl()));
        Assertions.assertThat(value.getReturnInfo())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl()));
    }

    @Test
    public void discountTypeCombination() {
        Order value = Order.of();
        value.setDiscountTypeCombination(new com.commercetools.api.models.cart.DiscountTypeCombinationImpl());
        Assertions.assertThat(value.getDiscountTypeCombination())
                .isEqualTo(new com.commercetools.api.models.cart.DiscountTypeCombinationImpl());
    }

    @Test
    public void lastMessageSequenceNumber() {
        Order value = Order.of();
        value.setLastMessageSequenceNumber(8L);
        Assertions.assertThat(value.getLastMessageSequenceNumber()).isEqualTo(8L);
    }

    @Test
    public void custom() {
        Order value = Order.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void completedAt() {
        Order value = Order.of();
        value.setCompletedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCompletedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void createdAt() {
        Order value = Order.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Order value = Order.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Order value = Order.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Order value = Order.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }
}
