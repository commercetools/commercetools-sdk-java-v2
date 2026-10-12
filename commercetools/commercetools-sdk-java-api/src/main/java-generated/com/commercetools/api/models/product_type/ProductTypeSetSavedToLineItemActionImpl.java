
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the <code>savedToLineItem</code> property of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> on a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. This update action controls whether the Attribute value is copied onto a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> when a Product is added to a Cart.</p>
 *  <p>Changing this value does not immediately affect Line Items already in a Cart. Existing Line Items are updated the next time their Product data is refreshed, such as when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRecalculateAction" rel="nofollow">Recalculate</a> update action is performed with <code>updateProductData</code> set to <code>true</code>, or on a Cart update that triggers an API Extension. Replicating a Cart creates a new Cart that contains the current Product data; it does not update the original Cart.</p>
 *  <p>When <code>savedToLineItem</code> is <code>false</code>, <span>LineItem predicates</span> that reference this Attribute, such as those in Cart Discounts and Shipping Methods, evaluate as if the Attribute is not set.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeSetSavedToLineItemActionImpl implements ProductTypeSetSavedToLineItemAction, ModelBase {

    private String action;

    private String attributeName;

    private Boolean savedToLineItem;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeSetSavedToLineItemActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("savedToLineItem") final Boolean savedToLineItem) {
        this.attributeName = attributeName;
        this.savedToLineItem = savedToLineItem;
        this.action = SET_SAVED_TO_LINE_ITEM;
    }

    /**
     * create empty instance
     */
    public ProductTypeSetSavedToLineItemActionImpl() {
        this.action = SET_SAVED_TO_LINE_ITEM;
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
     *  <p>Whether the Attribute value is copied onto a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> when the Product is added to a Cart. See <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> for details.</p>
     *  <p>It has no effect if the Attribute already has the given value.</p>
     */

    public Boolean getSavedToLineItem() {
        return this.savedToLineItem;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setSavedToLineItem(final Boolean savedToLineItem) {
        this.savedToLineItem = savedToLineItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeSetSavedToLineItemActionImpl that = (ProductTypeSetSavedToLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(savedToLineItem, that.savedToLineItem)
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(savedToLineItem, that.savedToLineItem)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(savedToLineItem).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("attributeName", attributeName)
                .append("savedToLineItem", savedToLineItem)
                .build();
    }

    @Override
    public ProductTypeSetSavedToLineItemAction copyDeep() {
        return ProductTypeSetSavedToLineItemAction.deepCopy(this);
    }
}
