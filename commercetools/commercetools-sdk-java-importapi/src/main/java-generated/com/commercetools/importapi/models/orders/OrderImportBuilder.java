
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImport orderImport = OrderImport.builder()
 *             .orderNumber("{orderNumber}")
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderImportBuilder implements Builder<OrderImport> {

    private String orderNumber;

    @Nullable
    private com.commercetools.importapi.models.common.CustomerKeyReference customer;

    @Nullable
    private String customerEmail;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> lineItems;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> customLineItems;

    private com.commercetools.importapi.models.common.TypedMoney totalPrice;

    @Nullable
    private com.commercetools.importapi.models.orders.TaxedPrice taxedPrice;

    @Nullable
    private com.commercetools.importapi.models.common.Address shippingAddress;

    @Nullable
    private com.commercetools.importapi.models.common.Address billingAddress;

    @Nullable
    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.importapi.models.orders.OrderState orderState;

    @Nullable
    private com.commercetools.importapi.models.orders.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.importapi.models.orders.PaymentState paymentState;

    @Nullable
    private com.commercetools.importapi.models.orders.ShippingInfoImportDraft shippingInfo;

    @Nullable
    private java.time.ZonedDateTime completedAt;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    @Nullable
    private com.commercetools.importapi.models.orders.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.importapi.models.orders.RoundingMode taxRoundingMode;

    @Nullable
    private com.commercetools.importapi.models.orders.TaxCalculationMode taxCalculationMode;

    @Nullable
    private com.commercetools.importapi.models.orders.CartOrigin origin;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Address> itemShippingAddresses;

    @Nullable
    private com.commercetools.importapi.models.common.StoreKeyReference store;

    @Nullable
    private com.commercetools.importapi.models.common.StateKeyReference state;

    /**
     *  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order. It should be unique across a project. Once it's set it cannot be changed.</p>
     * @param orderNumber
     * @return Builder
     */

    public OrderImportBuilder orderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public OrderImportBuilder customer(
            Function<com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *
     * @param customer
     * @return Builder
     */

    public OrderImportBuilder customer(
            @Nullable final com.commercetools.importapi.models.common.CustomerKeyReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customerEmail</code>.</p>
     * @param customerEmail
     * @return Builder
     */

    public OrderImportBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @param lineItems
     * @return Builder
     */

    public OrderImportBuilder lineItems(
            @Nullable final com.commercetools.importapi.models.orders.LineItemImportDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @param lineItems
     * @return Builder
     */

    public OrderImportBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @param lineItems
     * @return Builder
     */

    public OrderImportBuilder plusLineItems(
            @Nullable final com.commercetools.importapi.models.orders.LineItemImportDraft... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder plusLineItems(
            Function<com.commercetools.importapi.models.orders.LineItemImportDraftBuilder, com.commercetools.importapi.models.orders.LineItemImportDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems
                .add(builder.apply(com.commercetools.importapi.models.orders.LineItemImportDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder withLineItems(
            Function<com.commercetools.importapi.models.orders.LineItemImportDraftBuilder, com.commercetools.importapi.models.orders.LineItemImportDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems
                .add(builder.apply(com.commercetools.importapi.models.orders.LineItemImportDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @param customLineItems
     * @return Builder
     */

    public OrderImportBuilder customLineItems(
            @Nullable final com.commercetools.importapi.models.orders.CustomLineItemDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @param customLineItems
     * @return Builder
     */

    public OrderImportBuilder customLineItems(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @param customLineItems
     * @return Builder
     */

    public OrderImportBuilder plusCustomLineItems(
            @Nullable final com.commercetools.importapi.models.orders.CustomLineItemDraft... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @return Builder
     */

    public OrderImportBuilder plusCustomLineItems(
            Function<com.commercetools.importapi.models.orders.CustomLineItemDraftBuilder, com.commercetools.importapi.models.orders.CustomLineItemDraftBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems
                .add(builder.apply(com.commercetools.importapi.models.orders.CustomLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @return Builder
     */

    public OrderImportBuilder withCustomLineItems(
            Function<com.commercetools.importapi.models.orders.CustomLineItemDraftBuilder, com.commercetools.importapi.models.orders.CustomLineItemDraftBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems
                .add(builder.apply(com.commercetools.importapi.models.orders.CustomLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.totalPrice</code>.</p>
     * @param totalPrice
     * @return Builder
     */

    public OrderImportBuilder totalPrice(final com.commercetools.importapi.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.totalPrice</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder totalPrice(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.totalPrice = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.taxedPrice</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder taxedPrice(
            Function<com.commercetools.importapi.models.orders.TaxedPriceBuilder, com.commercetools.importapi.models.orders.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.importapi.models.orders.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.taxedPrice</code>.</p>
     * @param taxedPrice
     * @return Builder
     */

    public OrderImportBuilder taxedPrice(
            @Nullable final com.commercetools.importapi.models.orders.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shippingAddress</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder shippingAddress(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shippingAddress</code>.</p>
     * @param shippingAddress
     * @return Builder
     */

    public OrderImportBuilder shippingAddress(
            @Nullable final com.commercetools.importapi.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.billingAddress</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder billingAddress(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.billingAddress</code>.</p>
     * @param billingAddress
     * @return Builder
     */

    public OrderImportBuilder billingAddress(
            @Nullable final com.commercetools.importapi.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customerGroup</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder customerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customerGroup</code>.</p>
     * @param customerGroup
     * @return Builder
     */

    public OrderImportBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.country</code>.</p>
     * @param country
     * @return Builder
     */

    public OrderImportBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.orderState</code>.</p>
     * @param orderState
     * @return Builder
     */

    public OrderImportBuilder orderState(
            @Nullable final com.commercetools.importapi.models.orders.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shipmentState</code>.</p>
     * @param shipmentState
     * @return Builder
     */

    public OrderImportBuilder shipmentState(
            @Nullable final com.commercetools.importapi.models.orders.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.paymentState</code>.</p>
     * @param paymentState
     * @return Builder
     */

    public OrderImportBuilder paymentState(
            @Nullable final com.commercetools.importapi.models.orders.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shippingInfo</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder shippingInfo(
            Function<com.commercetools.importapi.models.orders.ShippingInfoImportDraftBuilder, com.commercetools.importapi.models.orders.ShippingInfoImportDraftBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.importapi.models.orders.ShippingInfoImportDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shippingInfo</code>.</p>
     * @param shippingInfo
     * @return Builder
     */

    public OrderImportBuilder shippingInfo(
            @Nullable final com.commercetools.importapi.models.orders.ShippingInfoImportDraft shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.completedAt</code>.</p>
     * @param completedAt
     * @return Builder
     */

    public OrderImportBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.custom</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.custom</code>.</p>
     * @param custom
     * @return Builder
     */

    public OrderImportBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.inventoryMode</code>.</p>
     * @param inventoryMode
     * @return Builder
     */

    public OrderImportBuilder inventoryMode(
            @Nullable final com.commercetools.importapi.models.orders.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.taxRoundingMode</code>.</p>
     * @param taxRoundingMode
     * @return Builder
     */

    public OrderImportBuilder taxRoundingMode(
            @Nullable final com.commercetools.importapi.models.orders.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.taxCalculationMode</code>.</p>
     * @param taxCalculationMode
     * @return Builder
     */

    public OrderImportBuilder taxCalculationMode(
            @Nullable final com.commercetools.importapi.models.orders.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.origin</code>.</p>
     * @param origin
     * @return Builder
     */

    public OrderImportBuilder origin(@Nullable final com.commercetools.importapi.models.orders.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses
     * @return Builder
     */

    public OrderImportBuilder itemShippingAddresses(
            @Nullable final com.commercetools.importapi.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses
     * @return Builder
     */

    public OrderImportBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses
     * @return Builder
     */

    public OrderImportBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.importapi.models.common.Address... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder plusItemShippingAddresses(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @return Builder
     */

    public OrderImportBuilder withItemShippingAddresses(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Reference to the Store in which the Order is associated. If referenced Store does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Store exists.</p>
     * @return Builder
     */

    public OrderImportBuilder store(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Store in which the Order is associated. If referenced Store does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Store exists.</p>
     * @param store
     * @return Builder
     */

    public OrderImportBuilder store(@Nullable final com.commercetools.importapi.models.common.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Reference to a State in a custom workflow.</p>
     * @return Builder
     */

    public OrderImportBuilder state(
            Function<com.commercetools.importapi.models.common.StateKeyReferenceBuilder, com.commercetools.importapi.models.common.StateKeyReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.importapi.models.common.StateKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a State in a custom workflow.</p>
     * @param state
     * @return Builder
     */

    public OrderImportBuilder state(@Nullable final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.state = state;
        return this;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    @Nullable
    public com.commercetools.importapi.models.common.CustomerKeyReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> getLineItems() {
        return this.lineItems;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    public com.commercetools.importapi.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    @Nullable
    public com.commercetools.importapi.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    @Nullable
    public com.commercetools.importapi.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.OrderState getOrderState() {
        return this.orderState;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.PaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.ShippingInfoImportDraft getShippingInfo() {
        return this.shippingInfo;
    }

    @Nullable
    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.CartOrigin getOrigin() {
        return this.origin;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    @Nullable
    public com.commercetools.importapi.models.common.StoreKeyReference getStore() {
        return this.store;
    }

    @Nullable
    public com.commercetools.importapi.models.common.StateKeyReference getState() {
        return this.state;
    }

    public OrderImport build() {
        Objects.requireNonNull(orderNumber, OrderImport.class + ": orderNumber is missing");
        Objects.requireNonNull(totalPrice, OrderImport.class + ": totalPrice is missing");
        return new OrderImportImpl(orderNumber, customer, customerEmail, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, customerGroup, country, orderState, shipmentState,
            paymentState, shippingInfo, completedAt, custom, inventoryMode, taxRoundingMode, taxCalculationMode, origin,
            itemShippingAddresses, store, state);
    }

    /**
     * builds OrderImport without checking for non null required values
     */
    public OrderImport buildUnchecked() {
        return new OrderImportImpl(orderNumber, customer, customerEmail, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, customerGroup, country, orderState, shipmentState,
            paymentState, shippingInfo, completedAt, custom, inventoryMode, taxRoundingMode, taxCalculationMode, origin,
            itemShippingAddresses, store, state);
    }

    public static OrderImportBuilder of() {
        return new OrderImportBuilder();
    }

    public static OrderImportBuilder of(final OrderImport template) {
        OrderImportBuilder builder = new OrderImportBuilder();
        builder.orderNumber = template.getOrderNumber();
        builder.customer = template.getCustomer();
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
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.shippingInfo = template.getShippingInfo();
        builder.completedAt = template.getCompletedAt();
        builder.custom = template.getCustom();
        builder.inventoryMode = template.getInventoryMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.origin = template.getOrigin();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.store = template.getStore();
        builder.state = template.getState();
        return builder;
    }

}
