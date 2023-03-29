
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetLocalizedNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetLocalizedNameAction shippingMethodSetLocalizedNameAction = ShippingMethodSetLocalizedNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetLocalizedNameActionImpl.class)
public interface ShippingMethodSetLocalizedNameAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodSetLocalizedNameAction
     */
    String SET_LOCALIZED_NAME = "setLocalizedName";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return localizedName
     */
    @Valid
    @JsonProperty("localizedName")
    public LocalizedString getLocalizedName();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param localizedName value to be set
     */

    public void setLocalizedName(final LocalizedString localizedName);

    /**
     * factory method
     * @return instance of ShippingMethodSetLocalizedNameAction
     */
    public static ShippingMethodSetLocalizedNameAction of() {
        return new ShippingMethodSetLocalizedNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetLocalizedNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetLocalizedNameAction of(final ShippingMethodSetLocalizedNameAction template) {
        ShippingMethodSetLocalizedNameActionImpl instance = new ShippingMethodSetLocalizedNameActionImpl();
        instance.setLocalizedName(template.getLocalizedName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodSetLocalizedNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetLocalizedNameAction deepCopy(
            @Nullable final ShippingMethodSetLocalizedNameAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetLocalizedNameActionImpl instance = new ShippingMethodSetLocalizedNameActionImpl();
        instance.setLocalizedName(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getLocalizedName()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetLocalizedNameAction
     * @return builder
     */
    public static ShippingMethodSetLocalizedNameActionBuilder builder() {
        return ShippingMethodSetLocalizedNameActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetLocalizedNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetLocalizedNameActionBuilder builder(
            final ShippingMethodSetLocalizedNameAction template) {
        return ShippingMethodSetLocalizedNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetLocalizedNameAction(Function<ShippingMethodSetLocalizedNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetLocalizedNameAction>";
            }
        };
    }
}
