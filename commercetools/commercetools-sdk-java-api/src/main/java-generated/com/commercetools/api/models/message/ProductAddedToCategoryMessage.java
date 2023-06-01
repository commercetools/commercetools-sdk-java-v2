package com.commercetools.api.models.message;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.ProductAddedToCategoryMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Add To Category update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddedToCategoryMessage productAddedToCategoryMessage = ProductAddedToCategoryMessage.builder()
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductAddedToCategoryMessageImpl.class)
public interface ProductAddedToCategoryMessage extends Message {

    /**
     * discriminator value for ProductAddedToCategoryMessage
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
     * @return instance of ProductAddedToCategoryMessage
     */
    public static ProductAddedToCategoryMessage of(){
        return new ProductAddedToCategoryMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductAddedToCategoryMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductAddedToCategoryMessage of(final ProductAddedToCategoryMessage template) {
        ProductAddedToCategoryMessageImpl instance = new ProductAddedToCategoryMessageImpl();
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
     * factory method to create a deep copy of ProductAddedToCategoryMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductAddedToCategoryMessage deepCopy(@Nullable final ProductAddedToCategoryMessage template) {
        if (template == null) {
            return null;
        }
        ProductAddedToCategoryMessageImpl instance = new ProductAddedToCategoryMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setCategory(com.commercetools.api.models.category.CategoryReference.deepCopy(template.getCategory()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductAddedToCategoryMessage
     * @return builder
     */
    public static ProductAddedToCategoryMessageBuilder builder() {
        return ProductAddedToCategoryMessageBuilder.of();
    }
    
    /**
     * create builder for ProductAddedToCategoryMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAddedToCategoryMessageBuilder builder(final ProductAddedToCategoryMessage template) {
        return ProductAddedToCategoryMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductAddedToCategoryMessage(Function<ProductAddedToCategoryMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddedToCategoryMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddedToCategoryMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddedToCategoryMessage>";
            }
        };
    }
}
