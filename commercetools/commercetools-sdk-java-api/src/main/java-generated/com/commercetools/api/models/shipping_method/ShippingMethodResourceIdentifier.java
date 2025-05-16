
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a ShippingMethod. Either <code>id</code> or <code>key</code> is required. If both are set, an InvalidJsonInput error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodResourceIdentifier shippingMethodResourceIdentifier = ShippingMethodResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("shipping-method")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodResourceIdentifierImpl.class)
public interface ShippingMethodResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<ShippingMethod> {

    /**
     * discriminator value for ShippingMethodResourceIdentifier
     */
    String SHIPPING_METHOD = "shipping-method";

    /**
     *  <p>Unique identifier of the referenced ShippingMethod. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced ShippingMethod. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced ShippingMethod. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced ShippingMethod. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ShippingMethodResourceIdentifier
     */
    public static ShippingMethodResourceIdentifier of() {
        return new ShippingMethodResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodResourceIdentifier of(final ShippingMethodResourceIdentifier template) {
        ShippingMethodResourceIdentifierImpl instance = new ShippingMethodResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public ShippingMethodResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodResourceIdentifier deepCopy(@Nullable final ShippingMethodResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ShippingMethodResourceIdentifierImpl instance = new ShippingMethodResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodResourceIdentifier
     * @return builder
     */
    public static ShippingMethodResourceIdentifierBuilder builder() {
        return ShippingMethodResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ShippingMethodResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodResourceIdentifierBuilder builder(final ShippingMethodResourceIdentifier template) {
        return ShippingMethodResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodResourceIdentifier(Function<ShippingMethodResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodResourceIdentifier>";
            }
        };
    }
}
