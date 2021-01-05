package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.Reference;
import com.commercetools.ml.models.common.ReferenceTypeId;
import com.commercetools.ml.models.common.ProductReferenceImpl;

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
@JsonDeserialize(as = ProductReferenceImpl.class)
public interface ProductReference extends Reference {



    public static ProductReference of(){
        return new ProductReferenceImpl();
    }
    

    public static ProductReference of(final ProductReference template) {
        ProductReferenceImpl instance = new ProductReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public static ProductReferenceBuilder builder(){
        return ProductReferenceBuilder.of();
    }
    
    public static ProductReferenceBuilder builder(final ProductReference template){
        return ProductReferenceBuilder.of(template);
    }
    

    default <T> T withProductReference(Function<ProductReference, T> helper) {
        return helper.apply(this);
    }
}
