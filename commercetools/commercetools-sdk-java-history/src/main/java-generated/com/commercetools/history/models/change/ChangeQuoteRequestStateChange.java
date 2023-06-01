package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.QuoteRequestState;
import com.commercetools.history.models.change.ChangeQuoteRequestStateChangeImpl;

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
 *  <p>Update action for <code>changeQuoteRequestState</code> on <code>quote-request</code></p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeQuoteRequestStateChange changeQuoteRequestStateChange = ChangeQuoteRequestStateChange.builder()
 *             .change("{change}")
 *             .nextValue(QuoteRequestState.SUBMITTED)
 *             .previousValue(QuoteRequestState.SUBMITTED)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChangeQuoteRequestStateChangeImpl.class)
public interface ChangeQuoteRequestStateChange extends Change {

    /**
     * discriminator value for ChangeQuoteRequestStateChange
     */
    String CHANGE_QUOTE_REQUEST_STATE_CHANGE = "ChangeQuoteRequestStateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public QuoteRequestState getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public QuoteRequestState getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final QuoteRequestState nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final QuoteRequestState previousValue);
    

    /**
     * factory method
     * @return instance of ChangeQuoteRequestStateChange
     */
    public static ChangeQuoteRequestStateChange of(){
        return new ChangeQuoteRequestStateChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy ChangeQuoteRequestStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeQuoteRequestStateChange of(final ChangeQuoteRequestStateChange template) {
        ChangeQuoteRequestStateChangeImpl instance = new ChangeQuoteRequestStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeQuoteRequestStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeQuoteRequestStateChange deepCopy(@Nullable final ChangeQuoteRequestStateChange template) {
        if (template == null) {
            return null;
        }
        ChangeQuoteRequestStateChangeImpl instance = new ChangeQuoteRequestStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeQuoteRequestStateChange
     * @return builder
     */
    public static ChangeQuoteRequestStateChangeBuilder builder() {
        return ChangeQuoteRequestStateChangeBuilder.of();
    }
    
    /**
     * create builder for ChangeQuoteRequestStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeQuoteRequestStateChangeBuilder builder(final ChangeQuoteRequestStateChange template) {
        return ChangeQuoteRequestStateChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeQuoteRequestStateChange(Function<ChangeQuoteRequestStateChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeQuoteRequestStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeQuoteRequestStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeQuoteRequestStateChange>";
            }
        };
    }
}
