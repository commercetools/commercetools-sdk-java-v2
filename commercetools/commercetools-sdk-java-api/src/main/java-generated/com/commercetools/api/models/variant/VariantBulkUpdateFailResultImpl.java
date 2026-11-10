
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
 *  <p>Result for a Variant that failed to update in a bulk update request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateFailResultImpl implements VariantBulkUpdateFailResult, ModelBase {

    private String id;

    private String key;

    private String status;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantBulkUpdateFailResultImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.id = id;
        this.key = key;
        this.errors = errors;
        this.status = FAIL;
    }

    /**
     * create empty instance
     */
    public VariantBulkUpdateFailResultImpl() {
        this.status = FAIL;
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
     *  <p>Errors that caused the update to fail for this Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setErrors(final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantBulkUpdateFailResultImpl that = (VariantBulkUpdateFailResultImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(status, that.status)
                .append(errors, that.errors)
                .append(id, that.id)
                .append(key, that.key)
                .append(status, that.status)
                .append(errors, that.errors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(key).append(status).append(errors).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("status", status)
                .append("errors", errors)
                .build();
    }

    @Override
    public VariantBulkUpdateFailResult copyDeep() {
        return VariantBulkUpdateFailResult.deepCopy(this);
    }
}
