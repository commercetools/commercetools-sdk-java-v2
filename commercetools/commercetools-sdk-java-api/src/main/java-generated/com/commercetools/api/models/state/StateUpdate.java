
package com.commercetools.api.models.state;

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
 * StateUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateUpdate stateUpdate = StateUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateUpdateImpl.class)
public interface StateUpdate
        extends com.commercetools.api.models.ResourceUpdate<StateUpdate, StateUpdateAction, StateUpdateBuilder> {

    /**
     *  <p>Expected version of the State on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the State.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<StateUpdateAction> getActions();

    /**
     *  <p>Expected version of the State on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the State.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final StateUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the State.</p>
     * @param actions values to be set
     */

    public void setActions(final List<StateUpdateAction> actions);

    /**
     * factory method
     * @return instance of StateUpdate
     */
    public static StateUpdate of() {
        return new StateUpdateImpl();
    }

    /**
     * factory method to create a shallow copy StateUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateUpdate of(final StateUpdate template) {
        StateUpdateImpl instance = new StateUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public StateUpdate copyDeep();

    /**
     * factory method to create a deep copy of StateUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateUpdate deepCopy(@Nullable final StateUpdate template) {
        if (template == null) {
            return null;
        }
        StateUpdateImpl instance = new StateUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.state.StateUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StateUpdate
     * @return builder
     */
    public static StateUpdateBuilder builder() {
        return StateUpdateBuilder.of();
    }

    /**
     * create builder for StateUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateUpdateBuilder builder(final StateUpdate template) {
        return StateUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateUpdate(Function<StateUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<StateUpdate>";
            }
        };
    }
}
