
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Applies Cart Discounts to non-recurring Orders.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NonRecurringOrdersOnlyDraft nonRecurringOrdersOnlyDraft = NonRecurringOrdersOnlyDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("NonRecurringOrdersOnly")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NonRecurringOrdersOnlyDraftImpl.class)
public interface NonRecurringOrdersOnlyDraft
        extends RecurringOrderScopeDraft, io.vrap.rmf.base.client.Draft<NonRecurringOrdersOnlyDraft> {

    /**
     * discriminator value for NonRecurringOrdersOnlyDraft
     */
    String NON_RECURRING_ORDERS_ONLY = "NonRecurringOrdersOnly";

    /**
     * factory method
     * @return instance of NonRecurringOrdersOnlyDraft
     */
    public static NonRecurringOrdersOnlyDraft of() {
        return new NonRecurringOrdersOnlyDraftImpl();
    }

    /**
     * factory method to create a shallow copy NonRecurringOrdersOnlyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static NonRecurringOrdersOnlyDraft of(final NonRecurringOrdersOnlyDraft template) {
        NonRecurringOrdersOnlyDraftImpl instance = new NonRecurringOrdersOnlyDraftImpl();
        return instance;
    }

    public NonRecurringOrdersOnlyDraft copyDeep();

    /**
     * factory method to create a deep copy of NonRecurringOrdersOnlyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NonRecurringOrdersOnlyDraft deepCopy(@Nullable final NonRecurringOrdersOnlyDraft template) {
        if (template == null) {
            return null;
        }
        NonRecurringOrdersOnlyDraftImpl instance = new NonRecurringOrdersOnlyDraftImpl();
        return instance;
    }

    /**
     * builder factory method for NonRecurringOrdersOnlyDraft
     * @return builder
     */
    public static NonRecurringOrdersOnlyDraftBuilder builder() {
        return NonRecurringOrdersOnlyDraftBuilder.of();
    }

    /**
     * create builder for NonRecurringOrdersOnlyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NonRecurringOrdersOnlyDraftBuilder builder(final NonRecurringOrdersOnlyDraft template) {
        return NonRecurringOrdersOnlyDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNonRecurringOrdersOnlyDraft(Function<NonRecurringOrdersOnlyDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NonRecurringOrdersOnlyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NonRecurringOrdersOnlyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<NonRecurringOrdersOnlyDraft>";
            }
        };
    }
}
