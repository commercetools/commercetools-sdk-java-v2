
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderImportDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImportDraft orderImportDraft = OrderImportDraft.builder()
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @Nullable
    private com.commercetools.api.models.cart.CartOrigin origin;

    /**
     *  <p>String that unique identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique within a project.</p>
     * @param orderNumber value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *  <p>If given the customer with that ID must exist in the project.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p>The customer email can be used when no check against existing Customers is desired during order import.</p>
     * @param customerEmail value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>If not given <code>customLineItems</code> must not be empty.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder lineItems(
            @Nullable final com.commercetools.api.models.order.LineItemImportDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>If not given <code>customLineItems</code> must not be empty.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>If not given <code>customLineItems</code> must not be empty.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder plusLineItems(
            @Nullable final com.commercetools.api.models.order.LineItemImportDraft... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>If not given <code>customLineItems</code> must not be empty.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder plusLineItems(
            Function<com.commercetools.api.models.order.LineItemImportDraftBuilder, com.commercetools.api.models.order.LineItemImportDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.order.LineItemImportDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>If not given <code>customLineItems</code> must not be empty.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder withLineItems(
            Function<com.commercetools.api.models.order.LineItemImportDraftBuilder, com.commercetools.api.models.order.LineItemImportDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.order.LineItemImportDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>If not given <code>lineItems</code> must not be empty.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder customLineItems(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemImportDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>If not given <code>lineItems</code> must not be empty.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder customLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.cart.CustomLineItemImportDraft> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *  <p>If not given <code>lineItems</code> must not be empty.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder plusCustomLineItems(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemImportDraft... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>If not given <code>lineItems</code> must not be empty.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder, com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>If not given <code>lineItems</code> must not be empty.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder, com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.cart.CustomLineItemImportDraftBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the totalPrice using the builder function
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderImportDraftBuilder totalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the totalPrice
     * @param totalPrice value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder totalPrice(final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>Order Import does not support calculation of taxes. When setting the draft the taxedPrice is to be provided.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderImportDraftBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceDraftBuilder, com.commercetools.api.models.cart.TaxedPriceDraftBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Order Import does not support calculation of taxes. When setting the draft the taxedPrice is to be provided.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     * set the value to the shippingAddress using the builder function
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public OrderImportDraftBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the shippingAddress
     * @param shippingAddress value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * set the value to the billingAddress using the builder function
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public OrderImportDraftBuilder billingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the billingAddress
     * @param billingAddress value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder billingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Set when the customer is set and the customer is a member of a customer group. Used for product variant price selection.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public OrderImportDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Set when the customer is set and the customer is a member of a customer group. Used for product variant price selection.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2. Used for product variant price selection.</p>
     * @param country value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>If not given the <code>Open</code> state will be assigned by default.</p>
     * @param orderState value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder orderState(
            @Nullable final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p>This reference can point to a state in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderImportDraftBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>This reference can point to a state in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     * set the value to the shipmentState
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     * set the value to the paymentState
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Set if the ShippingMethod is set.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public OrderImportDraftBuilder shippingInfo(
            Function<com.commercetools.api.models.order.ShippingInfoImportDraftBuilder, com.commercetools.api.models.order.ShippingInfoImportDraftBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.order.ShippingInfoImportDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Set if the ShippingMethod is set.</p>
     * @param shippingInfo value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder shippingInfo(
            @Nullable final com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     * set the value to the paymentInfo using the builder function
     * @param builder function to build the paymentInfo value
     * @return Builder
     */

    public OrderImportDraftBuilder paymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfoBuilder> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the paymentInfo
     * @param paymentInfo value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder paymentInfo(
            @Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    /**
     * set the value to the completedAt
     * @param completedAt value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderImportDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     * @param custom value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>If not given the mode <code>None</code> will be assigned by default.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>If not given the tax rounding mode <code>HalfEven</code> will be assigned by default.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder taxRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderImportDraftBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderImportDraftBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Business Unit the Cart belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public OrderImportDraftBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Business Unit the Cart belongs to.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     * set the value to the store using the builder function
     * @param builder function to build the store value
     * @return Builder
     */

    public OrderImportDraftBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the store
     * @param store value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>The default origin is <code>Customer</code>.</p>
     * @param origin value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder origin(@Nullable final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>String that unique identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique within a project.</p>
     * @return orderNumber
     */

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>If given the customer with that ID must exist in the project.</p>
     * @return customerId
     */

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>The customer email can be used when no check against existing Customers is desired during order import.</p>
     * @return customerEmail
     */

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>If not given <code>customLineItems</code> must not be empty.</p>
     * @return lineItems
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.LineItemImportDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>If not given <code>lineItems</code> must not be empty.</p>
     * @return customLineItems
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.CustomLineItemImportDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     * value of totalPrice}
     * @return totalPrice
     */

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Order Import does not support calculation of taxes. When setting the draft the taxedPrice is to be provided.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedPriceDraft getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     * value of shippingAddress}
     * @return shippingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * value of billingAddress}
     * @return billingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Set when the customer is set and the customer is a member of a customer group. Used for product variant price selection.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2. Used for product variant price selection.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>If not given the <code>Open</code> state will be assigned by default.</p>
     * @return orderState
     */

    @Nullable
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>This reference can point to a state in a custom workflow.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     * value of shipmentState}
     * @return shipmentState
     */

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     * value of paymentState}
     * @return paymentState
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Set if the ShippingMethod is set.</p>
     * @return shippingInfo
     */

    @Nullable
    public com.commercetools.api.models.order.ShippingInfoImportDraft getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     * value of paymentInfo}
     * @return paymentInfo
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     * value of completedAt}
     * @return completedAt
     */

    @Nullable
    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     *  <p>The custom fields.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>If not given the mode <code>None</code> will be assigned by default.</p>
     * @return inventoryMode
     */

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>If not given the tax rounding mode <code>HalfEven</code> will be assigned by default.</p>
     * @return taxRoundingMode
     */

    @Nullable
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @return itemShippingAddresses
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>The Business Unit the Cart belongs to.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * value of store}
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     *  <p>The default origin is <code>Customer</code>.</p>
     * @return origin
     */

    @Nullable
    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     * builds OrderImportDraft with checking for non-null required values
     * @return OrderImportDraft
     */
    public OrderImportDraft build() {
        Objects.requireNonNull(totalPrice, OrderImportDraft.class + ": totalPrice is missing");
        return new OrderImportDraftImpl(orderNumber, customerId, customerEmail, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, customerGroup, country, orderState, state, shipmentState,
            paymentState, shippingInfo, paymentInfo, completedAt, custom, inventoryMode, taxRoundingMode,
            itemShippingAddresses, businessUnit, store, origin);
    }

    /**
     * builds OrderImportDraft without checking for non-null required values
     * @return OrderImportDraft
     */
    public OrderImportDraft buildUnchecked() {
        return new OrderImportDraftImpl(orderNumber, customerId, customerEmail, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, customerGroup, country, orderState, state, shipmentState,
            paymentState, shippingInfo, paymentInfo, completedAt, custom, inventoryMode, taxRoundingMode,
            itemShippingAddresses, businessUnit, store, origin);
    }

    /**
     * factory method for an instance of OrderImportDraftBuilder
     * @return builder
     */
    public static OrderImportDraftBuilder of() {
        return new OrderImportDraftBuilder();
    }

    /**
     * create builder for OrderImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
        builder.businessUnit = template.getBusinessUnit();
        builder.store = template.getStore();
        builder.origin = template.getOrigin();
        return builder;
    }

}
