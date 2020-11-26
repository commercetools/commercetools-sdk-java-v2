package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeNameAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangePredicateAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeValueAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetKeyAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountUpdateActionImpl implements ProductDiscountUpdateAction {

    private String action;

    @JsonCreator
    ProductDiscountUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public ProductDiscountUpdateActionImpl() {
    }

    
    public String getAction(){
        return this.action;
    }


}
