
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Dimensions of the Asset source specified by the number of pixels.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AssetDimensionsImpl.class)
public interface AssetDimensions {

    /**
    *  <p>Width of the Asset source.</p>
    */
    @NotNull
    @JsonProperty("w")
    public Integer getW();

    /**
    *  <p>Height of the Asset source.</p>
    */
    @NotNull
    @JsonProperty("h")
    public Integer getH();

    public void setW(final Integer w);

    public void setH(final Integer h);

    public static AssetDimensions of() {
        return new AssetDimensionsImpl();
    }

    public static AssetDimensions of(final AssetDimensions template) {
        AssetDimensionsImpl instance = new AssetDimensionsImpl();
        instance.setW(template.getW());
        instance.setH(template.getH());
        return instance;
    }

    public static AssetDimensionsBuilder builder() {
        return AssetDimensionsBuilder.of();
    }

    public static AssetDimensionsBuilder builder(final AssetDimensions template) {
        return AssetDimensionsBuilder.of(template);
    }

    default <T> T withAssetDimensions(Function<AssetDimensions, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AssetDimensions> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssetDimensions>() {
            @Override
            public String toString() {
                return "TypeReference<AssetDimensions>";
            }
        };
    }
}
