
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Cart Discounts are applied to non-recurring Orders.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NonRecurringOrdersOnly nonRecurringOrdersOnly = NonRecurringOrdersOnly.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("NonRecurringOrdersOnly")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NonRecurringOrdersOnlyImpl.class)
public interface NonRecurringOrdersOnly extends RecurringOrderScope {

    /**
     * discriminator value for NonRecurringOrdersOnly
     */
    String NON_RECURRING_ORDERS_ONLY = "NonRecurringOrdersOnly";

    /**
     * factory method
     * @return instance of NonRecurringOrdersOnly
     */
    public static NonRecurringOrdersOnly of() {
        return new NonRecurringOrdersOnlyImpl();
    }

    /**
     * factory method to create a shallow copy NonRecurringOrdersOnly
     * @param template instance to be copied
     * @return copy instance
     */
    public static NonRecurringOrdersOnly of(final NonRecurringOrdersOnly template) {
        NonRecurringOrdersOnlyImpl instance = new NonRecurringOrdersOnlyImpl();
        return instance;
    }

    public NonRecurringOrdersOnly copyDeep();

    /**
     * factory method to create a deep copy of NonRecurringOrdersOnly
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NonRecurringOrdersOnly deepCopy(@Nullable final NonRecurringOrdersOnly template) {
        if (template == null) {
            return null;
        }
        NonRecurringOrdersOnlyImpl instance = new NonRecurringOrdersOnlyImpl();
        return instance;
    }

    /**
     * builder factory method for NonRecurringOrdersOnly
     * @return builder
     */
    public static NonRecurringOrdersOnlyBuilder builder() {
        return NonRecurringOrdersOnlyBuilder.of();
    }

    /**
     * create builder for NonRecurringOrdersOnly instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NonRecurringOrdersOnlyBuilder builder(final NonRecurringOrdersOnly template) {
        return NonRecurringOrdersOnlyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNonRecurringOrdersOnly(Function<NonRecurringOrdersOnly, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NonRecurringOrdersOnly> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NonRecurringOrdersOnly>() {
            @Override
            public String toString() {
                return "TypeReference<NonRecurringOrdersOnly>";
            }
        };
    }
}
