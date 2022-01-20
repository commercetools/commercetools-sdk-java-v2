
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductTypeChangeAttributeOrderActionImpl implements ProductTypeChangeAttributeOrderAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes;

    @JsonCreator
    ProductTypeChangeAttributeOrderActionImpl(
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes) {
        this.attributes = attributes;
        this.action = CHANGE_ATTRIBUTE_ORDER;
    }

    public ProductTypeChangeAttributeOrderActionImpl() {
        this.action = CHANGE_ATTRIBUTE_ORDER;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(final com.commercetools.api.models.product_type.AttributeDefinition... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeAttributeOrderActionImpl that = (ProductTypeChangeAttributeOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(attributes, that.attributes).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributes).toHashCode();
    }

}
