
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingImagesVariantLevelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingImagesVariantLevel missingImagesVariantLevel = MissingImagesVariantLevel.builder()
 *             .missingImages(0.3)
 *             .total(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingImagesVariantLevelBuilder implements Builder<MissingImagesVariantLevel> {

    private Long missingImages;

    private Long total;

    /**
     *  <p>Number of product variants missing images.</p>
     */

    public MissingImagesVariantLevelBuilder missingImages(final Long missingImages) {
        this.missingImages = missingImages;
        return this;
    }

    /**
     *  <p>Number of products scanned.</p>
     */

    public MissingImagesVariantLevelBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public Long getMissingImages() {
        return this.missingImages;
    }

    public Long getTotal() {
        return this.total;
    }

    public MissingImagesVariantLevel build() {
        Objects.requireNonNull(missingImages, MissingImagesVariantLevel.class + ": missingImages is missing");
        Objects.requireNonNull(total, MissingImagesVariantLevel.class + ": total is missing");
        return new MissingImagesVariantLevelImpl(missingImages, total);
    }

    /**
     * builds MissingImagesVariantLevel without checking for non null required values
     */
    public MissingImagesVariantLevel buildUnchecked() {
        return new MissingImagesVariantLevelImpl(missingImages, total);
    }

    public static MissingImagesVariantLevelBuilder of() {
        return new MissingImagesVariantLevelBuilder();
    }

    public static MissingImagesVariantLevelBuilder of(final MissingImagesVariantLevel template) {
        MissingImagesVariantLevelBuilder builder = new MissingImagesVariantLevelBuilder();
        builder.missingImages = template.getMissingImages();
        builder.total = template.getTotal();
        return builder;
    }

}
