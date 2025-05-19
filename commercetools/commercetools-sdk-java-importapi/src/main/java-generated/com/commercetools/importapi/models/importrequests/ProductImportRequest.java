
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.products.ProductImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request body to import Products. Contains data for Products to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductImportRequest productImportRequest = ProductImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductImportRequestImpl.class)
public interface ProductImportRequest extends ImportRequest {

    /**
     * discriminator value for ProductImportRequest
     */
    String PRODUCT = "product";

    /**
     *  <p>The product import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductImport> getResources();

    /**
     *  <p>The product import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final ProductImport... resources);

    /**
     *  <p>The product import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<ProductImport> resources);

    /**
     * factory method
     * @return instance of ProductImportRequest
     */
    public static ProductImportRequest of() {
        return new ProductImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy ProductImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductImportRequest of(final ProductImportRequest template) {
        ProductImportRequestImpl instance = new ProductImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public ProductImportRequest copyDeep();

    /**
     * factory method to create a deep copy of ProductImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductImportRequest deepCopy(@Nullable final ProductImportRequest template) {
        if (template == null) {
            return null;
        }
        ProductImportRequestImpl instance = new ProductImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.products.ProductImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductImportRequest
     * @return builder
     */
    public static ProductImportRequestBuilder builder() {
        return ProductImportRequestBuilder.of();
    }

    /**
     * create builder for ProductImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductImportRequestBuilder builder(final ProductImportRequest template) {
        return ProductImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductImportRequest(Function<ProductImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductImportRequest>";
            }
        };
    }
}
