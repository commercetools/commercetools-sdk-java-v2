
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetDescriptionAction shippingMethodSetDescriptionAction = ShippingMethodSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetDescriptionActionImpl.class)
@Deprecated
public interface ShippingMethodSetDescriptionAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     * factory method
     * @return instance of ShippingMethodSetDescriptionAction
     */
    public static ShippingMethodSetDescriptionAction of() {
        return new ShippingMethodSetDescriptionActionImpl();
    }

    /**
     * factory method to copy an instance of ShippingMethodSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetDescriptionAction of(final ShippingMethodSetDescriptionAction template) {
        ShippingMethodSetDescriptionActionImpl instance = new ShippingMethodSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetDescriptionAction
     * @return builder
     */
    public static ShippingMethodSetDescriptionActionBuilder builder() {
        return ShippingMethodSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetDescriptionActionBuilder builder(final ShippingMethodSetDescriptionAction template) {
        return ShippingMethodSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetDescriptionAction(Function<ShippingMethodSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetDescriptionAction>";
            }
        };
    }
}
