
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
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupIsActiveSetMessage" rel="nofollow">DiscountGroupIsActiveSet</a> Message.</p>
 *  <p>If the <span>limit</span> for active Discount Groups has been reached, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxDiscountGroupsReachedError" rel="nofollow">MaxDiscountGroupsReached</a> error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupSetIsActiveActionImpl implements DiscountGroupSetIsActiveAction, ModelBase {

    private String action;

    private Boolean isActive;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountGroupSetIsActiveActionImpl(@JsonProperty("isActive") final Boolean isActive) {
        this.isActive = isActive;
        this.action = SET_IS_ACTIVE;
    }

    /**
     * create empty instance
     */
    public DiscountGroupSetIsActiveActionImpl() {
        this.action = SET_IS_ACTIVE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountGroupSetIsActiveActionImpl that = (DiscountGroupSetIsActiveActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(isActive, that.isActive)
                .append(action, that.action)
                .append(isActive, that.isActive)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(isActive).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("isActive", isActive)
                .build();
    }

    @Override
    public DiscountGroupSetIsActiveAction copyDeep() {
        return DiscountGroupSetIsActiveAction.deepCopy(this);
    }
}
