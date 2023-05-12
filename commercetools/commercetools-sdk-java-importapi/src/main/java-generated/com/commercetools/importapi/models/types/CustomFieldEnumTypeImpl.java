
package com.commercetools.importapi.models.types;

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
 *  <p>Field type for enum values.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldEnumTypeImpl implements CustomFieldEnumType, ModelBase {

    private String name;

    private java.util.List<com.commercetools.importapi.models.types.CustomFieldEnumValue> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomFieldEnumTypeImpl(
            @JsonProperty("values") final java.util.List<com.commercetools.importapi.models.types.CustomFieldEnumValue> values) {
        this.values = values;
        this.name = ENUM;
    }

    /**
     * create empty instance
     */
    public CustomFieldEnumTypeImpl() {
        this.name = ENUM;
    }

    /**
     *
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Allowed values.</p>
     */

    public java.util.List<com.commercetools.importapi.models.types.CustomFieldEnumValue> getValues() {
        return this.values;
    }

    public void setValues(final com.commercetools.importapi.models.types.CustomFieldEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public void setValues(final java.util.List<com.commercetools.importapi.models.types.CustomFieldEnumValue> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldEnumTypeImpl that = (CustomFieldEnumTypeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(values).toHashCode();
    }

}
