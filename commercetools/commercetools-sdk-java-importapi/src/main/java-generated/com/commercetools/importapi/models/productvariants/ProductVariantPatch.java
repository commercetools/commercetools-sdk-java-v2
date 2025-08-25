
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the data used to update a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantPatch productVariantPatch = ProductVariantPatch.builder()
 *             .productVariant(productVariantBuilder -> productVariantBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantPatchImpl.class)
public interface ProductVariantPatch {

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to update.</p>
     * @return productVariant
     */
    @NotNull
    @Valid
    @JsonProperty("productVariant")
    public ProductVariantKeyReference getProductVariant();

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
     *  <ul>
     *   <li>The referenced Attribute must be defined in an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>, or the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be <code>validationFailed</code>.</li>
     *   <li>Setting the value of a non-required Attribute to <code>null</code> will remove the Attribute.</li>
     *   <li>Attempting to set a <code>null</code> value to a required Attribute will make the import operation fail with an <a href="https://docs.commercetools.com/apis/ctp:import:type:InvalidOperation" rel="nofollow">InvalidOperation</a> error.</li>
     *   <li>Importing <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextAttribute" rel="nofollow">LocalizableTextAttributes</a> or <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextSetAttribute" rel="nofollow">LocalizableTextSetAttributes</a> follows an override pattern, meaning that omitted localized fields will be deleted, new fields will be created, and existing fields will be updated. You can delete localized fields by setting their value to <code>null</code>.</li>
     *  </ul>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public Attributes getAttributes();

    /**
     *  <p>If <code>false</code>, the attribute changes are applied to both <span>current and staged projected representations</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that contains the ProductVariant.</p>
     *  <p>We recommend to set this value to minimize concurrency errors. If set, this field is required for every ProductVariantPatch in the <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatchRequest" rel="nofollow">ProductVariantPatchRequest</a>.</p>
     *  <p>If the referenced Product does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @return product
     */
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to update.</p>
     * @param productVariant value to be set
     */

    public void setProductVariant(final ProductVariantKeyReference productVariant);

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
     *  <ul>
     *   <li>The referenced Attribute must be defined in an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>, or the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be <code>validationFailed</code>.</li>
     *   <li>Setting the value of a non-required Attribute to <code>null</code> will remove the Attribute.</li>
     *   <li>Attempting to set a <code>null</code> value to a required Attribute will make the import operation fail with an <a href="https://docs.commercetools.com/apis/ctp:import:type:InvalidOperation" rel="nofollow">InvalidOperation</a> error.</li>
     *   <li>Importing <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextAttribute" rel="nofollow">LocalizableTextAttributes</a> or <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextSetAttribute" rel="nofollow">LocalizableTextSetAttributes</a> follows an override pattern, meaning that omitted localized fields will be deleted, new fields will be created, and existing fields will be updated. You can delete localized fields by setting their value to <code>null</code>.</li>
     *  </ul>
     * @param attributes value to be set
     */

    public void setAttributes(final Attributes attributes);

    /**
     *  <p>If <code>false</code>, the attribute changes are applied to both <span>current and staged projected representations</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that contains the ProductVariant.</p>
     *  <p>We recommend to set this value to minimize concurrency errors. If set, this field is required for every ProductVariantPatch in the <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatchRequest" rel="nofollow">ProductVariantPatchRequest</a>.</p>
     *  <p>If the referenced Product does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductKeyReference product);

    /**
     * factory method
     * @return instance of ProductVariantPatch
     */
    public static ProductVariantPatch of() {
        return new ProductVariantPatchImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantPatch
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantPatch of(final ProductVariantPatch template) {
        ProductVariantPatchImpl instance = new ProductVariantPatchImpl();
        instance.setProductVariant(template.getProductVariant());
        instance.setAttributes(template.getAttributes());
        instance.setStaged(template.getStaged());
        instance.setProduct(template.getProduct());
        return instance;
    }

    public ProductVariantPatch copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantPatch
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantPatch deepCopy(@Nullable final ProductVariantPatch template) {
        if (template == null) {
            return null;
        }
        ProductVariantPatchImpl instance = new ProductVariantPatchImpl();
        instance.setProductVariant(com.commercetools.importapi.models.common.ProductVariantKeyReference
                .deepCopy(template.getProductVariant()));
        instance.setAttributes(
            com.commercetools.importapi.models.productvariants.Attributes.deepCopy(template.getAttributes()));
        instance.setStaged(template.getStaged());
        instance.setProduct(
            com.commercetools.importapi.models.common.ProductKeyReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for ProductVariantPatch
     * @return builder
     */
    public static ProductVariantPatchBuilder builder() {
        return ProductVariantPatchBuilder.of();
    }

    /**
     * create builder for ProductVariantPatch instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantPatchBuilder builder(final ProductVariantPatch template) {
        return ProductVariantPatchBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantPatch(Function<ProductVariantPatch, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantPatch> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantPatch>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantPatch>";
            }
        };
    }
}
