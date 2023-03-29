
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Publish update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPublishedMessage productPublishedMessage = ProductPublishedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .productProjection(productProjectionBuilder -> productProjectionBuilder)
 *             .scope(ProductPublishScope.ALL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPublishedMessageImpl.class)
public interface ProductPublishedMessage extends Message {

    /**
     * discriminator value for ProductPublishedMessage
     */
    String PRODUCT_PUBLISHED = "ProductPublished";

    /**
     *  <p>List of image URLs which were removed during the Publish update action.</p>
     * @return removedImageUrls
     */
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    /**
     *  <p>Current Product Projection of the Product at the time of creation.</p>
     * @return productProjection
     */
    @NotNull
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    /**
     *  <p>Publishing Scope that was used during the Publish update action.</p>
     * @return scope
     */
    @NotNull
    @JsonProperty("scope")
    public ProductPublishScope getScope();

    /**
     *  <p>List of image URLs which were removed during the Publish update action.</p>
     * @param removedImageUrls values to be set
     */

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    /**
     *  <p>List of image URLs which were removed during the Publish update action.</p>
     * @param removedImageUrls values to be set
     */

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    /**
     *  <p>Current Product Projection of the Product at the time of creation.</p>
     * @param productProjection value to be set
     */

    public void setProductProjection(final ProductProjection productProjection);

    /**
     *  <p>Publishing Scope that was used during the Publish update action.</p>
     * @param scope value to be set
     */

    public void setScope(final ProductPublishScope scope);

    /**
     * factory method
     * @return instance of ProductPublishedMessage
     */
    public static ProductPublishedMessage of() {
        return new ProductPublishedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductPublishedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPublishedMessage of(final ProductPublishedMessage template) {
        ProductPublishedMessageImpl instance = new ProductPublishedMessageImpl();
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
        instance.setProductProjection(template.getProductProjection());
        instance.setScope(template.getScope());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPublishedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPublishedMessage deepCopy(@Nullable final ProductPublishedMessage template) {
        if (template == null) {
            return null;
        }
        ProductPublishedMessageImpl instance = new ProductPublishedMessageImpl();
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
        instance.setRemovedImageUrls(
            Optional.ofNullable(template.getRemovedImageUrls()).map(ArrayList::new).orElse(null));
        instance.setProductProjection(Optional.ofNullable(template.getProductProjection())
                .map(com.commercetools.api.models.product.ProductProjection::deepCopy)
                .orElse(null));
        instance.setScope(template.getScope());
        return instance;
    }

    /**
     * builder factory method for ProductPublishedMessage
     * @return builder
     */
    public static ProductPublishedMessageBuilder builder() {
        return ProductPublishedMessageBuilder.of();
    }

    /**
     * create builder for ProductPublishedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPublishedMessageBuilder builder(final ProductPublishedMessage template) {
        return ProductPublishedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPublishedMessage(Function<ProductPublishedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPublishedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPublishedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPublishedMessage>";
            }
        };
    }
}
