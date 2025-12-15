
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetKeyChange shippingMethodSetKeyChange = ShippingMethodSetKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodSetKeyChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetKeyChangeImpl.class)
public interface ShippingMethodSetKeyChange extends Change {

    /**
     * discriminator value for ShippingMethodSetKeyChange
     */
    String SHIPPING_METHOD_SET_KEY_CHANGE = "ShippingMethodSetKeyChange";

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
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of ShippingMethodSetKeyChange
     */
    public static ShippingMethodSetKeyChange of() {
        return new ShippingMethodSetKeyChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetKeyChange of(final ShippingMethodSetKeyChange template) {
        ShippingMethodSetKeyChangeImpl instance = new ShippingMethodSetKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ShippingMethodSetKeyChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSetKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetKeyChange deepCopy(@Nullable final ShippingMethodSetKeyChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetKeyChangeImpl instance = new ShippingMethodSetKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetKeyChange
     * @return builder
     */
    public static ShippingMethodSetKeyChangeBuilder builder() {
        return ShippingMethodSetKeyChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetKeyChangeBuilder builder(final ShippingMethodSetKeyChange template) {
        return ShippingMethodSetKeyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetKeyChange(Function<ShippingMethodSetKeyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetKeyChange>";
            }
        };
    }
}
