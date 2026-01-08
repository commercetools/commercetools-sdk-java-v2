
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.quote_request.QuoteRequestReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * StagedQuote
 *
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
@JsonDeserialize(as = StagedQuoteImpl.class)
public interface StagedQuote extends BaseResource, com.commercetools.api.models.WithKey {

    /**
     *  <p>The unique ID of the StagedQuote.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the StagedQuote.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-specific unique identifier of the staged quote.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Date and time (UTC) the StagedQuote was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the StagedQuote was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the StagedQuote.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the StagedQuote.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     * @return stagedQuoteState
     */
    @NotNull
    @JsonProperty("stagedQuoteState")
    public StagedQuoteState getStagedQuoteState();

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     * @return quoteRequest
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public QuoteRequestReference getQuoteRequest();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> containing the offered items. May contain either <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscounts</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a>.</p>
     * @return quotationCart
     */
    @NotNull
    @Valid
    @JsonProperty("quotationCart")
    public CartReference getQuotationCart();

    /**
     *  <p>Expiration date for the Quote. Once a Quote expires, it cannot be ordered.</p>
     * @return validTo
     */

    @JsonProperty("validTo")
    public ZonedDateTime getValidTo();

    /**
     *  <p>Message from the <span>Seller</span> included in the offer.</p>
     * @return sellerComment
     */

    @JsonProperty("sellerComment")
    public String getSellerComment();

    /**
     *  <p>Custom Fields of the Staged Quote.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>The purchase order number is typically set by the <span>Buyer</span> on a <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> to track the purchase order during the <span>quote and order flow</span>.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> for the Staged Quote. Only available for <span>B2B</span>-enabled Projects.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p>The Store to which the <span>Buyer</span> belongs.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The unique ID of the StagedQuote.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the StagedQuote.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-specific unique identifier of the staged quote.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Date and time (UTC) the StagedQuote was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the StagedQuote was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the StagedQuote.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the StagedQuote.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     * @param stagedQuoteState value to be set
     */

    public void setStagedQuoteState(final StagedQuoteState stagedQuoteState);

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     * @param quoteRequest value to be set
     */

    public void setQuoteRequest(final QuoteRequestReference quoteRequest);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> containing the offered items. May contain either <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscounts</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscounts</a>.</p>
     * @param quotationCart value to be set
     */

    public void setQuotationCart(final CartReference quotationCart);

    /**
     *  <p>Expiration date for the Quote. Once a Quote expires, it cannot be ordered.</p>
     * @param validTo value to be set
     */

    public void setValidTo(final ZonedDateTime validTo);

    /**
     *  <p>Message from the <span>Seller</span> included in the offer.</p>
     * @param sellerComment value to be set
     */

    public void setSellerComment(final String sellerComment);

    /**
     *  <p>Custom Fields of the Staged Quote.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>The purchase order number is typically set by the <span>Buyer</span> on a <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> to track the purchase order during the <span>quote and order flow</span>.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> for the Staged Quote. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     *  <p>The Store to which the <span>Buyer</span> belongs.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     * factory method
     * @return instance of StagedQuote
     */
    public static StagedQuote of() {
        return new StagedQuoteImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuote
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuote of(final StagedQuote template) {
        StagedQuoteImpl instance = new StagedQuoteImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setStagedQuoteState(template.getStagedQuoteState());
        instance.setCustomer(template.getCustomer());
        instance.setQuoteRequest(template.getQuoteRequest());
        instance.setQuotationCart(template.getQuotationCart());
        instance.setValidTo(template.getValidTo());
        instance.setSellerComment(template.getSellerComment());
        instance.setCustom(template.getCustom());
        instance.setState(template.getState());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        return instance;
    }

    public StagedQuote copyDeep();

    /**
     * factory method to create a deep copy of StagedQuote
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuote deepCopy(@Nullable final StagedQuote template) {
        if (template == null) {
            return null;
        }
        StagedQuoteImpl instance = new StagedQuoteImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setStagedQuoteState(template.getStagedQuoteState());
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setQuoteRequest(
            com.commercetools.api.models.quote_request.QuoteRequestReference.deepCopy(template.getQuoteRequest()));
        instance.setQuotationCart(
            com.commercetools.api.models.cart.CartReference.deepCopy(template.getQuotationCart()));
        instance.setValidTo(template.getValidTo());
        instance.setSellerComment(template.getSellerComment());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setBusinessUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getBusinessUnit()));
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for StagedQuote
     * @return builder
     */
    public static StagedQuoteBuilder builder() {
        return StagedQuoteBuilder.of();
    }

    /**
     * create builder for StagedQuote instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteBuilder builder(final StagedQuote template) {
        return StagedQuoteBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuote(Function<StagedQuote, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuote> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuote>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuote>";
            }
        };
    }
}
