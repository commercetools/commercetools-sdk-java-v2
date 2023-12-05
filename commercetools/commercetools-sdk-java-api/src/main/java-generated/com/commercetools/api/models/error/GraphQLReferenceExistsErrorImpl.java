
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
 *  <p>Returned when a resource cannot be deleted because it is being referenced by another resource.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLReferenceExistsErrorImpl implements GraphQLReferenceExistsError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.common.ReferenceTypeId referencedBy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLReferenceExistsErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("referencedBy") final com.commercetools.api.models.common.ReferenceTypeId referencedBy) {
        this.values = values;
        this.referencedBy = referencedBy;
        this.code = REFERENCE_EXISTS;
    }

    /**
     * create empty instance
     */
    public GraphQLReferenceExistsErrorImpl() {
        this.code = REFERENCE_EXISTS;
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
     *  <p>Type of referenced resource.</p>
     */

    public com.commercetools.api.models.common.ReferenceTypeId getReferencedBy() {
        return this.referencedBy;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setReferencedBy(final com.commercetools.api.models.common.ReferenceTypeId referencedBy) {
        this.referencedBy = referencedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLReferenceExistsErrorImpl that = (GraphQLReferenceExistsErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(referencedBy, that.referencedBy)
                .append(code, that.code)
                .append(values, that.values)
                .append(referencedBy, that.referencedBy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(referencedBy).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("referencedBy", referencedBy)
                .build();
    }

}
