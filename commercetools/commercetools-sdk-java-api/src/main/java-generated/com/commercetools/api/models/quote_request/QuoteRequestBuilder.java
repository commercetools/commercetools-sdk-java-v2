
package com.commercetools.api.models.quote_request;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequest quoteRequest = QuoteRequest.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .quoteRequestState(QuoteRequestState.SUBMITTED)
 *             .customer(customerBuilder -> customerBuilder)
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestBuilder implements Builder<QuoteRequest> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;

    @Nullable
    private String comment;

    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

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
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    @Nullable
    private com.commercetools.api.models.order.PaymentInfo paymentInfo;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the QuoteRequest.</p>
     */

    public QuoteRequestBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the QuoteRequest.</p>
     */

    public QuoteRequestBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the QuoteRequest was initially created.</p>
     */

    public QuoteRequestBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the QuoteRequest was last updated.</p>
     */

    public QuoteRequestBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the QuoteRequest.</p>
     */

    public QuoteRequestBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public QuoteRequestBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public QuoteRequestBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public QuoteRequestBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public QuoteRequestBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Indicates the current state of the Quote Request in the negotiation process.</p>
     */

    public QuoteRequestBuilder quoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        return this;
    }

    /**
     *  <p>Text message included in the request.</p>
     */

    public QuoteRequestBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>The Buyer who raised the request.</p>
     */

    public QuoteRequestBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Buyer who raised the request.</p>
     */

    public QuoteRequestBuilder customer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Used for Product Variant price selection.</p>
     */

    public QuoteRequestBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Used for Product Variant price selection.</p>
     */

    public QuoteRequestBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     */

    public QuoteRequestBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     */

    public QuoteRequestBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>The Line Items for which a quote is requested.</p>
     */

    public QuoteRequestBuilder lineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>The Line Items for which a quote is requested.</p>
     */

    public QuoteRequestBuilder lineItems(final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>The Line Items for which a quote is requested.</p>
     */

    public QuoteRequestBuilder plusLineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>The Line Items for which a quote is requested.</p>
     */

    public QuoteRequestBuilder plusLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Line Items for which a quote is requested.</p>
     */

    public QuoteRequestBuilder withLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Custom Line Items for which a quote is requested.</p>
     */

    public QuoteRequestBuilder customLineItems(
            final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>The Custom Line Items for which a quote is requested.</p>
     */

    public QuoteRequestBuilder customLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *  <p>The Custom Line Items for which a quote is requested.</p>
     */

    public QuoteRequestBuilder plusCustomLineItems(
            final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>The Custom Line Items for which a quote is requested.</p>
     */

    public QuoteRequestBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Custom Line Items for which a quote is requested.</p>
     */

    public QuoteRequestBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The sum of all <code>totalPrice</code> fields of the <code>lineItems</code> and <code>customLineItems</code>, as well as the <code>price</code> field of <code>shippingInfo</code> (if it exists). <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property of each price.</p>
     */

    public QuoteRequestBuilder totalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>The sum of all <code>totalPrice</code> fields of the <code>lineItems</code> and <code>customLineItems</code>, as well as the <code>price</code> field of <code>shippingInfo</code> (if it exists). <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property of each price.</p>
     */

    public QuoteRequestBuilder totalPrice(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Not set until the shipping address is set. Will be set automatically in the <code>Platform</code> TaxMode. For the <code>External</code> tax mode it will be set as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
     */

    public QuoteRequestBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Not set until the shipping address is set. Will be set automatically in the <code>Platform</code> TaxMode. For the <code>External</code> tax mode it will be set as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
     */

    public QuoteRequestBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Used to determine the eligible ShippingMethods and rates as well as the tax rate of the Line Items.</p>
     */

    public QuoteRequestBuilder shippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Used to determine the eligible ShippingMethods and rates as well as the tax rate of the Line Items.</p>
     */

    public QuoteRequestBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>The address used for invoicing.</p>
     */

    public QuoteRequestBuilder billingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address used for invoicing.</p>
     */

    public QuoteRequestBuilder billingAddress(
            @Nullable final com.commercetools.api.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>The inventory mode of the Cart referenced in the QuoteRequestDraft.</p>
     */

    public QuoteRequestBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>The tax mode of the Cart referenced in the QuoteRequestDraft.</p>
     */

    public QuoteRequestBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rounding.</p>
     */

    public QuoteRequestBuilder taxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with <code>LineItemLevel</code> (horizontally) or <code>UnitPriceLevel</code> (vertically) calculation mode.</p>
     */

    public QuoteRequestBuilder taxCalculationMode(
            final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Used for Product Variant price selection.</p>
     */

    public QuoteRequestBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Set automatically once the ShippingMethod is set.</p>
     */

    public QuoteRequestBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set automatically once the ShippingMethod is set.</p>
     */

    public QuoteRequestBuilder shippingInfo(
            @Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p>Log of payment transactions related to this quote.</p>
     */

    public QuoteRequestBuilder paymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfoBuilder> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Log of payment transactions related to this quote.</p>
     */

    public QuoteRequestBuilder paymentInfo(@Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    /**
     *  <p>Used to select a ShippingRatePriceTier.</p>
     */

    public QuoteRequestBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>Used to select a ShippingRatePriceTier.</p>
     */

    public QuoteRequestBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInput>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public QuoteRequestBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public QuoteRequestBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public QuoteRequestBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public QuoteRequestBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public QuoteRequestBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounts only valid for this Quote, those cannot be associated to any other Cart or Order.</p>
     */

    public QuoteRequestBuilder directDiscounts(
            @Nullable final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        this.directDiscounts = new ArrayList<>(Arrays.asList(directDiscounts));
        return this;
    }

    /**
     *  <p>Discounts only valid for this Quote, those cannot be associated to any other Cart or Order.</p>
     */

    public QuoteRequestBuilder directDiscounts(
            @Nullable final java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts) {
        this.directDiscounts = directDiscounts;
        return this;
    }

    /**
     *  <p>Discounts only valid for this Quote, those cannot be associated to any other Cart or Order.</p>
     */

    public QuoteRequestBuilder plusDirectDiscounts(
            @Nullable final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        if (this.directDiscounts == null) {
            this.directDiscounts = new ArrayList<>();
        }
        this.directDiscounts.addAll(Arrays.asList(directDiscounts));
        return this;
    }

    /**
     *  <p>Discounts only valid for this Quote, those cannot be associated to any other Cart or Order.</p>
     */

    public QuoteRequestBuilder plusDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscountBuilder> builder) {
        if (this.directDiscounts == null) {
            this.directDiscounts = new ArrayList<>();
        }
        this.directDiscounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounts only valid for this Quote, those cannot be associated to any other Cart or Order.</p>
     */

    public QuoteRequestBuilder withDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscountBuilder> builder) {
        this.directDiscounts = new ArrayList<>();
        this.directDiscounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Fields of this Quote Request.</p>
     */

    public QuoteRequestBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of this Quote Request.</p>
     */

    public QuoteRequestBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
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
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState() {
        return this.quoteRequestState;
    }

    @Nullable
    public String getComment() {
        return this.comment;
    }

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
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
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.DirectDiscount> getDirectDiscounts() {
        return this.directDiscounts;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public QuoteRequest build() {
        Objects.requireNonNull(id, QuoteRequest.class + ": id is missing");
        Objects.requireNonNull(version, QuoteRequest.class + ": version is missing");
        Objects.requireNonNull(createdAt, QuoteRequest.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, QuoteRequest.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(quoteRequestState, QuoteRequest.class + ": quoteRequestState is missing");
        Objects.requireNonNull(customer, QuoteRequest.class + ": customer is missing");
        Objects.requireNonNull(lineItems, QuoteRequest.class + ": lineItems is missing");
        Objects.requireNonNull(customLineItems, QuoteRequest.class + ": customLineItems is missing");
        Objects.requireNonNull(totalPrice, QuoteRequest.class + ": totalPrice is missing");
        Objects.requireNonNull(taxMode, QuoteRequest.class + ": taxMode is missing");
        Objects.requireNonNull(taxRoundingMode, QuoteRequest.class + ": taxRoundingMode is missing");
        Objects.requireNonNull(taxCalculationMode, QuoteRequest.class + ": taxCalculationMode is missing");
        return new QuoteRequestImpl(id, version, createdAt, lastModifiedAt, key, lastModifiedBy, createdBy,
            quoteRequestState, comment, customer, customerGroup, store, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, inventoryMode, taxMode, taxRoundingMode, taxCalculationMode,
            country, shippingInfo, paymentInfo, shippingRateInput, itemShippingAddresses, directDiscounts, custom);
    }

    /**
     * builds QuoteRequest without checking for non null required values
     */
    public QuoteRequest buildUnchecked() {
        return new QuoteRequestImpl(id, version, createdAt, lastModifiedAt, key, lastModifiedBy, createdBy,
            quoteRequestState, comment, customer, customerGroup, store, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, inventoryMode, taxMode, taxRoundingMode, taxCalculationMode,
            country, shippingInfo, paymentInfo, shippingRateInput, itemShippingAddresses, directDiscounts, custom);
    }

    public static QuoteRequestBuilder of() {
        return new QuoteRequestBuilder();
    }

    public static QuoteRequestBuilder of(final QuoteRequest template) {
        QuoteRequestBuilder builder = new QuoteRequestBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.key = template.getKey();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.quoteRequestState = template.getQuoteRequestState();
        builder.comment = template.getComment();
        builder.customer = template.getCustomer();
        builder.customerGroup = template.getCustomerGroup();
        builder.store = template.getStore();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.shippingAddress = template.getShippingAddress();
        builder.billingAddress = template.getBillingAddress();
        builder.inventoryMode = template.getInventoryMode();
        builder.taxMode = template.getTaxMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.country = template.getCountry();
        builder.shippingInfo = template.getShippingInfo();
        builder.paymentInfo = template.getPaymentInfo();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.directDiscounts = template.getDirectDiscounts();
        builder.custom = template.getCustom();
        return builder;
    }

}
