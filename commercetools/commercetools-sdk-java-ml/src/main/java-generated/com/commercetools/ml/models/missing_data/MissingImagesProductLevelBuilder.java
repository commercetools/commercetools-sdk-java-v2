
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingImagesProductLevelBuilder implements Builder<MissingImagesProductLevel> {

    private Long missingImages;

    private Long total;

    public MissingImagesProductLevelBuilder missingImages(final Long missingImages) {
        this.missingImages = missingImages;
        return this;
    }

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
