
package com.commercetools.api.models.product_discount;

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
 * ProductDiscountChangeSortOrderAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountChangeSortOrderActionImpl implements ProductDiscountChangeSortOrderAction, ModelBase {

    private String action;

    private String sortOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDiscountChangeSortOrderActionImpl(@JsonProperty("sortOrder") final String sortOrder) {
        this.sortOrder = sortOrder;
        this.action = CHANGE_SORT_ORDER;
    }

    /**
     * create empty instance
     */
    public ProductDiscountChangeSortOrderActionImpl() {
        this.action = CHANGE_SORT_ORDER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. Must not be empty. The string value must be a number between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized.</p>
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    public void setSortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountChangeSortOrderActionImpl that = (ProductDiscountChangeSortOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(sortOrder, that.sortOrder)
                .append(action, that.action)
                .append(sortOrder, that.sortOrder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(sortOrder).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("sortOrder", sortOrder)
                .build();
    }

    @Override
    public ProductDiscountChangeSortOrderAction copyDeep() {
        return ProductDiscountChangeSortOrderAction.deepCopy(this);
    }
}
