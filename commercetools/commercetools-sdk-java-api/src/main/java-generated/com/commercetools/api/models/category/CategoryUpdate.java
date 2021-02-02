
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryUpdateImpl.class)
public interface CategoryUpdate
        extends com.commercetools.api.models.ResourceUpdate<CategoryUpdate, CategoryUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CategoryUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final CategoryUpdateAction... actions);

    public void setActions(final List<CategoryUpdateAction> actions);

    public static CategoryUpdate of() {
        return new CategoryUpdateImpl();
    }

    public static CategoryUpdate of(final CategoryUpdate template) {
        CategoryUpdateImpl instance = new CategoryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static CategoryUpdateBuilder builder() {
        return CategoryUpdateBuilder.of();
    }

    public static CategoryUpdateBuilder builder(final CategoryUpdate template) {
        return CategoryUpdateBuilder.of(template);
    }

    default <T> T withCategoryUpdate(Function<CategoryUpdate, T> helper) {
        return helper.apply(this);
    }
}
