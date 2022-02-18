
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class FieldContainerImpl implements FieldContainer, ModelBase {

    private Map<String, java.lang.Object> values;

    @JsonCreator
    FieldContainerImpl(@JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.values = values;
    }

    public FieldContainerImpl() {
    }

    /**
    *  <p>JSON object with keys matching the names of Custom Fields (that is, <code>name</code>s in the <a href="ctp:api:type:FieldDefinition">FieldDefinitions</a>) and values given by <a href="ctp:api:type:CustomFieldValue">CustomFieldValue</a>.</p>
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

        FieldContainerImpl that = (FieldContainerImpl) o;

        return new EqualsBuilder().append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

}
