
package com.commercetools.api.models.quote;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteBuilder builder) {
        Quote quote = builder.buildUnchecked();
        Assertions.assertThat(quote).isInstanceOf(Quote.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Quote.builder().id("id") },
                new Object[] { "version", Quote.builder().version(2L) },
                new Object[] { "key", Quote.builder().key("key") },
                new Object[] { "createdAt", Quote.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Quote.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Quote.builder().lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Quote.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "quoteRequest", Quote.builder()
                        .quoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestReferenceImpl()) },
                new Object[] { "stagedQuote", Quote.builder()
                        .stagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteReferenceImpl()) },
                new Object[] { "customer",
                        Quote.builder().customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "customerGroup", Quote.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "validTo", Quote.builder().validTo(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "sellerComment", Quote.builder().sellerComment("sellerComment") },
                new Object[] { "buyerComment", Quote.builder().buyerComment("buyerComment") },
                new Object[] { "store",
                        Quote.builder().store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "lineItems", Quote.builder()
                        .lineItems(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl())) },
                new Object[] { "customLineItems",
                        Quote.builder()
                                .customLineItems(Collections
                                        .singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl())) },
                new Object[] { "totalPrice",
                        Quote.builder().totalPrice(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { "taxedPrice",
                        Quote.builder().taxedPrice(new com.commercetools.api.models.cart.TaxedPriceImpl()) },
                new Object[] { "shippingAddress",
                        Quote.builder().shippingAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "billingAddress",
                        Quote.builder().billingAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "inventoryMode",
                        Quote.builder()
                                .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] { "taxMode",
                        Quote.builder().taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) },
                new Object[] { "priceRoundingMode", Quote.builder()
                        .priceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "taxRoundingMode",
                        Quote.builder()
                                .taxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "taxCalculationMode",
                        Quote.builder()
                                .taxCalculationMode(
                                    com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel")) },
                new Object[] { "country", Quote.builder().country("country") },
                new Object[] { "shippingInfo",
                        Quote.builder().shippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) },
                new Object[] { "paymentInfo",
                        Quote.builder().paymentInfo(new com.commercetools.api.models.order.PaymentInfoImpl()) },
                new Object[] { "shippingRateInput",
                        Quote.builder()
                                .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) },
                new Object[] { "itemShippingAddresses",
                        Quote.builder()
                                .itemShippingAddresses(
                                    Collections.singletonList(new com.commercetools.api.models.common.AddressImpl())) },
                new Object[] { "directDiscounts",
                        Quote.builder()
                                .directDiscounts(Collections
                                        .singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl())) },
                new Object[] { "custom",
                        Quote.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "quoteState",
                        Quote.builder().quoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending")) },
                new Object[] { "state",
                        Quote.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "purchaseOrderNumber", Quote.builder().purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { "businessUnit",
                        Quote.builder()
                                .businessUnit(
                                    new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void id() {
        Quote value = Quote.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Quote value = Quote.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        Quote value = Quote.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void createdAt() {
        Quote value = Quote.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Quote value = Quote.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Quote value = Quote.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Quote value = Quote.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void quoteRequest() {
        Quote value = Quote.of();
        value.setQuoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestReferenceImpl());
        Assertions.assertThat(value.getQuoteRequest())
                .isEqualTo(new com.commercetools.api.models.quote_request.QuoteRequestReferenceImpl());
    }

    @Test
    public void stagedQuote() {
        Quote value = Quote.of();
        value.setStagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteReferenceImpl());
        Assertions.assertThat(value.getStagedQuote())
                .isEqualTo(new com.commercetools.api.models.staged_quote.StagedQuoteReferenceImpl());
    }

    @Test
    public void customer() {
        Quote value = Quote.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void customerGroup() {
        Quote value = Quote.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void validTo() {
        Quote value = Quote.of();
        value.setValidTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidTo()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void sellerComment() {
        Quote value = Quote.of();
        value.setSellerComment("sellerComment");
        Assertions.assertThat(value.getSellerComment()).isEqualTo("sellerComment");
    }

    @Test
    public void buyerComment() {
        Quote value = Quote.of();
        value.setBuyerComment("buyerComment");
        Assertions.assertThat(value.getBuyerComment()).isEqualTo("buyerComment");
    }

    @Test
    public void store() {
        Quote value = Quote.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void lineItems() {
        Quote value = Quote.of();
        value.setLineItems(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl()));
    }

    @Test
    public void customLineItems() {
        Quote value = Quote.of();
        value.setCustomLineItems(Collections.singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl()));
        Assertions.assertThat(value.getCustomLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl()));
    }

    @Test
    public void totalPrice() {
        Quote value = Quote.of();
        value.setTotalPrice(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        Quote value = Quote.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedPriceImpl());
        Assertions.assertThat(value.getTaxedPrice()).isEqualTo(new com.commercetools.api.models.cart.TaxedPriceImpl());
    }

    @Test
    public void shippingAddress() {
        Quote value = Quote.of();
        value.setShippingAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void billingAddress() {
        Quote value = Quote.of();
        value.setBillingAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getBillingAddress())
                .isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void inventoryMode() {
        Quote value = Quote.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void taxMode() {
        Quote value = Quote.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }

    @Test
    public void priceRoundingMode() {
        Quote value = Quote.of();
        value.setPriceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPriceRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void taxRoundingMode() {
        Quote value = Quote.of();
        value.setTaxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void taxCalculationMode() {
        Quote value = Quote.of();
        value.setTaxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getTaxCalculationMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
    }

    @Test
    public void country() {
        Quote value = Quote.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void shippingInfo() {
        Quote value = Quote.of();
        value.setShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }

    @Test
    public void paymentInfo() {
        Quote value = Quote.of();
        value.setPaymentInfo(new com.commercetools.api.models.order.PaymentInfoImpl());
        Assertions.assertThat(value.getPaymentInfo())
                .isEqualTo(new com.commercetools.api.models.order.PaymentInfoImpl());
    }

    @Test
    public void shippingRateInput() {
        Quote value = Quote.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }

    @Test
    public void itemShippingAddresses() {
        Quote value = Quote.of();
        value.setItemShippingAddresses(
            Collections.singletonList(new com.commercetools.api.models.common.AddressImpl()));
        Assertions.assertThat(value.getItemShippingAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AddressImpl()));
    }

    @Test
    public void directDiscounts() {
        Quote value = Quote.of();
        value.setDirectDiscounts(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl()));
        Assertions.assertThat(value.getDirectDiscounts())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl()));
    }

    @Test
    public void custom() {
        Quote value = Quote.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void quoteState() {
        Quote value = Quote.of();
        value.setQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getQuoteState())
                .isEqualTo(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
    }

    @Test
    public void state() {
        Quote value = Quote.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void purchaseOrderNumber() {
        Quote value = Quote.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void businessUnit() {
        Quote value = Quote.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }
}
