
package com.commercetools.api.models.common;

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
 * DiscountedPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedPriceImpl implements DiscountedPrice, ModelBase {

    private com.commercetools.api.models.common.TypedMoney value;

    private com.commercetools.api.models.product_discount.ProductDiscountReference discount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedPriceImpl(@JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value,
            @JsonProperty("discount") final com.commercetools.api.models.product_discount.ProductDiscountReference discount) {
        this.value = value;
        this.discount = discount;
    }

    /**
     * create empty instance
     */
    public DiscountedPriceImpl() {
    }

    /**
     *  <p>Money value of the discounted price.</p>
     *  <ul>
     *   <li><p>When a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountValueRelative" rel="nofollow">relative Product Discount</a> applies and the fractional part of the resulting discounted price is 0.5, the discounted price is <span>rounded half down</span>.</p><p>For example, a price of &euro;1.01 (<code>centAmount: 101</code>) with a 50% discount (<code>permyriad: 5000</code>) calculates to &euro;0.505. Since the fractional half-cent is exactly 0.5, it rounds down to &euro;0.50 (<code>centAmount: 50</code>).</p></li>
     *   <li><p>When an <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountValueAbsolute" rel="nofollow">absolute Product Discount</a> exceeds the price of the Product Variant, the resulting discounted price is set to <code>0</code>.</p></li>
     *  </ul>
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> related to the discounted price.</p>
     */

    public com.commercetools.api.models.product_discount.ProductDiscountReference getDiscount() {
        return this.discount;
    }

    public void setValue(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
    }

    public void setDiscount(final com.commercetools.api.models.product_discount.ProductDiscountReference discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountedPriceImpl that = (DiscountedPriceImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(discount, that.discount)
                .append(value, that.value)
                .append(discount, that.discount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).append(discount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("value", value)
                .append("discount", discount)
                .build();
    }

    @Override
    public DiscountedPrice copyDeep() {
        return DiscountedPrice.deepCopy(this);
    }
}
