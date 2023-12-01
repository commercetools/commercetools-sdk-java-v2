
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Field type for localized enum values.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldLocalizedEnumTypeImpl implements CustomFieldLocalizedEnumType, ModelBase {

    private String name;

    private java.util.List<com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValue> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomFieldLocalizedEnumTypeImpl(
            @JsonProperty("values") final java.util.List<com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
        this.name = LOCALIZED_ENUM;
    }

    /**
     * create empty instance
     */
    public CustomFieldLocalizedEnumTypeImpl() {
        this.name = LOCALIZED_ENUM;
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

    public java.util.List<com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValue> getValues() {
        return this.values;
    }

    public void setValues(final com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public void setValues(
            final java.util.List<com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldLocalizedEnumTypeImpl that = (CustomFieldLocalizedEnumTypeImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(values, that.values)
                .append(name, that.name)
                .append(values, that.values)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("values", values)
                .build();
    }

}
