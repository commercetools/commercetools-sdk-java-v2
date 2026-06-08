
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodRemoveShippingRateAction" rel="nofollow">Remove ShippingRate</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodRemoveShippingRateChange shippingMethodRemoveShippingRateChange = ShippingMethodRemoveShippingRateChange.builder()
 *             .change("{change}")
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodRemoveShippingRateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodRemoveShippingRateChangeImpl.class)
public interface ShippingMethodRemoveShippingRateChange extends Change {

    /**
     * discriminator value for ShippingMethodRemoveShippingRateChange
     */
    String SHIPPING_METHOD_REMOVE_SHIPPING_RATE_CHANGE = "ShippingMethodRemoveShippingRateChange";

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
     *  <p>Zone from which the ShippingRate was removed.</p>
     * @return zone
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ShippingRate getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Zone from which the ShippingRate was removed.</p>
     * @param zone value to be set
     */

    public void setZone(final ZoneResourceIdentifier zone);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ShippingRate previousValue);

    /**
     * factory method
     * @return instance of ShippingMethodRemoveShippingRateChange
     */
    public static ShippingMethodRemoveShippingRateChange of() {
        return new ShippingMethodRemoveShippingRateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodRemoveShippingRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodRemoveShippingRateChange of(final ShippingMethodRemoveShippingRateChange template) {
        ShippingMethodRemoveShippingRateChangeImpl instance = new ShippingMethodRemoveShippingRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setZone(template.getZone());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public ShippingMethodRemoveShippingRateChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodRemoveShippingRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodRemoveShippingRateChange deepCopy(
            @Nullable final ShippingMethodRemoveShippingRateChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodRemoveShippingRateChangeImpl instance = new ShippingMethodRemoveShippingRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setZone(com.commercetools.history.models.common.ZoneResourceIdentifier.deepCopy(template.getZone()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.ShippingRate.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodRemoveShippingRateChange
     * @return builder
     */
    public static ShippingMethodRemoveShippingRateChangeBuilder builder() {
        return ShippingMethodRemoveShippingRateChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodRemoveShippingRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodRemoveShippingRateChangeBuilder builder(
            final ShippingMethodRemoveShippingRateChange template) {
        return ShippingMethodRemoveShippingRateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodRemoveShippingRateChange(
            Function<ShippingMethodRemoveShippingRateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodRemoveShippingRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodRemoveShippingRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodRemoveShippingRateChange>";
            }
        };
    }
}
