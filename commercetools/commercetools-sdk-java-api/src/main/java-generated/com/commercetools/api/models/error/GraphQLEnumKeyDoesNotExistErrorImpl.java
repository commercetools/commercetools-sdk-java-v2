
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
 *  <p>Returned when an AttributeEnumType or AttributeLocalizedEnumType already contains a value with the given key.</p>
 *  <p>The error is returned as a failed response to the Change the key of an EnumValue update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLEnumKeyDoesNotExistErrorImpl implements GraphQLEnumKeyDoesNotExistError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private String conflictingEnumKey;

    private String conflictingAttributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLEnumKeyDoesNotExistErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("conflictingEnumKey") final String conflictingEnumKey,
            @JsonProperty("conflictingAttributeName") final String conflictingAttributeName) {
        this.values = values;
        this.conflictingEnumKey = conflictingEnumKey;
        this.conflictingAttributeName = conflictingAttributeName;
        this.code = ENUM_KEY_DOES_NOT_EXIST;
    }

    /**
     * create empty instance
     */
    public GraphQLEnumKeyDoesNotExistErrorImpl() {
        this.code = ENUM_KEY_DOES_NOT_EXIST;
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
     *  <p>Conflicting enum key.</p>
     */

    public String getConflictingEnumKey() {
        return this.conflictingEnumKey;
    }

    /**
     *  <p>Name of the conflicting Attribute.</p>
     */

    public String getConflictingAttributeName() {
        return this.conflictingAttributeName;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setConflictingEnumKey(final String conflictingEnumKey) {
        this.conflictingEnumKey = conflictingEnumKey;
    }

    public void setConflictingAttributeName(final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLEnumKeyDoesNotExistErrorImpl that = (GraphQLEnumKeyDoesNotExistErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(conflictingEnumKey, that.conflictingEnumKey)
                .append(conflictingAttributeName, that.conflictingAttributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(values)
                .append(conflictingEnumKey)
                .append(conflictingAttributeName)
                .toHashCode();
    }

}
