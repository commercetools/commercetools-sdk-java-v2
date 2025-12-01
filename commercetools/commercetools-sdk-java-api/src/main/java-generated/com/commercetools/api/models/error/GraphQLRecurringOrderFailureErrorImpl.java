
package com.commercetools.api.models.error;

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
 *  <p>Returned when a subsequent Order for a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> could not be processed.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLRecurringOrderFailureErrorImpl implements GraphQLRecurringOrderFailureError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private java.lang.Object details;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLRecurringOrderFailureErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("details") final java.lang.Object details) {
        this.values = values;
        this.details = details;
        this.code = RECURRING_ORDER_FAILURE;
    }

    /**
     * create empty instance
     */
    public GraphQLRecurringOrderFailureErrorImpl() {
        this.code = RECURRING_ORDER_FAILURE;
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

    /**
     *  <p>Details about the error's cause and the entities involved.</p>
     */

    public java.lang.Object getDetails() {
        return this.details;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setDetails(final java.lang.Object details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLRecurringOrderFailureErrorImpl that = (GraphQLRecurringOrderFailureErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(details, that.details)
                .append(code, that.code)
                .append(values, that.values)
                .append(details, that.details)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(details).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("details", details)
                .build();
    }

    @Override
    public GraphQLRecurringOrderFailureError copyDeep() {
        return GraphQLRecurringOrderFailureError.deepCopy(this);
    }
}
