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



    public static ProductReferenceImpl of(){
        return new ProductReferenceImpl();
    }
    

    public static ProductReferenceImpl of(final ProductReference template) {
        ProductReferenceImpl instance = new ProductReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    default <T> T withProductReference(Function<ProductReference, T> helper) {
        return helper.apply(this);
    }
}
