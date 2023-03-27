
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteRequestUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteRequestUpdateAction myQuoteRequestUpdateAction = MyQuoteRequestUpdateAction.cancelQuoteRequestBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyQuoteRequestCancelActionImpl.class, name = MyQuoteRequestCancelAction.CANCEL_QUOTE_REQUEST) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = MyQuoteRequestUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = MyQuoteRequestUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MyQuoteRequestUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<MyQuoteRequestUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * builder for cancelQuoteRequest subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyQuoteRequestCancelActionBuilder cancelQuoteRequestBuilder() {
        return com.commercetools.api.models.me.MyQuoteRequestCancelActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyQuoteRequestUpdateAction(Function<MyQuoteRequestUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteRequestUpdateAction>";
            }
        };
    }
}
