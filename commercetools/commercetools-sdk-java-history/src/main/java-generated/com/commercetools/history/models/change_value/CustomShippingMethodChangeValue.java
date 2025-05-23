
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
 * CustomShippingMethodChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomShippingMethodChangeValue customShippingMethodChangeValue = CustomShippingMethodChangeValue.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomShippingMethodChangeValueImpl.class)
public interface CustomShippingMethodChangeValue {

    /**
     *  <p>Name of the Custom ShippingMethod.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the Custom ShippingMethod.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of CustomShippingMethodChangeValue
     */
    public static CustomShippingMethodChangeValue of() {
        return new CustomShippingMethodChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy CustomShippingMethodChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomShippingMethodChangeValue of(final CustomShippingMethodChangeValue template) {
        CustomShippingMethodChangeValueImpl instance = new CustomShippingMethodChangeValueImpl();
        instance.setName(template.getName());
        return instance;
    }

    public CustomShippingMethodChangeValue copyDeep();

    /**
     * factory method to create a deep copy of CustomShippingMethodChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomShippingMethodChangeValue deepCopy(@Nullable final CustomShippingMethodChangeValue template) {
        if (template == null) {
            return null;
        }
        CustomShippingMethodChangeValueImpl instance = new CustomShippingMethodChangeValueImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for CustomShippingMethodChangeValue
     * @return builder
     */
    public static CustomShippingMethodChangeValueBuilder builder() {
        return CustomShippingMethodChangeValueBuilder.of();
    }

    /**
     * create builder for CustomShippingMethodChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomShippingMethodChangeValueBuilder builder(final CustomShippingMethodChangeValue template) {
        return CustomShippingMethodChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomShippingMethodChangeValue(Function<CustomShippingMethodChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomShippingMethodChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomShippingMethodChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<CustomShippingMethodChangeValue>";
            }
        };
    }
}
