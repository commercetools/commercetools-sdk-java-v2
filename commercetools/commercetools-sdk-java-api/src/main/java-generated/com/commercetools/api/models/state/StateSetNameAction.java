
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * StateSetNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateSetNameAction stateSetNameAction = StateSetNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateSetNameActionImpl.class)
public interface StateSetNameAction extends StateUpdateAction {

    /**
     * discriminator value for StateSetNameAction
     */
    String SET_NAME = "setName";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of StateSetNameAction
     */
    public static StateSetNameAction of() {
        return new StateSetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy StateSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateSetNameAction of(final StateSetNameAction template) {
        StateSetNameActionImpl instance = new StateSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of StateSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateSetNameAction deepCopy(@Nullable final StateSetNameAction template) {
        if (template == null) {
            return null;
        }
        StateSetNameActionImpl instance = new StateSetNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for StateSetNameAction
     * @return builder
     */
    public static StateSetNameActionBuilder builder() {
        return StateSetNameActionBuilder.of();
    }

    /**
     * create builder for StateSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateSetNameActionBuilder builder(final StateSetNameAction template) {
        return StateSetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateSetNameAction(Function<StateSetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateSetNameAction>";
            }
        };
    }
}
