
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 * ShippingMethodSetCarrierAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetCarrierAction shippingMethodSetCarrierAction = ShippingMethodSetCarrierAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCarrier")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetCarrierActionImpl.class)
public interface ShippingMethodSetCarrierAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodSetCarrierAction
     */
    String SET_CARRIER = "setCarrier";

    /**
     *  <p>Name of the carrier that delivers the parcel, for example <code>DHL</code>. If <code>carrier</code> is absent or <code>null</code>, it is removed if it exists.</p>
     * @return carrier
     */

    @JsonProperty("carrier")
    public String getCarrier();

    /**
     *  <p>Name of the carrier that delivers the parcel, for example <code>DHL</code>. If <code>carrier</code> is absent or <code>null</code>, it is removed if it exists.</p>
     * @param carrier value to be set
     */

    public void setCarrier(final String carrier);

    /**
     * factory method
     * @return instance of ShippingMethodSetCarrierAction
     */
    public static ShippingMethodSetCarrierAction of() {
        return new ShippingMethodSetCarrierActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetCarrierAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetCarrierAction of(final ShippingMethodSetCarrierAction template) {
        ShippingMethodSetCarrierActionImpl instance = new ShippingMethodSetCarrierActionImpl();
        instance.setCarrier(template.getCarrier());
        return instance;
    }

    public ShippingMethodSetCarrierAction copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSetCarrierAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetCarrierAction deepCopy(@Nullable final ShippingMethodSetCarrierAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetCarrierActionImpl instance = new ShippingMethodSetCarrierActionImpl();
        instance.setCarrier(template.getCarrier());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetCarrierAction
     * @return builder
     */
    public static ShippingMethodSetCarrierActionBuilder builder() {
        return ShippingMethodSetCarrierActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetCarrierAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetCarrierActionBuilder builder(final ShippingMethodSetCarrierAction template) {
        return ShippingMethodSetCarrierActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetCarrierAction(Function<ShippingMethodSetCarrierAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ShippingMethodSetCarrierAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ShippingMethodSetCarrierAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetCarrierAction>";
            }
        };
    }
}
