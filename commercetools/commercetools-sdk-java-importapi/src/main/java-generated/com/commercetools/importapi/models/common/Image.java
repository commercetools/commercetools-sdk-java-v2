
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>An Image uploaded to the commercetools platform is stored in a Content Delivery Network and it's available in several pre-defined sizes. If you already have an image stored on an external service, you can save the URL when creating a new product or adding a variant, or you can add it later.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImageImpl.class)
public interface Image {

    /**
    *  <p>URL of the image in its original size. The URL must be unique within a single variant. It can be used to obtain the image in different sizes.</p>
    */
    @NotNull
    @JsonProperty("url")
    public String getUrl();

    /**
    *  <p>Dimensions of the original image. This can be used by your application, for example, to determine whether the image is large enough to display a zoom view.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("dimensions")
    public AssetDimensions getDimensions();

    /**
    *  <p>Custom label that can be used, for example, as an image description.</p>
    */

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

    public static com.fasterxml.jackson.core.type.TypeReference<Image> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Image>() {
            @Override
            public String toString() {
                return "TypeReference<Image>";
            }
        };
    }
}
