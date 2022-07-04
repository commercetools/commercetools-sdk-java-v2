
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteUpdateAction quoteUpdateAction = QuoteUpdateAction.changeQuoteStateBuilder()
 *             quoteState(QuoteState.PENDING)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteChangeQuoteStateActionImpl.class, name = QuoteChangeQuoteStateAction.CHANGE_QUOTE_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteSetCustomFieldActionImpl.class, name = QuoteSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.quote.QuoteSetCustomTypeActionImpl.class, name = QuoteSetCustomTypeAction.SET_CUSTOM_TYPE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = QuoteUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = QuoteUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface QuoteUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<QuoteUpdateAction> {

    /**
     *
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.quote.QuoteChangeQuoteStateActionBuilder changeQuoteStateBuilder() {
        return com.commercetools.api.models.quote.QuoteChangeQuoteStateActionBuilder.of();
    }

    public static com.commercetools.api.models.quote.QuoteSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.quote.QuoteSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.quote.QuoteSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.quote.QuoteSetCustomTypeActionBuilder.of();
    }

    default <T> T withQuoteUpdateAction(Function<QuoteUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteUpdateAction>";
            }
        };
    }
}
