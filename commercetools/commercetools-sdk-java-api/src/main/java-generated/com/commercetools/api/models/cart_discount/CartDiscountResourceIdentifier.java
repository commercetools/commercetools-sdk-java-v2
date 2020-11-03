package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl;

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
@JsonDeserialize(as = CartDiscountResourceIdentifierImpl.class)
public interface CartDiscountResourceIdentifier extends ResourceIdentifier {



    public static CartDiscountResourceIdentifierImpl of(){
        return new CartDiscountResourceIdentifierImpl();
    }
    

    public static CartDiscountResourceIdentifierImpl of(final CartDiscountResourceIdentifier template) {
        CartDiscountResourceIdentifierImpl instance = new CartDiscountResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withCartDiscountResourceIdentifier(Function<CartDiscountResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
