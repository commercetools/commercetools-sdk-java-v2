
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
 *  <p>Returned when an AttributeEnumType or AttributeLocalizedEnumType contains duplicate keys.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDuplicateEnumValuesErrorImpl implements GraphQLDuplicateEnumValuesError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private java.util.List<String> duplicates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLDuplicateEnumValuesErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("duplicates") final java.util.List<String> duplicates) {
        this.values = values;
        this.duplicates = duplicates;
        this.code = DUPLICATE_ENUM_VALUES;
    }

    /**
     * create empty instance
     */
    public GraphQLDuplicateEnumValuesErrorImpl() {
        this.code = DUPLICATE_ENUM_VALUES;
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
     *  <p>Duplicate keys.</p>
     */

    public java.util.List<String> getDuplicates() {
        return this.duplicates;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setDuplicates(final String... duplicates) {
        this.duplicates = new ArrayList<>(Arrays.asList(duplicates));
    }

    public void setDuplicates(final java.util.List<String> duplicates) {
        this.duplicates = duplicates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLDuplicateEnumValuesErrorImpl that = (GraphQLDuplicateEnumValuesErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(duplicates, that.duplicates)
                .append(code, that.code)
                .append(values, that.values)
                .append(duplicates, that.duplicates)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(duplicates).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("duplicates", duplicates)
                .build();
    }

    @Override
    public GraphQLDuplicateEnumValuesError copyDeep() {
        return GraphQLDuplicateEnumValuesError.deepCopy(this);
    }
}
