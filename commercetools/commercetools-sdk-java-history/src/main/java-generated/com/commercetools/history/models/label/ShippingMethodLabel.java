
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ShippingMethodLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodLabel shippingMethodLabel = ShippingMethodLabel.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodLabelImpl.class)
public interface ShippingMethodLabel extends Label {

    /**
     * discriminator value for ShippingMethodLabel
     */
    String SHIPPING_METHOD_LABEL = "ShippingMethodLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-defined unique identifier of the Shipping Method.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique name identifier of the Shipping Method.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>User-defined unique identifier of the Shipping Method.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Unique name identifier of the Shipping Method.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of ShippingMethodLabel
     */
    public static ShippingMethodLabel of() {
        return new ShippingMethodLabelImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodLabel of(final ShippingMethodLabel template) {
        ShippingMethodLabelImpl instance = new ShippingMethodLabelImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        return instance;
    }

    public ShippingMethodLabel copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodLabel deepCopy(@Nullable final ShippingMethodLabel template) {
        if (template == null) {
            return null;
        }
        ShippingMethodLabelImpl instance = new ShippingMethodLabelImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodLabel
     * @return builder
     */
    public static ShippingMethodLabelBuilder builder() {
        return ShippingMethodLabelBuilder.of();
    }

    /**
     * create builder for ShippingMethodLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodLabelBuilder builder(final ShippingMethodLabel template) {
        return ShippingMethodLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodLabel(Function<ShippingMethodLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodLabel>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodLabel>";
            }
        };
    }
}
