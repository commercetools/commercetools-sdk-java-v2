
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Defines the scope of Cart Discounts for recurring Orders.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderScopeDraft recurringOrderScopeDraft = RecurringOrderScopeDraft.anyOrderBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = RecurringOrderScopeDraftImpl.class, visible = true)
@JsonDeserialize(as = RecurringOrderScopeDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface RecurringOrderScopeDraft {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public RecurringOrderScopeDraft copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderScopeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderScopeDraft deepCopy(@Nullable final RecurringOrderScopeDraft template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof RecurringOrderScopeDraftImpl)) {
            return template.copyDeep();
        }
        RecurringOrderScopeDraftImpl instance = new RecurringOrderScopeDraftImpl();
        return instance;
    }

    /**
     * builder for anyOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.AnyOrderDraftBuilder anyOrderBuilder() {
        return com.commercetools.api.models.recurring_order.AnyOrderDraftBuilder.of();
    }

    /**
     * builder for applicableRecurrencePolicies subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.ApplicableRecurrencePoliciesDraftBuilder applicableRecurrencePoliciesBuilder() {
        return com.commercetools.api.models.recurring_order.ApplicableRecurrencePoliciesDraftBuilder.of();
    }

    /**
     * builder for nonRecurringOrdersOnly subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.NonRecurringOrdersOnlyDraftBuilder nonRecurringOrdersOnlyBuilder() {
        return com.commercetools.api.models.recurring_order.NonRecurringOrdersOnlyDraftBuilder.of();
    }

    /**
     * builder for recurringOrdersOnly subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrdersOnlyDraftBuilder recurringOrdersOnlyBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrdersOnlyDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderScopeDraft(Function<RecurringOrderScopeDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderScopeDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderScopeDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderScopeDraft>";
            }
        };
    }
}
