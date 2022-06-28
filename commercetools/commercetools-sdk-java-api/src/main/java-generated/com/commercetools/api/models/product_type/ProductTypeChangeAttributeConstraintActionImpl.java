
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
 *  <p>Updates the <code>attributeConstraint</code> of an AttributeDefinition. For now only following changes are supported: <code>SameForAll</code> to <code>None</code> and <code>Unique</code> to <code>None</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeAttributeConstraintActionImpl
        implements ProductTypeChangeAttributeConstraintAction, ModelBase {

    private String action;

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue;

    @JsonCreator
    ProductTypeChangeAttributeConstraintActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("newValue") final com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue) {
        this.attributeName = attributeName;
        this.newValue = newValue;
        this.action = CHANGE_ATTRIBUTE_CONSTRAINT;
    }

    public ProductTypeChangeAttributeConstraintActionImpl() {
        this.action = CHANGE_ATTRIBUTE_CONSTRAINT;
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
     *  <p><code>None</code></p>
     */

    public com.commercetools.api.models.product_type.AttributeConstraintEnumDraft getNewValue() {
        return this.newValue;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setNewValue(final com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue) {
        this.newValue = newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeAttributeConstraintActionImpl that = (ProductTypeChangeAttributeConstraintActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(newValue, that.newValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(newValue).toHashCode();
    }

}
