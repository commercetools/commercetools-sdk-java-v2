
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodReference shippingMethodReference = ShippingMethodReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("shipping-method")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodReferenceImpl.class)
public interface ShippingMethodReference extends Reference {

    /**
     * discriminator value for ShippingMethodReference
     */
    String SHIPPING_METHOD = "shipping-method";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ShippingMethodReference
     */
    public static ShippingMethodReference of() {
        return new ShippingMethodReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodReference of(final ShippingMethodReference template) {
        ShippingMethodReferenceImpl instance = new ShippingMethodReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public ShippingMethodReference copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodReference deepCopy(@Nullable final ShippingMethodReference template) {
        if (template == null) {
            return null;
        }
        ShippingMethodReferenceImpl instance = new ShippingMethodReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodReference
     * @return builder
     */
    public static ShippingMethodReferenceBuilder builder() {
        return ShippingMethodReferenceBuilder.of();
    }

    /**
     * create builder for ShippingMethodReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodReferenceBuilder builder(final ShippingMethodReference template) {
        return ShippingMethodReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodReference(Function<ShippingMethodReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodReference>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodReference>";
            }
        };
    }
}
