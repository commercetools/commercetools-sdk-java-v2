
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFieldLocalizedEnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String CART_CLASSIFICATION = "CartClassification";

    /**
     *  <p>The classification items that can be used for specifiying any ShippingRatePriceTier.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<CustomFieldLocalizedEnumValue> getValues();

    @JsonIgnore
    public void setValues(final CustomFieldLocalizedEnumValue... values);

    public void setValues(final List<CustomFieldLocalizedEnumValue> values);

    public static CartClassificationType of() {
        return new CartClassificationTypeImpl();
    }

    public static CartClassificationType of(final CartClassificationType template) {
        CartClassificationTypeImpl instance = new CartClassificationTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    public static CartClassificationTypeBuilder builder() {
        return CartClassificationTypeBuilder.of();
    }

    public static CartClassificationTypeBuilder builder(final CartClassificationType template) {
        return CartClassificationTypeBuilder.of(template);
    }

    default <T> T withCartClassificationType(Function<CartClassificationType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartClassificationType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartClassificationType>() {
            @Override
            public String toString() {
                return "TypeReference<CartClassificationType>";
            }
        };
    }
}
