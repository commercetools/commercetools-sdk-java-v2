
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingImagesCountBuilder implements Builder<MissingImagesCount> {

    private Long missingImages;

    private Long total;

    public MissingImagesCountBuilder missingImages(final Long missingImages) {
        this.missingImages = missingImages;
        return this;
    }

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
