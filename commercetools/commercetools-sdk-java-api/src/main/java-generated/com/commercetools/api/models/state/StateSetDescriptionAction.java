
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
 * StateSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateSetDescriptionAction stateSetDescriptionAction = StateSetDescriptionAction.builder()
 *             .description(descriptionBuilder -> descriptionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateSetDescriptionActionImpl.class)
public interface StateSetDescriptionAction extends StateUpdateAction {

    /**
     * discriminator value for StateSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @NotNull
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of StateSetDescriptionAction
     */
    public static StateSetDescriptionAction of() {
        return new StateSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy StateSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateSetDescriptionAction of(final StateSetDescriptionAction template) {
        StateSetDescriptionActionImpl instance = new StateSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public StateSetDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of StateSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateSetDescriptionAction deepCopy(@Nullable final StateSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        StateSetDescriptionActionImpl instance = new StateSetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for StateSetDescriptionAction
     * @return builder
     */
    public static StateSetDescriptionActionBuilder builder() {
        return StateSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for StateSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateSetDescriptionActionBuilder builder(final StateSetDescriptionAction template) {
        return StateSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateSetDescriptionAction(Function<StateSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateSetDescriptionAction>";
            }
        };
    }
}
