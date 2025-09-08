
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.productdrafts.ProductDraftImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request body to <a href="https://docs.commercetools.com/apis/ctp:import:endpoint:/{projectKey}/product-drafts/import-containers/{importContainerKey}:POST" rel="nofollow">import ProductDrafts</a>. Contains data for <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDraftImportRequest productDraftImportRequest = ProductDraftImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-draft")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDraftImportRequestImpl.class)
public interface ProductDraftImportRequest extends ImportRequest {

    /**
     * discriminator value for ProductDraftImportRequest
     */
    String PRODUCT_DRAFT = "product-draft";

    /**
     *  <p>The product draft import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductDraftImport> getResources();

    /**
     *  <p>The product draft import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final ProductDraftImport... resources);

    /**
     *  <p>The product draft import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<ProductDraftImport> resources);

    /**
     * factory method
     * @return instance of ProductDraftImportRequest
     */
    public static ProductDraftImportRequest of() {
        return new ProductDraftImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy ProductDraftImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDraftImportRequest of(final ProductDraftImportRequest template) {
        ProductDraftImportRequestImpl instance = new ProductDraftImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public ProductDraftImportRequest copyDeep();

    /**
     * factory method to create a deep copy of ProductDraftImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDraftImportRequest deepCopy(@Nullable final ProductDraftImportRequest template) {
        if (template == null) {
            return null;
        }
        ProductDraftImportRequestImpl instance = new ProductDraftImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.productdrafts.ProductDraftImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductDraftImportRequest
     * @return builder
     */
    public static ProductDraftImportRequestBuilder builder() {
        return ProductDraftImportRequestBuilder.of();
    }

    /**
     * create builder for ProductDraftImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDraftImportRequestBuilder builder(final ProductDraftImportRequest template) {
        return ProductDraftImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDraftImportRequest(Function<ProductDraftImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDraftImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDraftImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDraftImportRequest>";
            }
        };
    }
}
