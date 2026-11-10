
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Represents the result of a single Variant update within a bulk update request. Use <code>status</code> to determine whether the update succeeded or failed.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateResult variantBulkUpdateResult = VariantBulkUpdateResult.failBuilder()
 *             plusErrors(errorsBuilder -> errorsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "status", defaultImpl = VariantBulkUpdateResultImpl.class, visible = true)
@JsonDeserialize(as = VariantBulkUpdateResultImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface VariantBulkUpdateResult {

    /**
     *  <p>Unique identifier of the Variant from the request. Present when the Variant was identified by <code>id</code>.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the Variant from the request. Present when the Variant was identified by <code>key</code>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Indicates whether the update succeeded or failed.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public String getStatus();

    /**
     *  <p>Unique identifier of the Variant from the request. Present when the Variant was identified by <code>id</code>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the Variant from the request. Present when the Variant was identified by <code>key</code>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    public VariantBulkUpdateResult copyDeep();

    /**
     * factory method to create a deep copy of VariantBulkUpdateResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantBulkUpdateResult deepCopy(@Nullable final VariantBulkUpdateResult template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof VariantBulkUpdateResultImpl)) {
            return template.copyDeep();
        }
        VariantBulkUpdateResultImpl instance = new VariantBulkUpdateResultImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder for fail subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantBulkUpdateFailResultBuilder failBuilder() {
        return com.commercetools.api.models.variant.VariantBulkUpdateFailResultBuilder.of();
    }

    /**
     * builder for success subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantBulkUpdateSuccessResultBuilder successBuilder() {
        return com.commercetools.api.models.variant.VariantBulkUpdateSuccessResultBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantBulkUpdateResult(Function<VariantBulkUpdateResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantBulkUpdateResult> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantBulkUpdateResult>() {
            @Override
            public String toString() {
                return "TypeReference<VariantBulkUpdateResult>";
            }
        };
    }
}
