
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Set Date of Birth update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerDateOfBirthSetMessagePayloadImpl implements CustomerDateOfBirthSetMessagePayload, ModelBase {

    private String type;

    private java.time.LocalDate dateOfBirth;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerDateOfBirthSetMessagePayloadImpl(@JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.type = CUSTOMER_DATE_OF_BIRTH_SET;
    }

    /**
     * create empty instance
     */
    public CustomerDateOfBirthSetMessagePayloadImpl() {
        this.type = CUSTOMER_DATE_OF_BIRTH_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>dateOfBirth</code> that was set during the Set Date of Birth update action.</p>
     */

    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerDateOfBirthSetMessagePayloadImpl that = (CustomerDateOfBirthSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(dateOfBirth, that.dateOfBirth)
                .append(type, that.type)
                .append(dateOfBirth, that.dateOfBirth)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(dateOfBirth).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("dateOfBirth", dateOfBirth)
                .build();
    }

}
