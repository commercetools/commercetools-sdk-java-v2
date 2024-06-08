
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.CustomShippingMethodChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set Custom ShippingMethod update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomShippingMethodChange setCustomShippingMethodChange = SetCustomShippingMethodChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomShippingMethodChangeImpl.class)
public interface SetCustomShippingMethodChange extends Change {

    /**
     * discriminator value for SetCustomShippingMethodChange
     */
    String SET_CUSTOM_SHIPPING_METHOD_CHANGE = "SetCustomShippingMethodChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomShippingMethodChangeValue getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomShippingMethodChangeValue getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomShippingMethodChangeValue previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomShippingMethodChangeValue nextValue);

    /**
     * factory method
     * @return instance of SetCustomShippingMethodChange
     */
    public static SetCustomShippingMethodChange of() {
        return new SetCustomShippingMethodChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomShippingMethodChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomShippingMethodChange of(final SetCustomShippingMethodChange template) {
        SetCustomShippingMethodChangeImpl instance = new SetCustomShippingMethodChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomShippingMethodChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomShippingMethodChange deepCopy(@Nullable final SetCustomShippingMethodChange template) {
        if (template == null) {
            return null;
        }
        SetCustomShippingMethodChangeImpl instance = new SetCustomShippingMethodChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.change_value.CustomShippingMethodChangeValue
                .deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.change_value.CustomShippingMethodChangeValue
                .deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetCustomShippingMethodChange
     * @return builder
     */
    public static SetCustomShippingMethodChangeBuilder builder() {
        return SetCustomShippingMethodChangeBuilder.of();
    }

    /**
     * create builder for SetCustomShippingMethodChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomShippingMethodChangeBuilder builder(final SetCustomShippingMethodChange template) {
        return SetCustomShippingMethodChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomShippingMethodChange(Function<SetCustomShippingMethodChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomShippingMethodChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomShippingMethodChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomShippingMethodChange>";
            }
        };
    }
}
