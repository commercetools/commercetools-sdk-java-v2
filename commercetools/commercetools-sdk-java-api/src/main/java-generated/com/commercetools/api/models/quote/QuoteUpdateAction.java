
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = QuoteUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = QuoteUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface QuoteUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<QuoteUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public QuoteUpdateAction copyDeep();

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

        if (!(template instanceof QuoteUpdateActionImpl)) {
            return template.copyDeep();
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
