
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartAddDiscountCodeActionImpl implements CartAddDiscountCodeAction {

    private String action;

    private String code;

    @JsonCreator
    CartAddDiscountCodeActionImpl(@JsonProperty("code") final String code) {
        this.code = code;
        this.action = ADD_DISCOUNT_CODE;
    }

    public CartAddDiscountCodeActionImpl() {
        this.action = ADD_DISCOUNT_CODE;
    }

    public String getAction() {
        return this.action;
    }

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

        CartAddDiscountCodeActionImpl that = (CartAddDiscountCodeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(code, that.code).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(code).toHashCode();
    }

}
