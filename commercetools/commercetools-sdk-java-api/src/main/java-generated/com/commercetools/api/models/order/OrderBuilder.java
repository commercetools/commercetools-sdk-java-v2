
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Order order = Order.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .shippingMode(ShippingMode.SINGLE)
 *             .plusShipping(shippingBuilder -> shippingBuilder)
 *             .orderState(OrderState.OPEN)
 *             .plusSyncInfo(syncInfoBuilder -> syncInfoBuilder)
 *             .origin(CartOrigin.CUSTOMER)
 *             .plusRefusedGifts(refusedGiftsBuilder -> refusedGiftsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderBuilder implements Builder<Order> {

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
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    @Nullable
    private com.commercetools.api.models.store.StoreKeyReference store;

    private java.util.List<com.commercetools.api.models.cart.LineItem> lineItems;

    private java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems;

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice;

    @Nullable
    private com.commercetools.api.models.common.Address shippingAddress;

    @Nullable
    private com.commercetools.api.models.common.Address billingAddress;

    private com.commercetools.api.models.cart.ShippingMode shippingMode;

    private java.util.List<com.commercetools.api.models.cart.Shipping> shipping;

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
    private String purchaseOrderNumber;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;

    @Deprecated
    @Nullable
    private Long lastMessageSequenceNumber;

    @Nullable
    private com.commercetools.api.models.cart.CartReference cart;

    @Nullable
    private com.commercetools.api.models.quote.QuoteReference quote;

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

    /**
     *  <p>Unique identifier of the Order.</p>
     * @param id value to be set
     * @return Builder
     */

    public OrderBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The current version of the order.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     * @param createdAt value to be set
     * @return Builder
     */

    public OrderBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public OrderBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public OrderBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public OrderBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>This field will only be present if it was set for Order Import</p>
     * @param completedAt value to be set
     * @return Builder
     */

    public OrderBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed.</p>
     * @param orderNumber value to be set
     * @return Builder
     */

    public OrderBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *
     * @param customerId value to be set
     * @return Builder
     */

    public OrderBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *
     * @param customerEmail value to be set
     * @return Builder
     */

    public OrderBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>Identifies carts and orders belonging to an anonymous session (the customer has not signed up/in yet).</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public OrderBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>The Business Unit the Order belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public OrderBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Business Unit the Order belongs to.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public OrderBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *
     * @param builder function to build the store value
     * @return Builder
     */

    public OrderBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param store value to be set
     * @return Builder
     */

    public OrderBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderBuilder lineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderBuilder lineItems(final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderBuilder plusLineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderBuilder plusLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderBuilder withLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderBuilder customLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderBuilder customLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderBuilder plusCustomLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param totalPrice value to be set
     * @return Builder
     */

    public OrderBuilder totalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderBuilder totalPrice(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The taxes are calculated based on the shipping address.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The taxes are calculated based on the shipping address.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public OrderBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Sum of <code>taxedPrice</code> of ShippingInfo across all Shipping Methods. For <code>Platform</code> TaxMode, it is set automatically only if shipping address is set or Shipping Method is added to the Cart.</p>
     * @param builder function to build the taxedShippingPrice value
     * @return Builder
     */

    public OrderBuilder taxedShippingPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedShippingPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sum of <code>taxedPrice</code> of ShippingInfo across all Shipping Methods. For <code>Platform</code> TaxMode, it is set automatically only if shipping address is set or Shipping Method is added to the Cart.</p>
     * @param taxedShippingPrice value to be set
     * @return Builder
     */

    public OrderBuilder taxedShippingPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice) {
        this.taxedShippingPrice = taxedShippingPrice;
        return this;
    }

    /**
     *  <p>Holds all shipping-related information per Shipping Method.</p>
     *  <p>For <code>Multi</code> ShippingMode, it is updated automatically after the Shipping Methods are added.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public OrderBuilder shippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Holds all shipping-related information per Shipping Method.</p>
     *  <p>For <code>Multi</code> ShippingMode, it is updated automatically after the Shipping Methods are added.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public OrderBuilder shippingAddress(@Nullable final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public OrderBuilder billingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param billingAddress value to be set
     * @return Builder
     */

    public OrderBuilder billingAddress(@Nullable final com.commercetools.api.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Indicates whether one or multiple Shipping Methods are added to the Cart.</p>
     * @param shippingMode value to be set
     * @return Builder
     */

    public OrderBuilder shippingMode(final com.commercetools.api.models.cart.ShippingMode shippingMode) {
        this.shippingMode = shippingMode;
        return this;
    }

    /**
     *  <p>Holds all shipping-related information per Shipping Method for <code>Multi</code> ShippingMode.</p>
     *  <p>It is updated automatically after the Shipping Method is added.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public OrderBuilder shipping(final com.commercetools.api.models.cart.Shipping... shipping) {
        this.shipping = new ArrayList<>(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Holds all shipping-related information per Shipping Method for <code>Multi</code> ShippingMode.</p>
     *  <p>It is updated automatically after the Shipping Method is added.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public OrderBuilder shipping(final java.util.List<com.commercetools.api.models.cart.Shipping> shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     *  <p>Holds all shipping-related information per Shipping Method for <code>Multi</code> ShippingMode.</p>
     *  <p>It is updated automatically after the Shipping Method is added.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public OrderBuilder plusShipping(final com.commercetools.api.models.cart.Shipping... shipping) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.addAll(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Holds all shipping-related information per Shipping Method for <code>Multi</code> ShippingMode.</p>
     *  <p>It is updated automatically after the Shipping Method is added.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public OrderBuilder plusShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.ShippingBuilder> builder) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Holds all shipping-related information per Shipping Method for <code>Multi</code> ShippingMode.</p>
     *  <p>It is updated automatically after the Shipping Method is added.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public OrderBuilder withShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.ShippingBuilder> builder) {
        this.shipping = new ArrayList<>();
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param taxMode value to be set
     * @return Builder
     */

    public OrderBuilder taxMode(@Nullable final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rouding.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public OrderBuilder taxRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Set when the customer is set and the customer is a member of a customer group. Used for product variant price selection.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public OrderBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Set when the customer is set and the customer is a member of a customer group. Used for product variant price selection.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public OrderBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2. Used for product variant price selection.</p>
     * @param country value to be set
     * @return Builder
     */

    public OrderBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>One of the four predefined OrderStates.</p>
     * @param orderState value to be set
     * @return Builder
     */

    public OrderBuilder orderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p>This reference can point to a state in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>This reference can point to a state in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public OrderBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderBuilder shipmentState(@Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderBuilder paymentState(@Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Set if the ShippingMethod is set.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public OrderBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set if the ShippingMethod is set.</p>
     * @param shippingInfo value to be set
     * @return Builder
     */

    public OrderBuilder shippingInfo(@Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *
     * @param syncInfo value to be set
     * @return Builder
     */

    public OrderBuilder syncInfo(final com.commercetools.api.models.order.SyncInfo... syncInfo) {
        this.syncInfo = new ArrayList<>(Arrays.asList(syncInfo));
        return this;
    }

    /**
     *
     * @param syncInfo value to be set
     * @return Builder
     */

    public OrderBuilder syncInfo(final java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }

    /**
     *
     * @param syncInfo value to be set
     * @return Builder
     */

    public OrderBuilder plusSyncInfo(final com.commercetools.api.models.order.SyncInfo... syncInfo) {
        if (this.syncInfo == null) {
            this.syncInfo = new ArrayList<>();
        }
        this.syncInfo.addAll(Arrays.asList(syncInfo));
        return this;
    }

    /**
     *
     * @param builder function to build the syncInfo value
     * @return Builder
     */

    public OrderBuilder plusSyncInfo(
            Function<com.commercetools.api.models.order.SyncInfoBuilder, com.commercetools.api.models.order.SyncInfoBuilder> builder) {
        if (this.syncInfo == null) {
            this.syncInfo = new ArrayList<>();
        }
        this.syncInfo.add(builder.apply(com.commercetools.api.models.order.SyncInfoBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the syncInfo value
     * @return Builder
     */

    public OrderBuilder withSyncInfo(
            Function<com.commercetools.api.models.order.SyncInfoBuilder, com.commercetools.api.models.order.SyncInfoBuilder> builder) {
        this.syncInfo = new ArrayList<>();
        this.syncInfo.add(builder.apply(com.commercetools.api.models.order.SyncInfoBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param returnInfo value to be set
     * @return Builder
     */

    public OrderBuilder returnInfo(@Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        this.returnInfo = new ArrayList<>(Arrays.asList(returnInfo));
        return this;
    }

    /**
     *
     * @param returnInfo value to be set
     * @return Builder
     */

    public OrderBuilder returnInfo(
            @Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    /**
     *
     * @param returnInfo value to be set
     * @return Builder
     */

    public OrderBuilder plusReturnInfo(@Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.addAll(Arrays.asList(returnInfo));
        return this;
    }

    /**
     *
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public OrderBuilder plusReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public OrderBuilder withReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        this.returnInfo = new ArrayList<>();
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Purchase Order Number is typically set by the Buyer on a QuoteRequest to track the purchase order during the quote and order flow.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */

    public OrderBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     *
     * @param discountCodes value to be set
     * @return Builder
     */

    public OrderBuilder discountCodes(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *
     * @param discountCodes value to be set
     * @return Builder
     */

    public OrderBuilder discountCodes(
            @Nullable final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    /**
     *
     * @param discountCodes value to be set
     * @return Builder
     */

    public OrderBuilder plusDiscountCodes(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.addAll(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *
     * @param builder function to build the discountCodes value
     * @return Builder
     */

    public OrderBuilder plusDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the discountCodes value
     * @return Builder
     */

    public OrderBuilder withDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        this.discountCodes = new ArrayList<>();
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Internal-only field.</p>
     * @param lastMessageSequenceNumber value to be set
     * @return Builder
     */
    @Deprecated
    public OrderBuilder lastMessageSequenceNumber(@Nullable final Long lastMessageSequenceNumber) {
        this.lastMessageSequenceNumber = lastMessageSequenceNumber;
        return this;
    }

    /**
     *  <p>Set when this order was created from a cart. The cart will have the state <code>Ordered</code>.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public OrderBuilder cart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReferenceBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set when this order was created from a cart. The cart will have the state <code>Ordered</code>.</p>
     * @param cart value to be set
     * @return Builder
     */

    public OrderBuilder cart(@Nullable final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>Set when this order was created from a quote.</p>
     * @param builder function to build the quote value
     * @return Builder
     */

    public OrderBuilder quote(
            Function<com.commercetools.api.models.quote.QuoteReferenceBuilder, com.commercetools.api.models.quote.QuoteReferenceBuilder> builder) {
        this.quote = builder.apply(com.commercetools.api.models.quote.QuoteReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set when this order was created from a quote.</p>
     * @param quote value to be set
     * @return Builder
     */

    public OrderBuilder quote(@Nullable final com.commercetools.api.models.quote.QuoteReference quote) {
        this.quote = quote;
        return this;
    }

    /**
     *
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param custom value to be set
     * @return Builder
     */

    public OrderBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *
     * @param builder function to build the paymentInfo value
     * @return Builder
     */

    public OrderBuilder paymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfoBuilder> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param paymentInfo value to be set
     * @return Builder
     */

    public OrderBuilder paymentInfo(@Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    /**
     *
     * @param locale value to be set
     * @return Builder
     */

    public OrderBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *
     * @param inventoryMode value to be set
     * @return Builder
     */

    public OrderBuilder inventoryMode(@Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *
     * @param origin value to be set
     * @return Builder
     */

    public OrderBuilder origin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with LineItemLevel (horizontally) or UnitPriceLevel (vertically) calculation mode.</p>
     * @param taxCalculationMode value to be set
     * @return Builder
     */

    public OrderBuilder taxCalculationMode(
            @Nullable final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     * @return Builder
     */

    public OrderBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param builder function to build the shippingRateInput value
     * @return Builder
     */

    public OrderBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInput>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.Address... itemShippingAddresses) {
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

    public OrderBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Automatically filled when a line item with LineItemMode <code>GiftLineItem</code> is removed from this order.</p>
     * @param refusedGifts value to be set
     * @return Builder
     */

    public OrderBuilder refusedGifts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... refusedGifts) {
        this.refusedGifts = new ArrayList<>(Arrays.asList(refusedGifts));
        return this;
    }

    /**
     *  <p>Automatically filled when a line item with LineItemMode <code>GiftLineItem</code> is removed from this order.</p>
     * @param refusedGifts value to be set
     * @return Builder
     */

    public OrderBuilder refusedGifts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts) {
        this.refusedGifts = refusedGifts;
        return this;
    }

    /**
     *  <p>Automatically filled when a line item with LineItemMode <code>GiftLineItem</code> is removed from this order.</p>
     * @param refusedGifts value to be set
     * @return Builder
     */

    public OrderBuilder plusRefusedGifts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... refusedGifts) {
        if (this.refusedGifts == null) {
            this.refusedGifts = new ArrayList<>();
        }
        this.refusedGifts.addAll(Arrays.asList(refusedGifts));
        return this;
    }

    /**
     *  <p>Automatically filled when a line item with LineItemMode <code>GiftLineItem</code> is removed from this order.</p>
     * @param builder function to build the refusedGifts value
     * @return Builder
     */

    public OrderBuilder plusRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        if (this.refusedGifts == null) {
            this.refusedGifts = new ArrayList<>();
        }
        this.refusedGifts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Automatically filled when a line item with LineItemMode <code>GiftLineItem</code> is removed from this order.</p>
     * @param builder function to build the refusedGifts value
     * @return Builder
     */

    public OrderBuilder withRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        this.refusedGifts = new ArrayList<>();
        this.refusedGifts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
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
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
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
    public com.commercetools.api.models.cart.TaxedPrice getTaxedShippingPrice() {
        return this.taxedShippingPrice;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    public com.commercetools.api.models.cart.ShippingMode getShippingMode() {
        return this.shippingMode;
    }

    public java.util.List<com.commercetools.api.models.cart.Shipping> getShipping() {
        return this.shipping;
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
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes() {
        return this.discountCodes;
    }

    @Deprecated
    @Nullable
    public Long getLastMessageSequenceNumber() {
        return this.lastMessageSequenceNumber;
    }

    @Nullable
    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    @Nullable
    public com.commercetools.api.models.quote.QuoteReference getQuote() {
        return this.quote;
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

    /**
     * builds Order with checking for non-null required values
     * @return Order
     */
    public Order build() {
        Objects.requireNonNull(id, Order.class + ": id is missing");
        Objects.requireNonNull(version, Order.class + ": version is missing");
        Objects.requireNonNull(createdAt, Order.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Order.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(lineItems, Order.class + ": lineItems is missing");
        Objects.requireNonNull(customLineItems, Order.class + ": customLineItems is missing");
        Objects.requireNonNull(totalPrice, Order.class + ": totalPrice is missing");
        Objects.requireNonNull(shippingMode, Order.class + ": shippingMode is missing");
        Objects.requireNonNull(shipping, Order.class + ": shipping is missing");
        Objects.requireNonNull(orderState, Order.class + ": orderState is missing");
        Objects.requireNonNull(syncInfo, Order.class + ": syncInfo is missing");
        Objects.requireNonNull(origin, Order.class + ": origin is missing");
        Objects.requireNonNull(refusedGifts, Order.class + ": refusedGifts is missing");
        return new OrderImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, completedAt,
            orderNumber, customerId, customerEmail, anonymousId, businessUnit, store, lineItems, customLineItems,
            totalPrice, taxedPrice, taxedShippingPrice, shippingAddress, billingAddress, shippingMode, shipping,
            taxMode, taxRoundingMode, customerGroup, country, orderState, state, shipmentState, paymentState,
            shippingInfo, syncInfo, returnInfo, purchaseOrderNumber, discountCodes, lastMessageSequenceNumber, cart,
            quote, custom, paymentInfo, locale, inventoryMode, origin, taxCalculationMode, shippingRateInput,
            itemShippingAddresses, refusedGifts);
    }

    /**
     * builds Order without checking for non-null required values
     * @return Order
     */
    public Order buildUnchecked() {
        return new OrderImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, completedAt,
            orderNumber, customerId, customerEmail, anonymousId, businessUnit, store, lineItems, customLineItems,
            totalPrice, taxedPrice, taxedShippingPrice, shippingAddress, billingAddress, shippingMode, shipping,
            taxMode, taxRoundingMode, customerGroup, country, orderState, state, shipmentState, paymentState,
            shippingInfo, syncInfo, returnInfo, purchaseOrderNumber, discountCodes, lastMessageSequenceNumber, cart,
            quote, custom, paymentInfo, locale, inventoryMode, origin, taxCalculationMode, shippingRateInput,
            itemShippingAddresses, refusedGifts);
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
        builder.businessUnit = template.getBusinessUnit();
        builder.store = template.getStore();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxedShippingPrice = template.getTaxedShippingPrice();
        builder.shippingAddress = template.getShippingAddress();
        builder.billingAddress = template.getBillingAddress();
        builder.shippingMode = template.getShippingMode();
        builder.shipping = template.getShipping();
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
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        builder.discountCodes = template.getDiscountCodes();
        builder.lastMessageSequenceNumber = template.getLastMessageSequenceNumber();
        builder.cart = template.getCart();
        builder.quote = template.getQuote();
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
