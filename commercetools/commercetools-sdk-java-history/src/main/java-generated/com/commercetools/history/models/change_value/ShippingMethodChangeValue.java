
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ShippingMethodChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeValue shippingMethodChangeValue = ShippingMethodChangeValue.builder()
 *             .id("{id}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodChangeValueImpl.class)
public interface ShippingMethodChangeValue {

    /**
     *  <p><code>id</code> of the ShippingMethod.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Name of the ShippingMethod.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><code>id</code> of the ShippingMethod.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Name of the ShippingMethod.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of ShippingMethodChangeValue
     */
    public static ShippingMethodChangeValue of() {
        return new ShippingMethodChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodChangeValue of(final ShippingMethodChangeValue template) {
        ShippingMethodChangeValueImpl instance = new ShippingMethodChangeValueImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodChangeValue deepCopy(@Nullable final ShippingMethodChangeValue template) {
        if (template == null) {
            return null;
        }
        ShippingMethodChangeValueImpl instance = new ShippingMethodChangeValueImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodChangeValue
     * @return builder
     */
    public static ShippingMethodChangeValueBuilder builder() {
        return ShippingMethodChangeValueBuilder.of();
    }

    /**
     * create builder for ShippingMethodChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeValueBuilder builder(final ShippingMethodChangeValue template) {
        return ShippingMethodChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodChangeValue(Function<ShippingMethodChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodChangeValue>";
            }
        };
    }
}
