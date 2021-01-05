package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.cart_discount.CartDiscountSetDescriptionActionImpl;

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
@JsonDeserialize(as = CartDiscountSetDescriptionActionImpl.class)
public interface CartDiscountSetDescriptionAction extends CartDiscountUpdateAction {

    /**
    *  <p>If the <code>description</code> parameter is not included, the field will be emptied.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static CartDiscountSetDescriptionAction of(){
        return new CartDiscountSetDescriptionActionImpl();
    }
    

    public static CartDiscountSetDescriptionAction of(final CartDiscountSetDescriptionAction template) {
        CartDiscountSetDescriptionActionImpl instance = new CartDiscountSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static CartDiscountSetDescriptionActionBuilder builder(){
        return CartDiscountSetDescriptionActionBuilder.of();
    }
    
    public static CartDiscountSetDescriptionActionBuilder builder(final CartDiscountSetDescriptionAction template){
        return CartDiscountSetDescriptionActionBuilder.of(template);
    }
    

    default <T> T withCartDiscountSetDescriptionAction(Function<CartDiscountSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
