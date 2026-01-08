
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodSetCustomTypeAction" rel="nofollow">Set Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetCustomTypeChange shippingMethodSetCustomTypeChange = ShippingMethodSetCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodSetCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetCustomTypeChangeImpl.class)
public interface ShippingMethodSetCustomTypeChange extends Change {

    /**
     * discriminator value for ShippingMethodSetCustomTypeChange
     */
    String SHIPPING_METHOD_SET_CUSTOM_TYPE_CHANGE = "ShippingMethodSetCustomTypeChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * factory method
     * @return instance of ShippingMethodSetCustomTypeChange
     */
    public static ShippingMethodSetCustomTypeChange of() {
        return new ShippingMethodSetCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetCustomTypeChange of(final ShippingMethodSetCustomTypeChange template) {
        ShippingMethodSetCustomTypeChangeImpl instance = new ShippingMethodSetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ShippingMethodSetCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSetCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetCustomTypeChange deepCopy(
            @Nullable final ShippingMethodSetCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetCustomTypeChangeImpl instance = new ShippingMethodSetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetCustomTypeChange
     * @return builder
     */
    public static ShippingMethodSetCustomTypeChangeBuilder builder() {
        return ShippingMethodSetCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetCustomTypeChangeBuilder builder(final ShippingMethodSetCustomTypeChange template) {
        return ShippingMethodSetCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetCustomTypeChange(Function<ShippingMethodSetCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetCustomTypeChange>";
            }
        };
    }
}
