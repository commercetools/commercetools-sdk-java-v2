
package com.commercetools.importapi.models.productvariants;

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
 * Attributes
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributesImpl implements Attributes, ModelBase {

    private Map<String, com.commercetools.importapi.models.productvariants.Attribute> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributesImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, com.commercetools.importapi.models.productvariants.Attribute> values) {
        this.values = values;
    }

    /**
     * create empty instance
     */
    public AttributesImpl() {
    }

    /**
     *  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself. And since this property will be represented as a map, we can set individual attributes to null to delete them (which follows JSON Merge Patch semantics).</p>
     */

    public Map<String, com.commercetools.importapi.models.productvariants.Attribute> values() {
        return values;
    }

    public void setValue(String key, com.commercetools.importapi.models.productvariants.Attribute value) {
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

        AttributesImpl that = (AttributesImpl) o;

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
    public Attributes copyDeep() {
        return Attributes.deepCopy(this);
    }
}
