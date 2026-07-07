
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Result for a Variant that was successfully updated in a bulk update request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateSuccessResult variantBulkUpdateSuccessResult = VariantBulkUpdateSuccessResult.builder()
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Success")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantBulkUpdateSuccessResultImpl.class)
public interface VariantBulkUpdateSuccessResult extends VariantBulkUpdateResult {

    /**
     * discriminator value for VariantBulkUpdateSuccessResult
     */
    String SUCCESS = "Success";

    /**
     *  <p>A lightweight reference containing the <code>id</code> and updated <code>version</code> of the Variant.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public VariantBulkUpdateResource getResource();

    /**
     *  <p>A lightweight reference containing the <code>id</code> and updated <code>version</code> of the Variant.</p>
     * @param resource value to be set
     */

    public void setResource(final VariantBulkUpdateResource resource);

    /**
     * factory method
     * @return instance of VariantBulkUpdateSuccessResult
     */
    public static VariantBulkUpdateSuccessResult of() {
        return new VariantBulkUpdateSuccessResultImpl();
    }

    /**
     * factory method to create a shallow copy VariantBulkUpdateSuccessResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantBulkUpdateSuccessResult of(final VariantBulkUpdateSuccessResult template) {
        VariantBulkUpdateSuccessResultImpl instance = new VariantBulkUpdateSuccessResultImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setResource(template.getResource());
        return instance;
    }

    public VariantBulkUpdateSuccessResult copyDeep();

    /**
     * factory method to create a deep copy of VariantBulkUpdateSuccessResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantBulkUpdateSuccessResult deepCopy(@Nullable final VariantBulkUpdateSuccessResult template) {
        if (template == null) {
            return null;
        }
        VariantBulkUpdateSuccessResultImpl instance = new VariantBulkUpdateSuccessResultImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setResource(
            com.commercetools.api.models.variant.VariantBulkUpdateResource.deepCopy(template.getResource()));
        return instance;
    }

    /**
     * builder factory method for VariantBulkUpdateSuccessResult
     * @return builder
     */
    public static VariantBulkUpdateSuccessResultBuilder builder() {
        return VariantBulkUpdateSuccessResultBuilder.of();
    }

    /**
     * create builder for VariantBulkUpdateSuccessResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateSuccessResultBuilder builder(final VariantBulkUpdateSuccessResult template) {
        return VariantBulkUpdateSuccessResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantBulkUpdateSuccessResult(Function<VariantBulkUpdateSuccessResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantBulkUpdateSuccessResult> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantBulkUpdateSuccessResult>() {
            @Override
            public String toString() {
                return "TypeReference<VariantBulkUpdateSuccessResult>";
            }
        };
    }
}
