
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerPasswordUpdatedMessagePayloadImpl implements CustomerPasswordUpdatedMessagePayload {

    private String type;

    private Boolean reset;

    @JsonCreator
    CustomerPasswordUpdatedMessagePayloadImpl(@JsonProperty("reset") final Boolean reset) {
        this.reset = reset;
        this.type = CUSTOMER_PASSWORD_UPDATED;
    }

    public CustomerPasswordUpdatedMessagePayloadImpl() {
        this.type = CUSTOMER_PASSWORD_UPDATED;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>true, if password has been updated during Customer's Password Reset workflow.</p>
    */
    public Boolean getReset() {
        return this.reset;
    }

    public void setReset(final Boolean reset) {
        this.reset = reset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerPasswordUpdatedMessagePayloadImpl that = (CustomerPasswordUpdatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(reset, that.reset).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(reset).toHashCode();
    }

}
