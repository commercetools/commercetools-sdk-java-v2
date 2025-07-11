
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderMessagePayload recurringOrderMessagePayload = RecurringOrderMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface RecurringOrderMessagePayload extends MessagePayload {

    public RecurringOrderMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderMessagePayload deepCopy(@Nullable final RecurringOrderMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderMessagePayloadImpl instance = new RecurringOrderMessagePayloadImpl();
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderMessagePayload(Function<RecurringOrderMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderMessagePayload>";
            }
        };
    }
}
