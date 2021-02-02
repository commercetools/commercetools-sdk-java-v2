
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Invalid input has been sent to the service. The client application should validate the input according to the
*  constraints described in the error message before sending the request.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidInputImpl implements InvalidInput {

    private String code;

    private String message;

    @JsonCreator
    InvalidInputImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = INVALID_INPUT;
    }

    public InvalidInputImpl() {
        this.code = INVALID_INPUT;
    }

    public String getCode() {
        return this.code;
    }

    /**
    *  <p>The error's description.</p>
    */
    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InvalidInputImpl that = (InvalidInputImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).toHashCode();
    }

}
