
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderImportDraftBuilder implements Builder<OrderImportDraft> {

    @Nullable
    private String orderNumber;

    @Nullable
    private String customerId;

    @Nullable
    private String customerEmail;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.CustomLineItemImportDraft> customLineItems;

    private com.commercetools.api.models.common.Money totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress billingAddress;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.order.OrderState orderState;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo;

    @Nullable
    private com.commercetools.api.models.order.PaymentInfo paymentInfo;

    @Nullable
    private java.time.ZonedDateTime completedAt;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @Nullable
    private com.commercetools.api.models.cart.CartOrigin origin;

    public OrderImportDraftBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public OrderImportDraftBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public OrderImportDraftBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public OrderImportDraftBuilder lineItems(
            @Nullable final com.commercetools.api.models.order.LineItemImportDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    public OrderImportDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public OrderImportDraftBuilder plusLineItems(
            @Nullable final com.commercetools.api.models.order.LineItemImportDraft... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    public OrderImportDraftBuilder plusLineItems(
            Function<com.commercetools.api.models.order.LineItemImportDraftBuilder, com.commercetools.api.models.order.LineItemImportDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.order.LineItemImportDraftBuilder.of()).build());
        return this;
    }

    public OrderImportDraftBuilder withLineItems(
            Function<com.commercetools.api.models.order.LineItemImportDraftBuilder, com.commercetools.api.models.order.LineItemImportDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.order.LineItemImportDraftBuilder.of()).build());
        return this;
    }

    public OrderImportDraftBuilder customLineItems(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemImportDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    public OrderImportDraftBuilder customLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.cart.CustomLineItemImportDraft> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    public OrderImportDraftBuilder plusCustomLineItems(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemImportDraft... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    public OrderImportDraftBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder, com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder.of()).build());
        return this;
    }

    public OrderImportDraftBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder, com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder.of()).build());
        return this;
    }

    public OrderImportDraftBuilder totalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public OrderImportDraftBuilder totalPrice(final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public OrderImportDraftBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceDraftBuilder, com.commercetools.api.models.cart.TaxedPriceDraftBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceDraftBuilder.of()).build();
        return this;
    }

    public OrderImportDraftBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public OrderImportDraftBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public OrderImportDraftBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public OrderImportDraftBuilder billingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public OrderImportDraftBuilder billingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public OrderImportDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public OrderImportDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public OrderImportDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public OrderImportDraftBuilder orderState(
            @Nullable final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    public OrderImportDraftBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    public OrderImportDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    public OrderImportDraftBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    public OrderImportDraftBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    public OrderImportDraftBuilder shippingInfo(
            Function<com.commercetools.api.models.order.ShippingInfoImportDraftBuilder, com.commercetools.api.models.order.ShippingInfoImportDraftBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.order.ShippingInfoImportDraftBuilder.of())
                .build();
        return this;
    }

    public OrderImportDraftBuilder shippingInfo(
            @Nullable final com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    public OrderImportDraftBuilder paymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfoBuilder> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of()).build();
        return this;
    }

    public OrderImportDraftBuilder paymentInfo(
            @Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    public OrderImportDraftBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    public OrderImportDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public OrderImportDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public OrderImportDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    public OrderImportDraftBuilder taxRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    public OrderImportDraftBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    public OrderImportDraftBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    public OrderImportDraftBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    public OrderImportDraftBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    public OrderImportDraftBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    public OrderImportDraftBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    public OrderImportDraftBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    public OrderImportDraftBuilder origin(@Nullable final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.LineItemImportDraft> getLineItems() {
        return this.lineItems;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.CustomLineItemImportDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedPriceDraft getTaxedPrice() {
        return this.taxedPrice;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    public com.commercetools.api.models.order.ShippingInfoImportDraft getShippingInfo() {
        return this.shippingInfo;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    @Nullable
    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    @Nullable
    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    public OrderImportDraft build() {
        Objects.requireNonNull(totalPrice, OrderImportDraft.class + ": totalPrice is missing");
        return new OrderImportDraftImpl(orderNumber, customerId, customerEmail, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, customerGroup, country, orderState, state, shipmentState,
            paymentState, shippingInfo, paymentInfo, completedAt, custom, inventoryMode, taxRoundingMode,
            itemShippingAddresses, store, origin);
    }

    /**
     * builds OrderImportDraft without checking for non null required values
     */
    public OrderImportDraft buildUnchecked() {
        return new OrderImportDraftImpl(orderNumber, customerId, customerEmail, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, customerGroup, country, orderState, state, shipmentState,
            paymentState, shippingInfo, paymentInfo, completedAt, custom, inventoryMode, taxRoundingMode,
            itemShippingAddresses, store, origin);
    }

    public static OrderImportDraftBuilder of() {
        return new OrderImportDraftBuilder();
    }

    public static OrderImportDraftBuilder of(final OrderImportDraft template) {
        OrderImportDraftBuilder builder = new OrderImportDraftBuilder();
        builder.orderNumber = template.getOrderNumber();
        builder.customerId = template.getCustomerId();
        builder.customerEmail = template.getCustomerEmail();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.shippingAddress = template.getShippingAddress();
        builder.billingAddress = template.getBillingAddress();
        builder.customerGroup = template.getCustomerGroup();
        builder.country = template.getCountry();
        builder.orderState = template.getOrderState();
        builder.state = template.getState();
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.shippingInfo = template.getShippingInfo();
        builder.paymentInfo = template.getPaymentInfo();
        builder.completedAt = template.getCompletedAt();
        builder.custom = template.getCustom();
        builder.inventoryMode = template.getInventoryMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.store = template.getStore();
        builder.origin = template.getOrigin();
        return builder;
    }

}
