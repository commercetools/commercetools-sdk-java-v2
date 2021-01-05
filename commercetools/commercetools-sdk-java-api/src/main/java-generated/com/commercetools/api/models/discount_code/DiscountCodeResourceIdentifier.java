package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierImpl;

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
@JsonDeserialize(as = DiscountCodeResourceIdentifierImpl.class)
public interface DiscountCodeResourceIdentifier extends ResourceIdentifier {



    public static DiscountCodeResourceIdentifier of(){
        return new DiscountCodeResourceIdentifierImpl();
    }
    

    public static DiscountCodeResourceIdentifier of(final DiscountCodeResourceIdentifier template) {
        DiscountCodeResourceIdentifierImpl instance = new DiscountCodeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static DiscountCodeResourceIdentifierBuilder builder(){
        return DiscountCodeResourceIdentifierBuilder.of();
    }
    
    public static DiscountCodeResourceIdentifierBuilder builder(final DiscountCodeResourceIdentifier template){
        return DiscountCodeResourceIdentifierBuilder.of(template);
    }
    

    default <T> T withDiscountCodeResourceIdentifier(Function<DiscountCodeResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
