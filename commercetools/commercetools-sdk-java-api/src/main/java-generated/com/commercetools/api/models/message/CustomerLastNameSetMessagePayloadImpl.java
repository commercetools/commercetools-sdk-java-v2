
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerLastNameSetMessagePayloadImpl implements CustomerLastNameSetMessagePayload, ModelBase {

    private String type;

    private String lastName;

    @JsonCreator
    CustomerLastNameSetMessagePayloadImpl(@JsonProperty("lastName") final String lastName) {
        this.lastName = lastName;
        this.type = CUSTOMER_LAST_NAME_SET;
    }

    public CustomerLastNameSetMessagePayloadImpl() {
        this.type = CUSTOMER_LAST_NAME_SET;
    }

    public String getType() {
        return this.type;
    }

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

        return new EqualsBuilder().append(type, that.type).append(lastName, that.lastName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(lastName).toHashCode();
    }

}
