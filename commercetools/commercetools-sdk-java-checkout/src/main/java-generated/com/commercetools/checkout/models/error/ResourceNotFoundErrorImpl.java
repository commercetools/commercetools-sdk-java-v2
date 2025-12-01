
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
 *  <p>Returned when the resource addressed by the request URL does not exist.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceNotFoundErrorImpl implements ResourceNotFoundError, ModelBase {

    private String code;

    private String message;

    private String resourceIdentifier;

    private String resourceId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ResourceNotFoundErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("resourceIdentifier") final String resourceIdentifier,
            @JsonProperty("resourceId") final String resourceId) {
        this.message = message;
        this.resourceIdentifier = resourceIdentifier;
        this.resourceId = resourceId;
        this.code = RESOURCE_NOT_FOUND;
    }

    /**
     * create empty instance
     */
    public ResourceNotFoundErrorImpl() {
        this.code = RESOURCE_NOT_FOUND;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The Resource with $resourceIdentifier $resourceId was not found."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The identifier type used (e.g., <code>id</code>, <code>key</code>).</p>
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     *  <p>The actual identifier value.</p>
     */

    public String getResourceId() {
        return this.resourceId;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setResourceIdentifier(final String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    public void setResourceId(final String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ResourceNotFoundErrorImpl that = (ResourceNotFoundErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(resourceIdentifier, that.resourceIdentifier)
                .append(resourceId, that.resourceId)
                .append(code, that.code)
                .append(message, that.message)
                .append(resourceIdentifier, that.resourceIdentifier)
                .append(resourceId, that.resourceId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(resourceIdentifier)
                .append(resourceId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("resourceIdentifier", resourceIdentifier)
                .append("resourceId", resourceId)
                .build();
    }

    @Override
    public ResourceNotFoundError copyDeep() {
        return ResourceNotFoundError.deepCopy(this);
    }
}
