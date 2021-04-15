
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class QueryTimedOutErrorImpl implements QueryTimedOutError {

    private String code;

    private String message;

    @JsonCreator
    QueryTimedOutErrorImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = QUERY_TIMED_OUT;
    }

    public QueryTimedOutErrorImpl() {
        this.code = QUERY_TIMED_OUT;
    }

    public String getCode() {
        return this.code;
    }

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

        QueryTimedOutErrorImpl that = (QueryTimedOutErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).toHashCode();
    }

}
