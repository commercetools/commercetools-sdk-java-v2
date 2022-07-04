
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestUpdateAction quoteRequestUpdateAction = QuoteRequestUpdateAction.changeQuoteRequestStateBuilder()
 *             quoteRequestState(QuoteRequestState.SUBMITTED)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateActionImpl.class, name = QuoteRequestChangeQuoteRequestStateAction.CHANGE_QUOTE_REQUEST_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldActionImpl.class, name = QuoteRequestSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeActionImpl.class, name = QuoteRequestSetCustomTypeAction.SET_CUSTOM_TYPE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = QuoteRequestUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = QuoteRequestUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface QuoteRequestUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<QuoteRequestUpdateAction> {

    /**
     *
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateActionBuilder changeQuoteRequestStateBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateActionBuilder.of();
    }

    public static com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeActionBuilder.of();
    }

    default <T> T withQuoteRequestUpdateAction(Function<QuoteRequestUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestUpdateAction>";
            }
        };
    }
}
