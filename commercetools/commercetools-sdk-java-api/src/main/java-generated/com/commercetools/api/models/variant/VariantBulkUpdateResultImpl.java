
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Represents the result of a single Variant update within a bulk update request. Use <code>status</code> to determine whether the update succeeded or failed.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateResultImpl implements VariantBulkUpdateResult, ModelBase {

    private String id;

    private String key;

    private String status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantBulkUpdateResultImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("status") final String status) {
        this.id = id;
        this.key = key;
        this.status = status;
    }

    /**
     * create empty instance
     */
    public VariantBulkUpdateResultImpl() {
    }

    /**
     *  <p>Unique identifier of the Variant from the request. Present when the Variant was identified by <code>id</code>.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Variant from the request. Present when the Variant was identified by <code>key</code>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Indicates whether the update succeeded or failed.</p>
     */

    public String getStatus() {
        return this.status;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantBulkUpdateResultImpl that = (VariantBulkUpdateResultImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(status, that.status)
                .append(id, that.id)
                .append(key, that.key)
                .append(status, that.status)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(key).append(status).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("status", status)
                .build();
    }

    @Override
    public VariantBulkUpdateResult copyDeep() {
        return VariantBulkUpdateResult.deepCopy(this);
    }
}
