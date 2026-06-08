
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
 *  <p>Returned when a field value conflicts with an existing value causing a duplicate.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDuplicateFieldErrorImpl implements GraphQLDuplicateFieldError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private String field;

    private java.lang.Object duplicateValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLDuplicateFieldErrorImpl(@JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("field") final String field,
            @JsonProperty("duplicateValue") final java.lang.Object duplicateValue) {
        this.values = values;
        this.field = field;
        this.duplicateValue = duplicateValue;
        this.code = DUPLICATE_FIELD;
    }

    /**
     * create empty instance
     */
    public GraphQLDuplicateFieldErrorImpl() {
        this.code = DUPLICATE_FIELD;
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
     *  <p>Name of the conflicting field.</p>
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>Conflicting duplicate value.</p>
     */

    public java.lang.Object getDuplicateValue() {
        return this.duplicateValue;
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

    public void setDuplicateValue(final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLDuplicateFieldErrorImpl that = (GraphQLDuplicateFieldErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(field, that.field)
                .append(duplicateValue, that.duplicateValue)
                .append(code, that.code)
                .append(values, that.values)
                .append(field, that.field)
                .append(duplicateValue, that.duplicateValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(values)
                .append(field)
                .append(duplicateValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("field", field)
                .append("duplicateValue", duplicateValue)
                .build();
    }

    @Override
    public GraphQLDuplicateFieldError copyDeep() {
        return GraphQLDuplicateFieldError.deepCopy(this);
    }
}
