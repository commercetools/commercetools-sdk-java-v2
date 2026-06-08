
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * RecurringOrderUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderUpdate recurringOrderUpdate = RecurringOrderUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderUpdateImpl.class)
public interface RecurringOrderUpdate {

    /**
     *  <p>Expected version of the RecurringOrder on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the RecurringOrder.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<RecurringOrderUpdateAction> getActions();

    /**
     *  <p>Expected version of the RecurringOrder on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the RecurringOrder.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final RecurringOrderUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the RecurringOrder.</p>
     * @param actions values to be set
     */

    public void setActions(final List<RecurringOrderUpdateAction> actions);

    /**
     * factory method
     * @return instance of RecurringOrderUpdate
     */
    public static RecurringOrderUpdate of() {
        return new RecurringOrderUpdateImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderUpdate of(final RecurringOrderUpdate template) {
        RecurringOrderUpdateImpl instance = new RecurringOrderUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public RecurringOrderUpdate copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderUpdate deepCopy(@Nullable final RecurringOrderUpdate template) {
        if (template == null) {
            return null;
        }
        RecurringOrderUpdateImpl instance = new RecurringOrderUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.recurring_order.RecurringOrderUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderUpdate
     * @return builder
     */
    public static RecurringOrderUpdateBuilder builder() {
        return RecurringOrderUpdateBuilder.of();
    }

    /**
     * create builder for RecurringOrderUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderUpdateBuilder builder(final RecurringOrderUpdate template) {
        return RecurringOrderUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderUpdate(Function<RecurringOrderUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderUpdate>";
            }
        };
    }
}
