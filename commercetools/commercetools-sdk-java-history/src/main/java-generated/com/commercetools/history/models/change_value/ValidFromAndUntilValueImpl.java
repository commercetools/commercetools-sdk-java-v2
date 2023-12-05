
package com.commercetools.history.models.change_value;

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
 * ValidFromAndUntilValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ValidFromAndUntilValueImpl implements ValidFromAndUntilValue, ModelBase {

    private String validFrom;

    private String validUntil;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ValidFromAndUntilValueImpl(@JsonProperty("validFrom") final String validFrom,
            @JsonProperty("validUntil") final String validUntil) {
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }

    /**
     * create empty instance
     */
    public ValidFromAndUntilValueImpl() {
    }

    /**
     *  <p>Date and time (UTC) from when the Discount is effective.</p>
     */

    public String getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time (UTC) until when the Discount is effective.</p>
     */

    public String getValidUntil() {
        return this.validUntil;
    }

    public void setValidFrom(final String validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final String validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ValidFromAndUntilValueImpl that = (ValidFromAndUntilValueImpl) o;

        return new EqualsBuilder().append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(validFrom).append(validUntil).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .build();
    }

}
