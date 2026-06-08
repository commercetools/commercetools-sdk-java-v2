
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetLastNameAction" rel="nofollow">Set Last Name</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerLastNameSetMessagePayloadImpl implements CustomerLastNameSetMessagePayload, ModelBase {

    private String type;

    private String lastName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerLastNameSetMessagePayloadImpl(@JsonProperty("lastName") final String lastName) {
        this.lastName = lastName;
        this.type = CUSTOMER_LAST_NAME_SET;
    }

    /**
     * create empty instance
     */
    public CustomerLastNameSetMessagePayloadImpl() {
        this.type = CUSTOMER_LAST_NAME_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>lastName</code> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetLastNameAction" rel="nofollow">Set Last Name</a> update action.</p>
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

        CustomerLastNameSetMessagePayloadImpl that = (CustomerLastNameSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(lastName, that.lastName)
                .append(type, that.type)
                .append(lastName, that.lastName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(lastName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("lastName", lastName)
                .build();
    }

    @Override
    public CustomerLastNameSetMessagePayload copyDeep() {
        return CustomerLastNameSetMessagePayload.deepCopy(this);
    }
}
