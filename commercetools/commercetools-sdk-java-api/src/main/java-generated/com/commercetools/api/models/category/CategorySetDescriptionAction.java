package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.category.CategorySetDescriptionActionImpl;

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
@JsonDeserialize(as = CategorySetDescriptionActionImpl.class)
public interface CategorySetDescriptionAction extends CategoryUpdateAction {

    
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static CategorySetDescriptionAction of(){
        return new CategorySetDescriptionActionImpl();
    }
    

    public static CategorySetDescriptionAction of(final CategorySetDescriptionAction template) {
        CategorySetDescriptionActionImpl instance = new CategorySetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static CategorySetDescriptionActionBuilder builder(){
        return CategorySetDescriptionActionBuilder.of();
    }
    
    public static CategorySetDescriptionActionBuilder builder(final CategorySetDescriptionAction template){
        return CategorySetDescriptionActionBuilder.of(template);
    }
    

    default <T> T withCategorySetDescriptionAction(Function<CategorySetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
