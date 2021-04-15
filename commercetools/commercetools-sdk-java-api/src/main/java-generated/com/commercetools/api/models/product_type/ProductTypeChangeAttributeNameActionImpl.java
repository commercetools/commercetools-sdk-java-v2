
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
public final class ProductTypeChangeAttributeNameActionImpl implements ProductTypeChangeAttributeNameAction {

    private String action;

    private String attributeName;

    private String newAttributeName;

    @JsonCreator
    ProductTypeChangeAttributeNameActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("newAttributeName") final String newAttributeName) {
        this.attributeName = attributeName;
        this.newAttributeName = newAttributeName;
        this.action = CHANGE_ATTRIBUTE_NAME;
    }

    public ProductTypeChangeAttributeNameActionImpl() {
        this.action = CHANGE_ATTRIBUTE_NAME;
    }

    public String getAction() {
        return this.action;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(newAttributeName).toHashCode();
    }

}
