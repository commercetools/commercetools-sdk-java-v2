
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>A field with an enum set value.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumSetFieldImpl implements EnumSetField, ModelBase {

    private String type;

    private java.util.List<String> value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    EnumSetFieldImpl(@JsonProperty("value") final java.util.List<String> value) {
        this.value = value;
        this.type = ENUM_SET;
    }

    /**
     * create empty instance
     */
    public EnumSetFieldImpl() {
        this.type = ENUM_SET;
    }

    /**
     *  <p>The type of this field.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>JSON array of enum values, each represented by its key. Each key must match the key of a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumValue" rel="nofollow">CustomFieldLocalizedEnumValue</a> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumType" rel="nofollow">CustomFieldEnumType</a>. The order of items in the array is not fixed.</p>
     */

    public java.util.List<String> getValue() {
        return this.value;
    }

    public void setValue(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
    }

    public void setValue(final java.util.List<String> value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EnumSetFieldImpl that = (EnumSetFieldImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(value, that.value)
                .append(type, that.type)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("value", value)
                .build();
    }

    @Override
    public EnumSetField copyDeep() {
        return EnumSetField.deepCopy(this);
    }
}
