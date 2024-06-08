
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Transitions the Quote Request to a different state. A Buyer is only allowed to cancel a Quote Request when it is in <code>Submitted</code> state.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestChangeQuoteRequestStateAction quoteRequestChangeQuoteRequestStateAction = QuoteRequestChangeQuoteRequestStateAction.builder()
 *             .quoteRequestState(QuoteRequestState.SUBMITTED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestChangeQuoteRequestStateActionImpl.class)
public interface QuoteRequestChangeQuoteRequestStateAction extends QuoteRequestUpdateAction {

    /**
     * discriminator value for QuoteRequestChangeQuoteRequestStateAction
     */
    String CHANGE_QUOTE_REQUEST_STATE = "changeQuoteRequestState";

    /**
     *  <p>New state to be set for the Quote Request.</p>
     * @return quoteRequestState
     */
    @NotNull
    @JsonProperty("quoteRequestState")
    public QuoteRequestState getQuoteRequestState();

    /**
     *  <p>New state to be set for the Quote Request.</p>
     * @param quoteRequestState value to be set
     */

    public void setQuoteRequestState(final QuoteRequestState quoteRequestState);

    /**
     * factory method
     * @return instance of QuoteRequestChangeQuoteRequestStateAction
     */
    public static QuoteRequestChangeQuoteRequestStateAction of() {
        return new QuoteRequestChangeQuoteRequestStateActionImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestChangeQuoteRequestStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestChangeQuoteRequestStateAction of(
            final QuoteRequestChangeQuoteRequestStateAction template) {
        QuoteRequestChangeQuoteRequestStateActionImpl instance = new QuoteRequestChangeQuoteRequestStateActionImpl();
        instance.setQuoteRequestState(template.getQuoteRequestState());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteRequestChangeQuoteRequestStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestChangeQuoteRequestStateAction deepCopy(
            @Nullable final QuoteRequestChangeQuoteRequestStateAction template) {
        if (template == null) {
            return null;
        }
        QuoteRequestChangeQuoteRequestStateActionImpl instance = new QuoteRequestChangeQuoteRequestStateActionImpl();
        instance.setQuoteRequestState(template.getQuoteRequestState());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestChangeQuoteRequestStateAction
     * @return builder
     */
    public static QuoteRequestChangeQuoteRequestStateActionBuilder builder() {
        return QuoteRequestChangeQuoteRequestStateActionBuilder.of();
    }

    /**
     * create builder for QuoteRequestChangeQuoteRequestStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestChangeQuoteRequestStateActionBuilder builder(
            final QuoteRequestChangeQuoteRequestStateAction template) {
        return QuoteRequestChangeQuoteRequestStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestChangeQuoteRequestStateAction(
            Function<QuoteRequestChangeQuoteRequestStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestChangeQuoteRequestStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestChangeQuoteRequestStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestChangeQuoteRequestStateAction>";
            }
        };
    }
}
