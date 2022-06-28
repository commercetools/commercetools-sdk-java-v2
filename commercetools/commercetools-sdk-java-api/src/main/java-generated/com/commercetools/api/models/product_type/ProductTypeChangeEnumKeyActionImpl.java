
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

/**
 *  <p>Updates the key of a single enum <code>value</code> in an AttributeEnumType AttributeDefinition, AttributeLocalizedEnumType AttributeDefinition, AttributeSetType of AttributeEnumType AttributeDefinition, or AttributeSetType of AttributeLocalizedEnumType AttributeDefinition.</p>
 *  <p>All Products will be updated to the new key in an eventually consistent way.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeEnumKeyActionImpl implements ProductTypeChangeEnumKeyAction, ModelBase {

    private String action;

    private String attributeName;

    private String key;

    private String newKey;

    @JsonCreator
    ProductTypeChangeEnumKeyActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("key") final String key, @JsonProperty("newKey") final String newKey) {
        this.attributeName = attributeName;
        this.key = key;
        this.newKey = newKey;
        this.action = CHANGE_ENUM_KEY;
    }

    public ProductTypeChangeEnumKeyActionImpl() {
        this.action = CHANGE_ENUM_KEY;
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
     *  <p>Existing key to be changed.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>New key to be set.</p>
     */

    public String getNewKey() {
        return this.newKey;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setNewKey(final String newKey) {
        this.newKey = newKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeEnumKeyActionImpl that = (ProductTypeChangeEnumKeyActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(key, that.key)
                .append(newKey, that.newKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(key).append(newKey).toHashCode();
    }

}
