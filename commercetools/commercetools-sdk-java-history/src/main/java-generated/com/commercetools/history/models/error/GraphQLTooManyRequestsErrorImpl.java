
package com.commercetools.history.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
public class GraphQLTooManyRequestsErrorImpl implements GraphQLTooManyRequestsError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLTooManyRequestsErrorImpl(@JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.values = values;
        this.code = TOO_MANY_REQUESTS;
    }

    /**
     * create empty instance
     */
    public GraphQLTooManyRequestsErrorImpl() {
        this.code = TOO_MANY_REQUESTS;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLTooManyRequestsErrorImpl that = (GraphQLTooManyRequestsErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(code, that.code)
                .append(values, that.values)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .build();
    }

    @Override
    public GraphQLTooManyRequestsError copyDeep() {
        return GraphQLTooManyRequestsError.deepCopy(this);
    }
}
