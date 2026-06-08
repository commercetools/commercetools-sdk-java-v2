
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.product_selections.ProductSelectionImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request body to <a href="https://docs.commercetools.com/apis/ctp:import:endpoint:/{projectKey}/product-selections/import-containers/{importContainerKey}:POST" rel="nofollow">import Product Selections</a>. Contains data for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selections</a> to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionImportRequest productSelectionImportRequest = ProductSelectionImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-selection")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionImportRequestImpl.class)
public interface ProductSelectionImportRequest extends ImportRequest {

    /**
     * discriminator value for ProductSelectionImportRequest
     */
    String PRODUCT_SELECTION = "product-selection";

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductSelectionImport> getResources();

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final ProductSelectionImport... resources);

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<ProductSelectionImport> resources);

    /**
     * factory method
     * @return instance of ProductSelectionImportRequest
     */
    public static ProductSelectionImportRequest of() {
        return new ProductSelectionImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionImportRequest of(final ProductSelectionImportRequest template) {
        ProductSelectionImportRequestImpl instance = new ProductSelectionImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public ProductSelectionImportRequest copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionImportRequest deepCopy(@Nullable final ProductSelectionImportRequest template) {
        if (template == null) {
            return null;
        }
        ProductSelectionImportRequestImpl instance = new ProductSelectionImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.product_selections.ProductSelectionImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionImportRequest
     * @return builder
     */
    public static ProductSelectionImportRequestBuilder builder() {
        return ProductSelectionImportRequestBuilder.of();
    }

    /**
     * create builder for ProductSelectionImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionImportRequestBuilder builder(final ProductSelectionImportRequest template) {
        return ProductSelectionImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionImportRequest(Function<ProductSelectionImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionImportRequest>";
            }
        };
    }
}
