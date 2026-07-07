
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
 *  <p>A lightweight reference containing the <code>id</code> and updated <code>version</code> of a Variant after a successful bulk update.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateResource variantBulkUpdateResource = VariantBulkUpdateResource.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantBulkUpdateResourceImpl.class)
public interface VariantBulkUpdateResource {

    /**
     *  <p>Unique identifier of the updated Variant.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The new version of the Variant after the update.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Unique identifier of the updated Variant.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>The new version of the Variant after the update.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * factory method
     * @return instance of VariantBulkUpdateResource
     */
    public static VariantBulkUpdateResource of() {
        return new VariantBulkUpdateResourceImpl();
    }

    /**
     * factory method to create a shallow copy VariantBulkUpdateResource
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantBulkUpdateResource of(final VariantBulkUpdateResource template) {
        VariantBulkUpdateResourceImpl instance = new VariantBulkUpdateResourceImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        return instance;
    }

    public VariantBulkUpdateResource copyDeep();

    /**
     * factory method to create a deep copy of VariantBulkUpdateResource
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantBulkUpdateResource deepCopy(@Nullable final VariantBulkUpdateResource template) {
        if (template == null) {
            return null;
        }
        VariantBulkUpdateResourceImpl instance = new VariantBulkUpdateResourceImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * builder factory method for VariantBulkUpdateResource
     * @return builder
     */
    public static VariantBulkUpdateResourceBuilder builder() {
        return VariantBulkUpdateResourceBuilder.of();
    }

    /**
     * create builder for VariantBulkUpdateResource instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateResourceBuilder builder(final VariantBulkUpdateResource template) {
        return VariantBulkUpdateResourceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantBulkUpdateResource(Function<VariantBulkUpdateResource, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantBulkUpdateResource> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantBulkUpdateResource>() {
            @Override
            public String toString() {
                return "TypeReference<VariantBulkUpdateResource>";
            }
        };
    }
}
