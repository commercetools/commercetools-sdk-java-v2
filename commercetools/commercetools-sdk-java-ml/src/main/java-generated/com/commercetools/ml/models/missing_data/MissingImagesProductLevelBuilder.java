
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingImagesProductLevelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingImagesProductLevel missingImagesProductLevel = MissingImagesProductLevel.builder()
 *             .missingImages(0.3)
 *             .total(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingImagesProductLevelBuilder implements Builder<MissingImagesProductLevel> {

    private Long missingImages;

    private Long total;

    /**
     <*  <p>Number of products missing images.</p>>
     */

    public MissingImagesProductLevelBuilder missingImages(final Long missingImages) {
        this.missingImages = missingImages;
        return this;
    }

    /**
     <*  <p>Number of products scanned.</p>>
     */

    public MissingImagesProductLevelBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public Long getMissingImages() {
        return this.missingImages;
    }

    public Long getTotal() {
        return this.total;
    }

    public MissingImagesProductLevel build() {
        Objects.requireNonNull(missingImages, MissingImagesProductLevel.class + ": missingImages is missing");
        Objects.requireNonNull(total, MissingImagesProductLevel.class + ": total is missing");
        return new MissingImagesProductLevelImpl(missingImages, total);
    }

    /**
     * builds MissingImagesProductLevel without checking for non null required values
     */
    public MissingImagesProductLevel buildUnchecked() {
        return new MissingImagesProductLevelImpl(missingImages, total);
    }

    public static MissingImagesProductLevelBuilder of() {
        return new MissingImagesProductLevelBuilder();
    }

    public static MissingImagesProductLevelBuilder of(final MissingImagesProductLevel template) {
        MissingImagesProductLevelBuilder builder = new MissingImagesProductLevelBuilder();
        builder.missingImages = template.getMissingImages();
        builder.total = template.getTotal();
        return builder;
    }

}
