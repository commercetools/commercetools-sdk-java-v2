
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
public final class CustomerEmailChangedMessagePayloadImpl implements CustomerEmailChangedMessagePayload {

    private String type;

    private String email;

    @JsonCreator
    CustomerEmailChangedMessagePayloadImpl(@JsonProperty("email") final String email) {
        this.email = email;
        this.type = CUSTOMER_EMAIL_CHANGED;
    }

    public CustomerEmailChangedMessagePayloadImpl() {
        this.type = CUSTOMER_EMAIL_CHANGED;
    }

    public String getType() {
        return this.type;
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

        CustomerEmailChangedMessagePayloadImpl that = (CustomerEmailChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(email, that.email).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(email).toHashCode();
    }

}
