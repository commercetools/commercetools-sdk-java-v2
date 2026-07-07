
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.variants.VariantImport;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>The request body to <a href="https://docs.commercetools.com/apis/ctp:import:endpoint:/{projectKey}/variants/import-containers/{importContainerKey}:POST" rel="nofollow">import Variants</a>. Contains data for Variants to be created or updated in a Project.</p>
 *  <p>This import resource is only available for Projects with <code>productCatalogModel</code> set to <code>Modular</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantImportRequest variantImportRequest = VariantImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("variant")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantImportRequestImpl.class)
public interface VariantImportRequest extends ImportRequest {

    /**
     * discriminator value for VariantImportRequest
     */
    String VARIANT = "variant";

    /**
     *  <p>The Variant import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<VariantImport> getResources();

    /**
     *  <p>The Variant import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final VariantImport... resources);

    /**
     *  <p>The Variant import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<VariantImport> resources);

    /**
     * factory method
     * @return instance of VariantImportRequest
     */
    public static VariantImportRequest of() {
        return new VariantImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy VariantImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantImportRequest of(final VariantImportRequest template) {
        VariantImportRequestImpl instance = new VariantImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public VariantImportRequest copyDeep();

    /**
     * factory method to create a deep copy of VariantImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantImportRequest deepCopy(@Nullable final VariantImportRequest template) {
        if (template == null) {
            return null;
        }
        VariantImportRequestImpl instance = new VariantImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.variants.VariantImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantImportRequest
     * @return builder
     */
    public static VariantImportRequestBuilder builder() {
        return VariantImportRequestBuilder.of();
    }

    /**
     * create builder for VariantImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantImportRequestBuilder builder(final VariantImportRequest template) {
        return VariantImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantImportRequest(Function<VariantImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantImportRequest> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<VariantImportRequest>";
            }
        };
    }
}
