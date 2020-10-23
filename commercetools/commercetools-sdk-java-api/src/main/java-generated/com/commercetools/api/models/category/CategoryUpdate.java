package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryUpdateImpl;

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
@JsonDeserialize(as = CategoryUpdateImpl.class)
public interface CategoryUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CategoryUpdateAction> getActions();

    public void setVersion(final Long version);
    
    public void setActions(final List<CategoryUpdateAction> actions);

    public static CategoryUpdateImpl of(){
        return new CategoryUpdateImpl();
    }
    

    public static CategoryUpdateImpl of(final CategoryUpdate template) {
        CategoryUpdateImpl instance = new CategoryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withCategoryUpdate(Function<CategoryUpdate, T> helper) {
        return helper.apply(this);
    }
}
