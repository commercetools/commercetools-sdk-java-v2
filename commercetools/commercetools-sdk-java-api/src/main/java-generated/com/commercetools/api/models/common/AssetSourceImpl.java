
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Representation of an Asset in a specific format, for example a video in a certain encoding, or an image in a certain resolution.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssetSourceImpl implements AssetSource, ModelBase {

    private String uri;

    private String key;

    private com.commercetools.api.models.common.AssetDimensions dimensions;

    private String contentType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssetSourceImpl(@JsonProperty("uri") final String uri, @JsonProperty("key") final String key,
            @JsonProperty("dimensions") final com.commercetools.api.models.common.AssetDimensions dimensions,
            @JsonProperty("contentType") final String contentType) {
        this.uri = uri;
        this.key = key;
        this.dimensions = dimensions;
        this.contentType = contentType;
    }

    /**
     * create empty instance
     */
    public AssetSourceImpl() {
    }

    /**
     *  <p>URI of the AssetSource.</p>
     */

    public String getUri() {
        return this.uri;
    }

    /**
     *  <p>User-defined identifier of the AssetSource. Must be unique per Asset.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Width and height of the AssetSource.</p>
     */

    public com.commercetools.api.models.common.AssetDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     *  <p>Indicates the type of content, for example <code>application/pdf</code>.</p>
     */

    public String getContentType() {
        return this.contentType;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setDimensions(final com.commercetools.api.models.common.AssetDimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssetSourceImpl that = (AssetSourceImpl) o;

        return new EqualsBuilder().append(uri, that.uri)
                .append(key, that.key)
                .append(dimensions, that.dimensions)
                .append(contentType, that.contentType)
                .append(uri, that.uri)
                .append(key, that.key)
                .append(dimensions, that.dimensions)
                .append(contentType, that.contentType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(uri).append(key).append(dimensions).append(contentType).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("uri", uri)
                .append("key", key)
                .append("dimensions", dimensions)
                .append("contentType", contentType)
                .build();
    }

    @Override
    public AssetSource copyDeep() {
        return AssetSource.deepCopy(this);
    }
}
