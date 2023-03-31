
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
 *  <p>Returned when the <code>CombinationUnique</code> AttributeConstraint criteria are not met during an Update Product request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDuplicateAttributeValuesErrorImpl implements GraphQLDuplicateAttributeValuesError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLDuplicateAttributeValuesErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.values = values;
        this.attributes = attributes;
        this.code = DUPLICATE_ATTRIBUTE_VALUES;
    }

    /**
     * create empty instance
     */
    public GraphQLDuplicateAttributeValuesErrorImpl() {
        this.code = DUPLICATE_ATTRIBUTE_VALUES;
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
     *  <p>Conflicting Attributes.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLDuplicateAttributeValuesErrorImpl that = (GraphQLDuplicateAttributeValuesErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(attributes, that.attributes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(attributes).toHashCode();
    }

}
