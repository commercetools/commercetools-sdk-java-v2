
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
 *  <p>Discounts the Product Price by a fixed amount, defined by the <code>money</code> field.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountValueAbsoluteDraftImpl implements ProductDiscountValueAbsoluteDraft, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.common.Money> money;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDiscountValueAbsoluteDraftImpl(
            @JsonProperty("money") final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
        this.type = ABSOLUTE;
    }

    /**
     * create empty instance
     */
    public ProductDiscountValueAbsoluteDraftImpl() {
        this.type = ABSOLUTE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Money> getMoney() {
        return this.money;
    }

    public void setMoney(final com.commercetools.api.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
    }

    public void setMoney(final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountValueAbsoluteDraftImpl that = (ProductDiscountValueAbsoluteDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(money, that.money)
                .append(type, that.type)
                .append(money, that.money)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(money).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("money", money)
                .build();
    }

    @Override
    public ProductDiscountValueAbsoluteDraft copyDeep() {
        return ProductDiscountValueAbsoluteDraft.deepCopy(this);
    }
}
