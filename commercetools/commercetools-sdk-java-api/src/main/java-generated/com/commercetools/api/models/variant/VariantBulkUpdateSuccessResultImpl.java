
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
 *  <p>Result for a Variant that was successfully updated in a bulk update request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateSuccessResultImpl implements VariantBulkUpdateSuccessResult, ModelBase {

    private String id;

    private String key;

    private String status;

    private com.commercetools.api.models.variant.VariantBulkUpdateResource resource;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantBulkUpdateSuccessResultImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("resource") final com.commercetools.api.models.variant.VariantBulkUpdateResource resource) {
        this.id = id;
        this.key = key;
        this.resource = resource;
        this.status = SUCCESS;
    }

    /**
     * create empty instance
     */
    public VariantBulkUpdateSuccessResultImpl() {
        this.status = SUCCESS;
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

    /**
     *  <p>A lightweight reference containing the <code>id</code> and updated <code>version</code> of the Variant.</p>
     */

    public com.commercetools.api.models.variant.VariantBulkUpdateResource getResource() {
        return this.resource;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setResource(final com.commercetools.api.models.variant.VariantBulkUpdateResource resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantBulkUpdateSuccessResultImpl that = (VariantBulkUpdateSuccessResultImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(status, that.status)
                .append(resource, that.resource)
                .append(id, that.id)
                .append(key, that.key)
                .append(status, that.status)
                .append(resource, that.resource)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(key).append(status).append(resource).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("status", status)
                .append("resource", resource)
                .build();
    }

    @Override
    public VariantBulkUpdateSuccessResult copyDeep() {
        return VariantBulkUpdateSuccessResult.deepCopy(this);
    }
}
