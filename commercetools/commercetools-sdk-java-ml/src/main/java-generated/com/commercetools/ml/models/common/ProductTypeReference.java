package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.Reference;
import com.commercetools.ml.models.common.ReferenceTypeId;
import com.commercetools.ml.models.common.ProductTypeReferenceImpl;

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
@JsonDeserialize(as = ProductTypeReferenceImpl.class)
public interface ProductTypeReference extends Reference {



    public static ProductTypeReference of(){
        return new ProductTypeReferenceImpl();
    }
    

    public static ProductTypeReference of(final ProductTypeReference template) {
        ProductTypeReferenceImpl instance = new ProductTypeReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public static ProductTypeReferenceBuilder builder(){
        return ProductTypeReferenceBuilder.of();
    }
    
    public static ProductTypeReferenceBuilder builder(final ProductTypeReference template){
        return ProductTypeReferenceBuilder.of(template);
    }
    

    default <T> T withProductTypeReference(Function<ProductTypeReference, T> helper) {
        return helper.apply(this);
    }
}
