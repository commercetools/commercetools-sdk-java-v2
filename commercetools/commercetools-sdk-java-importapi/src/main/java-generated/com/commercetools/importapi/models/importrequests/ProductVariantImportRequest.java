
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.productvariants.ProductVariantImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The request body to <a href="#import-productvariants">import ProductVariants</a>. Contains data for <a href="/../api/projects/products#productvariant">ProductVariants</a> to be created or updated in a commercetools Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantImportRequestImpl.class)
public interface ProductVariantImportRequest extends ImportRequest {

    String PRODUCT_VARIANT = "product-variant";

    /**
    *  <p>The product variant import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductVariantImport> getResources();

    @JsonIgnore
    public void setResources(final ProductVariantImport... resources);

    public void setResources(final List<ProductVariantImport> resources);

    public static ProductVariantImportRequest of() {
        return new ProductVariantImportRequestImpl();
    }

    public static ProductVariantImportRequest of(final ProductVariantImportRequest template) {
        ProductVariantImportRequestImpl instance = new ProductVariantImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static ProductVariantImportRequestBuilder builder() {
        return ProductVariantImportRequestBuilder.of();
    }

    public static ProductVariantImportRequestBuilder builder(final ProductVariantImportRequest template) {
        return ProductVariantImportRequestBuilder.of(template);
    }

    default <T> T withProductVariantImportRequest(Function<ProductVariantImportRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantImportRequest>";
            }
        };
    }
}
