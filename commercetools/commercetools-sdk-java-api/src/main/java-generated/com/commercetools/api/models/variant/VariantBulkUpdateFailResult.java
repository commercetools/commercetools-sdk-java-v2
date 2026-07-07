
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Result for a Variant that failed to update in a bulk update request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateFailResult variantBulkUpdateFailResult = VariantBulkUpdateFailResult.builder()
 *             .plusErrors(errorsBuilder -> errorsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Fail")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantBulkUpdateFailResultImpl.class)
public interface VariantBulkUpdateFailResult extends VariantBulkUpdateResult {

    /**
     * discriminator value for VariantBulkUpdateFailResult
     */
    String FAIL = "Fail";

    /**
     *  <p>Errors that caused the update to fail for this Variant.</p>
     * @return errors
     */
    @NotNull
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
     *  <p>Errors that caused the update to fail for this Variant.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    /**
     *  <p>Errors that caused the update to fail for this Variant.</p>
     * @param errors values to be set
     */

    public void setErrors(final List<ErrorObject> errors);

    /**
     * factory method
     * @return instance of VariantBulkUpdateFailResult
     */
    public static VariantBulkUpdateFailResult of() {
        return new VariantBulkUpdateFailResultImpl();
    }

    /**
     * factory method to create a shallow copy VariantBulkUpdateFailResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantBulkUpdateFailResult of(final VariantBulkUpdateFailResult template) {
        VariantBulkUpdateFailResultImpl instance = new VariantBulkUpdateFailResultImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public VariantBulkUpdateFailResult copyDeep();

    /**
     * factory method to create a deep copy of VariantBulkUpdateFailResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantBulkUpdateFailResult deepCopy(@Nullable final VariantBulkUpdateFailResult template) {
        if (template == null) {
            return null;
        }
        VariantBulkUpdateFailResultImpl instance = new VariantBulkUpdateFailResultImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.error.ErrorObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantBulkUpdateFailResult
     * @return builder
     */
    public static VariantBulkUpdateFailResultBuilder builder() {
        return VariantBulkUpdateFailResultBuilder.of();
    }

    /**
     * create builder for VariantBulkUpdateFailResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateFailResultBuilder builder(final VariantBulkUpdateFailResult template) {
        return VariantBulkUpdateFailResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantBulkUpdateFailResult(Function<VariantBulkUpdateFailResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantBulkUpdateFailResult> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantBulkUpdateFailResult>() {
            @Override
            public String toString() {
                return "TypeReference<VariantBulkUpdateFailResult>";
            }
        };
    }
}
