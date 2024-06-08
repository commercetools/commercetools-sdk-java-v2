
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Product Variant value conflicts with an existing one during an Update Product request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateVariantValuesError duplicateVariantValuesError = DuplicateVariantValuesError.builder()
 *             .message("{message}")
 *             .variantValues(variantValuesBuilder -> variantValuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateVariantValuesErrorImpl.class)
public interface DuplicateVariantValuesError extends ErrorObject {

    /**
     * discriminator value for DuplicateVariantValuesError
     */
    String DUPLICATE_VARIANT_VALUES = "DuplicateVariantValues";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"A duplicate combination of the variant values (sku, key, images, prices, attributes) exists."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     * @return variantValues
     */
    @NotNull
    @Valid
    @JsonProperty("variantValues")
    public VariantValues getVariantValues();

    /**
     *  <p><code>"A duplicate combination of the variant values (sku, key, images, prices, attributes) exists."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     * @param variantValues value to be set
     */

    public void setVariantValues(final VariantValues variantValues);

    /**
     * factory method
     * @return instance of DuplicateVariantValuesError
     */
    public static DuplicateVariantValuesError of() {
        return new DuplicateVariantValuesErrorImpl();
    }

    /**
     * factory method to create a shallow copy DuplicateVariantValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    public static DuplicateVariantValuesError of(final DuplicateVariantValuesError template) {
        DuplicateVariantValuesErrorImpl instance = new DuplicateVariantValuesErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setVariantValues(template.getVariantValues());
        return instance;
    }

    /**
     * factory method to create a deep copy of DuplicateVariantValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DuplicateVariantValuesError deepCopy(@Nullable final DuplicateVariantValuesError template) {
        if (template == null) {
            return null;
        }
        DuplicateVariantValuesErrorImpl instance = new DuplicateVariantValuesErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setVariantValues(
            com.commercetools.api.models.error.VariantValues.deepCopy(template.getVariantValues()));
        return instance;
    }

    /**
     * builder factory method for DuplicateVariantValuesError
     * @return builder
     */
    public static DuplicateVariantValuesErrorBuilder builder() {
        return DuplicateVariantValuesErrorBuilder.of();
    }

    /**
     * create builder for DuplicateVariantValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateVariantValuesErrorBuilder builder(final DuplicateVariantValuesError template) {
        return DuplicateVariantValuesErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDuplicateVariantValuesError(Function<DuplicateVariantValuesError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateVariantValuesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateVariantValuesError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateVariantValuesError>";
            }
        };
    }
}
