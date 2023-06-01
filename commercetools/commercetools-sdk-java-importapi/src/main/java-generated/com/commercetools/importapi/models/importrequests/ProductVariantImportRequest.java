package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.productvariants.ProductVariantImport;
import com.commercetools.importapi.models.importrequests.ProductVariantImportRequestImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>The request body to import ProductVariants. Contains data for ProductVariants to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantImportRequest productVariantImportRequest = ProductVariantImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantImportRequestImpl.class)
public interface ProductVariantImportRequest extends ImportRequest {

    /**
     * discriminator value for ProductVariantImportRequest
     */
    String PRODUCT_VARIANT = "product-variant";

    /**
     *  <p>The product variant import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductVariantImport> getResources();

    /**
     *  <p>The product variant import resources of this request.</p>
     * @param resources values to be set
     */
    
    @JsonIgnore
    public void setResources(final ProductVariantImport ...resources);
    /**
     *  <p>The product variant import resources of this request.</p>
     * @param resources values to be set
     */
    
    public void setResources(final List<ProductVariantImport> resources);

    /**
     * factory method
     * @return instance of ProductVariantImportRequest
     */
    public static ProductVariantImportRequest of(){
        return new ProductVariantImportRequestImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductVariantImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantImportRequest of(final ProductVariantImportRequest template) {
        ProductVariantImportRequestImpl instance = new ProductVariantImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantImportRequest deepCopy(@Nullable final ProductVariantImportRequest template) {
        if (template == null) {
            return null;
        }
        ProductVariantImportRequestImpl instance = new ProductVariantImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream().map(com.commercetools.importapi.models.productvariants.ProductVariantImport::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantImportRequest
     * @return builder
     */
    public static ProductVariantImportRequestBuilder builder() {
        return ProductVariantImportRequestBuilder.of();
    }
    
    /**
     * create builder for ProductVariantImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantImportRequestBuilder builder(final ProductVariantImportRequest template) {
        return ProductVariantImportRequestBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantImportRequest(Function<ProductVariantImportRequest, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantImportRequest>";
            }
        };
    }
}
