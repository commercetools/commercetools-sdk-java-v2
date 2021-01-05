package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.Reference;
import com.commercetools.ml.models.common.ReferenceTypeId;
import com.commercetools.ml.models.common.CategoryReferenceImpl;

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
@JsonDeserialize(as = CategoryReferenceImpl.class)
public interface CategoryReference extends Reference {



    public static CategoryReference of(){
        return new CategoryReferenceImpl();
    }
    

    public static CategoryReference of(final CategoryReference template) {
        CategoryReferenceImpl instance = new CategoryReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public static CategoryReferenceBuilder builder(){
        return CategoryReferenceBuilder.of();
    }
    
    public static CategoryReferenceBuilder builder(final CategoryReference template){
        return CategoryReferenceBuilder.of(template);
    }
    

    default <T> T withCategoryReference(Function<CategoryReference, T> helper) {
        return helper.apply(this);
    }
}
