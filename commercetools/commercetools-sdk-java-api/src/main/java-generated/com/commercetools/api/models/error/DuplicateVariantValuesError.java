
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String DUPLICATE_VARIANT_VALUES = "DuplicateVariantValues";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"A duplicate combination of the variant values (sku, key, images, prices, attributes) exists."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("variantValues")
    public VariantValues getVariantValues();

    public void setMessage(final String message);

    public void setVariantValues(final VariantValues variantValues);

    public static DuplicateVariantValuesError of() {
        return new DuplicateVariantValuesErrorImpl();
    }

    public static DuplicateVariantValuesError of(final DuplicateVariantValuesError template) {
        DuplicateVariantValuesErrorImpl instance = new DuplicateVariantValuesErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setVariantValues(template.getVariantValues());
        return instance;
    }

    public static DuplicateVariantValuesErrorBuilder builder() {
        return DuplicateVariantValuesErrorBuilder.of();
    }

    public static DuplicateVariantValuesErrorBuilder builder(final DuplicateVariantValuesError template) {
        return DuplicateVariantValuesErrorBuilder.of(template);
    }

    default <T> T withDuplicateVariantValuesError(Function<DuplicateVariantValuesError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateVariantValuesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateVariantValuesError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateVariantValuesError>";
            }
        };
    }
}
