
package com.commercetools.api.models.product_type;

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
 *  <p>Removes enum values from an AttributeDefinition of AttributeEnumType, AttributeLocalizedEnumType, AttributeSetType of AttributeEnumType, or AttributeSetType of AttributeLocalizedEnumType.</p>
 *  <p>If the Attribute is <strong>not</strong> required, the Attributes of all Products using those enum keys will also be removed in an eventually consistent way. If the Attribute is required, the operation returns an EnumValueIsUsed error.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeRemoveEnumValuesActionImpl implements ProductTypeRemoveEnumValuesAction, ModelBase {

    private String action;

    private String attributeName;

    private java.util.List<String> keys;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeRemoveEnumValuesActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("keys") final java.util.List<String> keys) {
        this.attributeName = attributeName;
        this.keys = keys;
        this.action = REMOVE_ENUM_VALUES;
    }

    /**
     * create empty instance
     */
    public ProductTypeRemoveEnumValuesActionImpl() {
        this.action = REMOVE_ENUM_VALUES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     */

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
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

        ProductTypeRemoveEnumValuesActionImpl that = (ProductTypeRemoveEnumValuesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(keys, that.keys)
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(keys, that.keys)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(keys).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("attributeName", attributeName)
                .append("keys", keys)
                .build();
    }

    @Override
    public ProductTypeRemoveEnumValuesAction copyDeep() {
        return ProductTypeRemoveEnumValuesAction.deepCopy(this);
    }
}
