
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImageImpl.class)
public interface Image {

    @NotNull
    @JsonProperty("url")
    public String getUrl();

    @NotNull
    @Valid
    @JsonProperty("dimensions")
    public AssetDimensions getDimensions();

    @JsonProperty("label")
    public String getLabel();

    public void setUrl(final String url);

    public void setDimensions(final AssetDimensions dimensions);

    public void setLabel(final String label);

    public static Image of() {
        return new ImageImpl();
    }

    public static Image of(final Image template) {
        ImageImpl instance = new ImageImpl();
        instance.setUrl(template.getUrl());
        instance.setDimensions(template.getDimensions());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static ImageBuilder builder() {
        return ImageBuilder.of();
    }

    public static ImageBuilder builder(final Image template) {
        return ImageBuilder.of(template);
    }

    default <T> T withImage(Function<Image, T> helper) {
        return helper.apply(this);
    }
}
