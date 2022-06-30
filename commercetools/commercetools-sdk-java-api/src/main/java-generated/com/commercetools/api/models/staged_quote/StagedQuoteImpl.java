
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * StagedQuote
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteImpl implements StagedQuote, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private String key;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private com.commercetools.api.models.quote_request.QuoteRequestReference quoteRequest;

    private com.commercetools.api.models.cart.CartReference quotationCart;

    private java.time.ZonedDateTime validTo;

    private String sellerComment;

    private com.commercetools.api.models.type.CustomFields custom;

    @JsonCreator
    StagedQuoteImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("key") final String key,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("stagedQuoteState") final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("quoteRequest") final com.commercetools.api.models.quote_request.QuoteRequestReference quoteRequest,
            @JsonProperty("quotationCart") final com.commercetools.api.models.cart.CartReference quotationCart,
            @JsonProperty("validTo") final java.time.ZonedDateTime validTo,
            @JsonProperty("sellerComment") final String sellerComment,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.key = key;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.stagedQuoteState = stagedQuoteState;
        this.customer = customer;
        this.quoteRequest = quoteRequest;
        this.quotationCart = quotationCart;
        this.validTo = validTo;
        this.sellerComment = sellerComment;
        this.custom = custom;
    }

    public StagedQuoteImpl() {
    }

    /**
     *  <p>The unique ID of the StagedQuote.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the StagedQuote.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the StagedQuote was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the StagedQuote was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-specific unique identifier of the staged quote.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     */

    public com.commercetools.api.models.staged_quote.StagedQuoteState getStagedQuoteState() {
        return this.stagedQuoteState;
    }

    /**
     *  <p>The Buyer who requested the quote.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>The Quote Request related to this Staged Quote.</p>
     */

    public com.commercetools.api.models.quote_request.QuoteRequestReference getQuoteRequest() {
        return this.quoteRequest;
    }

    /**
     *  <p>The Cart containing the offered items.</p>
     */

    public com.commercetools.api.models.cart.CartReference getQuotationCart() {
        return this.quotationCart;
    }

    /**
     *  <p>Expiration date for the quote.</p>
     */

    public java.time.ZonedDateTime getValidTo() {
        return this.validTo;
    }

    /**
     *  <p>The text message included in the offer from the Seller.</p>
     */

    public String getSellerComment() {
        return this.sellerComment;
    }

    /**
     *  <p>Custom Fields of this Staged Quote.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setStagedQuoteState(final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setQuoteRequest(final com.commercetools.api.models.quote_request.QuoteRequestReference quoteRequest) {
        this.quoteRequest = quoteRequest;
    }

    public void setQuotationCart(final com.commercetools.api.models.cart.CartReference quotationCart) {
        this.quotationCart = quotationCart;
    }

    public void setValidTo(final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
    }

    public void setSellerComment(final String sellerComment) {
        this.sellerComment = sellerComment;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedQuoteImpl that = (StagedQuoteImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(stagedQuoteState, that.stagedQuoteState)
                .append(customer, that.customer)
                .append(quoteRequest, that.quoteRequest)
                .append(quotationCart, that.quotationCart)
                .append(validTo, that.validTo)
                .append(sellerComment, that.sellerComment)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(key)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(stagedQuoteState)
                .append(customer)
                .append(quoteRequest)
                .append(quotationCart)
                .append(validTo)
                .append(sellerComment)
                .append(custom)
                .toHashCode();
    }

}
