
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove From Category update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemovedFromCategoryMessagePayload productRemovedFromCategoryMessagePayload = ProductRemovedFromCategoryMessagePayload.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemovedFromCategoryMessagePayloadImpl.class)
public interface ProductRemovedFromCategoryMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductRemovedFromCategoryMessagePayload
     */
    String PRODUCT_REMOVED_FROM_CATEGORY = "ProductRemovedFromCategory";

    /**
     *  <p>Category the Product was removed from.</p>
     * @return category
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryReference getCategory();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Category the Product was removed from.</p>
     * @param category value to be set
     */

    public void setCategory(final CategoryReference category);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductRemovedFromCategoryMessagePayload
     */
    public static ProductRemovedFromCategoryMessagePayload of() {
        return new ProductRemovedFromCategoryMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductRemovedFromCategoryMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRemovedFromCategoryMessagePayload of(final ProductRemovedFromCategoryMessagePayload template) {
        ProductRemovedFromCategoryMessagePayloadImpl instance = new ProductRemovedFromCategoryMessagePayloadImpl();
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductRemovedFromCategoryMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRemovedFromCategoryMessagePayload deepCopy(
            @Nullable final ProductRemovedFromCategoryMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductRemovedFromCategoryMessagePayloadImpl instance = new ProductRemovedFromCategoryMessagePayloadImpl();
        instance.setCategory(Optional.ofNullable(template.getCategory())
                .map(com.commercetools.api.models.category.CategoryReference::deepCopy)
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductRemovedFromCategoryMessagePayload
     * @return builder
     */
    public static ProductRemovedFromCategoryMessagePayloadBuilder builder() {
        return ProductRemovedFromCategoryMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductRemovedFromCategoryMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemovedFromCategoryMessagePayloadBuilder builder(
            final ProductRemovedFromCategoryMessagePayload template) {
        return ProductRemovedFromCategoryMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRemovedFromCategoryMessagePayload(
            Function<ProductRemovedFromCategoryMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemovedFromCategoryMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemovedFromCategoryMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemovedFromCategoryMessagePayload>";
            }
        };
    }
}
