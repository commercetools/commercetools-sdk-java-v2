package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>References a cart discount by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountKeyReferenceImpl.class)
public interface CartDiscountKeyReference extends KeyReference {



    public static CartDiscountKeyReferenceImpl of(){
        return new CartDiscountKeyReferenceImpl();
    }
    

    public static CartDiscountKeyReferenceImpl of(final CartDiscountKeyReference template) {
        CartDiscountKeyReferenceImpl instance = new CartDiscountKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

}
