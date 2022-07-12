
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String CANCEL_QUOTE_REQUEST = "cancelQuoteRequest";

    public static MyQuoteRequestCancelAction of() {
        return new MyQuoteRequestCancelActionImpl();
    }

    public static MyQuoteRequestCancelAction of(final MyQuoteRequestCancelAction template) {
        MyQuoteRequestCancelActionImpl instance = new MyQuoteRequestCancelActionImpl();
        return instance;
    }

    public static MyQuoteRequestCancelActionBuilder builder() {
        return MyQuoteRequestCancelActionBuilder.of();
    }

    public static MyQuoteRequestCancelActionBuilder builder(final MyQuoteRequestCancelAction template) {
        return MyQuoteRequestCancelActionBuilder.of(template);
    }

    default <T> T withMyQuoteRequestCancelAction(Function<MyQuoteRequestCancelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestCancelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestCancelAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteRequestCancelAction>";
            }
        };
    }
}
