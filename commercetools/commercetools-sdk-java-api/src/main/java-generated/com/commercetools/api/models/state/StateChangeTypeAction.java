
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * StateChangeTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateChangeTypeAction stateChangeTypeAction = StateChangeTypeAction.builder()
 *             .type(StateTypeEnum.ORDER_STATE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateChangeTypeActionImpl.class)
public interface StateChangeTypeAction extends StateUpdateAction {

    /**
     * discriminator value for StateChangeTypeAction
     */
    String CHANGE_TYPE = "changeType";

    /**
     *  <p>Resource or object types the State shall be assigned to. Must not be empty.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public StateTypeEnum getType();

    /**
     *  <p>Resource or object types the State shall be assigned to. Must not be empty.</p>
     * @param type value to be set
     */

    public void setType(final StateTypeEnum type);

    /**
     * factory method
     * @return instance of StateChangeTypeAction
     */
    public static StateChangeTypeAction of() {
        return new StateChangeTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy StateChangeTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateChangeTypeAction of(final StateChangeTypeAction template) {
        StateChangeTypeActionImpl instance = new StateChangeTypeActionImpl();
        instance.setType(template.getType());
        return instance;
    }

    /**
     * factory method to create a deep copy of StateChangeTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateChangeTypeAction deepCopy(@Nullable final StateChangeTypeAction template) {
        if (template == null) {
            return null;
        }
        StateChangeTypeActionImpl instance = new StateChangeTypeActionImpl();
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for StateChangeTypeAction
     * @return builder
     */
    public static StateChangeTypeActionBuilder builder() {
        return StateChangeTypeActionBuilder.of();
    }

    /**
     * create builder for StateChangeTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateChangeTypeActionBuilder builder(final StateChangeTypeAction template) {
        return StateChangeTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateChangeTypeAction(Function<StateChangeTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateChangeTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateChangeTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateChangeTypeAction>";
            }
        };
    }
}
