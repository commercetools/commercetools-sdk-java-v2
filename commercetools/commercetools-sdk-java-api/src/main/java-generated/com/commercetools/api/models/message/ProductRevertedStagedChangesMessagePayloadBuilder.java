
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRevertedStagedChangesMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRevertedStagedChangesMessagePayloadBuilder
        implements Builder<ProductRevertedStagedChangesMessagePayload> {

    private java.util.List<String> removedImageUrls;

    /**
     *  <p>List of image URLs that were removed during the Revert Staged Changes update action.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductRevertedStagedChangesMessagePayloadBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>List of image URLs that were removed during the Revert Staged Changes update action.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductRevertedStagedChangesMessagePayloadBuilder removedImageUrls(
            final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    /**
     *  <p>List of image URLs that were removed during the Revert Staged Changes update action.</p>
     * @param removedImageUrls value to be set
     * @return Builder
     */

    public ProductRevertedStagedChangesMessagePayloadBuilder plusRemovedImageUrls(final String... removedImageUrls) {
        if (this.removedImageUrls == null) {
            this.removedImageUrls = new ArrayList<>();
        }
        this.removedImageUrls.addAll(Arrays.asList(removedImageUrls));
        return this;
    }

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    /**
     * builds ProductRevertedStagedChangesMessagePayload with checking for non-null required values
     * @return ProductRevertedStagedChangesMessagePayload
     */
    public ProductRevertedStagedChangesMessagePayload build() {
        Objects.requireNonNull(removedImageUrls,
            ProductRevertedStagedChangesMessagePayload.class + ": removedImageUrls is missing");
        return new ProductRevertedStagedChangesMessagePayloadImpl(removedImageUrls);
    }

    /**
     * builds ProductRevertedStagedChangesMessagePayload without checking for non-null required values
     * @return ProductRevertedStagedChangesMessagePayload
     */
    public ProductRevertedStagedChangesMessagePayload buildUnchecked() {
        return new ProductRevertedStagedChangesMessagePayloadImpl(removedImageUrls);
    }

    public static ProductRevertedStagedChangesMessagePayloadBuilder of() {
        return new ProductRevertedStagedChangesMessagePayloadBuilder();
    }

    public static ProductRevertedStagedChangesMessagePayloadBuilder of(
            final ProductRevertedStagedChangesMessagePayload template) {
        ProductRevertedStagedChangesMessagePayloadBuilder builder = new ProductRevertedStagedChangesMessagePayloadBuilder();
        builder.removedImageUrls = template.getRemovedImageUrls();
        return builder;
    }

}
