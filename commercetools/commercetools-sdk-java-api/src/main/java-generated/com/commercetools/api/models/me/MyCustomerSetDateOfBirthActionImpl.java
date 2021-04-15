
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerSetDateOfBirthActionImpl implements MyCustomerSetDateOfBirthAction {

    private String action;

    private java.time.LocalDate dateOfBirth;

    @JsonCreator
    MyCustomerSetDateOfBirthActionImpl(@JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.action = SET_DATE_OF_BIRTH;
    }

    public MyCustomerSetDateOfBirthActionImpl() {
        this.action = SET_DATE_OF_BIRTH;
    }

    public String getAction() {
        return this.action;
    }

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

        MyCustomerSetDateOfBirthActionImpl that = (MyCustomerSetDateOfBirthActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(dateOfBirth, that.dateOfBirth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(dateOfBirth).toHashCode();
    }

}
