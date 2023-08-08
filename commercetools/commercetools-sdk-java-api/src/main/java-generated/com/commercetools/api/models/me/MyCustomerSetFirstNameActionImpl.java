
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Setting the first name of the Customer produces the CustomerFirstNameSetMessage.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetFirstNameActionImpl implements MyCustomerSetFirstNameAction, ModelBase {

    private String action;

    private String firstName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerSetFirstNameActionImpl(@JsonProperty("firstName") final String firstName) {
        this.firstName = firstName;
        this.action = SET_FIRST_NAME;
    }

    /**
     * create empty instance
     */
    public MyCustomerSetFirstNameActionImpl() {
        this.action = SET_FIRST_NAME;
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

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCustomerSetFirstNameActionImpl that = (MyCustomerSetFirstNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(firstName, that.firstName)
                .append(action, that.action)
                .append(firstName, that.firstName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(firstName).toHashCode();
    }

}
