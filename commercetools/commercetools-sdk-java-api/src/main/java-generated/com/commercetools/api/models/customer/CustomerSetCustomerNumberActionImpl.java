
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerSetCustomerNumberActionImpl implements CustomerSetCustomerNumberAction, ModelBase {

    private String action;

    private String customerNumber;

    @JsonCreator
    CustomerSetCustomerNumberActionImpl(@JsonProperty("customerNumber") final String customerNumber) {
        this.customerNumber = customerNumber;
        this.action = SET_CUSTOMER_NUMBER;
    }

    public CustomerSetCustomerNumberActionImpl() {
        this.action = SET_CUSTOMER_NUMBER;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>It should be <strong>unique</strong> across a project.
    *  Once it's set, it cannot be changed.</p>
    */
    public String getCustomerNumber() {
        return this.customerNumber;
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

        CustomerSetCustomerNumberActionImpl that = (CustomerSetCustomerNumberActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customerNumber, that.customerNumber).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customerNumber).toHashCode();
    }

}
