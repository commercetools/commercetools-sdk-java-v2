
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AssetDimensionsBuilder {

    private Double w;

    private Double h;

    public AssetDimensionsBuilder w(final Double w) {
        this.w = w;
        return this;
    }

    public AssetDimensionsBuilder h(final Double h) {
        this.h = h;
        return this;
    }

    public Double getW() {
        return this.w;
    }

    public Double getH() {
        return this.h;
    }

    public AssetDimensions build() {
        return new AssetDimensionsImpl(w, h);
    }

    public static AssetDimensionsBuilder of() {
        return new AssetDimensionsBuilder();
    }

    public static AssetDimensionsBuilder of(final AssetDimensions template) {
        AssetDimensionsBuilder builder = new AssetDimensionsBuilder();
        builder.w = template.getW();
        builder.h = template.getH();
        return builder;
    }

}
