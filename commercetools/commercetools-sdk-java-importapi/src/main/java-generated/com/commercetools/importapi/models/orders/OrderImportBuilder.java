
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
     * @param orderNumber value to be set
     * @return Builder
     */

    public OrderImportBuilder orderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *  <p><code>key</code> of the Customer that the Order belongs to. If the referenced Customer does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Customer is created.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public OrderImportBuilder customer(
            Function<com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><code>key</code> of the Customer that the Order belongs to. If the referenced Customer does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Customer is created.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public OrderImportBuilder withCustomer(
            Function<com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerKeyReference> builder) {
        this.customer = builder.apply(com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><code>key</code> of the Customer that the Order belongs to. If the referenced Customer does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Customer is created.</p>
     * @param customer value to be set
     * @return Builder
     */

    public OrderImportBuilder customer(
            @Nullable final com.commercetools.importapi.models.common.CustomerKeyReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customerEmail</code>.</p>
     * @param customerEmail value to be set
     * @return Builder
     */

    public OrderImportBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderImportBuilder lineItems(
            @Nullable final com.commercetools.importapi.models.orders.LineItemImportDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderImportBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @param lineItems value to be set
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
     * @param builder function to build the lineItems value
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
     * @param builder function to build the lineItems value
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
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderImportBuilder addLineItems(
            Function<com.commercetools.importapi.models.orders.LineItemImportDraftBuilder, com.commercetools.importapi.models.orders.LineItemImportDraft> builder) {
        return plusLineItems(builder.apply(com.commercetools.importapi.models.orders.LineItemImportDraftBuilder.of()));
    }

    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderImportBuilder setLineItems(
            Function<com.commercetools.importapi.models.orders.LineItemImportDraftBuilder, com.commercetools.importapi.models.orders.LineItemImportDraft> builder) {
        return lineItems(builder.apply(com.commercetools.importapi.models.orders.LineItemImportDraftBuilder.of()));
    }

    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderImportBuilder customLineItems(
            @Nullable final com.commercetools.importapi.models.orders.CustomLineItemDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderImportBuilder customLineItems(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @param customLineItems value to be set
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
     * @param builder function to build the customLineItems value
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
     * @param builder function to build the customLineItems value
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
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderImportBuilder addCustomLineItems(
            Function<com.commercetools.importapi.models.orders.CustomLineItemDraftBuilder, com.commercetools.importapi.models.orders.CustomLineItemDraft> builder) {
        return plusCustomLineItems(
            builder.apply(com.commercetools.importapi.models.orders.CustomLineItemDraftBuilder.of()));
    }

    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderImportBuilder setCustomLineItems(
            Function<com.commercetools.importapi.models.orders.CustomLineItemDraftBuilder, com.commercetools.importapi.models.orders.CustomLineItemDraft> builder) {
        return customLineItems(
            builder.apply(com.commercetools.importapi.models.orders.CustomLineItemDraftBuilder.of()));
    }

    /**
     *  <p>Maps to <code>Order.totalPrice</code>.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public OrderImportBuilder totalPrice(final com.commercetools.importapi.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.totalPrice</code>.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderImportBuilder totalPrice(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.totalPrice = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.taxedPrice</code>.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderImportBuilder taxedPrice(
            Function<com.commercetools.importapi.models.orders.TaxedPriceBuilder, com.commercetools.importapi.models.orders.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.importapi.models.orders.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.taxedPrice</code>.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderImportBuilder withTaxedPrice(
            Function<com.commercetools.importapi.models.orders.TaxedPriceBuilder, com.commercetools.importapi.models.orders.TaxedPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.importapi.models.orders.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.taxedPrice</code>.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public OrderImportBuilder taxedPrice(
            @Nullable final com.commercetools.importapi.models.orders.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shippingAddress</code>.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public OrderImportBuilder shippingAddress(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shippingAddress</code>.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public OrderImportBuilder withShippingAddress(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.Address> builder) {
        this.shippingAddress = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shippingAddress</code>.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public OrderImportBuilder shippingAddress(
            @Nullable final com.commercetools.importapi.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.billingAddress</code>.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public OrderImportBuilder billingAddress(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.billingAddress</code>.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public OrderImportBuilder withBillingAddress(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.Address> builder) {
        this.billingAddress = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.billingAddress</code>.</p>
     * @param billingAddress value to be set
     * @return Builder
     */

    public OrderImportBuilder billingAddress(
            @Nullable final com.commercetools.importapi.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customerGroup</code>. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @param builder function to build the customerGroup value
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
     *  <p>Maps to <code>Order.customerGroup</code>. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public OrderImportBuilder withCustomerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.customerGroup</code>. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public OrderImportBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.country</code>.</p>
     * @param country value to be set
     * @return Builder
     */

    public OrderImportBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.orderState</code>.</p>
     * @param orderState value to be set
     * @return Builder
     */

    public OrderImportBuilder orderState(
            @Nullable final com.commercetools.importapi.models.orders.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shipmentState</code>.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderImportBuilder shipmentState(
            @Nullable final com.commercetools.importapi.models.orders.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.paymentState</code>.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderImportBuilder paymentState(
            @Nullable final com.commercetools.importapi.models.orders.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shippingInfo</code>.</p>
     * @param builder function to build the shippingInfo value
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
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public OrderImportBuilder withShippingInfo(
            Function<com.commercetools.importapi.models.orders.ShippingInfoImportDraftBuilder, com.commercetools.importapi.models.orders.ShippingInfoImportDraft> builder) {
        this.shippingInfo = builder
                .apply(com.commercetools.importapi.models.orders.ShippingInfoImportDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.shippingInfo</code>.</p>
     * @param shippingInfo value to be set
     * @return Builder
     */

    public OrderImportBuilder shippingInfo(
            @Nullable final com.commercetools.importapi.models.orders.ShippingInfoImportDraft shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.completedAt</code>.</p>
     * @param completedAt value to be set
     * @return Builder
     */

    public OrderImportBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderImportBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.custom</code>.</p>
     * @param custom value to be set
     * @return Builder
     */

    public OrderImportBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.inventoryMode</code>.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public OrderImportBuilder inventoryMode(
            @Nullable final com.commercetools.importapi.models.orders.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.taxRoundingMode</code>.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public OrderImportBuilder taxRoundingMode(
            @Nullable final com.commercetools.importapi.models.orders.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.taxCalculationMode</code>.</p>
     * @param taxCalculationMode value to be set
     * @return Builder
     */

    public OrderImportBuilder taxCalculationMode(
            @Nullable final com.commercetools.importapi.models.orders.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.origin</code>.</p>
     * @param origin value to be set
     * @return Builder
     */

    public OrderImportBuilder origin(@Nullable final com.commercetools.importapi.models.orders.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderImportBuilder itemShippingAddresses(
            @Nullable final com.commercetools.importapi.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderImportBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
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
     * @param builder function to build the itemShippingAddresses value
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
     * @param builder function to build the itemShippingAddresses value
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
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderImportBuilder addItemShippingAddresses(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.Address> builder) {
        return plusItemShippingAddresses(builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderImportBuilder setItemShippingAddresses(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.Address> builder) {
        return itemShippingAddresses(builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Maps to <code>Order.store</code>. If the referenced Store does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Store is created.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public OrderImportBuilder store(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.store</code>. If the referenced Store does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Store is created.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public OrderImportBuilder withStore(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.store</code>. If the referenced Store does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Store is created.</p>
     * @param store value to be set
     * @return Builder
     */

    public OrderImportBuilder store(@Nullable final com.commercetools.importapi.models.common.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.state</code>. If the referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderImportBuilder state(
            Function<com.commercetools.importapi.models.common.StateKeyReferenceBuilder, com.commercetools.importapi.models.common.StateKeyReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.importapi.models.common.StateKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.state</code>. If the referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderImportBuilder withState(
            Function<com.commercetools.importapi.models.common.StateKeyReferenceBuilder, com.commercetools.importapi.models.common.StateKeyReference> builder) {
        this.state = builder.apply(com.commercetools.importapi.models.common.StateKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.state</code>. If the referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param state value to be set
     * @return Builder
     */

    public OrderImportBuilder state(@Nullable final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order. It should be unique across a project. Once it's set it cannot be changed.</p>
     * @return orderNumber
     */

    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p><code>key</code> of the Customer that the Order belongs to. If the referenced Customer does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Customer is created.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.importapi.models.common.CustomerKeyReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Maps to <code>Order.customerEmail</code>.</p>
     * @return customerEmail
     */

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @return lineItems
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @return customLineItems
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>Maps to <code>Order.totalPrice</code>.</p>
     * @return totalPrice
     */

    public com.commercetools.importapi.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Maps to <code>Order.taxedPrice</code>.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.importapi.models.orders.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Maps to <code>Order.shippingAddress</code>.</p>
     * @return shippingAddress
     */

    @Nullable
    public com.commercetools.importapi.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Maps to <code>Order.billingAddress</code>.</p>
     * @return billingAddress
     */

    @Nullable
    public com.commercetools.importapi.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Maps to <code>Order.customerGroup</code>. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Maps to <code>Order.country</code>.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Maps to <code>Order.orderState</code>.</p>
     * @return orderState
     */

    @Nullable
    public com.commercetools.importapi.models.orders.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>Maps to <code>Order.shipmentState</code>.</p>
     * @return shipmentState
     */

    @Nullable
    public com.commercetools.importapi.models.orders.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Maps to <code>Order.paymentState</code>.</p>
     * @return paymentState
     */

    @Nullable
    public com.commercetools.importapi.models.orders.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Maps to <code>Order.shippingInfo</code>.</p>
     * @return shippingInfo
     */

    @Nullable
    public com.commercetools.importapi.models.orders.ShippingInfoImportDraft getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Maps to <code>Order.completedAt</code>.</p>
     * @return completedAt
     */

    @Nullable
    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     *  <p>Maps to <code>Order.custom</code>.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     *  <p>Maps to <code>Order.inventoryMode</code>.</p>
     * @return inventoryMode
     */

    @Nullable
    public com.commercetools.importapi.models.orders.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Maps to <code>Order.taxRoundingMode</code>.</p>
     * @return taxRoundingMode
     */

    @Nullable
    public com.commercetools.importapi.models.orders.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     *  <p>Maps to <code>Order.taxCalculationMode</code>.</p>
     * @return taxCalculationMode
     */

    @Nullable
    public com.commercetools.importapi.models.orders.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
     *  <p>Maps to <code>Order.origin</code>.</p>
     * @return origin
     */

    @Nullable
    public com.commercetools.importapi.models.orders.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @return itemShippingAddresses
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>Maps to <code>Order.store</code>. If the referenced Store does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Store is created.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.importapi.models.common.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>Maps to <code>Order.state</code>. If the referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.importapi.models.common.StateKeyReference getState() {
        return this.state;
    }

    /**
     * builds OrderImport with checking for non-null required values
     * @return OrderImport
     */
    public OrderImport build() {
        Objects.requireNonNull(orderNumber, OrderImport.class + ": orderNumber is missing");
        Objects.requireNonNull(totalPrice, OrderImport.class + ": totalPrice is missing");
        return new OrderImportImpl(orderNumber, customer, customerEmail, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, customerGroup, country, orderState, shipmentState,
            paymentState, shippingInfo, completedAt, custom, inventoryMode, taxRoundingMode, taxCalculationMode, origin,
            itemShippingAddresses, store, state);
    }

    /**
     * builds OrderImport without checking for non-null required values
     * @return OrderImport
     */
    public OrderImport buildUnchecked() {
        return new OrderImportImpl(orderNumber, customer, customerEmail, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, customerGroup, country, orderState, shipmentState,
            paymentState, shippingInfo, completedAt, custom, inventoryMode, taxRoundingMode, taxCalculationMode, origin,
            itemShippingAddresses, store, state);
    }

    /**
     * factory method for an instance of OrderImportBuilder
     * @return builder
     */
    public static OrderImportBuilder of() {
        return new OrderImportBuilder();
    }

    /**
     * create builder for OrderImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
