
package com.commercetools.api.models.discount_group;

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
 *  <p>Setting the sort order generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSortOrderSetMessage" rel="nofollow">DiscountGroupSortOrderSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupSetSortOrderActionImpl implements DiscountGroupSetSortOrderAction, ModelBase {

    private String action;

    private String sortOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountGroupSetSortOrderActionImpl(@JsonProperty("sortOrder") final String sortOrder) {
        this.sortOrder = sortOrder;
        this.action = SET_SORT_ORDER;
    }

    /**
     * create empty instance
     */
    public DiscountGroupSetSortOrderActionImpl() {
        this.action = SET_SORT_ORDER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>). A CartDiscount with a higher value will be prioritized.</p>
     *  <p>The sort order must be unique among all DiscountGroups and CartDiscounts.</p>
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

        DiscountGroupSetSortOrderActionImpl that = (DiscountGroupSetSortOrderActionImpl) o;

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
    public DiscountGroupSetSortOrderAction copyDeep() {
        return DiscountGroupSetSortOrderAction.deepCopy(this);
    }
}
