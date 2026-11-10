
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Removes LocalizedEnumValues from a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumType" rel="nofollow">LocalizedEnumType</a> FieldDefinition. This update action can be used to update a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumType" rel="nofollow">LocalizedEnumType</a> FieldDefinition and a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> FieldDefinition of <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumType" rel="nofollow">LocalizedEnumType</a>.</p>
 *  <p>This update action is always allowed, even if the FieldDefinition is <code>required</code> and even if a resource still has a Custom Field value referencing one of the removed keys. Existing Custom Field values are not updated or removed by this update action, and are returned unchanged until they are explicitly updated. Note that a subsequent update of a single Custom Field on such a resource can fail, because that update revalidates all Custom Field values on the resource.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeRemoveLocalizedEnumValuesActionImpl implements TypeRemoveLocalizedEnumValuesAction, ModelBase {

    private String action;

    private String fieldName;

    private java.util.List<String> keys;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeRemoveLocalizedEnumValuesActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("keys") final java.util.List<String> keys) {
        this.fieldName = fieldName;
        this.keys = keys;
        this.action = REMOVE_LOCALIZED_ENUM_VALUES;
    }

    /**
     * create empty instance
     */
    public TypeRemoveLocalizedEnumValuesActionImpl() {
        this.action = REMOVE_LOCALIZED_ENUM_VALUES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to update.</p>
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumValue" rel="nofollow">LocalizedEnumValues</a> to remove. An empty array results in no change.</p>
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

        TypeRemoveLocalizedEnumValuesActionImpl that = (TypeRemoveLocalizedEnumValuesActionImpl) o;

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
    public TypeRemoveLocalizedEnumValuesAction copyDeep() {
        return TypeRemoveLocalizedEnumValuesAction.deepCopy(this);
    }
}
