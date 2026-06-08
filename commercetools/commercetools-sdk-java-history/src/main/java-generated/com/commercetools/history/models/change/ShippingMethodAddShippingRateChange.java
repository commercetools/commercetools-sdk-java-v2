
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ShippingRate;
import com.commercetools.history.models.common.ZoneResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodAddShippingRateAction" rel="nofollow">Add ShippingRate</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddShippingRateChange shippingMethodAddShippingRateChange = ShippingMethodAddShippingRateChange.builder()
 *             .change("{change}")
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodAddShippingRateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodAddShippingRateChangeImpl.class)
public interface ShippingMethodAddShippingRateChange extends Change {

    /**
     * discriminator value for ShippingMethodAddShippingRateChange
     */
    String SHIPPING_METHOD_ADD_SHIPPING_RATE_CHANGE = "ShippingMethodAddShippingRateChange";

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
     *  <p>Zone to which the ShippingRate was added.</p>
     * @return zone
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ShippingRate getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Zone to which the ShippingRate was added.</p>
     * @param zone value to be set
     */

    public void setZone(final ZoneResourceIdentifier zone);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ShippingRate nextValue);

    /**
     * factory method
     * @return instance of ShippingMethodAddShippingRateChange
     */
    public static ShippingMethodAddShippingRateChange of() {
        return new ShippingMethodAddShippingRateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodAddShippingRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodAddShippingRateChange of(final ShippingMethodAddShippingRateChange template) {
        ShippingMethodAddShippingRateChangeImpl instance = new ShippingMethodAddShippingRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setZone(template.getZone());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ShippingMethodAddShippingRateChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodAddShippingRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodAddShippingRateChange deepCopy(
            @Nullable final ShippingMethodAddShippingRateChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodAddShippingRateChangeImpl instance = new ShippingMethodAddShippingRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setZone(com.commercetools.history.models.common.ZoneResourceIdentifier.deepCopy(template.getZone()));
        instance.setNextValue(com.commercetools.history.models.common.ShippingRate.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodAddShippingRateChange
     * @return builder
     */
    public static ShippingMethodAddShippingRateChangeBuilder builder() {
        return ShippingMethodAddShippingRateChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodAddShippingRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodAddShippingRateChangeBuilder builder(
            final ShippingMethodAddShippingRateChange template) {
        return ShippingMethodAddShippingRateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodAddShippingRateChange(Function<ShippingMethodAddShippingRateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddShippingRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddShippingRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodAddShippingRateChange>";
            }
        };
    }
}
