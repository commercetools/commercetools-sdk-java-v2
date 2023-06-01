package com.commercetools.api.models.quote;

import com.commercetools.api.models.quote.QuoteState;
import com.commercetools.api.models.quote.QuoteUpdateAction;
import com.commercetools.api.models.quote.QuoteChangeQuoteStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = QuoteChangeQuoteStateActionImpl.class)
public interface QuoteChangeQuoteStateAction extends QuoteUpdateAction {

    /**
     * discriminator value for QuoteChangeQuoteStateAction
     */
    String CHANGE_QUOTE_STATE = "changeQuoteState";

    /**
     *  <p>New state to be set for the Quote.</p>
     * @return quoteState
     */
    @NotNull
    @JsonProperty("quoteState")
    public QuoteState getQuoteState();

    /**
     *  <p>New state to be set for the Quote.</p>
     * @param quoteState value to be set
     */
    
    public void setQuoteState(final QuoteState quoteState);
    

    /**
     * factory method
     * @return instance of QuoteChangeQuoteStateAction
     */
    public static QuoteChangeQuoteStateAction of(){
        return new QuoteChangeQuoteStateActionImpl();
    }
    

    /**
     * factory method to create a shallow copy QuoteChangeQuoteStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteChangeQuoteStateAction of(final QuoteChangeQuoteStateAction template) {
        QuoteChangeQuoteStateActionImpl instance = new QuoteChangeQuoteStateActionImpl();
        instance.setQuoteState(template.getQuoteState());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteChangeQuoteStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteChangeQuoteStateAction deepCopy(@Nullable final QuoteChangeQuoteStateAction template) {
        if (template == null) {
            return null;
        }
        QuoteChangeQuoteStateActionImpl instance = new QuoteChangeQuoteStateActionImpl();
        instance.setQuoteState(template.getQuoteState());
        return instance;
    }

    /**
     * builder factory method for QuoteChangeQuoteStateAction
     * @return builder
     */
    public static QuoteChangeQuoteStateActionBuilder builder() {
        return QuoteChangeQuoteStateActionBuilder.of();
    }
    
    /**
     * create builder for QuoteChangeQuoteStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteChangeQuoteStateActionBuilder builder(final QuoteChangeQuoteStateAction template) {
        return QuoteChangeQuoteStateActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteChangeQuoteStateAction(Function<QuoteChangeQuoteStateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteChangeQuoteStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteChangeQuoteStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteChangeQuoteStateAction>";
            }
        };
    }
}
