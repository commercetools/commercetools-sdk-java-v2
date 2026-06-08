
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRevertStagedChangesAction" rel="nofollow">Revert Staged Changes</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRevertedStagedChangesMessage productRevertedStagedChangesMessage = ProductRevertedStagedChangesMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("ProductRevertedStagedChanges")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRevertedStagedChangesMessageImpl.class)
public interface ProductRevertedStagedChangesMessage extends Message {

    /**
     * discriminator value for ProductRevertedStagedChangesMessage
     */
    String PRODUCT_REVERTED_STAGED_CHANGES = "ProductRevertedStagedChanges";

    /**
     *  <p>List of image URLs that were removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRevertStagedChangesAction" rel="nofollow">Revert Staged Changes</a> update action.</p>
     * @return removedImageUrls
     */
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    /**
     *  <p>List of image URLs that were removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRevertStagedChangesAction" rel="nofollow">Revert Staged Changes</a> update action.</p>
     * @param removedImageUrls values to be set
     */

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    /**
     *  <p>List of image URLs that were removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRevertStagedChangesAction" rel="nofollow">Revert Staged Changes</a> update action.</p>
     * @param removedImageUrls values to be set
     */

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    /**
     * factory method
     * @return instance of ProductRevertedStagedChangesMessage
     */
    public static ProductRevertedStagedChangesMessage of() {
        return new ProductRevertedStagedChangesMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductRevertedStagedChangesMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRevertedStagedChangesMessage of(final ProductRevertedStagedChangesMessage template) {
        ProductRevertedStagedChangesMessageImpl instance = new ProductRevertedStagedChangesMessageImpl();
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
        return instance;
    }

    public ProductRevertedStagedChangesMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductRevertedStagedChangesMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRevertedStagedChangesMessage deepCopy(
            @Nullable final ProductRevertedStagedChangesMessage template) {
        if (template == null) {
            return null;
        }
        ProductRevertedStagedChangesMessageImpl instance = new ProductRevertedStagedChangesMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setRemovedImageUrls(
            Optional.ofNullable(template.getRemovedImageUrls()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductRevertedStagedChangesMessage
     * @return builder
     */
    public static ProductRevertedStagedChangesMessageBuilder builder() {
        return ProductRevertedStagedChangesMessageBuilder.of();
    }

    /**
     * create builder for ProductRevertedStagedChangesMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRevertedStagedChangesMessageBuilder builder(
            final ProductRevertedStagedChangesMessage template) {
        return ProductRevertedStagedChangesMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRevertedStagedChangesMessage(Function<ProductRevertedStagedChangesMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRevertedStagedChangesMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRevertedStagedChangesMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRevertedStagedChangesMessage>";
            }
        };
    }
}
