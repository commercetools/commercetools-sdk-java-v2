
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add To Category update action.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductAddedToCategoryMessagePayloadImpl.class)
public interface ProductAddedToCategoryMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductAddedToCategoryMessagePayload
     */
    String PRODUCT_ADDED_TO_CATEGORY = "ProductAddedToCategory";

    /**
     *  <p>Category the Product was added to.</p>
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
     *  <p>Category the Product was added to.</p>
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
     * @return instance of ProductAddedToCategoryMessagePayload
     */
    public static ProductAddedToCategoryMessagePayload of() {
        return new ProductAddedToCategoryMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of ProductAddedToCategoryMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductAddedToCategoryMessagePayload of(final ProductAddedToCategoryMessagePayload template) {
        ProductAddedToCategoryMessagePayloadImpl instance = new ProductAddedToCategoryMessagePayloadImpl();
        instance.setCategory(template.getCategory());
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
