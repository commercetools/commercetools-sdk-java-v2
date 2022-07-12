
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.quote_request.QuoteRequestReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
public interface StagedQuote extends BaseResource {

    /**
     *  <p>The unique ID of the StagedQuote.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the StagedQuote.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-specific unique identifier of the staged quote.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Date and time (UTC) the StagedQuote was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the StagedQuote was last updated.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     */
    @NotNull
    @JsonProperty("stagedQuoteState")
    public StagedQuoteState getStagedQuoteState();

    /**
     *  <p>The Buyer who requested the quote.</p>
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>The Quote Request related to this Staged Quote.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public QuoteRequestReference getQuoteRequest();

    /**
     *  <p>The Cart containing the offered items.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("quotationCart")
    public CartReference getQuotationCart();

    /**
     *  <p>Expiration date for the quote.</p>
     */

    @JsonProperty("validTo")
    public ZonedDateTime getValidTo();

    /**
     *  <p>The text message included in the offer from the Seller.</p>
     */

    @JsonProperty("sellerComment")
    public String getSellerComment();

    /**
     *  <p>Custom Fields of this Staged Quote.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setKey(final String key);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setStagedQuoteState(final StagedQuoteState stagedQuoteState);

    public void setCustomer(final CustomerReference customer);

    public void setQuoteRequest(final QuoteRequestReference quoteRequest);

    public void setQuotationCart(final CartReference quotationCart);

    public void setValidTo(final ZonedDateTime validTo);

    public void setSellerComment(final String sellerComment);

    public void setCustom(final CustomFields custom);

    public static StagedQuote of() {
        return new StagedQuoteImpl();
    }

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
        return instance;
    }

    public static StagedQuoteBuilder builder() {
        return StagedQuoteBuilder.of();
    }

    public static StagedQuoteBuilder builder(final StagedQuote template) {
        return StagedQuoteBuilder.of(template);
    }

    default <T> T withStagedQuote(Function<StagedQuote, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuote> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuote>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuote>";
            }
        };
    }
}
