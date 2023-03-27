
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteUpdateAction myQuoteUpdateAction = MyQuoteUpdateAction.changeMyQuoteStateBuilder()
 *             quoteState(MyQuoteState.DECLINED)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyQuoteChangeMyQuoteStateActionImpl.class, name = MyQuoteChangeMyQuoteStateAction.CHANGE_MY_QUOTE_STATE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = MyQuoteUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = MyQuoteUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MyQuoteUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<MyQuoteUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * builder for changeMyQuoteState subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyQuoteChangeMyQuoteStateActionBuilder changeMyQuoteStateBuilder() {
        return com.commercetools.api.models.me.MyQuoteChangeMyQuoteStateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyQuoteUpdateAction(Function<MyQuoteUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteUpdateAction>";
            }
        };
    }
}
