
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Transitions the <code>quoteRequestState</code> of the Quote Request to <code>Cancelled</code>. Can only be used when the Quote Request is in state <code>Submitted</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteRequestCancelAction myQuoteRequestCancelAction = MyQuoteRequestCancelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyQuoteRequestCancelActionImpl.class)
public interface MyQuoteRequestCancelAction extends MyQuoteRequestUpdateAction {

    /**
     * discriminator value for MyQuoteRequestCancelAction
     */
    String CANCEL_QUOTE_REQUEST = "cancelQuoteRequest";

    /**
     * factory method
     * @return instance of MyQuoteRequestCancelAction
     */
    public static MyQuoteRequestCancelAction of() {
        return new MyQuoteRequestCancelActionImpl();
    }

    /**
     * factory method to create a shallow copy MyQuoteRequestCancelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyQuoteRequestCancelAction of(final MyQuoteRequestCancelAction template) {
        MyQuoteRequestCancelActionImpl instance = new MyQuoteRequestCancelActionImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of MyQuoteRequestCancelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyQuoteRequestCancelAction deepCopy(@Nullable final MyQuoteRequestCancelAction template) {
        if (template == null) {
            return null;
        }
        MyQuoteRequestCancelActionImpl instance = new MyQuoteRequestCancelActionImpl();
        return instance;
    }

    /**
     * builder factory method for MyQuoteRequestCancelAction
     * @return builder
     */
    public static MyQuoteRequestCancelActionBuilder builder() {
        return MyQuoteRequestCancelActionBuilder.of();
    }

    /**
     * create builder for MyQuoteRequestCancelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyQuoteRequestCancelActionBuilder builder(final MyQuoteRequestCancelAction template) {
        return MyQuoteRequestCancelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyQuoteRequestCancelAction(Function<MyQuoteRequestCancelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestCancelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestCancelAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteRequestCancelAction>";
            }
        };
    }
}
