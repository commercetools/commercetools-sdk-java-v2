
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Cart Discounts are applied to recurring Orders.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrdersOnly recurringOrdersOnly = RecurringOrdersOnly.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrdersOnly")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrdersOnlyImpl.class)
public interface RecurringOrdersOnly extends RecurringOrderScope {

    /**
     * discriminator value for RecurringOrdersOnly
     */
    String RECURRING_ORDERS_ONLY = "RecurringOrdersOnly";

    /**
     * factory method
     * @return instance of RecurringOrdersOnly
     */
    public static RecurringOrdersOnly of() {
        return new RecurringOrdersOnlyImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrdersOnly
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrdersOnly of(final RecurringOrdersOnly template) {
        RecurringOrdersOnlyImpl instance = new RecurringOrdersOnlyImpl();
        return instance;
    }

    public RecurringOrdersOnly copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrdersOnly
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrdersOnly deepCopy(@Nullable final RecurringOrdersOnly template) {
        if (template == null) {
            return null;
        }
        RecurringOrdersOnlyImpl instance = new RecurringOrdersOnlyImpl();
        return instance;
    }

    /**
     * builder factory method for RecurringOrdersOnly
     * @return builder
     */
    public static RecurringOrdersOnlyBuilder builder() {
        return RecurringOrdersOnlyBuilder.of();
    }

    /**
     * create builder for RecurringOrdersOnly instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrdersOnlyBuilder builder(final RecurringOrdersOnly template) {
        return RecurringOrdersOnlyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrdersOnly(Function<RecurringOrdersOnly, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrdersOnly> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrdersOnly>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrdersOnly>";
            }
        };
    }
}
