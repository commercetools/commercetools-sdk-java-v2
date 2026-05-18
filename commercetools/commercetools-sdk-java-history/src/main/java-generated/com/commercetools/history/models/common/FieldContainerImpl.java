
package com.commercetools.history.models.common;

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
 * FieldContainer
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FieldContainerImpl implements FieldContainer, ModelBase {

    private Map<String, java.lang.Object> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FieldContainerImpl(@JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.values = values;
    }

    /**
     * create empty instance
     */
    public FieldContainerImpl() {
    }

    /**
     *  <p>JSON object with keys matching the names of Custom Fields (that is, <code>name</code>s in the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinitions</a>) and values given by <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a>.</p>
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

        return new EqualsBuilder().append(values, that.values).append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("values", values).build();
    }

    @Override
    public FieldContainer copyDeep() {
        return FieldContainer.deepCopy(this);
    }
}
