
package com.commercetools.api.models.category;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryChangeNameActionImpl;
import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryChangeNameActionImpl.class)
public interface CategoryChangeNameAction extends CategoryUpdateAction {

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static CategoryChangeNameAction of() {
        return new CategoryChangeNameActionImpl();
    }

    public static CategoryChangeNameAction of(final CategoryChangeNameAction template) {
        CategoryChangeNameActionImpl instance = new CategoryChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static CategoryChangeNameActionBuilder builder() {
        return CategoryChangeNameActionBuilder.of();
    }

    public static CategoryChangeNameActionBuilder builder(final CategoryChangeNameAction template) {
        return CategoryChangeNameActionBuilder.of(template);
    }

    default <T> T withCategoryChangeNameAction(Function<CategoryChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
