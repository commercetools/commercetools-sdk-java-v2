package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.category.CategoryChangeSlugActionImpl;

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
@JsonDeserialize(as = CategoryChangeSlugActionImpl.class)
public interface CategoryChangeSlugAction extends CategoryUpdateAction {

    /**
    *  <p>Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.
    *  Maximum size is {{ site.data.api-limits.slugLength }}.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    public void setSlug(final LocalizedString slug);

    public static CategoryChangeSlugActionImpl of(){
        return new CategoryChangeSlugActionImpl();
    }
    

    public static CategoryChangeSlugActionImpl of(final CategoryChangeSlugAction template) {
        CategoryChangeSlugActionImpl instance = new CategoryChangeSlugActionImpl();
        instance.setSlug(template.getSlug());
        return instance;
    }

    default <T> T withCategoryChangeSlugAction(Function<CategoryChangeSlugAction, T> helper) {
        return helper.apply(this);
    }
}
