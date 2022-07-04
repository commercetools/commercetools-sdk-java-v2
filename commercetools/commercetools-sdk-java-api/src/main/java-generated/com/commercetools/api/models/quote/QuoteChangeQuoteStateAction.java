
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteChangeQuoteStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteChangeQuoteStateAction quoteChangeQuoteStateAction = QuoteChangeQuoteStateAction.builder()
 *             .quoteState(QuoteState.PENDING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteChangeQuoteStateActionImpl.class)
public interface QuoteChangeQuoteStateAction extends QuoteUpdateAction {

    String CHANGE_QUOTE_STATE = "changeQuoteState";

    /**
     *  <p>The new quote state to be set for the Quote.</p>
     */
    @NotNull
    @JsonProperty("quoteState")
    public QuoteState getQuoteState();

    public void setQuoteState(final QuoteState quoteState);

    public static QuoteChangeQuoteStateAction of() {
        return new QuoteChangeQuoteStateActionImpl();
    }

    public static QuoteChangeQuoteStateAction of(final QuoteChangeQuoteStateAction template) {
        QuoteChangeQuoteStateActionImpl instance = new QuoteChangeQuoteStateActionImpl();
        instance.setQuoteState(template.getQuoteState());
        return instance;
    }

    public static QuoteChangeQuoteStateActionBuilder builder() {
        return QuoteChangeQuoteStateActionBuilder.of();
    }

    public static QuoteChangeQuoteStateActionBuilder builder(final QuoteChangeQuoteStateAction template) {
        return QuoteChangeQuoteStateActionBuilder.of(template);
    }

    default <T> T withQuoteChangeQuoteStateAction(Function<QuoteChangeQuoteStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteChangeQuoteStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteChangeQuoteStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteChangeQuoteStateAction>";
            }
        };
    }
}
