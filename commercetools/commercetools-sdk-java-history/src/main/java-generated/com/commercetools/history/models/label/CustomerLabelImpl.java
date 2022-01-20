
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerLabelImpl implements CustomerLabel, ModelBase {

    private String type;

    private String firstName;

    private String lastName;

    private String customerNumber;

    @JsonCreator
    CustomerLabelImpl(@JsonProperty("firstName") final String firstName,
            @JsonProperty("lastName") final String lastName,
            @JsonProperty("customerNumber") final String customerNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.type = CUSTOMER_LABEL;
    }

    public CustomerLabelImpl() {
        this.type = CUSTOMER_LABEL;
    }

    public String getType() {
        return this.type;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerLabelImpl that = (CustomerLabelImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(customerNumber, that.customerNumber)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(firstName)
                .append(lastName)
                .append(customerNumber)
                .toHashCode();
    }

}
