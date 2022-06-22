
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
 *  <p>Removes an AttributeDefinition and also deletes all corresponding Attributes on all Products with this ProductType. The removal of the Attributes is eventually consistent.</p>
 *  <p>The <code>CombinationUnique</code> constraint is not checked when an Attribute is removed, and uniqueness violations may occur when you remove an Attribute with a <code>CombinationUnique</code> constraint.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeRemoveAttributeDefinitionActionImpl
        implements ProductTypeRemoveAttributeDefinitionAction, ModelBase {

    private String action;

    private String name;

    @JsonCreator
    ProductTypeRemoveAttributeDefinitionActionImpl(@JsonProperty("name") final String name) {
        this.name = name;
        this.action = REMOVE_ATTRIBUTE_DEFINITION;
    }

    public ProductTypeRemoveAttributeDefinitionActionImpl() {
        this.action = REMOVE_ATTRIBUTE_DEFINITION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Name of the Attribute to remove.</p>
     */

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeRemoveAttributeDefinitionActionImpl that = (ProductTypeRemoveAttributeDefinitionActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).toHashCode();
    }

}
