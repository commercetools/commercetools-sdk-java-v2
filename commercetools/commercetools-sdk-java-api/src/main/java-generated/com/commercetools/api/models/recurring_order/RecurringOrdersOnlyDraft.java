
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Applies Cart Discounts to recurring Orders.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrdersOnlyDraft recurringOrdersOnlyDraft = RecurringOrdersOnlyDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrdersOnly")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrdersOnlyDraftImpl.class)
public interface RecurringOrdersOnlyDraft
        extends RecurringOrderScopeDraft, io.vrap.rmf.base.client.Draft<RecurringOrdersOnlyDraft> {

    /**
     * discriminator value for RecurringOrdersOnlyDraft
     */
    String RECURRING_ORDERS_ONLY = "RecurringOrdersOnly";

    /**
     * factory method
     * @return instance of RecurringOrdersOnlyDraft
     */
    public static RecurringOrdersOnlyDraft of() {
        return new RecurringOrdersOnlyDraftImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrdersOnlyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrdersOnlyDraft of(final RecurringOrdersOnlyDraft template) {
        RecurringOrdersOnlyDraftImpl instance = new RecurringOrdersOnlyDraftImpl();
        return instance;
    }

    public RecurringOrdersOnlyDraft copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrdersOnlyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrdersOnlyDraft deepCopy(@Nullable final RecurringOrdersOnlyDraft template) {
        if (template == null) {
            return null;
        }
        RecurringOrdersOnlyDraftImpl instance = new RecurringOrdersOnlyDraftImpl();
        return instance;
    }

    /**
     * builder factory method for RecurringOrdersOnlyDraft
     * @return builder
     */
    public static RecurringOrdersOnlyDraftBuilder builder() {
        return RecurringOrdersOnlyDraftBuilder.of();
    }

    /**
     * create builder for RecurringOrdersOnlyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrdersOnlyDraftBuilder builder(final RecurringOrdersOnlyDraft template) {
        return RecurringOrdersOnlyDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrdersOnlyDraft(Function<RecurringOrdersOnlyDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrdersOnlyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrdersOnlyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrdersOnlyDraft>";
            }
        };
    }
}
