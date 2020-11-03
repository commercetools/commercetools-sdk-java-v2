package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
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
public final class CartDiscountSetDescriptionActionImpl implements CartDiscountSetDescriptionAction {

    private String action;
    
    private com.commercetools.api.models.common.LocalizedString description;

    @JsonCreator
    CartDiscountSetDescriptionActionImpl(@JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        this.action = "setDescription";
    }
    public CartDiscountSetDescriptionActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If the <code>description</code> parameter is not included, the field will be emptied.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }

}
