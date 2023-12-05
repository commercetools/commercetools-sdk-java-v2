
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Returned when the <code>type</code> is different for an AttributeDefinition using the same <code>name</code> in multiple Product Types.</p>
 *  <p>The error is returned as a failed response to the Create ProductType request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAttributeDefinitionTypeConflictErrorImpl
        implements GraphQLAttributeDefinitionTypeConflictError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private String conflictingProductTypeId;

    private String conflictingProductTypeName;

    private String conflictingAttributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLAttributeDefinitionTypeConflictErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("conflictingProductTypeId") final String conflictingProductTypeId,
            @JsonProperty("conflictingProductTypeName") final String conflictingProductTypeName,
            @JsonProperty("conflictingAttributeName") final String conflictingAttributeName) {
        this.values = values;
        this.conflictingProductTypeId = conflictingProductTypeId;
        this.conflictingProductTypeName = conflictingProductTypeName;
        this.conflictingAttributeName = conflictingAttributeName;
        this.code = ATTRIBUTE_DEFINITION_TYPE_CONFLICT;
    }

    /**
     * create empty instance
     */
    public GraphQLAttributeDefinitionTypeConflictErrorImpl() {
        this.code = ATTRIBUTE_DEFINITION_TYPE_CONFLICT;
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
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     */

    public String getConflictingProductTypeId() {
        return this.conflictingProductTypeId;
    }

    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     */

    public String getConflictingProductTypeName() {
        return this.conflictingProductTypeName;
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

    public void setConflictingProductTypeId(final String conflictingProductTypeId) {
        this.conflictingProductTypeId = conflictingProductTypeId;
    }

    public void setConflictingProductTypeName(final String conflictingProductTypeName) {
        this.conflictingProductTypeName = conflictingProductTypeName;
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

        GraphQLAttributeDefinitionTypeConflictErrorImpl that = (GraphQLAttributeDefinitionTypeConflictErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(conflictingProductTypeId, that.conflictingProductTypeId)
                .append(conflictingProductTypeName, that.conflictingProductTypeName)
                .append(conflictingAttributeName, that.conflictingAttributeName)
                .append(code, that.code)
                .append(values, that.values)
                .append(conflictingProductTypeId, that.conflictingProductTypeId)
                .append(conflictingProductTypeName, that.conflictingProductTypeName)
                .append(conflictingAttributeName, that.conflictingAttributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(values)
                .append(conflictingProductTypeId)
                .append(conflictingProductTypeName)
                .append(conflictingAttributeName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("conflictingProductTypeId", conflictingProductTypeId)
                .append("conflictingProductTypeName", conflictingProductTypeName)
                .append("conflictingAttributeName", conflictingAttributeName)
                .build();
    }

}
