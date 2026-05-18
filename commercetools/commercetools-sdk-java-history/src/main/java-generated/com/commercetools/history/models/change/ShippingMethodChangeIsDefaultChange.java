
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodChangeIsDefaultAction" rel="nofollow">Change IsDefault</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeIsDefaultChange shippingMethodChangeIsDefaultChange = ShippingMethodChangeIsDefaultChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodChangeIsDefaultChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodChangeIsDefaultChangeImpl.class)
public interface ShippingMethodChangeIsDefaultChange extends Change {

    /**
     * discriminator value for ShippingMethodChangeIsDefaultChange
     */
    String SHIPPING_METHOD_CHANGE_IS_DEFAULT_CHANGE = "ShippingMethodChangeIsDefaultChange";

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
    @JsonProperty("previousValue")
    public Boolean getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Boolean previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Boolean nextValue);

    /**
     * factory method
     * @return instance of ShippingMethodChangeIsDefaultChange
     */
    public static ShippingMethodChangeIsDefaultChange of() {
        return new ShippingMethodChangeIsDefaultChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodChangeIsDefaultChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodChangeIsDefaultChange of(final ShippingMethodChangeIsDefaultChange template) {
        ShippingMethodChangeIsDefaultChangeImpl instance = new ShippingMethodChangeIsDefaultChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ShippingMethodChangeIsDefaultChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodChangeIsDefaultChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodChangeIsDefaultChange deepCopy(
            @Nullable final ShippingMethodChangeIsDefaultChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodChangeIsDefaultChangeImpl instance = new ShippingMethodChangeIsDefaultChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodChangeIsDefaultChange
     * @return builder
     */
    public static ShippingMethodChangeIsDefaultChangeBuilder builder() {
        return ShippingMethodChangeIsDefaultChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodChangeIsDefaultChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeIsDefaultChangeBuilder builder(
            final ShippingMethodChangeIsDefaultChange template) {
        return ShippingMethodChangeIsDefaultChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodChangeIsDefaultChange(Function<ShippingMethodChangeIsDefaultChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeIsDefaultChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeIsDefaultChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodChangeIsDefaultChange>";
            }
        };
    }
}
