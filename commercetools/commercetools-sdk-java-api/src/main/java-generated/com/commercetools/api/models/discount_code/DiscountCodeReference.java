package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl;

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
@JsonDeserialize(as = DiscountCodeReferenceImpl.class)
public interface DiscountCodeReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public DiscountCode getObj();

    public void setObj(final DiscountCode obj);

    public static DiscountCodeReference of(){
        return new DiscountCodeReferenceImpl();
    }
    

    public static DiscountCodeReference of(final DiscountCodeReference template) {
        DiscountCodeReferenceImpl instance = new DiscountCodeReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static DiscountCodeReferenceBuilder builder(){
        return DiscountCodeReferenceBuilder.of();
    }
    
    public static DiscountCodeReferenceBuilder builder(final DiscountCodeReference template){
        return DiscountCodeReferenceBuilder.of(template);
    }
    

    default <T> T withDiscountCodeReference(Function<DiscountCodeReference, T> helper) {
        return helper.apply(this);
    }
}
