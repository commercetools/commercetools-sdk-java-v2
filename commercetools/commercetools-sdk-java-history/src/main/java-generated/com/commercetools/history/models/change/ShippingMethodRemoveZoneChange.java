
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodRemoveZoneAction" rel="nofollow">Remove Zone</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodRemoveZoneChange shippingMethodRemoveZoneChange = ShippingMethodRemoveZoneChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodRemoveZoneChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodRemoveZoneChangeImpl.class)
public interface ShippingMethodRemoveZoneChange extends Change {

    /**
     * discriminator value for ShippingMethodRemoveZoneChange
     */
    String SHIPPING_METHOD_REMOVE_ZONE_CHANGE = "ShippingMethodRemoveZoneChange";

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
    public Reference getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

    /**
     * factory method
     * @return instance of ShippingMethodRemoveZoneChange
     */
    public static ShippingMethodRemoveZoneChange of() {
        return new ShippingMethodRemoveZoneChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodRemoveZoneChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodRemoveZoneChange of(final ShippingMethodRemoveZoneChange template) {
        ShippingMethodRemoveZoneChangeImpl instance = new ShippingMethodRemoveZoneChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public ShippingMethodRemoveZoneChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodRemoveZoneChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodRemoveZoneChange deepCopy(@Nullable final ShippingMethodRemoveZoneChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodRemoveZoneChangeImpl instance = new ShippingMethodRemoveZoneChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodRemoveZoneChange
     * @return builder
     */
    public static ShippingMethodRemoveZoneChangeBuilder builder() {
        return ShippingMethodRemoveZoneChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodRemoveZoneChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodRemoveZoneChangeBuilder builder(final ShippingMethodRemoveZoneChange template) {
        return ShippingMethodRemoveZoneChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodRemoveZoneChange(Function<ShippingMethodRemoveZoneChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodRemoveZoneChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodRemoveZoneChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodRemoveZoneChange>";
            }
        };
    }
}
