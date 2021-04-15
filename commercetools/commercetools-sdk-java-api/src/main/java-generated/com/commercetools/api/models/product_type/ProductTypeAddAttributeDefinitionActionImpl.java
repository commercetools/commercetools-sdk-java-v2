
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeAddAttributeDefinitionActionImpl implements ProductTypeAddAttributeDefinitionAction {

    private String action;

    private com.commercetools.api.models.product_type.AttributeDefinitionDraft attribute;

    @JsonCreator
    ProductTypeAddAttributeDefinitionActionImpl(
            @JsonProperty("attribute") final com.commercetools.api.models.product_type.AttributeDefinitionDraft attribute) {
        this.attribute = attribute;
        this.action = ADD_ATTRIBUTE_DEFINITION;
    }

    public ProductTypeAddAttributeDefinitionActionImpl() {
        this.action = ADD_ATTRIBUTE_DEFINITION;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.product_type.AttributeDefinitionDraft getAttribute() {
        return this.attribute;
    }

    public void setAttribute(final com.commercetools.api.models.product_type.AttributeDefinitionDraft attribute) {
        this.attribute = attribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeAddAttributeDefinitionActionImpl that = (ProductTypeAddAttributeDefinitionActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(attribute, that.attribute).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attribute).toHashCode();
    }

}
