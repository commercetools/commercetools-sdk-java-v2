
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFieldLocalizedEnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Used when the ShippingRate maps to an abstract Cart categorization expressed by strings (for example, <code>Light</code>, <code>Medium</code>, or <code>Heavy</code>). Only keys defined in the <code>values</code> array can be used to create a tier or to set a value of the <code>shippingRateInput</code> on the Cart. Keys must be unique.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartClassificationType cartClassificationType = CartClassificationType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartClassificationTypeImpl.class)
public interface CartClassificationType extends ShippingRateInputType {

    /**
     * discriminator value for CartClassificationType
     */
    String CART_CLASSIFICATION = "CartClassification";

    /**
     *  <p>The classification items that can be used for specifying any ShippingRatePriceTier.</p>
     * @return values
     */
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<CustomFieldLocalizedEnumValue> getValues();

    /**
     *  <p>The classification items that can be used for specifying any ShippingRatePriceTier.</p>
     * @param values values to be set
     */

    @JsonIgnore
    public void setValues(final CustomFieldLocalizedEnumValue... values);

    /**
     *  <p>The classification items that can be used for specifying any ShippingRatePriceTier.</p>
     * @param values values to be set
     */

    public void setValues(final List<CustomFieldLocalizedEnumValue> values);

    /**
     * factory method
     * @return instance of CartClassificationType
     */
    public static CartClassificationType of() {
        return new CartClassificationTypeImpl();
    }

    /**
     * factory method to create a shallow copy CartClassificationType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartClassificationType of(final CartClassificationType template) {
        CartClassificationTypeImpl instance = new CartClassificationTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartClassificationType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartClassificationType deepCopy(@Nullable final CartClassificationType template) {
        if (template == null) {
            return null;
        }
        CartClassificationTypeImpl instance = new CartClassificationTypeImpl();
        instance.setValues(Optional.ofNullable(template.getValues())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.type.CustomFieldLocalizedEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartClassificationType
     * @return builder
     */
    public static CartClassificationTypeBuilder builder() {
        return CartClassificationTypeBuilder.of();
    }

    /**
     * create builder for CartClassificationType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartClassificationTypeBuilder builder(final CartClassificationType template) {
        return CartClassificationTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartClassificationType(Function<CartClassificationType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartClassificationType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartClassificationType>() {
            @Override
            public String toString() {
                return "TypeReference<CartClassificationType>";
            }
        };
    }
}
