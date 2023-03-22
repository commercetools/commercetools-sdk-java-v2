
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>Expected version of the State on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
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

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final StateUpdateAction... actions);

    public void setActions(final List<StateUpdateAction> actions);

    public static StateUpdate of() {
        return new StateUpdateImpl();
    }

    public static StateUpdate of(final StateUpdate template) {
        StateUpdateImpl instance = new StateUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static StateUpdateBuilder builder() {
        return StateUpdateBuilder.of();
    }

    public static StateUpdateBuilder builder(final StateUpdate template) {
        return StateUpdateBuilder.of(template);
    }

    default <T> T withStateUpdate(Function<StateUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StateUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<StateUpdate>";
            }
        };
    }
}
