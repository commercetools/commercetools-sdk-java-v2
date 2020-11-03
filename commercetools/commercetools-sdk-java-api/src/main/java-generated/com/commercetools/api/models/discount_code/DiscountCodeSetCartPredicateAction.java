package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeSetCartPredicateActionImpl.class)
public interface DiscountCodeSetCartPredicateAction extends DiscountCodeUpdateAction {

    /**
    *  <p>If the <code>cartPredicate</code> parameter is not included, the field will be emptied.</p>
    */
    
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    public void setCartPredicate(final String cartPredicate);

    public static DiscountCodeSetCartPredicateActionImpl of(){
        return new DiscountCodeSetCartPredicateActionImpl();
    }
    

    public static DiscountCodeSetCartPredicateActionImpl of(final DiscountCodeSetCartPredicateAction template) {
        DiscountCodeSetCartPredicateActionImpl instance = new DiscountCodeSetCartPredicateActionImpl();
        instance.setCartPredicate(template.getCartPredicate());
        return instance;
    }

    default <T> T withDiscountCodeSetCartPredicateAction(Function<DiscountCodeSetCartPredicateAction, T> helper) {
        return helper.apply(this);
    }
}
