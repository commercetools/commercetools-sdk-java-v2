
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

    /**
     *  <p>The unique ID of the StagedQuote.</p>
     */

    public StagedQuoteBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the StagedQuote.</p>
     */

    public StagedQuoteBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the StagedQuote was initially created.</p>
     */

    public StagedQuoteBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the StagedQuote was last updated.</p>
     */

    public StagedQuoteBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-specific unique identifier of the staged quote.</p>
     */

    public StagedQuoteBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StagedQuoteBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StagedQuoteBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StagedQuoteBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StagedQuoteBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     */

    public StagedQuoteBuilder stagedQuoteState(
            final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
        return this;
    }

    /**
     *  <p>The Buyer who requested the quote.</p>
     */

    public StagedQuoteBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Buyer who requested the quote.</p>
     */

    public StagedQuoteBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>The Quote Request related to this Staged Quote.</p>
     */

    public StagedQuoteBuilder quoteRequest(
            Function<com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder, com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder> builder) {
        this.quoteRequest = builder.apply(com.commercetools.api.models.quote_request.QuoteRequestReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Quote Request related to this Staged Quote.</p>
     */

    public StagedQuoteBuilder quoteRequest(
            final com.commercetools.api.models.quote_request.QuoteRequestReference quoteRequest) {
        this.quoteRequest = quoteRequest;
        return this;
    }

    /**
     *  <p>The Cart containing the offered items.</p>
     */

    public StagedQuoteBuilder quotationCart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReferenceBuilder> builder) {
        this.quotationCart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Cart containing the offered items.</p>
     */

    public StagedQuoteBuilder quotationCart(final com.commercetools.api.models.cart.CartReference quotationCart) {
        this.quotationCart = quotationCart;
        return this;
    }

    /**
     *  <p>Expiration date for the quote.</p>
     */

    public StagedQuoteBuilder validTo(@Nullable final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     *  <p>The text message included in the offer from the Seller.</p>
     */

    public StagedQuoteBuilder sellerComment(@Nullable final String sellerComment) {
        this.sellerComment = sellerComment;
        return this;
    }

    /**
     *  <p>Custom Fields of this Staged Quote.</p>
     */

    public StagedQuoteBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of this Staged Quote.</p>
     */

    public StagedQuoteBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
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

    public com.commercetools.api.models.staged_quote.StagedQuoteState getStagedQuoteState() {
        return this.stagedQuoteState;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    public com.commercetools.api.models.quote_request.QuoteRequestReference getQuoteRequest() {
        return this.quoteRequest;
    }

    public com.commercetools.api.models.cart.CartReference getQuotationCart() {
        return this.quotationCart;
    }

    @Nullable
    public java.time.ZonedDateTime getValidTo() {
        return this.validTo;
    }

    @Nullable
    public String getSellerComment() {
        return this.sellerComment;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public StagedQuote build() {
        Objects.requireNonNull(id, StagedQuote.class + ": id is missing");
        Objects.requireNonNull(version, StagedQuote.class + ": version is missing");
        Objects.requireNonNull(createdAt, StagedQuote.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, StagedQuote.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(stagedQuoteState, StagedQuote.class + ": stagedQuoteState is missing");
        Objects.requireNonNull(quoteRequest, StagedQuote.class + ": quoteRequest is missing");
        Objects.requireNonNull(quotationCart, StagedQuote.class + ": quotationCart is missing");
        return new StagedQuoteImpl(id, version, createdAt, lastModifiedAt, key, lastModifiedBy, createdBy,
            stagedQuoteState, customer, quoteRequest, quotationCart, validTo, sellerComment, custom);
    }

    /**
     * builds StagedQuote without checking for non null required values
     */
    public StagedQuote buildUnchecked() {
        return new StagedQuoteImpl(id, version, createdAt, lastModifiedAt, key, lastModifiedBy, createdBy,
            stagedQuoteState, customer, quoteRequest, quotationCart, validTo, sellerComment, custom);
    }

    public static StagedQuoteBuilder of() {
        return new StagedQuoteBuilder();
    }

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
        return builder;
    }

}
