
package com.commercetools.checkout.models.error;

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
 *  <p>Returned when the referenced resources violate a constraint required for the operation, for example, when a Cart and a PaymentMethod are expected to belong to the same customer but do not.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InternalConstraintViolatedErrorImpl implements InternalConstraintViolatedError, ModelBase {

    private String code;

    private String message;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InternalConstraintViolatedErrorImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = INTERNAL_CONSTRAINT_VIOLATED;
    }

    /**
     * create empty instance
     */
    public InternalConstraintViolatedErrorImpl() {
        this.code = INTERNAL_CONSTRAINT_VIOLATED;
    }

    /**
     *  <p>Error code, always <code>InternalConstraintViolated</code>.</p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Description of the error.</p>
     */

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InternalConstraintViolatedErrorImpl that = (InternalConstraintViolatedErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(code, that.code)
                .append(message, that.message)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .build();
    }

    @Override
    public InternalConstraintViolatedError copyDeep() {
        return InternalConstraintViolatedError.deepCopy(this);
    }
}
