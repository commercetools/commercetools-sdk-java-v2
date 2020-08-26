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
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountUpdateActionImpl implements CartDiscountUpdateAction {

    private String action;

    @JsonCreator
    CartDiscountUpdateActionImpl() {
        this.action = "null";
    }
    

    
    public String getAction(){
        return this.action;
    }


}
