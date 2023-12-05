
package com.commercetools.api.models.me;

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
 *  <p>Adds a DiscountCode to the Cart to activate the related CartDiscounts. Adding a Discount Code is only possible if no DirectDiscount has been applied to the Cart. Discount Codes can be added to frozen Carts, but their DiscountCodeState is then <code>DoesNotMatchCart</code>.</p>
 *  <p>The maximum number of Discount Codes in a Cart is restricted by a limit.</p>
 *  <p>Specific Error Code: MatchingPriceNotFound</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartAddDiscountCodeActionImpl implements MyCartAddDiscountCodeAction, ModelBase {

    private String action;

    private String code;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartAddDiscountCodeActionImpl(@JsonProperty("code") final String code) {
        this.code = code;
        this.action = ADD_DISCOUNT_CODE;
    }

    /**
     * create empty instance
     */
    public MyCartAddDiscountCodeActionImpl() {
        this.action = ADD_DISCOUNT_CODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>code</code> of a DiscountCode.</p>
     */

    public String getCode() {
        return this.code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartAddDiscountCodeActionImpl that = (MyCartAddDiscountCodeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(code, that.code)
                .append(action, that.action)
                .append(code, that.code)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(code).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("code", code)
                .build();
    }

}
