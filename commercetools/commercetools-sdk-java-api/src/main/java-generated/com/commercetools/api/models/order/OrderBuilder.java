
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderBuilder implements Builder<Order> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private java.time.ZonedDateTime completedAt;

    @Nullable
    private String orderNumber;

    @Nullable
    private String customerId;

    @Nullable
    private String customerEmail;

    @Nullable
    private String anonymousId;

    @Nullable
    private com.commercetools.api.models.store.StoreKeyReference store;

    private java.util.List<com.commercetools.api.models.cart.LineItem> lineItems;

    private java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems;

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    @Nullable
    private com.commercetools.api.models.common.Address shippingAddress;

    @Nullable
    private com.commercetools.api.models.common.Address billingAddress;

    @Nullable
    private com.commercetools.api.models.cart.TaxMode taxMode;

    @Nullable
    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private String country;

    private com.commercetools.api.models.order.OrderState orderState;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    private java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;

    private Long lastMessageSequenceNumber;

    @Nullable
    private com.commercetools.api.models.cart.CartReference cart;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.order.PaymentInfo paymentInfo;

    @Nullable
    private String locale;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.CartOrigin origin;

    @Nullable
    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts;

    public OrderBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public OrderBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public OrderBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public OrderBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public OrderBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OrderBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    public OrderBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public OrderBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public OrderBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public OrderBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    public OrderBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    public OrderBuilder lineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    public OrderBuilder withLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    public OrderBuilder plusLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    public OrderBuilder lineItems(final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public OrderBuilder customLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    public OrderBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    public OrderBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    public OrderBuilder customLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    public OrderBuilder totalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public OrderBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    public OrderBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public OrderBuilder shippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    public OrderBuilder shippingAddress(@Nullable final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public OrderBuilder billingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    public OrderBuilder billingAddress(@Nullable final com.commercetools.api.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public OrderBuilder taxMode(@Nullable final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public OrderBuilder taxRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    public OrderBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    public OrderBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public OrderBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public OrderBuilder orderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    public OrderBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    public OrderBuilder shipmentState(@Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    public OrderBuilder paymentState(@Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    public OrderBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    public OrderBuilder shippingInfo(@Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    public OrderBuilder syncInfo(final com.commercetools.api.models.order.SyncInfo... syncInfo) {
        this.syncInfo = new ArrayList<>(Arrays.asList(syncInfo));
        return this;
    }

    public OrderBuilder withSyncInfo(
            Function<com.commercetools.api.models.order.SyncInfoBuilder, com.commercetools.api.models.order.SyncInfoBuilder> builder) {
        this.syncInfo = new ArrayList<>();
        this.syncInfo.add(builder.apply(com.commercetools.api.models.order.SyncInfoBuilder.of()).build());
        return this;
    }

    public OrderBuilder plusSyncInfo(
            Function<com.commercetools.api.models.order.SyncInfoBuilder, com.commercetools.api.models.order.SyncInfoBuilder> builder) {
        if (this.syncInfo == null) {
            this.syncInfo = new ArrayList<>();
        }
        this.syncInfo.add(builder.apply(com.commercetools.api.models.order.SyncInfoBuilder.of()).build());
        return this;
    }

    public OrderBuilder syncInfo(final java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }

    public OrderBuilder returnInfo(@Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        this.returnInfo = new ArrayList<>(Arrays.asList(returnInfo));
        return this;
    }

    public OrderBuilder withReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        this.returnInfo = new ArrayList<>();
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    public OrderBuilder plusReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    public OrderBuilder returnInfo(
            @Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    public OrderBuilder discountCodes(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    public OrderBuilder withDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        this.discountCodes = new ArrayList<>();
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
        return this;
    }

    public OrderBuilder plusDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
        return this;
    }

    public OrderBuilder discountCodes(
            @Nullable final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    public OrderBuilder lastMessageSequenceNumber(final Long lastMessageSequenceNumber) {
        this.lastMessageSequenceNumber = lastMessageSequenceNumber;
        return this;
    }

    public OrderBuilder cart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReferenceBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of()).build();
        return this;
    }

    public OrderBuilder cart(@Nullable final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
        return this;
    }

    public OrderBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    public OrderBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public OrderBuilder paymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfoBuilder> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of()).build();
        return this;
    }

    public OrderBuilder paymentInfo(@Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    public OrderBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    public OrderBuilder inventoryMode(@Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    public OrderBuilder origin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    public OrderBuilder taxCalculationMode(
            @Nullable final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    public OrderBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    public OrderBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    public OrderBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    public OrderBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    public OrderBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    public OrderBuilder refusedGifts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... refusedGifts) {
        this.refusedGifts = new ArrayList<>(Arrays.asList(refusedGifts));
        return this;
    }

    public OrderBuilder withRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        this.refusedGifts = new ArrayList<>();
        this.refusedGifts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
        return this;
    }

    public OrderBuilder plusRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        if (this.refusedGifts == null) {
            this.refusedGifts = new ArrayList<>();
        }
        this.refusedGifts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
        return this;
    }

    public OrderBuilder refusedGifts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts) {
        this.refusedGifts = refusedGifts;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
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
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems() {
        return this.lineItems;
    }

    public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems() {
        return this.customLineItems;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

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
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    public java.util.List<com.commercetools.api.models.order.SyncInfo> getSyncInfo() {
        return this.syncInfo;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ReturnInfo> getReturnInfo() {
        return this.returnInfo;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes() {
        return this.discountCodes;
    }

    public Long getLastMessageSequenceNumber() {
        return this.lastMessageSequenceNumber;
    }

    @Nullable
    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getRefusedGifts() {
        return this.refusedGifts;
    }

    public Order build() {
        Objects.requireNonNull(id, Order.class + ": id is missing");
        Objects.requireNonNull(version, Order.class + ": version is missing");
        Objects.requireNonNull(createdAt, Order.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Order.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(lineItems, Order.class + ": lineItems is missing");
        Objects.requireNonNull(customLineItems, Order.class + ": customLineItems is missing");
        Objects.requireNonNull(totalPrice, Order.class + ": totalPrice is missing");
        Objects.requireNonNull(orderState, Order.class + ": orderState is missing");
        Objects.requireNonNull(syncInfo, Order.class + ": syncInfo is missing");
        Objects.requireNonNull(lastMessageSequenceNumber, Order.class + ": lastMessageSequenceNumber is missing");
        Objects.requireNonNull(origin, Order.class + ": origin is missing");
        Objects.requireNonNull(refusedGifts, Order.class + ": refusedGifts is missing");
        return new OrderImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, completedAt,
            orderNumber, customerId, customerEmail, anonymousId, store, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, taxMode, taxRoundingMode, customerGroup, country, orderState,
            state, shipmentState, paymentState, shippingInfo, syncInfo, returnInfo, discountCodes,
            lastMessageSequenceNumber, cart, custom, paymentInfo, locale, inventoryMode, origin, taxCalculationMode,
            shippingRateInput, itemShippingAddresses, refusedGifts);
    }

    /**
     * builds Order without checking for non null required values
     */
    public Order buildUnchecked() {
        return new OrderImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, completedAt,
            orderNumber, customerId, customerEmail, anonymousId, store, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, taxMode, taxRoundingMode, customerGroup, country, orderState,
            state, shipmentState, paymentState, shippingInfo, syncInfo, returnInfo, discountCodes,
            lastMessageSequenceNumber, cart, custom, paymentInfo, locale, inventoryMode, origin, taxCalculationMode,
            shippingRateInput, itemShippingAddresses, refusedGifts);
    }

    public static OrderBuilder of() {
        return new OrderBuilder();
    }

    public static OrderBuilder of(final Order template) {
        OrderBuilder builder = new OrderBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.completedAt = template.getCompletedAt();
        builder.orderNumber = template.getOrderNumber();
        builder.customerId = template.getCustomerId();
        builder.customerEmail = template.getCustomerEmail();
        builder.anonymousId = template.getAnonymousId();
        builder.store = template.getStore();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.shippingAddress = template.getShippingAddress();
        builder.billingAddress = template.getBillingAddress();
        builder.taxMode = template.getTaxMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.customerGroup = template.getCustomerGroup();
        builder.country = template.getCountry();
        builder.orderState = template.getOrderState();
        builder.state = template.getState();
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.shippingInfo = template.getShippingInfo();
        builder.syncInfo = template.getSyncInfo();
        builder.returnInfo = template.getReturnInfo();
        builder.discountCodes = template.getDiscountCodes();
        builder.lastMessageSequenceNumber = template.getLastMessageSequenceNumber();
        builder.cart = template.getCart();
        builder.custom = template.getCustom();
        builder.paymentInfo = template.getPaymentInfo();
        builder.locale = template.getLocale();
        builder.inventoryMode = template.getInventoryMode();
        builder.origin = template.getOrigin();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.refusedGifts = template.getRefusedGifts();
        return builder;
    }

}
