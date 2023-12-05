
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
 *  <p>Changes the <code>email</code> of the Customer and sets the <code>isEmailVerified</code> property to <code>false</code>. This update action generates a CustomerEmailChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerChangeEmailActionImpl implements CustomerChangeEmailAction, ModelBase {

    private String action;

    private String email;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerChangeEmailActionImpl(@JsonProperty("email") final String email) {
        this.email = email;
        this.action = CHANGE_EMAIL;
    }

    /**
     * create empty instance
     */
    public CustomerChangeEmailActionImpl() {
        this.action = CHANGE_EMAIL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
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

        CustomerChangeEmailActionImpl that = (CustomerChangeEmailActionImpl) o;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("email", email)
                .build();
    }

}
