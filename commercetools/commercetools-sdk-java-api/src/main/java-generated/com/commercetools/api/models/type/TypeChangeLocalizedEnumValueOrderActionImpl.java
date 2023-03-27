
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
 *  <p>Changes the order of LocalizedEnumValues in a LocalizedEnumType FieldDefinition. This update action can be used to update a LocalizedEnumType FieldDefinition and a SetType of LocalizedEnumType FieldDefinitions.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeChangeLocalizedEnumValueOrderActionImpl implements TypeChangeLocalizedEnumValueOrderAction, ModelBase {

    private String action;

    private String fieldName;

    private java.util.List<String> keys;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeChangeLocalizedEnumValueOrderActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("keys") final java.util.List<String> keys) {
        this.fieldName = fieldName;
        this.keys = keys;
        this.action = CHANGE_LOCALIZED_ENUM_VALUE_ORDER;
    }

    /**
     * create empty instance
     */
    public TypeChangeLocalizedEnumValueOrderActionImpl() {
        this.action = CHANGE_LOCALIZED_ENUM_VALUE_ORDER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Must match the set of <code>key</code>s of the LocalizedEnumValues in the FieldDefinition (up to order).</p>
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

        TypeChangeLocalizedEnumValueOrderActionImpl that = (TypeChangeLocalizedEnumValueOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(fieldName, that.fieldName)
                .append(keys, that.keys)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).append(keys).toHashCode();
    }

}
