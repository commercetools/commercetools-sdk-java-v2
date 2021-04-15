
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCustomerEmailActionImpl implements StagedOrderSetCustomerEmailAction {

    private String action;

    private String email;

    @JsonCreator
    StagedOrderSetCustomerEmailActionImpl(@JsonProperty("email") final String email) {
        this.email = email;
        this.action = SET_CUSTOMER_EMAIL;
    }

    public StagedOrderSetCustomerEmailActionImpl() {
        this.action = SET_CUSTOMER_EMAIL;
    }

    public String getAction() {
        return this.action;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetCustomerEmailActionImpl that = (StagedOrderSetCustomerEmailActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(email, that.email).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(email).toHashCode();
    }

}
