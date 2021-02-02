
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingImagesVariantLevelImpl.class)
public interface MissingImagesVariantLevel extends MissingImagesCount {

    /**
    *  <p>Number of product variants missing images.</p>
    */
    @NotNull
    @JsonProperty("missingImages")
    public Long getMissingImages();

    /**
    *  <p>Number of products scanned.</p>
    */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    public void setMissingImages(final Long missingImages);

    public void setTotal(final Long total);

    public static MissingImagesVariantLevel of() {
        return new MissingImagesVariantLevelImpl();
    }

    public static MissingImagesVariantLevel of(final MissingImagesVariantLevel template) {
        MissingImagesVariantLevelImpl instance = new MissingImagesVariantLevelImpl();
        instance.setMissingImages(template.getMissingImages());
        instance.setTotal(template.getTotal());
        return instance;
    }

    public static MissingImagesVariantLevelBuilder builder() {
        return MissingImagesVariantLevelBuilder.of();
    }

    public static MissingImagesVariantLevelBuilder builder(final MissingImagesVariantLevel template) {
        return MissingImagesVariantLevelBuilder.of(template);
    }

    default <T> T withMissingImagesVariantLevel(Function<MissingImagesVariantLevel, T> helper) {
        return helper.apply(this);
    }
}
