
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodAddZoneAction" rel="nofollow">Add Zone</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddZoneChange shippingMethodAddZoneChange = ShippingMethodAddZoneChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodAddZoneChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodAddZoneChangeImpl.class)
public interface ShippingMethodAddZoneChange extends Change {

    /**
     * discriminator value for ShippingMethodAddZoneChange
     */
    String SHIPPING_METHOD_ADD_ZONE_CHANGE = "ShippingMethodAddZoneChange";

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
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of ShippingMethodAddZoneChange
     */
    public static ShippingMethodAddZoneChange of() {
        return new ShippingMethodAddZoneChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodAddZoneChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodAddZoneChange of(final ShippingMethodAddZoneChange template) {
        ShippingMethodAddZoneChangeImpl instance = new ShippingMethodAddZoneChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ShippingMethodAddZoneChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodAddZoneChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodAddZoneChange deepCopy(@Nullable final ShippingMethodAddZoneChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodAddZoneChangeImpl instance = new ShippingMethodAddZoneChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodAddZoneChange
     * @return builder
     */
    public static ShippingMethodAddZoneChangeBuilder builder() {
        return ShippingMethodAddZoneChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodAddZoneChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodAddZoneChangeBuilder builder(final ShippingMethodAddZoneChange template) {
        return ShippingMethodAddZoneChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodAddZoneChange(Function<ShippingMethodAddZoneChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddZoneChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddZoneChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodAddZoneChange>";
            }
        };
    }
}
