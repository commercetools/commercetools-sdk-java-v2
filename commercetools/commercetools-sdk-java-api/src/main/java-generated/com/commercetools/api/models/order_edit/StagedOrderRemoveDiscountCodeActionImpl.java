
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderRemoveDiscountCodeActionImpl implements StagedOrderRemoveDiscountCodeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    @JsonCreator
    StagedOrderRemoveDiscountCodeActionImpl(
            @JsonProperty("discountCode") final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        this.action = REMOVE_DISCOUNT_CODE;
    }

    public StagedOrderRemoveDiscountCodeActionImpl() {
        this.action = REMOVE_DISCOUNT_CODE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:DiscountCode">DiscountCode</a>.</p>
    */
    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public void setDiscountCode(final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderRemoveDiscountCodeActionImpl that = (StagedOrderRemoveDiscountCodeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(discountCode, that.discountCode).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(discountCode).toHashCode();
    }

}
