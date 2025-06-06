
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
 * ProductTypeAddAttributeDefinitionAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeAddAttributeDefinitionActionImpl implements ProductTypeAddAttributeDefinitionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product_type.AttributeDefinitionDraft attribute;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeAddAttributeDefinitionActionImpl(
            @JsonProperty("attribute") final com.commercetools.api.models.product_type.AttributeDefinitionDraft attribute) {
        this.attribute = attribute;
        this.action = ADD_ATTRIBUTE_DEFINITION;
    }

    /**
     * create empty instance
     */
    public ProductTypeAddAttributeDefinitionActionImpl() {
        this.action = ADD_ATTRIBUTE_DEFINITION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to append to <code>attributes</code>.</p>
     */

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

        return new EqualsBuilder().append(action, that.action)
                .append(attribute, that.attribute)
                .append(action, that.action)
                .append(attribute, that.attribute)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attribute).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("attribute", attribute)
                .build();
    }

    @Override
    public ProductTypeAddAttributeDefinitionAction copyDeep() {
        return ProductTypeAddAttributeDefinitionAction.deepCopy(this);
    }
}
