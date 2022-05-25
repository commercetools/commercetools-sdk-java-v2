
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

/**
 *  <p>Sets the DiscountedLineItemPrice of the CartDiscountLineItemsTarget or CartDiscountCustomLineItemsTarget to the value specified in the <code>money</code> field, if it is lower than the current Line Item price for the same currency. If the Line Item price is already discounted to a price equal to or lower than the respective price in the <code>money</code> field, this Discount is not applied.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueFixedImpl implements CartDiscountValueFixed, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money;

    @JsonCreator
    CartDiscountValueFixedImpl(
            @JsonProperty("money") final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
        this.money = money;
        this.type = FIXED;
    }

    public CartDiscountValueFixedImpl() {
        this.type = FIXED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> getMoney() {
        return this.money;
    }

    public void setMoney(final com.commercetools.api.models.common.CentPrecisionMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
    }

    public void setMoney(final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountValueFixedImpl that = (CartDiscountValueFixedImpl) o;

        return new EqualsBuilder().append(type, that.type).append(money, that.money).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(money).toHashCode();
    }

}
