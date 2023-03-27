
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetLocalizedDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetLocalizedDescriptionAction shippingMethodSetLocalizedDescriptionAction = ShippingMethodSetLocalizedDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetLocalizedDescriptionActionImpl.class)
public interface ShippingMethodSetLocalizedDescriptionAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodSetLocalizedDescriptionAction
     */
    String SET_LOCALIZED_DESCRIPTION = "setLocalizedDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return localizedDescription
     */
    @Valid
    @JsonProperty("localizedDescription")
    public LocalizedString getLocalizedDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param localizedDescription value to be set
     */

    public void setLocalizedDescription(final LocalizedString localizedDescription);

    /**
     * factory method
     * @return instance of ShippingMethodSetLocalizedDescriptionAction
     */
    public static ShippingMethodSetLocalizedDescriptionAction of() {
        return new ShippingMethodSetLocalizedDescriptionActionImpl();
    }

    /**
     * factory method to copy an instance of ShippingMethodSetLocalizedDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetLocalizedDescriptionAction of(
            final ShippingMethodSetLocalizedDescriptionAction template) {
        ShippingMethodSetLocalizedDescriptionActionImpl instance = new ShippingMethodSetLocalizedDescriptionActionImpl();
        instance.setLocalizedDescription(template.getLocalizedDescription());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetLocalizedDescriptionAction
     * @return builder
     */
    public static ShippingMethodSetLocalizedDescriptionActionBuilder builder() {
        return ShippingMethodSetLocalizedDescriptionActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetLocalizedDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetLocalizedDescriptionActionBuilder builder(
            final ShippingMethodSetLocalizedDescriptionAction template) {
        return ShippingMethodSetLocalizedDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetLocalizedDescriptionAction(
            Function<ShippingMethodSetLocalizedDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetLocalizedDescriptionAction>";
            }
        };
    }
}
