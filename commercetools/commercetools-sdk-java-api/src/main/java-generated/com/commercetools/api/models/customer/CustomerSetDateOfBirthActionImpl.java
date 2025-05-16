
package com.commercetools.api.models.customer;

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
 *  <p>Setting the date of birth of the Customer produces the CustomerDateOfBirthSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetDateOfBirthActionImpl implements CustomerSetDateOfBirthAction, ModelBase {

    private String action;

    private java.time.LocalDate dateOfBirth;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetDateOfBirthActionImpl(@JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.action = SET_DATE_OF_BIRTH;
    }

    /**
     * create empty instance
     */
    public CustomerSetDateOfBirthActionImpl() {
        this.action = SET_DATE_OF_BIRTH;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
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

        CustomerSetDateOfBirthActionImpl that = (CustomerSetDateOfBirthActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(dateOfBirth, that.dateOfBirth)
                .append(action, that.action)
                .append(dateOfBirth, that.dateOfBirth)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(dateOfBirth).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("dateOfBirth", dateOfBirth)
                .build();
    }

    @Override
    public CustomerSetDateOfBirthAction copyDeep() {
        return CustomerSetDateOfBirthAction.deepCopy(this);
    }
}
