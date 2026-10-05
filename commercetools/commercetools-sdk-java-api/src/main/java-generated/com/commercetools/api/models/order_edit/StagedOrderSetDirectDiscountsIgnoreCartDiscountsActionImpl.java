
package com.commercetools.api.models.order_edit;

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
 *  <p>Determines whether the <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> on the Order replace the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>, or apply alongside them.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl
        implements StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction, ModelBase {

    private String action;

    private Boolean directDiscountsIgnoreCartDiscounts;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl(
            @JsonProperty("directDiscountsIgnoreCartDiscounts") final Boolean directDiscountsIgnoreCartDiscounts) {
        this.directDiscountsIgnoreCartDiscounts = directDiscountsIgnoreCartDiscounts;
        this.action = SET_DIRECT_DISCOUNTS_IGNORE_CART_DISCOUNTS;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl() {
        this.action = SET_DIRECT_DISCOUNTS_IGNORE_CART_DISCOUNTS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, only <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> apply to the Order. Matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> are ignored, and Discount Codes cannot be added.</li>
     *  </ul>
     *  <p>The value can be set to <code>true</code> only if the Order does not have both <code>discountCodes</code> and <code>directDiscounts</code>.</p>
     *  <ul>
     *   <li>If <code>false</code>, Cart Discounts, Discount Codes, and Direct Discounts apply to the Order.</li>
     *  </ul>
     */

    public Boolean getDirectDiscountsIgnoreCartDiscounts() {
        return this.directDiscountsIgnoreCartDiscounts;
    }

    public void setDirectDiscountsIgnoreCartDiscounts(final Boolean directDiscountsIgnoreCartDiscounts) {
        this.directDiscountsIgnoreCartDiscounts = directDiscountsIgnoreCartDiscounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl that = (StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(directDiscountsIgnoreCartDiscounts, that.directDiscountsIgnoreCartDiscounts)
                .append(action, that.action)
                .append(directDiscountsIgnoreCartDiscounts, that.directDiscountsIgnoreCartDiscounts)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(directDiscountsIgnoreCartDiscounts).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("directDiscountsIgnoreCartDiscounts", directDiscountsIgnoreCartDiscounts)
                .build();
    }

    @Override
    public StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction copyDeep() {
        return StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction.deepCopy(this);
    }
}
