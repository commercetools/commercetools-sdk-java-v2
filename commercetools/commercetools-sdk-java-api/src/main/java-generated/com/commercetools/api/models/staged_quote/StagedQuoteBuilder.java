
package com.commercetools.api.models.staged_quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuote stagedQuote = StagedQuote.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .stagedQuoteState(StagedQuoteState.IN_PROGRESS)
 *             .quoteRequest(quoteRequestBuilder -> quoteRequestBuilder)
 *             .quotationCart(quotationCartBuilder -> quotationCartBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteBuilder implements Builder<StagedQuote> {

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

    private com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    private com.commercetools.api.models.quote_request.QuoteRequestReference quoteRequest;

    private com.commercetools.api.models.cart.CartReference quotationCart;

    @Nullable
    private java.time.ZonedDateTime validTo;

    @Nullable
    private String sellerComment;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private String purchaseOrderNumber;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    @Nullable
    private com.commercetools.api.models.store.StoreKeyReference store;

    /**
     *  <p>The unique ID of the StagedQuote.</p>
     * @param id value to be set
     * @return Builder
     */

    public StagedQuoteBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the StagedQuote.</p>
     * @param version value to be set
     * @return Builder
     */

    public StagedQuoteBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the StagedQuote was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public StagedQuoteBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the StagedQuote was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public StagedQuoteBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-specific unique identifier of the staged quote.</p>
     * @param key value to be set
     * @return Builder
     */

    public StagedQuoteBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the StagedQuote.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StagedQuoteBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the StagedQuote.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StagedQuoteBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the StagedQuote.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public StagedQuoteBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the StagedQuote.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StagedQuoteBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the StagedQuote.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StagedQuoteBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the StagedQuote.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public StagedQuoteBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     * @param stagedQuoteState value to be set
     * @return Builder
     */

    public StagedQuoteBuilder stagedQuoteState(
            final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
        return this;
    }

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public StagedQuoteBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public StagedQuoteBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @param customer value to be set
     * @return Builder
     */

    public StagedQuoteBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     * @param builder function to build the quoteRequest value
     * @return Builder
     */

    public StagedQuoteBuilder quoteRequest(
            Function<com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder, com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder> builder) {
        this.quoteRequest = builder.apply(com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     * @param builder function to build the quoteRequest value
     * @return Builder
     */

    public StagedQuoteBuilder withQuoteRequest(
            Function<com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder, com.commercetools.api.models.quote_request.QuoteRequestReference> builder) {
        this.quoteRequest = builder.apply(com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     * @param quoteRequest value to be set
     * @return Builder
     */

    public StagedQuoteBuilder quoteRequest(
            final com.commercetools.api.models.quote_request.QuoteRequestReference quoteRequest) {
        this.quoteRequest = quoteRequest;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> containing the offered items. May contain either <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscounts</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a>.</p>
     * @param builder function to build the quotationCart value
     * @return Builder
     */

    public StagedQuoteBuilder quotationCart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReferenceBuilder> builder) {
        this.quotationCart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> containing the offered items. May contain either <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscounts</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a>.</p>
     * @param builder function to build the quotationCart value
     * @return Builder
     */

    public StagedQuoteBuilder withQuotationCart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReference> builder) {
        this.quotationCart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> containing the offered items. May contain either <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscounts</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a>.</p>
     * @param quotationCart value to be set
     * @return Builder
     */

    public StagedQuoteBuilder quotationCart(final com.commercetools.api.models.cart.CartReference quotationCart) {
        this.quotationCart = quotationCart;
        return this;
    }

    /**
     *  <p>Expiration date for the Quote. Once a Quote expires, it cannot be ordered.</p>
     * @param validTo value to be set
     * @return Builder
     */

    public StagedQuoteBuilder validTo(@Nullable final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     *  <p>Message from the <span>Seller</span> included in the offer.</p>
     * @param sellerComment value to be set
     * @return Builder
     */

    public StagedQuoteBuilder sellerComment(@Nullable final String sellerComment) {
        this.sellerComment = sellerComment;
        return this;
    }

    /**
     *  <p>Custom Fields of the Staged Quote.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedQuoteBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Staged Quote.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedQuoteBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Staged Quote.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StagedQuoteBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedQuoteBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedQuoteBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public StagedQuoteBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>The Purchase Order Number is typically set by the <span>Buyer</span> on a <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> to track the purchase order during the <span>quote and order flow</span>.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */

    public StagedQuoteBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> for the Staged Quote. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public StagedQuoteBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> for the Staged Quote. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public StagedQuoteBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> for the Staged Quote. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public StagedQuoteBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>The Store to which the <span>Buyer</span> belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public StagedQuoteBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the <span>Buyer</span> belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public StagedQuoteBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the <span>Buyer</span> belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public StagedQuoteBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>The unique ID of the StagedQuote.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the StagedQuote.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the StagedQuote was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the StagedQuote was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-specific unique identifier of the staged quote.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>IDs and references that last modified the StagedQuote.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the StagedQuote.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     * @return stagedQuoteState
     */

    public com.commercetools.api.models.staged_quote.StagedQuoteState getStagedQuoteState() {
        return this.stagedQuoteState;
    }

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     * @return quoteRequest
     */

    public com.commercetools.api.models.quote_request.QuoteRequestReference getQuoteRequest() {
        return this.quoteRequest;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> containing the offered items. May contain either <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscounts</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a>.</p>
     * @return quotationCart
     */

    public com.commercetools.api.models.cart.CartReference getQuotationCart() {
        return this.quotationCart;
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
     *  <p>Message from the <span>Seller</span> included in the offer.</p>
     * @return sellerComment
     */

    @Nullable
    public String getSellerComment() {
        return this.sellerComment;
    }

    /**
     *  <p>Custom Fields of the Staged Quote.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>The Purchase Order Number is typically set by the <span>Buyer</span> on a <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> to track the purchase order during the <span>quote and order flow</span>.</p>
     * @return purchaseOrderNumber
     */

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> for the Staged Quote. Only available for <span>B2B</span>-enabled Projects.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>The Store to which the <span>Buyer</span> belongs.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     * builds StagedQuote with checking for non-null required values
     * @return StagedQuote
     */
    public StagedQuote build() {
        Objects.requireNonNull(id, StagedQuote.class + ": id is missing");
        Objects.requireNonNull(version, StagedQuote.class + ": version is missing");
        Objects.requireNonNull(createdAt, StagedQuote.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, StagedQuote.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(stagedQuoteState, StagedQuote.class + ": stagedQuoteState is missing");
        Objects.requireNonNull(quoteRequest, StagedQuote.class + ": quoteRequest is missing");
        Objects.requireNonNull(quotationCart, StagedQuote.class + ": quotationCart is missing");
        return new StagedQuoteImpl(id, version, createdAt, lastModifiedAt, key, lastModifiedBy, createdBy,
            stagedQuoteState, customer, quoteRequest, quotationCart, validTo, sellerComment, custom, state,
            purchaseOrderNumber, businessUnit, store);
    }

    /**
     * builds StagedQuote without checking for non-null required values
     * @return StagedQuote
     */
    public StagedQuote buildUnchecked() {
        return new StagedQuoteImpl(id, version, createdAt, lastModifiedAt, key, lastModifiedBy, createdBy,
            stagedQuoteState, customer, quoteRequest, quotationCart, validTo, sellerComment, custom, state,
            purchaseOrderNumber, businessUnit, store);
    }

    /**
     * factory method for an instance of StagedQuoteBuilder
     * @return builder
     */
    public static StagedQuoteBuilder of() {
        return new StagedQuoteBuilder();
    }

    /**
     * create builder for StagedQuote instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteBuilder of(final StagedQuote template) {
        StagedQuoteBuilder builder = new StagedQuoteBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.key = template.getKey();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.stagedQuoteState = template.getStagedQuoteState();
        builder.customer = template.getCustomer();
        builder.quoteRequest = template.getQuoteRequest();
        builder.quotationCart = template.getQuotationCart();
        builder.validTo = template.getValidTo();
        builder.sellerComment = template.getSellerComment();
        builder.custom = template.getCustom();
        builder.state = template.getState();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        builder.businessUnit = template.getBusinessUnit();
        builder.store = template.getStore();
        return builder;
    }

}
