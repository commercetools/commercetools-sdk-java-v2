package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.message.ProductDeletedMessageImpl;

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
 *  <p>Generated after a successful Delete Product request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDeletedMessage productDeletedMessage = ProductDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductDeletedMessageImpl.class)
public interface ProductDeletedMessage extends Message {

    /**
     * discriminator value for ProductDeletedMessage
     */
    String PRODUCT_DELETED = "ProductDeleted";

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @return removedImageUrls
     */
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();
    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     * @return currentProjection
     */
    @Valid
    @JsonProperty("currentProjection")
    public ProductProjection getCurrentProjection();

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @param removedImageUrls values to be set
     */
    
    @JsonIgnore
    public void setRemovedImageUrls(final String ...removedImageUrls);
    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @param removedImageUrls values to be set
     */
    
    public void setRemovedImageUrls(final List<String> removedImageUrls);
    
    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     * @param currentProjection value to be set
     */
    
    public void setCurrentProjection(final ProductProjection currentProjection);
    

    /**
     * factory method
     * @return instance of ProductDeletedMessage
     */
    public static ProductDeletedMessage of(){
        return new ProductDeletedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDeletedMessage of(final ProductDeletedMessage template) {
        ProductDeletedMessageImpl instance = new ProductDeletedMessageImpl();
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
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        instance.setCurrentProjection(template.getCurrentProjection());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDeletedMessage deepCopy(@Nullable final ProductDeletedMessage template) {
        if (template == null) {
            return null;
        }
        ProductDeletedMessageImpl instance = new ProductDeletedMessageImpl();
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
        instance.setRemovedImageUrls(Optional.ofNullable(template.getRemovedImageUrls())
                .map(ArrayList::new)
                .orElse(null));
        instance.setCurrentProjection(com.commercetools.api.models.product.ProductProjection.deepCopy(template.getCurrentProjection()));
        return instance;
    }

    /**
     * builder factory method for ProductDeletedMessage
     * @return builder
     */
    public static ProductDeletedMessageBuilder builder() {
        return ProductDeletedMessageBuilder.of();
    }
    
    /**
     * create builder for ProductDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDeletedMessageBuilder builder(final ProductDeletedMessage template) {
        return ProductDeletedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDeletedMessage(Function<ProductDeletedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDeletedMessage>";
            }
        };
    }
}
