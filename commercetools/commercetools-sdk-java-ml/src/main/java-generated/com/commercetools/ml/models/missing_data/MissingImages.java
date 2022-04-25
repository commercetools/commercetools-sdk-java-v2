
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingImagesImpl.class)
public interface MissingImages {

    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
    *  <p>ID of the variant</p>
    */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
    *  <p>Number of images the variant contains.</p>
    */
    @NotNull
    @JsonProperty("imageCount")
    public Long getImageCount();

    public void setProduct(final ProductReference product);

    public void setVariantId(final Long variantId);

    public void setImageCount(final Long imageCount);

    public static MissingImages of() {
        return new MissingImagesImpl();
    }

    public static MissingImages of(final MissingImages template) {
        MissingImagesImpl instance = new MissingImagesImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setImageCount(template.getImageCount());
        return instance;
    }

    public static MissingImagesBuilder builder() {
        return MissingImagesBuilder.of();
    }

    public static MissingImagesBuilder builder(final MissingImages template) {
        return MissingImagesBuilder.of(template);
    }

    default <T> T withMissingImages(Function<MissingImages, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MissingImages> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingImages>() {
            @Override
            public String toString() {
                return "TypeReference<MissingImages>";
            }
        };
    }
}
