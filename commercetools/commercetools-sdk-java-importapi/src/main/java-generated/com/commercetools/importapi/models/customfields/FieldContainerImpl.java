
package com.commercetools.importapi.models.customfields;

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
*  <p>Maps the custom field names to the actual values.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class FieldContainerImpl implements FieldContainer, ModelBase {

    private Map<String, com.commercetools.importapi.models.customfields.CustomField> values;

    @JsonCreator
    FieldContainerImpl(
            @JsonProperty("values") final Map<String, com.commercetools.importapi.models.customfields.CustomField> values) {
        this.values = values;
    }

    public FieldContainerImpl() {
    }

    /**
    *  <p>Mapping from the custom field name to the actual value.</p>
    */
    public Map<String, com.commercetools.importapi.models.customfields.CustomField> values() {
        return values;
    }

    public void setValue(String key, com.commercetools.importapi.models.customfields.CustomField value) {
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
