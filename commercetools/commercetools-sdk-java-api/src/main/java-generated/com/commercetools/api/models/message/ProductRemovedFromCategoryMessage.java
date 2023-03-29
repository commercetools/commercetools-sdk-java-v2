
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
 *     ProductRemovedFromCategoryMessage productRemovedFromCategoryMessage = ProductRemovedFromCategoryMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .category(categoryBuilder -> categoryBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemovedFromCategoryMessageImpl.class)
public interface ProductRemovedFromCategoryMessage extends Message {

    /**
     * discriminator value for ProductRemovedFromCategoryMessage
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
     * @return instance of ProductRemovedFromCategoryMessage
     */
    public static ProductRemovedFromCategoryMessage of() {
        return new ProductRemovedFromCategoryMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductRemovedFromCategoryMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRemovedFromCategoryMessage of(final ProductRemovedFromCategoryMessage template) {
        ProductRemovedFromCategoryMessageImpl instance = new ProductRemovedFromCategoryMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductRemovedFromCategoryMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRemovedFromCategoryMessage deepCopy(
            @Nullable final ProductRemovedFromCategoryMessage template) {
        if (template == null) {
            return null;
        }
        ProductRemovedFromCategoryMessageImpl instance = new ProductRemovedFromCategoryMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setCategory(Optional.ofNullable(template.getCategory())
                .map(com.commercetools.api.models.category.CategoryReference::deepCopy)
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductRemovedFromCategoryMessage
     * @return builder
     */
    public static ProductRemovedFromCategoryMessageBuilder builder() {
        return ProductRemovedFromCategoryMessageBuilder.of();
    }

    /**
     * create builder for ProductRemovedFromCategoryMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemovedFromCategoryMessageBuilder builder(final ProductRemovedFromCategoryMessage template) {
        return ProductRemovedFromCategoryMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRemovedFromCategoryMessage(Function<ProductRemovedFromCategoryMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemovedFromCategoryMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemovedFromCategoryMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemovedFromCategoryMessage>";
            }
        };
    }
}
