
package com.commercetools.api.models.cart;

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
 *  <p>Indicates the best deal logic applies to a Cart or Order and indicates the discount type that offers the best deal.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BestDealImpl implements BestDeal, ModelBase {

    private String type;

    private String chosenDiscountType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BestDealImpl(@JsonProperty("chosenDiscountType") final String chosenDiscountType) {
        this.chosenDiscountType = chosenDiscountType;
        this.type = BEST_DEAL;
    }

    /**
     * create empty instance
     */
    public BestDealImpl() {
        this.type = BEST_DEAL;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Discount type that offers the best deal; the value can be <code>product-discount</code> or <code>cart-discount</code>.</p>
     */

    public String getChosenDiscountType() {
        return this.chosenDiscountType;
    }

    public void setChosenDiscountType(final String chosenDiscountType) {
        this.chosenDiscountType = chosenDiscountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BestDealImpl that = (BestDealImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(chosenDiscountType, that.chosenDiscountType)
                .append(type, that.type)
                .append(chosenDiscountType, that.chosenDiscountType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(chosenDiscountType).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("chosenDiscountType", chosenDiscountType)
                .build();
    }

}
