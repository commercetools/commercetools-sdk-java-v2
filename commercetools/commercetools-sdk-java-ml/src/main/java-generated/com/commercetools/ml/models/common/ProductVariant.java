
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The product variant that contains the image.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantImpl.class)
public interface ProductVariant {

    /**
    *  <p>The product that contains this variant.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
    *  <p>The state of the product variant.</p>
    */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
    *  <p>The id of the product variant.</p>
    */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    public void setProduct(final ProductReference product);

    public void setStaged(final Boolean staged);

    public void setVariantId(final Integer variantId);

    public static ProductVariant of() {
        return new ProductVariantImpl();
    }

    public static ProductVariant of(final ProductVariant template) {
        ProductVariantImpl instance = new ProductVariantImpl();
        instance.setProduct(template.getProduct());
        instance.setStaged(template.getStaged());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    public static ProductVariantBuilder builder() {
        return ProductVariantBuilder.of();
    }

    public static ProductVariantBuilder builder(final ProductVariant template) {
        return ProductVariantBuilder.of(template);
    }

    default <T> T withProductVariant(Function<ProductVariant, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariant> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariant>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariant>";
            }
        };
    }
}
