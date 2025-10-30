
package com.commercetools.checkout.models.error;

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
 *  <p>Returned when a resource type cannot be created as it has reached its <span>limits</span>.</p>
 *  <p>The limits must be adjusted for this resource before sending the request again.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MaxResourceLimitExceededErrorImpl implements MaxResourceLimitExceededError, ModelBase {

    private String code;

    private String message;

    private Double limit;

    private String resourceTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MaxResourceLimitExceededErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("limit") final Double limit, @JsonProperty("resourceTypeId") final String resourceTypeId) {
        this.message = message;
        this.limit = limit;
        this.resourceTypeId = resourceTypeId;
        this.code = MAX_RESOURCE_LIMIT_EXCEEDED;
    }

    /**
     * create empty instance
     */
    public MaxResourceLimitExceededErrorImpl() {
        this.code = MAX_RESOURCE_LIMIT_EXCEEDED;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"You have exceeded the limit of $limit resources of type $resourceTypeId."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The limit that was exceeded.</p>
     */

    public Double getLimit() {
        return this.limit;
    }

    /**
     *  <p>The resource type that reached its limit.</p>
     */

    public String getResourceTypeId() {
        return this.resourceTypeId;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setLimit(final Double limit) {
        this.limit = limit;
    }

    public void setResourceTypeId(final String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MaxResourceLimitExceededErrorImpl that = (MaxResourceLimitExceededErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(limit, that.limit)
                .append(resourceTypeId, that.resourceTypeId)
                .append(code, that.code)
                .append(message, that.message)
                .append(limit, that.limit)
                .append(resourceTypeId, that.resourceTypeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(limit)
                .append(resourceTypeId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("limit", limit)
                .append("resourceTypeId", resourceTypeId)
                .build();
    }

    @Override
    public MaxResourceLimitExceededError copyDeep() {
        return MaxResourceLimitExceededError.deepCopy(this);
    }
}
