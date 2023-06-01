package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountChangeCartPredicateAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeIsActiveAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeNameAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeRequiresDiscountCodeAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeSortOrderAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeStackingModeAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeTargetAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeValueAction;
import com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldAction;
import com.commercetools.api.models.cart_discount.CartDiscountSetCustomTypeAction;
import com.commercetools.api.models.cart_discount.CartDiscountSetDescriptionAction;
import com.commercetools.api.models.cart_discount.CartDiscountSetKeyAction;
import com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAction;
import com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAndUntilAction;
import com.commercetools.api.models.cart_discount.CartDiscountSetValidUntilAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * CartDiscountUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountUpdateActionImpl implements CartDiscountUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public CartDiscountUpdateActionImpl() {
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountUpdateActionImpl that = (CartDiscountUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
