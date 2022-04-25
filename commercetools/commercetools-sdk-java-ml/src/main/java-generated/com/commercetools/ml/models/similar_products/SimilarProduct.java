
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.ml.models.common.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>One part of a SimilarProductPair. Refers to a specific ProductVariant.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SimilarProductImpl.class)
public interface SimilarProduct {

    /**
    *  <p>Reference to Product</p>
    */
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
    *  <p>ID of the ProductVariant that was compared.</p>
    */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
    *  <p>Supplementary information about the data used for similarity estimation. This information helps you understand the estimated confidence score, but it should not be used to identify a product.</p>
    */
    @Valid
    @JsonProperty("meta")
    public SimilarProductMeta getMeta();

    public void setProduct(final ProductReference product);

    public void setVariantId(final Long variantId);

    public void setMeta(final SimilarProductMeta meta);

    public static SimilarProduct of() {
        return new SimilarProductImpl();
    }

    public static SimilarProduct of(final SimilarProduct template) {
        SimilarProductImpl instance = new SimilarProductImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setMeta(template.getMeta());
        return instance;
    }

    public static SimilarProductBuilder builder() {
        return SimilarProductBuilder.of();
    }

    public static SimilarProductBuilder builder(final SimilarProduct template) {
        return SimilarProductBuilder.of(template);
    }

    default <T> T withSimilarProduct(Function<SimilarProduct, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SimilarProduct> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarProduct>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarProduct>";
            }
        };
    }
}
