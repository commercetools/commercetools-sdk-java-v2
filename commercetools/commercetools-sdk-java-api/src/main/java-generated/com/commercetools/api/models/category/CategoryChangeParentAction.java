package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryChangeParentActionImpl;

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
@JsonDeserialize(as = CategoryChangeParentActionImpl.class)
public interface CategoryChangeParentAction extends CategoryUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("parent")
    public CategoryResourceIdentifier getParent();

    public void setParent(final CategoryResourceIdentifier parent);

    public static CategoryChangeParentActionImpl of(){
        return new CategoryChangeParentActionImpl();
    }
    

    public static CategoryChangeParentActionImpl of(final CategoryChangeParentAction template) {
        CategoryChangeParentActionImpl instance = new CategoryChangeParentActionImpl();
        instance.setParent(template.getParent());
        return instance;
    }

    default <T> T withCategoryChangeParentAction(Function<CategoryChangeParentAction, T> helper) {
        return helper.apply(this);
    }
}
