
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Setting the last name of the Customer produces the CustomerLastNameSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetLastNameActionImpl implements MyCustomerSetLastNameAction, ModelBase {

    private String action;

    private String lastName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerSetLastNameActionImpl(@JsonProperty("lastName") final String lastName) {
        this.lastName = lastName;
        this.action = SET_LAST_NAME;
    }

    /**
     * create empty instance
     */
    public MyCustomerSetLastNameActionImpl() {
        this.action = SET_LAST_NAME;
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

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCustomerSetLastNameActionImpl that = (MyCustomerSetLastNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lastName, that.lastName)
                .append(action, that.action)
                .append(lastName, that.lastName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lastName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("lastName", lastName)
                .build();
    }

}
