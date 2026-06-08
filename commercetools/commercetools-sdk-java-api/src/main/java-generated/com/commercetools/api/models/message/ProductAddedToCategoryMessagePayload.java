
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.CategoryReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductAddToCategoryAction" rel="nofollow">Add to Category</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddedToCategoryMessagePayload productAddedToCategoryMessagePayload = ProductAddedToCategoryMessagePayload.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductAddedToCategory")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductAddedToCategoryMessagePayloadImpl.class)
public interface ProductAddedToCategoryMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductAddedToCategoryMessagePayload
     */
    String PRODUCT_ADDED_TO_CATEGORY = "ProductAddedToCategory";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> was added to.</p>
     * @return category
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryReference getCategory();

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> was added to.</p>
     * @param category value to be set
     */

    public void setCategory(final CategoryReference category);

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductAddedToCategoryMessagePayload
     */
    public static ProductAddedToCategoryMessagePayload of() {
        return new ProductAddedToCategoryMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductAddedToCategoryMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductAddedToCategoryMessagePayload of(final ProductAddedToCategoryMessagePayload template) {
        ProductAddedToCategoryMessagePayloadImpl instance = new ProductAddedToCategoryMessagePayloadImpl();
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductAddedToCategoryMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductAddedToCategoryMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductAddedToCategoryMessagePayload deepCopy(
            @Nullable final ProductAddedToCategoryMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductAddedToCategoryMessagePayloadImpl instance = new ProductAddedToCategoryMessagePayloadImpl();
        instance.setCategory(com.commercetools.api.models.category.CategoryReference.deepCopy(template.getCategory()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductAddedToCategoryMessagePayload
     * @return builder
     */
    public static ProductAddedToCategoryMessagePayloadBuilder builder() {
        return ProductAddedToCategoryMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductAddedToCategoryMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAddedToCategoryMessagePayloadBuilder builder(
            final ProductAddedToCategoryMessagePayload template) {
        return ProductAddedToCategoryMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductAddedToCategoryMessagePayload(Function<ProductAddedToCategoryMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddedToCategoryMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddedToCategoryMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddedToCategoryMessagePayload>";
            }
        };
    }
}
