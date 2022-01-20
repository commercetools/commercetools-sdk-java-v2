
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartDiscountChangeIsActiveActionImpl implements CartDiscountChangeIsActiveAction, ModelBase {

    private String action;

    private Boolean isActive;

    @JsonCreator
    CartDiscountChangeIsActiveActionImpl(@JsonProperty("isActive") final Boolean isActive) {
        this.isActive = isActive;
        this.action = CHANGE_IS_ACTIVE;
    }

    public CartDiscountChangeIsActiveActionImpl() {
        this.action = CHANGE_IS_ACTIVE;
    }

    public String getAction() {
        return this.action;
    }

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

        CartDiscountChangeIsActiveActionImpl that = (CartDiscountChangeIsActiveActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(isActive, that.isActive).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(isActive).toHashCode();
    }

}
