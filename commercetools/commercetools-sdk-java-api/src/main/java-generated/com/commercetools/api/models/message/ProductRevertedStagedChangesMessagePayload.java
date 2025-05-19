
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
 *  <p>Generated after a successful Revert Staged Changes update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRevertedStagedChangesMessagePayload productRevertedStagedChangesMessagePayload = ProductRevertedStagedChangesMessagePayload.builder()
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductRevertedStagedChanges")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRevertedStagedChangesMessagePayloadImpl.class)
public interface ProductRevertedStagedChangesMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductRevertedStagedChangesMessagePayload
     */
    String PRODUCT_REVERTED_STAGED_CHANGES = "ProductRevertedStagedChanges";

    /**
     *  <p>List of image URLs that were removed during the Revert Staged Changes update action.</p>
     * @return removedImageUrls
     */
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    /**
     *  <p>List of image URLs that were removed during the Revert Staged Changes update action.</p>
     * @param removedImageUrls values to be set
     */

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    /**
     *  <p>List of image URLs that were removed during the Revert Staged Changes update action.</p>
     * @param removedImageUrls values to be set
     */

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    /**
     * factory method
     * @return instance of ProductRevertedStagedChangesMessagePayload
     */
    public static ProductRevertedStagedChangesMessagePayload of() {
        return new ProductRevertedStagedChangesMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductRevertedStagedChangesMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRevertedStagedChangesMessagePayload of(
            final ProductRevertedStagedChangesMessagePayload template) {
        ProductRevertedStagedChangesMessagePayloadImpl instance = new ProductRevertedStagedChangesMessagePayloadImpl();
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

    public ProductRevertedStagedChangesMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductRevertedStagedChangesMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRevertedStagedChangesMessagePayload deepCopy(
            @Nullable final ProductRevertedStagedChangesMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductRevertedStagedChangesMessagePayloadImpl instance = new ProductRevertedStagedChangesMessagePayloadImpl();
        instance.setRemovedImageUrls(
            Optional.ofNullable(template.getRemovedImageUrls()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductRevertedStagedChangesMessagePayload
     * @return builder
     */
    public static ProductRevertedStagedChangesMessagePayloadBuilder builder() {
        return ProductRevertedStagedChangesMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductRevertedStagedChangesMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRevertedStagedChangesMessagePayloadBuilder builder(
            final ProductRevertedStagedChangesMessagePayload template) {
        return ProductRevertedStagedChangesMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRevertedStagedChangesMessagePayload(
            Function<ProductRevertedStagedChangesMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRevertedStagedChangesMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRevertedStagedChangesMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRevertedStagedChangesMessagePayload>";
            }
        };
    }
}
