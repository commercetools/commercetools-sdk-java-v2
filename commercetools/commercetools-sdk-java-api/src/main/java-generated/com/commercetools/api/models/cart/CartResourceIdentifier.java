package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.cart.CartResourceIdentifierImpl;

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
@JsonDeserialize(as = CartResourceIdentifierImpl.class)
public interface CartResourceIdentifier extends ResourceIdentifier {



    public static CartResourceIdentifier of(){
        return new CartResourceIdentifierImpl();
    }
    

    public static CartResourceIdentifier of(final CartResourceIdentifier template) {
        CartResourceIdentifierImpl instance = new CartResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static CartResourceIdentifierBuilder builder(){
        return CartResourceIdentifierBuilder.of();
    }
    
    public static CartResourceIdentifierBuilder builder(final CartResourceIdentifier template){
        return CartResourceIdentifierBuilder.of(template);
    }
    

    default <T> T withCartResourceIdentifier(Function<CartResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
