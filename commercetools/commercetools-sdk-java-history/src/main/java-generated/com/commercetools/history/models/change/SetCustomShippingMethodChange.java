
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.CustomShippingMethodChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomShippingMethodChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomShippingMethodChange setCustomShippingMethodChange = SetCustomShippingMethodChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
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
     *  <p>Update action for <code>setCustomShippingMethod</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomShippingMethodChangeValue getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomShippingMethodChangeValue getPreviousValue();

    /**
     *  <p>Update action for <code>setCustomShippingMethod</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomShippingMethodChangeValue nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomShippingMethodChangeValue previousValue);

    /**
     * factory method
     * @return instance of SetCustomShippingMethodChange
     */
    public static SetCustomShippingMethodChange of() {
        return new SetCustomShippingMethodChangeImpl();
    }

    /**
     * factory method to copy an instance of SetCustomShippingMethodChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomShippingMethodChange of(final SetCustomShippingMethodChange template) {
        SetCustomShippingMethodChangeImpl instance = new SetCustomShippingMethodChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
