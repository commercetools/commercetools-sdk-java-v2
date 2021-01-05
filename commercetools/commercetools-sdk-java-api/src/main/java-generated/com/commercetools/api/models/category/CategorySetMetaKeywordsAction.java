package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.category.CategorySetMetaKeywordsActionImpl;

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
@JsonDeserialize(as = CategorySetMetaKeywordsActionImpl.class)
public interface CategorySetMetaKeywordsAction extends CategoryUpdateAction {

    
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public static CategorySetMetaKeywordsAction of(){
        return new CategorySetMetaKeywordsActionImpl();
    }
    

    public static CategorySetMetaKeywordsAction of(final CategorySetMetaKeywordsAction template) {
        CategorySetMetaKeywordsActionImpl instance = new CategorySetMetaKeywordsActionImpl();
        instance.setMetaKeywords(template.getMetaKeywords());
        return instance;
    }

    public static CategorySetMetaKeywordsActionBuilder builder(){
        return CategorySetMetaKeywordsActionBuilder.of();
    }
    
    public static CategorySetMetaKeywordsActionBuilder builder(final CategorySetMetaKeywordsAction template){
        return CategorySetMetaKeywordsActionBuilder.of(template);
    }
    

    default <T> T withCategorySetMetaKeywordsAction(Function<CategorySetMetaKeywordsAction, T> helper) {
        return helper.apply(this);
    }
}
