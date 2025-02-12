
package com.commercetools.api.models.quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Quote quote = Quote.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .quoteRequest(quoteRequestBuilder -> quoteRequestBuilder)
 *             .stagedQuote(stagedQuoteBuilder -> stagedQuoteBuilder)
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .quoteState(QuoteState.PENDING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteBuilder implements Builder<Quote> {

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

    private com.commercetools.api.models.quote_request.QuoteRequestReference quoteRequest;

    private com.commercetools.api.models.staged_quote.StagedQuoteReference stagedQuote;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private java.time.ZonedDateTime validTo;

    @Nullable
    private String sellerComment;

    @Nullable
    private String buyerComment;

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

    private com.commercetools.api.models.quote.QuoteState quoteState;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private String purchaseOrderNumber;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    /**
     *  <p>Unique identifier of the Quote.</p>
     * @param id value to be set
     * @return Builder
     */

    public QuoteBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Quote.</p>
     * @param version value to be set
     * @return Builder
     */

    public QuoteBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Quote was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public QuoteBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Quote was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public QuoteBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Quote.</p>
     * @param key value to be set
     * @return Builder
     */

    public QuoteBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Quote.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public QuoteBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Quote.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public QuoteBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Quote.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public QuoteBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Quote.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public QuoteBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Quote.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public QuoteBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Quote.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public QuoteBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Quote Request related to the Quote.</p>
     * @param builder function to build the quoteRequest value
     * @return Builder
     */

    public QuoteBuilder quoteRequest(
            Function<com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder, com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder> builder) {
        this.quoteRequest = builder.apply(com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Quote Request related to the Quote.</p>
     * @param builder function to build the quoteRequest value
     * @return Builder
     */

    public QuoteBuilder withQuoteRequest(
            Function<com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder, com.commercetools.api.models.quote_request.QuoteRequestReference> builder) {
        this.quoteRequest = builder.apply(com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Quote Request related to the Quote.</p>
     * @param quoteRequest value to be set
     * @return Builder
     */

    public QuoteBuilder quoteRequest(
            final com.commercetools.api.models.quote_request.QuoteRequestReference quoteRequest) {
        this.quoteRequest = quoteRequest;
        return this;
    }

    /**
     *  <p>Staged Quote related to the Quote.</p>
     * @param builder function to build the stagedQuote value
     * @return Builder
     */

    public QuoteBuilder stagedQuote(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteReferenceBuilder, com.commercetools.api.models.staged_quote.StagedQuoteReferenceBuilder> builder) {
        this.stagedQuote = builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Staged Quote related to the Quote.</p>
     * @param builder function to build the stagedQuote value
     * @return Builder
     */

    public QuoteBuilder withStagedQuote(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteReferenceBuilder, com.commercetools.api.models.staged_quote.StagedQuoteReference> builder) {
        this.stagedQuote = builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Staged Quote related to the Quote.</p>
     * @param stagedQuote value to be set
     * @return Builder
     */

    public QuoteBuilder stagedQuote(final com.commercetools.api.models.staged_quote.StagedQuoteReference stagedQuote) {
        this.stagedQuote = stagedQuote;
        return this;
    }

    /**
     *  <p>The Buyer who owns the Quote.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Buyer who owns the Quote.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Buyer who owns the Quote.</p>
     * @param customer value to be set
     * @return Builder
     */

    public QuoteBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Not updated if Customer is changed after Quote creation. Used for Product Variant price selection.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public QuoteBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Not updated if Customer is changed after Quote creation. Used for Product Variant price selection.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public QuoteBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Not updated if Customer is changed after Quote creation. Used for Product Variant price selection.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public QuoteBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Expiration date for the Quote. Once a Quote expires, it cannot be ordered.</p>
     * @param validTo value to be set
     * @return Builder
     */

    public QuoteBuilder validTo(@Nullable final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     *  <p>Message from the Seller included in the offer.</p>
     * @param sellerComment value to be set
     * @return Builder
     */

    public QuoteBuilder sellerComment(@Nullable final String sellerComment) {
        this.sellerComment = sellerComment;
        return this;
    }

    /**
     *  <p>Message from the Buyer included in the renegotiation request.</p>
     * @param buyerComment value to be set
     * @return Builder
     */

    public QuoteBuilder buyerComment(@Nullable final String buyerComment) {
        this.buyerComment = buyerComment;
        return this;
    }

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public QuoteBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public QuoteBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public QuoteBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public QuoteBuilder lineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public QuoteBuilder lineItems(final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public QuoteBuilder plusLineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public QuoteBuilder plusLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public QuoteBuilder withLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public QuoteBuilder addLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItem> builder) {
        return plusLineItems(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()));
    }

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public QuoteBuilder setLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItem> builder) {
        return lineItems(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()));
    }

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public QuoteBuilder customLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public QuoteBuilder customLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public QuoteBuilder plusCustomLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public QuoteBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public QuoteBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public QuoteBuilder addCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItem> builder) {
        return plusCustomLineItems(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()));
    }

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public QuoteBuilder setCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItem> builder) {
        return customLineItems(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()));
    }

    /**
     *  <p>Sum of all <code>totalPrice</code> fields of the <code>lineItems</code> and <code>customLineItems</code>, as well as the <code>price</code> field of <code>shippingInfo</code> (if it exists). <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property of each price.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public QuoteBuilder totalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>Sum of all <code>totalPrice</code> fields of the <code>lineItems</code> and <code>customLineItems</code>, as well as the <code>price</code> field of <code>shippingInfo</code> (if it exists). <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property of each price.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public QuoteBuilder totalPrice(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Not set until the shipping address is set. Will be set automatically in the <code>Platform</code> TaxMode. For the <code>External</code> tax mode it will be set as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public QuoteBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Not set until the shipping address is set. Will be set automatically in the <code>Platform</code> TaxMode. For the <code>External</code> tax mode it will be set as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public QuoteBuilder withTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Not set until the shipping address is set. Will be set automatically in the <code>Platform</code> TaxMode. For the <code>External</code> tax mode it will be set as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public QuoteBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Used to determine the eligible ShippingMethods and rates as well as the tax rate of the Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public QuoteBuilder shippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Used to determine the eligible ShippingMethods and rates as well as the tax rate of the Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public QuoteBuilder withShippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Used to determine the eligible ShippingMethods and rates as well as the tax rate of the Line Items.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public QuoteBuilder shippingAddress(@Nullable final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Address used for invoicing.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public QuoteBuilder billingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address used for invoicing.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public QuoteBuilder withBillingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address used for invoicing.</p>
     * @param billingAddress value to be set
     * @return Builder
     */

    public QuoteBuilder billingAddress(@Nullable final com.commercetools.api.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Inventory mode of the Cart referenced in the QuoteRequestDraft.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public QuoteBuilder inventoryMode(@Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Tax mode of the Cart referenced in the QuoteRequestDraft.</p>
     * @param taxMode value to be set
     * @return Builder
     */

    public QuoteBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rounding.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public QuoteBuilder taxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with <code>LineItemLevel</code> (horizontally) or <code>UnitPriceLevel</code> (vertically) calculation mode.</p>
     * @param taxCalculationMode value to be set
     * @return Builder
     */

    public QuoteBuilder taxCalculationMode(
            final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Used for Product Variant price selection.</p>
     * @param country value to be set
     * @return Builder
     */

    public QuoteBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Set automatically once the ShippingMethod is set.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public QuoteBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set automatically once the ShippingMethod is set.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public QuoteBuilder withShippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfo> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Set automatically once the ShippingMethod is set.</p>
     * @param shippingInfo value to be set
     * @return Builder
     */

    public QuoteBuilder shippingInfo(@Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p>Log of payment transactions related to the Quote.</p>
     * @param builder function to build the paymentInfo value
     * @return Builder
     */

    public QuoteBuilder paymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfoBuilder> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Log of payment transactions related to the Quote.</p>
     * @param builder function to build the paymentInfo value
     * @return Builder
     */

    public QuoteBuilder withPaymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfo> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Log of payment transactions related to the Quote.</p>
     * @param paymentInfo value to be set
     * @return Builder
     */

    public QuoteBuilder paymentInfo(@Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    /**
     *  <p>Used to select a ShippingRatePriceTier.</p>
     * @param shippingRateInput value to be set
     * @return Builder
     */

    public QuoteBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>Used to select a ShippingRatePriceTier.</p>
     * @param builder function to build the shippingRateInput value
     * @return Builder
     */

    public QuoteBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInput>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public QuoteBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public QuoteBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public QuoteBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public QuoteBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public QuoteBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public QuoteBuilder addItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        return plusItemShippingAddresses(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public QuoteBuilder setItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        return itemShippingAddresses(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @param directDiscounts value to be set
     * @return Builder
     */

    public QuoteBuilder directDiscounts(
            @Nullable final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        this.directDiscounts = new ArrayList<>(Arrays.asList(directDiscounts));
        return this;
    }

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @param directDiscounts value to be set
     * @return Builder
     */

    public QuoteBuilder directDiscounts(
            @Nullable final java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts) {
        this.directDiscounts = directDiscounts;
        return this;
    }

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @param directDiscounts value to be set
     * @return Builder
     */

    public QuoteBuilder plusDirectDiscounts(
            @Nullable final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        if (this.directDiscounts == null) {
            this.directDiscounts = new ArrayList<>();
        }
        this.directDiscounts.addAll(Arrays.asList(directDiscounts));
        return this;
    }

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public QuoteBuilder plusDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscountBuilder> builder) {
        if (this.directDiscounts == null) {
            this.directDiscounts = new ArrayList<>();
        }
        this.directDiscounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public QuoteBuilder withDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscountBuilder> builder) {
        this.directDiscounts = new ArrayList<>();
        this.directDiscounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public QuoteBuilder addDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscount> builder) {
        return plusDirectDiscounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public QuoteBuilder setDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscount> builder) {
        return directDiscounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Custom Fields on the Quote.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public QuoteBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields on the Quote.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public QuoteBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields on the Quote.</p>
     * @param custom value to be set
     * @return Builder
     */

    public QuoteBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Predefined states tracking the status of the Quote.</p>
     * @param quoteState value to be set
     * @return Builder
     */

    public QuoteBuilder quoteState(final com.commercetools.api.models.quote.QuoteState quoteState) {
        this.quoteState = quoteState;
        return this;
    }

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public QuoteBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>The Purchase Order Number is typically set by the Buyer on a QuoteRequest to track the purchase order during the quote and order flow.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */

    public QuoteBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     *  <p>The BusinessUnit for the Quote.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public QuoteBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The BusinessUnit for the Quote.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public QuoteBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The BusinessUnit for the Quote.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public QuoteBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>Unique identifier of the Quote.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Quote.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Quote was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Quote was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the Quote.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>IDs and references that last modified the Quote.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Quote.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Quote Request related to the Quote.</p>
     * @return quoteRequest
     */

    public com.commercetools.api.models.quote_request.QuoteRequestReference getQuoteRequest() {
        return this.quoteRequest;
    }

    /**
     *  <p>Staged Quote related to the Quote.</p>
     * @return stagedQuote
     */

    public com.commercetools.api.models.staged_quote.StagedQuoteReference getStagedQuote() {
        return this.stagedQuote;
    }

    /**
     *  <p>The Buyer who owns the Quote.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Not updated if Customer is changed after Quote creation. Used for Product Variant price selection.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Expiration date for the Quote. Once a Quote expires, it cannot be ordered.</p>
     * @return validTo
     */

    @Nullable
    public java.time.ZonedDateTime getValidTo() {
        return this.validTo;
    }

    /**
     *  <p>Message from the Seller included in the offer.</p>
     * @return sellerComment
     */

    @Nullable
    public String getSellerComment() {
        return this.sellerComment;
    }

    /**
     *  <p>Message from the Buyer included in the renegotiation request.</p>
     * @return buyerComment
     */

    @Nullable
    public String getBuyerComment() {
        return this.buyerComment;
    }

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @return lineItems
     */

    public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
     * @return customLineItems
     */

    public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>Sum of all <code>totalPrice</code> fields of the <code>lineItems</code> and <code>customLineItems</code>, as well as the <code>price</code> field of <code>shippingInfo</code> (if it exists). <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property of each price.</p>
     * @return totalPrice
     */

    public com.commercetools.api.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Not set until the shipping address is set. Will be set automatically in the <code>Platform</code> TaxMode. For the <code>External</code> tax mode it will be set as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Used to determine the eligible ShippingMethods and rates as well as the tax rate of the Line Items.</p>
     * @return shippingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Address used for invoicing.</p>
     * @return billingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Inventory mode of the Cart referenced in the QuoteRequestDraft.</p>
     * @return inventoryMode
     */

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Tax mode of the Cart referenced in the QuoteRequestDraft.</p>
     * @return taxMode
     */

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rounding.</p>
     * @return taxRoundingMode
     */

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with <code>LineItemLevel</code> (horizontally) or <code>UnitPriceLevel</code> (vertically) calculation mode.</p>
     * @return taxCalculationMode
     */

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
     *  <p>Used for Product Variant price selection.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Set automatically once the ShippingMethod is set.</p>
     * @return shippingInfo
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Log of payment transactions related to the Quote.</p>
     * @return paymentInfo
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     *  <p>Used to select a ShippingRatePriceTier.</p>
     * @return shippingRateInput
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @return itemShippingAddresses
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @return directDiscounts
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.DirectDiscount> getDirectDiscounts() {
        return this.directDiscounts;
    }

    /**
     *  <p>Custom Fields on the Quote.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Predefined states tracking the status of the Quote.</p>
     * @return quoteState
     */

    public com.commercetools.api.models.quote.QuoteState getQuoteState() {
        return this.quoteState;
    }

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>The Purchase Order Number is typically set by the Buyer on a QuoteRequest to track the purchase order during the quote and order flow.</p>
     * @return purchaseOrderNumber
     */

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p>The BusinessUnit for the Quote.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * builds Quote with checking for non-null required values
     * @return Quote
     */
    public Quote build() {
        Objects.requireNonNull(id, Quote.class + ": id is missing");
        Objects.requireNonNull(version, Quote.class + ": version is missing");
        Objects.requireNonNull(createdAt, Quote.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Quote.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(quoteRequest, Quote.class + ": quoteRequest is missing");
        Objects.requireNonNull(stagedQuote, Quote.class + ": stagedQuote is missing");
        Objects.requireNonNull(lineItems, Quote.class + ": lineItems is missing");
        Objects.requireNonNull(customLineItems, Quote.class + ": customLineItems is missing");
        Objects.requireNonNull(totalPrice, Quote.class + ": totalPrice is missing");
        Objects.requireNonNull(taxMode, Quote.class + ": taxMode is missing");
        Objects.requireNonNull(taxRoundingMode, Quote.class + ": taxRoundingMode is missing");
        Objects.requireNonNull(taxCalculationMode, Quote.class + ": taxCalculationMode is missing");
        Objects.requireNonNull(quoteState, Quote.class + ": quoteState is missing");
        return new QuoteImpl(id, version, createdAt, lastModifiedAt, key, lastModifiedBy, createdBy, quoteRequest,
            stagedQuote, customer, customerGroup, validTo, sellerComment, buyerComment, store, lineItems,
            customLineItems, totalPrice, taxedPrice, shippingAddress, billingAddress, inventoryMode, taxMode,
            taxRoundingMode, taxCalculationMode, country, shippingInfo, paymentInfo, shippingRateInput,
            itemShippingAddresses, directDiscounts, custom, quoteState, state, purchaseOrderNumber, businessUnit);
    }

    /**
     * builds Quote without checking for non-null required values
     * @return Quote
     */
    public Quote buildUnchecked() {
        return new QuoteImpl(id, version, createdAt, lastModifiedAt, key, lastModifiedBy, createdBy, quoteRequest,
            stagedQuote, customer, customerGroup, validTo, sellerComment, buyerComment, store, lineItems,
            customLineItems, totalPrice, taxedPrice, shippingAddress, billingAddress, inventoryMode, taxMode,
            taxRoundingMode, taxCalculationMode, country, shippingInfo, paymentInfo, shippingRateInput,
            itemShippingAddresses, directDiscounts, custom, quoteState, state, purchaseOrderNumber, businessUnit);
    }

    /**
     * factory method for an instance of QuoteBuilder
     * @return builder
     */
    public static QuoteBuilder of() {
        return new QuoteBuilder();
    }

    /**
     * create builder for Quote instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteBuilder of(final Quote template) {
        QuoteBuilder builder = new QuoteBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.key = template.getKey();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.quoteRequest = template.getQuoteRequest();
        builder.stagedQuote = template.getStagedQuote();
        builder.customer = template.getCustomer();
        builder.customerGroup = template.getCustomerGroup();
        builder.validTo = template.getValidTo();
        builder.sellerComment = template.getSellerComment();
        builder.buyerComment = template.getBuyerComment();
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
        builder.quoteState = template.getQuoteState();
        builder.state = template.getState();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        builder.businessUnit = template.getBusinessUnit();
        return builder;
    }

}
