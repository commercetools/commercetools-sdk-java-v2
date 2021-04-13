
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImageDimensionsImpl.class)
public interface ImageDimensions {

    @NotNull
    @JsonProperty("w")
    public Integer getW();

    @NotNull
    @JsonProperty("h")
    public Integer getH();

    public void setW(final Integer w);

    public void setH(final Integer h);

    public static ImageDimensions of() {
        return new ImageDimensionsImpl();
    }

    public static ImageDimensions of(final ImageDimensions template) {
        ImageDimensionsImpl instance = new ImageDimensionsImpl();
        instance.setW(template.getW());
        instance.setH(template.getH());
        return instance;
    }

    public static ImageDimensionsBuilder builder() {
        return ImageDimensionsBuilder.of();
    }

    public static ImageDimensionsBuilder builder(final ImageDimensions template) {
        return ImageDimensionsBuilder.of(template);
    }

    default <T> T withImageDimensions(Function<ImageDimensions, T> helper) {
        return helper.apply(this);
    }
}
