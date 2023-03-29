
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The product variant that contains the image.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariant productVariant = ProductVariant.builder()
 *             .product(productBuilder -> productBuilder)
 *             .staged(true)
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantImpl.class)
public interface ProductVariant {

    /**
     *  <p>The product that contains this variant.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>The state of the product variant.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The id of the product variant.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p>The product that contains this variant.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>The state of the product variant.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>The id of the product variant.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     * factory method
     * @return instance of ProductVariant
     */
    public static ProductVariant of() {
        return new ProductVariantImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariant
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariant of(final ProductVariant template) {
        ProductVariantImpl instance = new ProductVariantImpl();
        instance.setProduct(template.getProduct());
        instance.setStaged(template.getStaged());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariant
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariant deepCopy(@Nullable final ProductVariant template) {
        if (template == null) {
            return null;
        }
        ProductVariantImpl instance = new ProductVariantImpl();
        instance.setProduct(com.commercetools.ml.models.common.ProductReference.deepCopy(template.getProduct()));
        instance.setStaged(template.getStaged());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    /**
     * builder factory method for ProductVariant
     * @return builder
     */
    public static ProductVariantBuilder builder() {
        return ProductVariantBuilder.of();
    }

    /**
     * create builder for ProductVariant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantBuilder builder(final ProductVariant template) {
        return ProductVariantBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariant(Function<ProductVariant, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariant> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariant>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariant>";
            }
        };
    }
}
