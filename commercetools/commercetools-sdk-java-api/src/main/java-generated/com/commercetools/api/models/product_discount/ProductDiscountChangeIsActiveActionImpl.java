
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
 * ProductDiscountChangeIsActiveAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountChangeIsActiveActionImpl implements ProductDiscountChangeIsActiveAction, ModelBase {

    private String action;

    private Boolean isActive;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDiscountChangeIsActiveActionImpl(@JsonProperty("isActive") final Boolean isActive) {
        this.isActive = isActive;
        this.action = CHANGE_IS_ACTIVE;
    }

    /**
     * create empty instance
     */
    public ProductDiscountChangeIsActiveActionImpl() {
        this.action = CHANGE_IS_ACTIVE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount will be applied to Product Prices.</p>
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

        ProductDiscountChangeIsActiveActionImpl that = (ProductDiscountChangeIsActiveActionImpl) o;

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
    public ProductDiscountChangeIsActiveAction copyDeep() {
        return ProductDiscountChangeIsActiveAction.deepCopy(this);
    }
}
