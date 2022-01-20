
package com.commercetools.ml.models.image_search_config;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImageSearchConfigResponseImpl implements ImageSearchConfigResponse, ModelBase {

    private com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status;

    private java.time.ZonedDateTime lastModifiedAt;

    @JsonCreator
    ImageSearchConfigResponseImpl(
            @JsonProperty("status") final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt) {
        this.status = status;
        this.lastModifiedAt = lastModifiedAt;
    }

    public ImageSearchConfigResponseImpl() {
    }

    /**
    *  <p>The image search activation status.</p>
    */
    public com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus getStatus() {
        return this.status;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public void setStatus(final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status) {
        this.status = status;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImageSearchConfigResponseImpl that = (ImageSearchConfigResponseImpl) o;

        return new EqualsBuilder().append(status, that.status).append(lastModifiedAt, that.lastModifiedAt).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(status).append(lastModifiedAt).toHashCode();
    }

}
