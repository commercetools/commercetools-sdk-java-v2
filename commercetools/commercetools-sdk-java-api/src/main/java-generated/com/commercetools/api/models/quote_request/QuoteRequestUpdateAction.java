
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
 * QuoteRequestUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestUpdateAction quoteRequestUpdateAction = QuoteRequestUpdateAction.changeCustomerBuilder()
 *             customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = QuoteRequestUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = QuoteRequestUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface QuoteRequestUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<QuoteRequestUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public QuoteRequestUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of QuoteRequestUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestUpdateAction deepCopy(@Nullable final QuoteRequestUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof QuoteRequestUpdateActionImpl)) {
            return template.copyDeep();
        }
        QuoteRequestUpdateActionImpl instance = new QuoteRequestUpdateActionImpl();
        return instance;
    }

    /**
     * builder for changeCustomer subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote_request.QuoteRequestChangeCustomerActionBuilder changeCustomerBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestChangeCustomerActionBuilder.of();
    }

    /**
     * builder for changeQuoteRequestState subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateActionBuilder changeQuoteRequestStateBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for transitionState subtype
     * @return builder
     */
    public static com.commercetools.api.models.quote_request.QuoteRequestTransitionStateActionBuilder transitionStateBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestTransitionStateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestUpdateAction(Function<QuoteRequestUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestUpdateAction>";
            }
        };
    }
}
