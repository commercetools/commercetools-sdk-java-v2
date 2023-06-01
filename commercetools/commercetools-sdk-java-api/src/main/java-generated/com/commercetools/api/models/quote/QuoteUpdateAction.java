package com.commercetools.api.models.quote;

import com.commercetools.api.models.quote.QuoteChangeCustomerAction;
import com.commercetools.api.models.quote.QuoteChangeQuoteStateAction;
import com.commercetools.api.models.quote.QuoteRequestQuoteRenegotiationAction;
import com.commercetools.api.models.quote.QuoteSetCustomFieldAction;
import com.commercetools.api.models.quote.QuoteSetCustomTypeAction;
import com.commercetools.api.models.quote.QuoteTransitionStateAction;


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
 * QuoteUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteUpdateAction quoteUpdateAction = QuoteUpdateAction.changeCustomerBuilder()
 *             customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteChangeCustomerActionImpl.class, name = QuoteChangeCustomerAction.CHANGE_CUSTOMER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteChangeQuoteStateActionImpl.class, name = QuoteChangeQuoteStateAction.CHANGE_QUOTE_STATE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteRequestQuoteRenegotiationActionImpl.class, name = QuoteRequestQuoteRenegotiationAction.REQUEST_QUOTE_RENEGOTIATION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteSetCustomFieldActionImpl.class, name = QuoteSetCustomFieldAction.SET_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteSetCustomTypeActionImpl.class, name = QuoteSetCustomTypeAction.SET_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteTransitionStateActionImpl.class, name = QuoteTransitionStateAction.TRANSITION_STATE)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = QuoteUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = QuoteUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface QuoteUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<QuoteUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




    /**
     * factory method to create a deep copy of QuoteUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteUpdateAction deepCopy(@Nullable final QuoteUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.quote.QuoteChangeCustomerAction) {
            return com.commercetools.api.models.quote.QuoteChangeCustomerAction.deepCopy((com.commercetools.api.models.quote.QuoteChangeCustomerAction)template);
        }
        if (template instanceof com.commercetools.api.models.quote.QuoteChangeQuoteStateAction) {
            return com.commercetools.api.models.quote.QuoteChangeQuoteStateAction.deepCopy((com.commercetools.api.models.quote.QuoteChangeQuoteStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.quote.QuoteRequestQuoteRenegotiationAction) {
            return com.commercetools.api.models.quote.QuoteRequestQuoteRenegotiationAction.deepCopy((com.commercetools.api.models.quote.QuoteRequestQuoteRenegotiationAction)template);
        }
        if (template instanceof com.commercetools.api.models.quote.QuoteSetCustomFieldAction) {
            return com.commercetools.api.models.quote.QuoteSetCustomFieldAction.deepCopy((com.commercetools.api.models.quote.QuoteSetCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.quote.QuoteSetCustomTypeAction) {
            return com.commercetools.api.models.quote.QuoteSetCustomTypeAction.deepCopy((com.commercetools.api.models.quote.QuoteSetCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.quote.QuoteTransitionStateAction) {
            return com.commercetools.api.models.quote.QuoteTransitionStateAction.deepCopy((com.commercetools.api.models.quote.QuoteTransitionStateAction)template);
        }
        QuoteUpdateActionImpl instance = new QuoteUpdateActionImpl();
        return instance;
    }


    /**
     * builder for changeCustomer subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote.QuoteChangeCustomerActionBuilder changeCustomerBuilder() {
       return com.commercetools.api.models.quote.QuoteChangeCustomerActionBuilder.of();
    }
    /**
     * builder for changeQuoteState subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote.QuoteChangeQuoteStateActionBuilder changeQuoteStateBuilder() {
       return com.commercetools.api.models.quote.QuoteChangeQuoteStateActionBuilder.of();
    }
    /**
     * builder for requestQuoteRenegotiation subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote.QuoteRequestQuoteRenegotiationActionBuilder requestQuoteRenegotiationBuilder() {
       return com.commercetools.api.models.quote.QuoteRequestQuoteRenegotiationActionBuilder.of();
    }
    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote.QuoteSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.quote.QuoteSetCustomFieldActionBuilder.of();
    }
    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote.QuoteSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.quote.QuoteSetCustomTypeActionBuilder.of();
    }
    /**
     * builder for transitionState subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote.QuoteTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.quote.QuoteTransitionStateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteUpdateAction(Function<QuoteUpdateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteUpdateAction>";
            }
        };
    }
}
