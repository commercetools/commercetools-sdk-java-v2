
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AssetSourceBuilder {

    private String uri;

    private String key;

    private com.commercetools.history.models.AssetDimensions dimensions;

    private String contentType;

    public AssetSourceBuilder uri(final String uri) {
        this.uri = uri;
        return this;
    }

    public AssetSourceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public AssetSourceBuilder dimensions(final com.commercetools.history.models.AssetDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public AssetSourceBuilder contentType(final String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getUri() {
        return this.uri;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.history.models.AssetDimensions getDimensions() {
        return this.dimensions;
    }

    public String getContentType() {
        return this.contentType;
    }

    public AssetSource build() {
        return new AssetSourceImpl(uri, key, dimensions, contentType);
    }

    public static AssetSourceBuilder of() {
        return new AssetSourceBuilder();
    }

    public static AssetSourceBuilder of(final AssetSource template) {
        AssetSourceBuilder builder = new AssetSourceBuilder();
        builder.uri = template.getUri();
        builder.key = template.getKey();
        builder.dimensions = template.getDimensions();
        builder.contentType = template.getContentType();
        return builder;
    }

}
