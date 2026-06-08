
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ShippingRateInputType
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRateInputType shippingRateInputType = ShippingRateInputType.cartClassificationBuilder()
 *             plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRateInputTypeImpl.class, visible = true)
@JsonDeserialize(as = ShippingRateInputTypeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShippingRateInputType {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();

    public ShippingRateInputType copyDeep();

    /**
     * factory method to create a deep copy of ShippingRateInputType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingRateInputType deepCopy(@Nullable final ShippingRateInputType template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ShippingRateInputTypeImpl)) {
            return template.copyDeep();
        }
        ShippingRateInputTypeImpl instance = new ShippingRateInputTypeImpl();
        return instance;
    }

    /**
     * builder for cartClassification subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.CartClassificationTypeBuilder cartClassificationBuilder() {
        return com.commercetools.api.models.project.CartClassificationTypeBuilder.of();
    }

    /**
     * builder for cartScore subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.CartScoreTypeBuilder cartScoreBuilder() {
        return com.commercetools.api.models.project.CartScoreTypeBuilder.of();
    }

    /**
     * builder for cartValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.CartValueTypeBuilder cartValueBuilder() {
        return com.commercetools.api.models.project.CartValueTypeBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingRateInputType(Function<ShippingRateInputType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRateInputType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRateInputType>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRateInputType>";
            }
        };
    }
}
