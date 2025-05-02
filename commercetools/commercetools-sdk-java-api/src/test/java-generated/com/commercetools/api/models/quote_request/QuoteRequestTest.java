
package com.commercetools.api.models.quote_request;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestBuilder builder) {
        QuoteRequest quoteRequest = builder.buildUnchecked();
        Assertions.assertThat(quoteRequest).isInstanceOf(QuoteRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", QuoteRequest.builder().id("id") },
                new Object[] { "version", QuoteRequest.builder().version(2L) },
                new Object[] { "key", QuoteRequest.builder().key("key") },
                new Object[] { "createdAt",
                        QuoteRequest.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        QuoteRequest.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        QuoteRequest.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        QuoteRequest.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "quoteRequestState",
                        QuoteRequest.builder()
                                .quoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState
                                        .findEnum("Submitted")) },
                new Object[] { "comment", QuoteRequest.builder().comment("comment") },
                new Object[] { "customer",
                        QuoteRequest.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "customerGroup", QuoteRequest.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "store",
                        QuoteRequest.builder().store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "lineItems", QuoteRequest.builder()
                        .lineItems(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl())) },
                new Object[] { "customLineItems",
                        QuoteRequest.builder()
                                .customLineItems(Collections
                                        .singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl())) },
                new Object[] { "totalPrice",
                        QuoteRequest.builder().totalPrice(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { "taxedPrice",
                        QuoteRequest.builder().taxedPrice(new com.commercetools.api.models.cart.TaxedPriceImpl()) },
                new Object[] { "shippingAddress",
                        QuoteRequest.builder().shippingAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "billingAddress",
                        QuoteRequest.builder().billingAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "inventoryMode",
                        QuoteRequest.builder()
                                .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] { "taxMode",
                        QuoteRequest.builder()
                                .taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) },
                new Object[] { "taxRoundingMode",
                        QuoteRequest.builder()
                                .taxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "taxCalculationMode",
                        QuoteRequest.builder()
                                .taxCalculationMode(
                                    com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel")) },
                new Object[] { "country", QuoteRequest.builder().country("country") },
                new Object[] { "shippingInfo",
                        QuoteRequest.builder().shippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) },
                new Object[] { "paymentInfo",
                        QuoteRequest.builder().paymentInfo(new com.commercetools.api.models.order.PaymentInfoImpl()) },
                new Object[] { "shippingRateInput",
                        QuoteRequest.builder()
                                .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) },
                new Object[] { "itemShippingAddresses",
                        QuoteRequest.builder()
                                .itemShippingAddresses(
                                    Collections.singletonList(new com.commercetools.api.models.common.AddressImpl())) },
                new Object[] { "directDiscounts",
                        QuoteRequest.builder()
                                .directDiscounts(Collections
                                        .singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl())) },
                new Object[] { "custom",
                        QuoteRequest.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "state",
                        QuoteRequest.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "purchaseOrderNumber",
                        QuoteRequest.builder().purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { "cart",
                        QuoteRequest.builder().cart(new com.commercetools.api.models.cart.CartReferenceImpl()) },
                new Object[] { "businessUnit",
                        QuoteRequest.builder()
                                .businessUnit(
                                    new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void id() {
        QuoteRequest value = QuoteRequest.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        QuoteRequest value = QuoteRequest.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        QuoteRequest value = QuoteRequest.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void createdAt() {
        QuoteRequest value = QuoteRequest.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        QuoteRequest value = QuoteRequest.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        QuoteRequest value = QuoteRequest.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        QuoteRequest value = QuoteRequest.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void quoteRequestState() {
        QuoteRequest value = QuoteRequest.of();
        value.setQuoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }

    @Test
    public void comment() {
        QuoteRequest value = QuoteRequest.of();
        value.setComment("comment");
        Assertions.assertThat(value.getComment()).isEqualTo("comment");
    }

    @Test
    public void customer() {
        QuoteRequest value = QuoteRequest.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void customerGroup() {
        QuoteRequest value = QuoteRequest.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void store() {
        QuoteRequest value = QuoteRequest.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void lineItems() {
        QuoteRequest value = QuoteRequest.of();
        value.setLineItems(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl()));
    }

    @Test
    public void customLineItems() {
        QuoteRequest value = QuoteRequest.of();
        value.setCustomLineItems(Collections.singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl()));
        Assertions.assertThat(value.getCustomLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl()));
    }

    @Test
    public void totalPrice() {
        QuoteRequest value = QuoteRequest.of();
        value.setTotalPrice(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        QuoteRequest value = QuoteRequest.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedPriceImpl());
        Assertions.assertThat(value.getTaxedPrice()).isEqualTo(new com.commercetools.api.models.cart.TaxedPriceImpl());
    }

    @Test
    public void shippingAddress() {
        QuoteRequest value = QuoteRequest.of();
        value.setShippingAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void billingAddress() {
        QuoteRequest value = QuoteRequest.of();
        value.setBillingAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getBillingAddress())
                .isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void inventoryMode() {
        QuoteRequest value = QuoteRequest.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void taxMode() {
        QuoteRequest value = QuoteRequest.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }

    @Test
    public void taxRoundingMode() {
        QuoteRequest value = QuoteRequest.of();
        value.setTaxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void taxCalculationMode() {
        QuoteRequest value = QuoteRequest.of();
        value.setTaxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getTaxCalculationMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
    }

    @Test
    public void country() {
        QuoteRequest value = QuoteRequest.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void shippingInfo() {
        QuoteRequest value = QuoteRequest.of();
        value.setShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }

    @Test
    public void paymentInfo() {
        QuoteRequest value = QuoteRequest.of();
        value.setPaymentInfo(new com.commercetools.api.models.order.PaymentInfoImpl());
        Assertions.assertThat(value.getPaymentInfo())
                .isEqualTo(new com.commercetools.api.models.order.PaymentInfoImpl());
    }

    @Test
    public void shippingRateInput() {
        QuoteRequest value = QuoteRequest.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }

    @Test
    public void itemShippingAddresses() {
        QuoteRequest value = QuoteRequest.of();
        value.setItemShippingAddresses(
            Collections.singletonList(new com.commercetools.api.models.common.AddressImpl()));
        Assertions.assertThat(value.getItemShippingAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AddressImpl()));
    }

    @Test
    public void directDiscounts() {
        QuoteRequest value = QuoteRequest.of();
        value.setDirectDiscounts(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl()));
        Assertions.assertThat(value.getDirectDiscounts())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl()));
    }

    @Test
    public void custom() {
        QuoteRequest value = QuoteRequest.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void state() {
        QuoteRequest value = QuoteRequest.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void purchaseOrderNumber() {
        QuoteRequest value = QuoteRequest.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void cart() {
        QuoteRequest value = QuoteRequest.of();
        value.setCart(new com.commercetools.api.models.cart.CartReferenceImpl());
        Assertions.assertThat(value.getCart()).isEqualTo(new com.commercetools.api.models.cart.CartReferenceImpl());
    }

    @Test
    public void businessUnit() {
        QuoteRequest value = QuoteRequest.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }
}
