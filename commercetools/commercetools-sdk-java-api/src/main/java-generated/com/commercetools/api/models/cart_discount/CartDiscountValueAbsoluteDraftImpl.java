
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
 * CartDiscountValueAbsoluteDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueAbsoluteDraftImpl implements CartDiscountValueAbsoluteDraft, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.common.Money> money;

    private com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountValueAbsoluteDraftImpl(
            @JsonProperty("money") final java.util.List<com.commercetools.api.models.common.Money> money,
            @JsonProperty("applicationMode") final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.money = money;
        this.applicationMode = applicationMode;
        this.type = ABSOLUTE;
    }

    /**
     * create empty instance
     */
    public CartDiscountValueAbsoluteDraftImpl() {
        this.type = ABSOLUTE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Money> getMoney() {
        return this.money;
    }

    /**
     *  <p>Determines how the discount applies on CartDiscountLineItemTarget and CartDiscountCustomLineItemTarget.</p>
     *  <p>If not set, the default behavior is <code>ProportionateDistribution</code>.</p>
     */

    public com.commercetools.api.models.cart_discount.DiscountApplicationMode getApplicationMode() {
        return this.applicationMode;
    }

    public void setMoney(final com.commercetools.api.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
    }

    public void setMoney(final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
    }

    public void setApplicationMode(
            final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.applicationMode = applicationMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountValueAbsoluteDraftImpl that = (CartDiscountValueAbsoluteDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(money, that.money)
                .append(applicationMode, that.applicationMode)
                .append(type, that.type)
                .append(money, that.money)
                .append(applicationMode, that.applicationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(money).append(applicationMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("money", money)
                .append("applicationMode", applicationMode)
                .build();
    }

    @Override
    public CartDiscountValueAbsoluteDraft copyDeep() {
        return CartDiscountValueAbsoluteDraft.deepCopy(this);
    }
}
