package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraftImpl;

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
@JsonDeserialize(as = CartDiscountValueRelativeDraftImpl.class)
public interface CartDiscountValueRelativeDraft extends CartDiscountValueDraft {

    
    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    public void setPermyriad(final Long permyriad);

    public static CartDiscountValueRelativeDraft of(){
        return new CartDiscountValueRelativeDraftImpl();
    }
    

    public static CartDiscountValueRelativeDraft of(final CartDiscountValueRelativeDraft template) {
        CartDiscountValueRelativeDraftImpl instance = new CartDiscountValueRelativeDraftImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    public static CartDiscountValueRelativeDraftBuilder builder(){
        return CartDiscountValueRelativeDraftBuilder.of();
    }
    
    public static CartDiscountValueRelativeDraftBuilder builder(final CartDiscountValueRelativeDraft template){
        return CartDiscountValueRelativeDraftBuilder.of(template);
    }
    

    default <T> T withCartDiscountValueRelativeDraft(Function<CartDiscountValueRelativeDraft, T> helper) {
        return helper.apply(this);
    }
}
