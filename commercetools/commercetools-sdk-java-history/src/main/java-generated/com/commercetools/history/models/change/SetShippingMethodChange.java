
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ShippingMethodChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set ShippingMethod update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingMethodChange setShippingMethodChange = SetShippingMethodChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetShippingMethodChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingMethodChangeImpl.class)
public interface SetShippingMethodChange extends Change {

    /**
     * discriminator value for SetShippingMethodChange
     */
    String SET_SHIPPING_METHOD_CHANGE = "SetShippingMethodChange";

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
    public ShippingMethodChangeValue getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ShippingMethodChangeValue getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ShippingMethodChangeValue previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ShippingMethodChangeValue nextValue);

    /**
     * factory method
     * @return instance of SetShippingMethodChange
     */
    public static SetShippingMethodChange of() {
        return new SetShippingMethodChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingMethodChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingMethodChange of(final SetShippingMethodChange template) {
        SetShippingMethodChangeImpl instance = new SetShippingMethodChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetShippingMethodChange copyDeep();

    /**
     * factory method to create a deep copy of SetShippingMethodChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingMethodChange deepCopy(@Nullable final SetShippingMethodChange template) {
        if (template == null) {
            return null;
        }
        SetShippingMethodChangeImpl instance = new SetShippingMethodChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.change_value.ShippingMethodChangeValue
                .deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.change_value.ShippingMethodChangeValue.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingMethodChange
     * @return builder
     */
    public static SetShippingMethodChangeBuilder builder() {
        return SetShippingMethodChangeBuilder.of();
    }

    /**
     * create builder for SetShippingMethodChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingMethodChangeBuilder builder(final SetShippingMethodChange template) {
        return SetShippingMethodChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingMethodChange(Function<SetShippingMethodChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingMethodChange>";
            }
        };
    }
}
