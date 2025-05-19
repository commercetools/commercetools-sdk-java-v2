
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
 * StateChangeKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateChangeKeyAction stateChangeKeyAction = StateChangeKeyAction.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateChangeKeyActionImpl.class)
public interface StateChangeKeyAction extends StateUpdateAction {

    /**
     * discriminator value for StateChangeKeyAction
     */
    String CHANGE_KEY = "changeKey";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of StateChangeKeyAction
     */
    public static StateChangeKeyAction of() {
        return new StateChangeKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy StateChangeKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateChangeKeyAction of(final StateChangeKeyAction template) {
        StateChangeKeyActionImpl instance = new StateChangeKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public StateChangeKeyAction copyDeep();

    /**
     * factory method to create a deep copy of StateChangeKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateChangeKeyAction deepCopy(@Nullable final StateChangeKeyAction template) {
        if (template == null) {
            return null;
        }
        StateChangeKeyActionImpl instance = new StateChangeKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for StateChangeKeyAction
     * @return builder
     */
    public static StateChangeKeyActionBuilder builder() {
        return StateChangeKeyActionBuilder.of();
    }

    /**
     * create builder for StateChangeKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateChangeKeyActionBuilder builder(final StateChangeKeyAction template) {
        return StateChangeKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateChangeKeyAction(Function<StateChangeKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateChangeKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateChangeKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateChangeKeyAction>";
            }
        };
    }
}
