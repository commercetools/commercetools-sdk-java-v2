
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
 *  <p>Changing the email of the Customer produces the CustomerEmailChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerChangeEmailActionImpl implements MyCustomerChangeEmailAction, ModelBase {

    private String action;

    private String email;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerChangeEmailActionImpl(@JsonProperty("email") final String email) {
        this.email = email;
        this.action = CHANGE_EMAIL;
    }

    /**
     * create empty instance
     */
    public MyCustomerChangeEmailActionImpl() {
        this.action = CHANGE_EMAIL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set.</p>
     */

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

        MyCustomerChangeEmailActionImpl that = (MyCustomerChangeEmailActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(email, that.email)
                .append(action, that.action)
                .append(email, that.email)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(email).toHashCode();
    }

}
