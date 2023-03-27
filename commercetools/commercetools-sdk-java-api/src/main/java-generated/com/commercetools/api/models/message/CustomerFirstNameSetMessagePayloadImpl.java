
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

/**
 *  <p>Generated after a successful Set First Name update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerFirstNameSetMessagePayloadImpl implements CustomerFirstNameSetMessagePayload, ModelBase {

    private String type;

    private String firstName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerFirstNameSetMessagePayloadImpl(@JsonProperty("firstName") final String firstName) {
        this.firstName = firstName;
        this.type = CUSTOMER_FIRST_NAME_SET;
    }

    /**
     * create empty instance
     */
    public CustomerFirstNameSetMessagePayloadImpl() {
        this.type = CUSTOMER_FIRST_NAME_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>firstName</code> that was set during the Set First Name update action.</p>
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

        CustomerFirstNameSetMessagePayloadImpl that = (CustomerFirstNameSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(firstName, that.firstName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(firstName).toHashCode();
    }

}
