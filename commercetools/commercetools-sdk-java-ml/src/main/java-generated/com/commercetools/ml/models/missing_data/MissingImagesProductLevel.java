
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingImagesProductLevelImpl.class)
public interface MissingImagesProductLevel extends MissingImagesCount {

    /**
    *  <p>Number of products missing images.</p>
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

    public static MissingImagesProductLevel of() {
        return new MissingImagesProductLevelImpl();
    }

    public static MissingImagesProductLevel of(final MissingImagesProductLevel template) {
        MissingImagesProductLevelImpl instance = new MissingImagesProductLevelImpl();
        instance.setMissingImages(template.getMissingImages());
        instance.setTotal(template.getTotal());
        return instance;
    }

    public static MissingImagesProductLevelBuilder builder() {
        return MissingImagesProductLevelBuilder.of();
    }

    public static MissingImagesProductLevelBuilder builder(final MissingImagesProductLevel template) {
        return MissingImagesProductLevelBuilder.of(template);
    }

    default <T> T withMissingImagesProductLevel(Function<MissingImagesProductLevel, T> helper) {
        return helper.apply(this);
    }
}
