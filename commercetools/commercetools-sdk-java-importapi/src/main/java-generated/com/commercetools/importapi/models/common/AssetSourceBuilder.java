
package com.commercetools.importapi.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssetSourceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetSource assetSource = AssetSource.builder()
 *             .uri("{uri}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssetSourceBuilder implements Builder<AssetSource> {

    private String uri;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.importapi.models.common.AssetDimensions dimensions;

    @Nullable
    private String contentType;

    /**
     * set the value to the uri
     * @param uri value to be set
     * @return Builder
     */

    public AssetSourceBuilder uri(final String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public AssetSourceBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The width and height of the Asset Source.</p>
     * @param builder function to build the dimensions value
     * @return Builder
     */

    public AssetSourceBuilder dimensions(
            Function<com.commercetools.importapi.models.common.AssetDimensionsBuilder, com.commercetools.importapi.models.common.AssetDimensionsBuilder> builder) {
        this.dimensions = builder.apply(com.commercetools.importapi.models.common.AssetDimensionsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The width and height of the Asset Source.</p>
     * @param builder function to build the dimensions value
     * @return Builder
     */

    public AssetSourceBuilder withDimensions(
            Function<com.commercetools.importapi.models.common.AssetDimensionsBuilder, com.commercetools.importapi.models.common.AssetDimensions> builder) {
        this.dimensions = builder.apply(com.commercetools.importapi.models.common.AssetDimensionsBuilder.of());
        return this;
    }

    /**
     *  <p>The width and height of the Asset Source.</p>
     * @param dimensions value to be set
     * @return Builder
     */

    public AssetSourceBuilder dimensions(
            @Nullable final com.commercetools.importapi.models.common.AssetDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * set the value to the contentType
     * @param contentType value to be set
     * @return Builder
     */

    public AssetSourceBuilder contentType(@Nullable final String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * value of uri}
     * @return uri
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * value of key}
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The width and height of the Asset Source.</p>
     * @return dimensions
     */

    @Nullable
    public com.commercetools.importapi.models.common.AssetDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * value of contentType}
     * @return contentType
     */

    @Nullable
    public String getContentType() {
        return this.contentType;
    }

    /**
     * builds AssetSource with checking for non-null required values
     * @return AssetSource
     */
    public AssetSource build() {
        Objects.requireNonNull(uri, AssetSource.class + ": uri is missing");
        return new AssetSourceImpl(uri, key, dimensions, contentType);
    }

    /**
     * builds AssetSource without checking for non-null required values
     * @return AssetSource
     */
    public AssetSource buildUnchecked() {
        return new AssetSourceImpl(uri, key, dimensions, contentType);
    }

    /**
     * factory method for an instance of AssetSourceBuilder
     * @return builder
     */
    public static AssetSourceBuilder of() {
        return new AssetSourceBuilder();
    }

    /**
     * create builder for AssetSource instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssetSourceBuilder of(final AssetSource template) {
        AssetSourceBuilder builder = new AssetSourceBuilder();
        builder.uri = template.getUri();
        builder.key = template.getKey();
        builder.dimensions = template.getDimensions();
        builder.contentType = template.getContentType();
        return builder;
    }

}
