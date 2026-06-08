
package com.commercetools.api.models.cart_discount;

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
 * CartDiscountSetDiscountGroupAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetDiscountGroupActionImpl implements CartDiscountSetDiscountGroupAction, ModelBase {

    private String action;

    private com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier discountGroup;

    private String sortOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountSetDiscountGroupActionImpl(
            @JsonProperty("discountGroup") final com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier discountGroup,
            @JsonProperty("sortOrder") final String sortOrder) {
        this.discountGroup = discountGroup;
        this.sortOrder = sortOrder;
        this.action = SET_DISCOUNT_GROUP;
    }

    /**
     * create empty instance
     */
    public CartDiscountSetDiscountGroupActionImpl() {
        this.action = SET_DISCOUNT_GROUP;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Reference to a DiscountGroup that the Cart Discount must belong to. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier getDiscountGroup() {
        return this.discountGroup;
    }

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>) that determines the order in which the CartDiscounts are applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>Required if <code>discountGroup</code> is absent. If <code>discountGroup</code> is set, the CartDiscount will use the sort order of the DiscountGroup.</p>
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    public void setDiscountGroup(
            final com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier discountGroup) {
        this.discountGroup = discountGroup;
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

        CartDiscountSetDiscountGroupActionImpl that = (CartDiscountSetDiscountGroupActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(discountGroup, that.discountGroup)
                .append(sortOrder, that.sortOrder)
                .append(action, that.action)
                .append(discountGroup, that.discountGroup)
                .append(sortOrder, that.sortOrder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(discountGroup).append(sortOrder).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("discountGroup", discountGroup)
                .append("sortOrder", sortOrder)
                .build();
    }

    @Override
    public CartDiscountSetDiscountGroupAction copyDeep() {
        return CartDiscountSetDiscountGroupAction.deepCopy(this);
    }
}
