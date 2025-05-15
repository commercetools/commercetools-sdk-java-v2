
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
 *  <p>Renames an AttributeDefinition and also renames all corresponding Attributes on all Products with this ProductType. The renaming of the Attributes is eventually consistent.</p>
 *  <p>If the AttributeDefinition name to be changed does not exist, an AttributeNameDoesNotExist error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeAttributeNameActionImpl implements ProductTypeChangeAttributeNameAction, ModelBase {

    private String action;

    private String attributeName;

    private String newAttributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeChangeAttributeNameActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("newAttributeName") final String newAttributeName) {
        this.attributeName = attributeName;
        this.newAttributeName = newAttributeName;
        this.action = CHANGE_ATTRIBUTE_NAME;
    }

    /**
     * create empty instance
     */
    public ProductTypeChangeAttributeNameActionImpl() {
        this.action = CHANGE_ATTRIBUTE_NAME;
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
     *  <p>New user-defined name of the Attribute that is unique to the Project.</p>
     *  <p>When using the same <code>name</code> for an Attribute in two or more ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes. If not, an AttributeDefinitionAlreadyExists error is returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     */

    public String getNewAttributeName() {
        return this.newAttributeName;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setNewAttributeName(final String newAttributeName) {
        this.newAttributeName = newAttributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeAttributeNameActionImpl that = (ProductTypeChangeAttributeNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(newAttributeName, that.newAttributeName)
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(newAttributeName, that.newAttributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(newAttributeName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("attributeName", attributeName)
                .append("newAttributeName", newAttributeName)
                .build();
    }

    @Override
    public ProductTypeChangeAttributeNameAction copyDeep() {
        return ProductTypeChangeAttributeNameAction.deepCopy(this);
    }
}
