
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Transitions the Quote Request to a different state.</p>
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

    String CHANGE_QUOTE_REQUEST_STATE = "changeQuoteRequestState";

    /**
     *  <p>The new state to be set for the Quote Request.</p>
     */
    @NotNull
    @JsonProperty("quoteRequestState")
    public QuoteRequestState getQuoteRequestState();

    public void setQuoteRequestState(final QuoteRequestState quoteRequestState);

    public static QuoteRequestChangeQuoteRequestStateAction of() {
        return new QuoteRequestChangeQuoteRequestStateActionImpl();
    }

    public static QuoteRequestChangeQuoteRequestStateAction of(
            final QuoteRequestChangeQuoteRequestStateAction template) {
        QuoteRequestChangeQuoteRequestStateActionImpl instance = new QuoteRequestChangeQuoteRequestStateActionImpl();
        instance.setQuoteRequestState(template.getQuoteRequestState());
        return instance;
    }

    public static QuoteRequestChangeQuoteRequestStateActionBuilder builder() {
        return QuoteRequestChangeQuoteRequestStateActionBuilder.of();
    }

    public static QuoteRequestChangeQuoteRequestStateActionBuilder builder(
            final QuoteRequestChangeQuoteRequestStateAction template) {
        return QuoteRequestChangeQuoteRequestStateActionBuilder.of(template);
    }

    default <T> T withQuoteRequestChangeQuoteRequestStateAction(
            Function<QuoteRequestChangeQuoteRequestStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestChangeQuoteRequestStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestChangeQuoteRequestStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestChangeQuoteRequestStateAction>";
            }
        };
    }
}
