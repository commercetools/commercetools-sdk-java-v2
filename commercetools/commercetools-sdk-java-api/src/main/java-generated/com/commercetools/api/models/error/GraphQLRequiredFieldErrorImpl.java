
package com.commercetools.api.models.error;

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
 *  <p>Returned when a value is not defined for a required field.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLRequiredFieldErrorImpl implements GraphQLRequiredFieldError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private String field;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLRequiredFieldErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("field") final String field) {
        this.values = values;
        this.field = field;
        this.code = REQUIRED_FIELD;
    }

    /**
     * create empty instance
     */
    public GraphQLRequiredFieldErrorImpl() {
        this.code = REQUIRED_FIELD;
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
     *  <p>Name of the field missing the value.</p>
     */

    public String getField() {
        return this.field;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setField(final String field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLRequiredFieldErrorImpl that = (GraphQLRequiredFieldErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(field, that.field)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(field).toHashCode();
    }

}
