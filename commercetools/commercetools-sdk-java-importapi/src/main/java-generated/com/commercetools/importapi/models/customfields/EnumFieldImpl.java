
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
 *  <p>A field with an enum value.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumFieldImpl implements EnumField, ModelBase {

    private String type;

    private String value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    EnumFieldImpl(@JsonProperty("value") final String value) {
        this.value = value;
        this.type = ENUM;
    }

    /**
     * create empty instance
     */
    public EnumFieldImpl() {
        this.type = ENUM;
    }

    /**
     *  <p>The type of this field.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The key of the enum value. Must be a <code>key</code> of one of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumValue" rel="nofollow">CustomFieldEnumValues</a> defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumType" rel="nofollow">CustomFieldEnumType</a>.</p>
     */

    public String getValue() {
        return this.value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EnumFieldImpl that = (EnumFieldImpl) o;

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
    public EnumField copyDeep() {
        return EnumField.deepCopy(this);
    }
}
