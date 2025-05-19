
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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

    public MyQuoteRequestUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of MyQuoteRequestUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyQuoteRequestUpdateAction deepCopy(@Nullable final MyQuoteRequestUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof MyQuoteRequestUpdateActionImpl)) {
            return template.copyDeep();
        }
        MyQuoteRequestUpdateActionImpl instance = new MyQuoteRequestUpdateActionImpl();
        return instance;
    }

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
