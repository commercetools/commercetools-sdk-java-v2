package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.category.CategorySetMetaDescriptionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategorySetMetaDescriptionActionImpl.class)
public interface CategorySetMetaDescriptionAction extends CategoryUpdateAction {

    
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    public void setMetaDescription(final LocalizedString metaDescription);

    public static CategorySetMetaDescriptionActionImpl of(){
        return new CategorySetMetaDescriptionActionImpl();
    }
    

    public static CategorySetMetaDescriptionActionImpl of(final CategorySetMetaDescriptionAction template) {
        CategorySetMetaDescriptionActionImpl instance = new CategorySetMetaDescriptionActionImpl();
        instance.setMetaDescription(template.getMetaDescription());
        return instance;
    }

    default <T extends Accessor<CategorySetMetaDescriptionAction>> T withCategorySetMetaDescriptionAction(Function<CategorySetMetaDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
