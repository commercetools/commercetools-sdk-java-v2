package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.productvariants.ProductVariantPatch;
import com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestImpl;

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
 *  <p>The request body to import ProductVariantPatches. The data to be imported are represented by ProductVariantPatch.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantPatchRequest productVariantPatchRequest = ProductVariantPatchRequest.builder()
 *             .plusPatches(patchesBuilder -> patchesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantPatchRequestImpl.class)
public interface ProductVariantPatchRequest extends ImportRequest {

    /**
     * discriminator value for ProductVariantPatchRequest
     */
    String PRODUCT_VARIANT_PATCH = "product-variant-patch";

    /**
     *  <p>The product variant patches of this request.</p>
     * @return patches
     */
    @NotNull
    @Valid
    @JsonProperty("patches")
    public List<ProductVariantPatch> getPatches();

    /**
     *  <p>The product variant patches of this request.</p>
     * @param patches values to be set
     */
    
    @JsonIgnore
    public void setPatches(final ProductVariantPatch ...patches);
    /**
     *  <p>The product variant patches of this request.</p>
     * @param patches values to be set
     */
    
    public void setPatches(final List<ProductVariantPatch> patches);

    /**
     * factory method
     * @return instance of ProductVariantPatchRequest
     */
    public static ProductVariantPatchRequest of(){
        return new ProductVariantPatchRequestImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductVariantPatchRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantPatchRequest of(final ProductVariantPatchRequest template) {
        ProductVariantPatchRequestImpl instance = new ProductVariantPatchRequestImpl();
        instance.setPatches(template.getPatches());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantPatchRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantPatchRequest deepCopy(@Nullable final ProductVariantPatchRequest template) {
        if (template == null) {
            return null;
        }
        ProductVariantPatchRequestImpl instance = new ProductVariantPatchRequestImpl();
        instance.setPatches(Optional.ofNullable(template.getPatches())
                .map(t -> t.stream().map(com.commercetools.importapi.models.productvariants.ProductVariantPatch::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantPatchRequest
     * @return builder
     */
    public static ProductVariantPatchRequestBuilder builder() {
        return ProductVariantPatchRequestBuilder.of();
    }
    
    /**
     * create builder for ProductVariantPatchRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantPatchRequestBuilder builder(final ProductVariantPatchRequest template) {
        return ProductVariantPatchRequestBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantPatchRequest(Function<ProductVariantPatchRequest, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantPatchRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantPatchRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantPatchRequest>";
            }
        };
    }
}
