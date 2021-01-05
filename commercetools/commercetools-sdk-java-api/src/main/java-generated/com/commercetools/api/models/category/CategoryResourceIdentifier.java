package com.commercetools.api.models.category;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.category.CategoryResourceIdentifierImpl;

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
@JsonDeserialize(as = CategoryResourceIdentifierImpl.class)
public interface CategoryResourceIdentifier extends ResourceIdentifier {



    public static CategoryResourceIdentifier of(){
        return new CategoryResourceIdentifierImpl();
    }
    

    public static CategoryResourceIdentifier of(final CategoryResourceIdentifier template) {
        CategoryResourceIdentifierImpl instance = new CategoryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static CategoryResourceIdentifierBuilder builder(){
        return CategoryResourceIdentifierBuilder.of();
    }
    
    public static CategoryResourceIdentifierBuilder builder(final CategoryResourceIdentifier template){
        return CategoryResourceIdentifierBuilder.of(template);
    }
    

    default <T> T withCategoryResourceIdentifier(Function<CategoryResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
