
package com.commercetools.api.models.recurrence_policy;

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
 * RecurrencePolicyUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicyUpdate recurrencePolicyUpdate = RecurrencePolicyUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurrencePolicyUpdateImpl.class)
public interface RecurrencePolicyUpdate {

    /**
     *  <p>Expected version of the RecurrencePolicy on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the RecurrencePolicy.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<RecurrencePolicyUpdateAction> getActions();

    /**
     *  <p>Expected version of the RecurrencePolicy on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the RecurrencePolicy.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final RecurrencePolicyUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the RecurrencePolicy.</p>
     * @param actions values to be set
     */

    public void setActions(final List<RecurrencePolicyUpdateAction> actions);

    /**
     * factory method
     * @return instance of RecurrencePolicyUpdate
     */
    public static RecurrencePolicyUpdate of() {
        return new RecurrencePolicyUpdateImpl();
    }

    /**
     * factory method to create a shallow copy RecurrencePolicyUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurrencePolicyUpdate of(final RecurrencePolicyUpdate template) {
        RecurrencePolicyUpdateImpl instance = new RecurrencePolicyUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public RecurrencePolicyUpdate copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicyUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicyUpdate deepCopy(@Nullable final RecurrencePolicyUpdate template) {
        if (template == null) {
            return null;
        }
        RecurrencePolicyUpdateImpl instance = new RecurrencePolicyUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RecurrencePolicyUpdate
     * @return builder
     */
    public static RecurrencePolicyUpdateBuilder builder() {
        return RecurrencePolicyUpdateBuilder.of();
    }

    /**
     * create builder for RecurrencePolicyUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyUpdateBuilder builder(final RecurrencePolicyUpdate template) {
        return RecurrencePolicyUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicyUpdate(Function<RecurrencePolicyUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicyUpdate>";
            }
        };
    }
}
