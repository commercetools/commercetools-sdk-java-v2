
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.producttypes.ProductTypeImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request body to import ProductTypes. Contains data for ProductTypes to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeImportRequest productTypeImportRequest = ProductTypeImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-type")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeImportRequestImpl.class)
public interface ProductTypeImportRequest extends ImportRequest {

    /**
     * discriminator value for ProductTypeImportRequest
     */
    String PRODUCT_TYPE = "product-type";

    /**
     *  <p>The product type import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductTypeImport> getResources();

    /**
     *  <p>The product type import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final ProductTypeImport... resources);

    /**
     *  <p>The product type import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<ProductTypeImport> resources);

    /**
     * factory method
     * @return instance of ProductTypeImportRequest
     */
    public static ProductTypeImportRequest of() {
        return new ProductTypeImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeImportRequest of(final ProductTypeImportRequest template) {
        ProductTypeImportRequestImpl instance = new ProductTypeImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public ProductTypeImportRequest copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeImportRequest deepCopy(@Nullable final ProductTypeImportRequest template) {
        if (template == null) {
            return null;
        }
        ProductTypeImportRequestImpl instance = new ProductTypeImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.producttypes.ProductTypeImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTypeImportRequest
     * @return builder
     */
    public static ProductTypeImportRequestBuilder builder() {
        return ProductTypeImportRequestBuilder.of();
    }

    /**
     * create builder for ProductTypeImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeImportRequestBuilder builder(final ProductTypeImportRequest template) {
        return ProductTypeImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeImportRequest(Function<ProductTypeImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeImportRequest>";
            }
        };
    }
}
