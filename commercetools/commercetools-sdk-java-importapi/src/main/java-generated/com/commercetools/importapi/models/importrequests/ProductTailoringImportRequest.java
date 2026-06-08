
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.product_tailoring.ProductTailoringImport;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>The request body to <a href="https://docs.commercetools.com/apis/ctp:import:endpoint:/{projectKey}/product-tailorings/import-containers/{importContainerKey}:POST" rel="nofollow">import Product Tailoring</a>. Contains data for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringImportRequest productTailoringImportRequest = ProductTailoringImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-tailoring")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringImportRequestImpl.class)
public interface ProductTailoringImportRequest extends ImportRequest {

    /**
     * discriminator value for ProductTailoringImportRequest
     */
    String PRODUCT_TAILORING = "product-tailoring";

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductTailoringImport> getResources();

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final ProductTailoringImport... resources);

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<ProductTailoringImport> resources);

    /**
     * factory method
     * @return instance of ProductTailoringImportRequest
     */
    public static ProductTailoringImportRequest of() {
        return new ProductTailoringImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringImportRequest of(final ProductTailoringImportRequest template) {
        ProductTailoringImportRequestImpl instance = new ProductTailoringImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public ProductTailoringImportRequest copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringImportRequest deepCopy(@Nullable final ProductTailoringImportRequest template) {
        if (template == null) {
            return null;
        }
        ProductTailoringImportRequestImpl instance = new ProductTailoringImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.product_tailoring.ProductTailoringImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringImportRequest
     * @return builder
     */
    public static ProductTailoringImportRequestBuilder builder() {
        return ProductTailoringImportRequestBuilder.of();
    }

    /**
     * create builder for ProductTailoringImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringImportRequestBuilder builder(final ProductTailoringImportRequest template) {
        return ProductTailoringImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringImportRequest(Function<ProductTailoringImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ProductTailoringImportRequest> typeReference() {
        return new tools.jackson.core.type.TypeReference<ProductTailoringImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringImportRequest>";
            }
        };
    }
}
