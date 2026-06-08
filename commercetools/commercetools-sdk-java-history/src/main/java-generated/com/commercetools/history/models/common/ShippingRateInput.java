
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
 * ShippingRateInput
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRateInput shippingRateInput = ShippingRateInput.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingRateInputImpl.class)
public interface ShippingRateInput {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * set type
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     * factory method
     * @return instance of ShippingRateInput
     */
    public static ShippingRateInput of() {
        return new ShippingRateInputImpl();
    }

    /**
     * factory method to create a shallow copy ShippingRateInput
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingRateInput of(final ShippingRateInput template) {
        ShippingRateInputImpl instance = new ShippingRateInputImpl();
        instance.setType(template.getType());
        return instance;
    }

    public ShippingRateInput copyDeep();

    /**
     * factory method to create a deep copy of ShippingRateInput
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingRateInput deepCopy(@Nullable final ShippingRateInput template) {
        if (template == null) {
            return null;
        }
        ShippingRateInputImpl instance = new ShippingRateInputImpl();
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for ShippingRateInput
     * @return builder
     */
    public static ShippingRateInputBuilder builder() {
        return ShippingRateInputBuilder.of();
    }

    /**
     * create builder for ShippingRateInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRateInputBuilder builder(final ShippingRateInput template) {
        return ShippingRateInputBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingRateInput(Function<ShippingRateInput, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRateInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRateInput>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRateInput>";
            }
        };
    }
}
