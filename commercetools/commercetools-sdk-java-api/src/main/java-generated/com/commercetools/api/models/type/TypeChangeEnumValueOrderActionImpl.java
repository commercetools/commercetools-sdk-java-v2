
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Changes the order of EnumValues in an EnumType FieldDefinition. This update action can be used to update an EnumType FieldDefinition and a SetType FieldDefinition of EnumType.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeChangeEnumValueOrderActionImpl implements TypeChangeEnumValueOrderAction, ModelBase {

    private String action;

    private String fieldName;

    private java.util.List<String> keys;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeChangeEnumValueOrderActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("keys") final java.util.List<String> keys) {
        this.fieldName = fieldName;
        this.keys = keys;
        this.action = CHANGE_ENUM_VALUE_ORDER;
    }

    /**
     * create empty instance
     */
    public TypeChangeEnumValueOrderActionImpl() {
        this.action = CHANGE_ENUM_VALUE_ORDER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Must match the set of <code>key</code>s of the EnumValues in the FieldDefinition (apart from their order).</p>
     */

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setKeys(final String... keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
    }

    public void setKeys(final java.util.List<String> keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeChangeEnumValueOrderActionImpl that = (TypeChangeEnumValueOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(fieldName, that.fieldName)
                .append(keys, that.keys)
                .append(action, that.action)
                .append(fieldName, that.fieldName)
                .append(keys, that.keys)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).append(keys).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("fieldName", fieldName)
                .append("keys", keys)
                .build();
    }

    @Override
    public TypeChangeEnumValueOrderAction copyDeep() {
        return TypeChangeEnumValueOrderAction.deepCopy(this);
    }
}
