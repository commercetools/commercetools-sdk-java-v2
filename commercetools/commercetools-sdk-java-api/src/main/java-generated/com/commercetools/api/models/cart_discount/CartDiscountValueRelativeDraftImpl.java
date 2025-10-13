
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
 * CartDiscountValueRelativeDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueRelativeDraftImpl implements CartDiscountValueRelativeDraft, ModelBase {

    private String type;

    private Long permyriad;

    private com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountValueRelativeDraftImpl(@JsonProperty("permyriad") final Long permyriad,
            @JsonProperty("applicationMode") final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.permyriad = permyriad;
        this.applicationMode = applicationMode;
        this.type = RELATIVE;
    }

    /**
     * create empty instance
     */
    public CartDiscountValueRelativeDraftImpl() {
        this.type = RELATIVE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     */

    public Long getPermyriad() {
        return this.permyriad;
    }

    /**
     *  <p>Determines how the discount applies when using <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>.</p>
     *  <ul>
     *   <li>If the mode is <code>IndividualApplication</code>, the discounted percentage is applied on each unit's price. The units matching the <code>triggerPattern</code> are not considered.</li>
     *   <li>If the mode is <code>ProportionateDistribution</code> and <code>EvenDistribution</code> the discounted value is calculated from the total value of the units matching the <code>targetPattern</code> and distributed among the units matching the <code>targetPattern</code> or <code>triggerPattern</code>. These modes are allowed only if <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> <code>triggerPattern</code> is non-empty.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart_discount.DiscountApplicationMode getApplicationMode() {
        return this.applicationMode;
    }

    public void setPermyriad(final Long permyriad) {
        this.permyriad = permyriad;
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

        CartDiscountValueRelativeDraftImpl that = (CartDiscountValueRelativeDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(permyriad, that.permyriad)
                .append(applicationMode, that.applicationMode)
                .append(type, that.type)
                .append(permyriad, that.permyriad)
                .append(applicationMode, that.applicationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(permyriad).append(applicationMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("permyriad", permyriad)
                .append("applicationMode", applicationMode)
                .build();
    }

    @Override
    public CartDiscountValueRelativeDraft copyDeep() {
        return CartDiscountValueRelativeDraft.deepCopy(this);
    }
}
