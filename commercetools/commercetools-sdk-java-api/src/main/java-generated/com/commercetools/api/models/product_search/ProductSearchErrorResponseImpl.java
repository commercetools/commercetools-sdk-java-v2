
package com.commercetools.api.models.product_search;

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
 * ProductSearchErrorResponse
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchErrorResponseImpl implements ProductSearchErrorResponse, ModelBase {

    private Integer statusCode;

    private String message;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchErrorResponseImpl(@JsonProperty("statusCode") final Integer statusCode,
            @JsonProperty("message") final String message,
            @JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.statusCode = statusCode;
        this.message = message;
        this.errors = errors;
    }

    /**
     * create empty instance
     */
    public ProductSearchErrorResponseImpl() {
    }

    /**
     *  <p>The http status code of the response.</p>
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     *  <p>Describes the error.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    public void setStatusCode(final Integer statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(final String message) {
        this.message = message;
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

        ProductSearchErrorResponseImpl that = (ProductSearchErrorResponseImpl) o;

        return new EqualsBuilder().append(statusCode, that.statusCode)
                .append(message, that.message)
                .append(errors, that.errors)
                .append(statusCode, that.statusCode)
                .append(message, that.message)
                .append(errors, that.errors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(statusCode).append(message).append(errors).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("statusCode", statusCode)
                .append("message", message)
                .append("errors", errors)
                .build();
    }

}
