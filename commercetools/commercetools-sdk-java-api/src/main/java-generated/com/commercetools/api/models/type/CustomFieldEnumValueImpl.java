
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

/**
*  <p>Defines an allowed value of a <a href="ctp:api:type:CustomFieldEnumType">CustomFieldEnumType</a> field.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomFieldEnumValueImpl implements CustomFieldEnumValue, ModelBase {

    private String key;

    private String label;

    @JsonCreator
    CustomFieldEnumValueImpl(@JsonProperty("key") final String key, @JsonProperty("label") final String label) {
        this.key = key;
        this.label = label;
    }

    public CustomFieldEnumValueImpl() {
    }

    /**
    *  <p>Key of the value used as a programmatic identifier.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Descriptive label of the value.</p>
    */
    public String getLabel() {
        return this.label;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldEnumValueImpl that = (CustomFieldEnumValueImpl) o;

        return new EqualsBuilder().append(key, that.key).append(label, that.label).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(label).toHashCode();
    }

}
