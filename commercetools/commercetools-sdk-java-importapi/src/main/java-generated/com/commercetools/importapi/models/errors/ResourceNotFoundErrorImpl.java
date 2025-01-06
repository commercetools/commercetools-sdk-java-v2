
package com.commercetools.importapi.models.errors;

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
 * ResourceNotFoundError
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceNotFoundErrorImpl implements ResourceNotFoundError, ModelBase {

    private String code;

    private String message;

    private java.lang.Object resource;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ResourceNotFoundErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("resource") final java.lang.Object resource) {
        this.message = message;
        this.resource = resource;
        this.code = RESOURCE_NOT_FOUND;
    }

    /**
     * create empty instance
     */
    public ResourceNotFoundErrorImpl() {
        this.code = RESOURCE_NOT_FOUND;
    }

    /**
     *  <p>An error identifier.</p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>A plain language description of the cause of an error.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *
     */

    public java.lang.Object getResource() {
        return this.resource;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setResource(final java.lang.Object resource) {
        this.resource = resource;
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
                .append(resource, that.resource)
                .append(code, that.code)
                .append(message, that.message)
                .append(resource, that.resource)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(resource).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("resource", resource)
                .build();
    }

}
