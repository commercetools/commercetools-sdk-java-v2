
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingImagesCountBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingImagesCount missingImagesCount = MissingImagesCount.builder()
 *             .missingImages(0.3)
 *             .total(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class MissingImagesCountBuilder implements Builder<MissingImagesCount> {

    private Long missingImages;

    private Long total;

    /**
     *
     */

    public MissingImagesCountBuilder missingImages(final Long missingImages) {
        this.missingImages = missingImages;
        return this;
    }

    /**
     *  <p>Number of products scanned.</p>
     */

    public MissingImagesCountBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public Long getMissingImages() {
        return this.missingImages;
    }

    public Long getTotal() {
        return this.total;
    }

    public MissingImagesCount build() {
        Objects.requireNonNull(missingImages, MissingImagesCount.class + ": missingImages is missing");
        Objects.requireNonNull(total, MissingImagesCount.class + ": total is missing");
        return new MissingImagesCountImpl(missingImages, total);
    }

    /**
     * builds MissingImagesCount without checking for non null required values
     */
    public MissingImagesCount buildUnchecked() {
        return new MissingImagesCountImpl(missingImages, total);
    }

    public static MissingImagesCountBuilder of() {
        return new MissingImagesCountBuilder();
    }

    public static MissingImagesCountBuilder of(final MissingImagesCount template) {
        MissingImagesCountBuilder builder = new MissingImagesCountBuilder();
        builder.missingImages = template.getMissingImages();
        builder.total = template.getTotal();
        return builder;
    }

}
