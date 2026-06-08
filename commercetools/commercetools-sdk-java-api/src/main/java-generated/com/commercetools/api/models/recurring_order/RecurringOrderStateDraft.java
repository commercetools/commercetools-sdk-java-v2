
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
 *  <p>Defines the new state for the Recurring Order—for possible values, see <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderActive" rel="nofollow">RecurringOrderActive</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderPaused" rel="nofollow">RecurringOrderPaused</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderExpired" rel="nofollow">RecurringOrderExpired</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderCanceled" rel="nofollow">RecurringOrderCanceled</a>.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderStateDraft recurringOrderStateDraft = RecurringOrderStateDraft.activeBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = RecurringOrderStateDraftImpl.class, visible = true)
@JsonDeserialize(as = RecurringOrderStateDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface RecurringOrderStateDraft {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public RecurringOrderStateDraft copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderStateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderStateDraft deepCopy(@Nullable final RecurringOrderStateDraft template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof RecurringOrderStateDraftImpl)) {
            return template.copyDeep();
        }
        RecurringOrderStateDraftImpl instance = new RecurringOrderStateDraftImpl();
        return instance;
    }

    /**
     * builder for active subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderActiveBuilder activeBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderActiveBuilder.of();
    }

    /**
     * builder for canceled subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderCanceledBuilder canceledBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderCanceledBuilder.of();
    }

    /**
     * builder for expired subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderExpiredBuilder expiredBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderExpiredBuilder.of();
    }

    /**
     * builder for paused subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderPausedBuilder pausedBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderPausedBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderStateDraft(Function<RecurringOrderStateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderStateDraft>";
            }
        };
    }
}
