
package com.commercetools.api.models.variant_attributes;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>A lightweight representation of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product's</a> Variants with only the requested Attributes and minimal availability data. Designed for building attribute selectors on product detail pages (PDPs).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributes variantAttributes = VariantAttributes.builder()
 *             .productId("{productId}")
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .plusVariants(variantsBuilder -> variantsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantAttributesImpl.class)
public interface VariantAttributes {

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return productKey
     */

    @JsonProperty("productKey")
    public String getProductKey();

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<VariantAttributesAttributeMetadata> getAttributes();

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @return variants
     */
    @NotNull
    @Valid
    @JsonProperty("variants")
    public List<VariantAttributesVariant> getVariants();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param productKey value to be set
     */

    public void setProductKey(final String productKey);

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final VariantAttributesAttributeMetadata... attributes);

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<VariantAttributesAttributeMetadata> attributes);

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @param variants values to be set
     */

    @JsonIgnore
    public void setVariants(final VariantAttributesVariant... variants);

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @param variants values to be set
     */

    public void setVariants(final List<VariantAttributesVariant> variants);

    /**
     * factory method
     * @return instance of VariantAttributes
     */
    public static VariantAttributes of() {
        return new VariantAttributesImpl();
    }

    /**
     * factory method to create a shallow copy VariantAttributes
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantAttributes of(final VariantAttributes template) {
        VariantAttributesImpl instance = new VariantAttributesImpl();
        instance.setProductId(template.getProductId());
        instance.setProductKey(template.getProductKey());
        instance.setAttributes(template.getAttributes());
        instance.setVariants(template.getVariants());
        return instance;
    }

    public VariantAttributes copyDeep();

    /**
     * factory method to create a deep copy of VariantAttributes
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantAttributes deepCopy(@Nullable final VariantAttributes template) {
        if (template == null) {
            return null;
        }
        VariantAttributesImpl instance = new VariantAttributesImpl();
        instance.setProductId(template.getProductId());
        instance.setProductKey(template.getProductKey());
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(
                            com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setVariants(Optional.ofNullable(template.getVariants())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.variant_attributes.VariantAttributesVariant::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantAttributes
     * @return builder
     */
    public static VariantAttributesBuilder builder() {
        return VariantAttributesBuilder.of();
    }

    /**
     * create builder for VariantAttributes instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesBuilder builder(final VariantAttributes template) {
        return VariantAttributesBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantAttributes(Function<VariantAttributes, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantAttributes> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantAttributes>() {
            @Override
            public String toString() {
                return "TypeReference<VariantAttributes>";
            }
        };
    }
}
