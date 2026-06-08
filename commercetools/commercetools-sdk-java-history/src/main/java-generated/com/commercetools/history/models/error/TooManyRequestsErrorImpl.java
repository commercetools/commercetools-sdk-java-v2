
package com.commercetools.history.models.error;

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
 *  <p>Returned when the <span>Query Records</span> request exceeds the rate limit.</p>
 *  <p>Reduce the date range and resource types in your query to minimize the token usage, or retry the request after some time (indicated in the <code>Retry-After</code> header).</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TooManyRequestsErrorImpl implements TooManyRequestsError, ModelBase {

    private String code;

    private String message;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TooManyRequestsErrorImpl(@JsonProperty("code") final String code, @JsonProperty("message") final String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * create empty instance
     */
    public TooManyRequestsErrorImpl() {
    }

    /**
     *  <p><code>"TooManyRequests"</code></p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"You have made too many requests. Please try again later."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    public void setCode(final String code) {
        this.code = code;
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

        TooManyRequestsErrorImpl that = (TooManyRequestsErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(code, that.code)
                .append(message, that.message)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .build();
    }

    @Override
    public TooManyRequestsError copyDeep() {
        return TooManyRequestsError.deepCopy(this);
    }
}
