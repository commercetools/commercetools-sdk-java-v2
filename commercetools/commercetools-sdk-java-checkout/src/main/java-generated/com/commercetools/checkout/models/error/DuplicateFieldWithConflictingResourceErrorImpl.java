
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
 *  <p>Returned when a field value conflicts with an existing value stored in a particular resource causing a duplicate.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateFieldWithConflictingResourceErrorImpl
        implements DuplicateFieldWithConflictingResourceError, ModelBase {

    private String code;

    private String message;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DuplicateFieldWithConflictingResourceErrorImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = DUPLICATE_FIELD_WITH_CONFLICTING_RESOURCE;
    }

    /**
     * create empty instance
     */
    public DuplicateFieldWithConflictingResourceErrorImpl() {
        this.code = DUPLICATE_FIELD_WITH_CONFLICTING_RESOURCE;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"A duplicate value $duplicateValue exists for field $field in request."</code></p>
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

        DuplicateFieldWithConflictingResourceErrorImpl that = (DuplicateFieldWithConflictingResourceErrorImpl) o;

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
    public DuplicateFieldWithConflictingResourceError copyDeep() {
        return DuplicateFieldWithConflictingResourceError.deepCopy(this);
    }
}
