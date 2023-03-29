
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.CustomFieldExpandedValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddInterfaceInteractionChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddInterfaceInteractionChange addInterfaceInteractionChange = AddInterfaceInteractionChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddInterfaceInteractionChangeImpl.class)
public interface AddInterfaceInteractionChange extends Change {

    /**
     * discriminator value for AddInterfaceInteractionChange
     */
    String ADD_INTERFACE_INTERACTION_CHANGE = "AddInterfaceInteractionChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>addInterfaceInteraction</code> on payments</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Only available if <code>expand</code> is set to true</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFieldExpandedValue getNextValue();

    /**
     *  <p>Update action for <code>addInterfaceInteraction</code> on payments</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Only available if <code>expand</code> is set to true</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFieldExpandedValue nextValue);

    /**
     * factory method
     * @return instance of AddInterfaceInteractionChange
     */
    public static AddInterfaceInteractionChange of() {
        return new AddInterfaceInteractionChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddInterfaceInteractionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddInterfaceInteractionChange of(final AddInterfaceInteractionChange template) {
        AddInterfaceInteractionChangeImpl instance = new AddInterfaceInteractionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddInterfaceInteractionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddInterfaceInteractionChange deepCopy(@Nullable final AddInterfaceInteractionChange template) {
        if (template == null) {
            return null;
        }
        AddInterfaceInteractionChangeImpl instance = new AddInterfaceInteractionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(
            com.commercetools.history.models.change_value.CustomFieldExpandedValue.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddInterfaceInteractionChange
     * @return builder
     */
    public static AddInterfaceInteractionChangeBuilder builder() {
        return AddInterfaceInteractionChangeBuilder.of();
    }

    /**
     * create builder for AddInterfaceInteractionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddInterfaceInteractionChangeBuilder builder(final AddInterfaceInteractionChange template) {
        return AddInterfaceInteractionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddInterfaceInteractionChange(Function<AddInterfaceInteractionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddInterfaceInteractionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddInterfaceInteractionChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddInterfaceInteractionChange>";
            }
        };
    }
}
