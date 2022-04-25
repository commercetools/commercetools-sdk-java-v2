
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryChangeSlugActionImpl.class)
public interface CategoryChangeSlugAction extends CategoryUpdateAction {

    String CHANGE_SLUG = "changeSlug";

    /**
    *  <p>Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.
    *  Maximum size is {{ site.data.api-limits.slugLength }}.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    public void setSlug(final LocalizedString slug);

    public static CategoryChangeSlugAction of() {
        return new CategoryChangeSlugActionImpl();
    }

    public static CategoryChangeSlugAction of(final CategoryChangeSlugAction template) {
        CategoryChangeSlugActionImpl instance = new CategoryChangeSlugActionImpl();
        instance.setSlug(template.getSlug());
        return instance;
    }

    public static CategoryChangeSlugActionBuilder builder() {
        return CategoryChangeSlugActionBuilder.of();
    }

    public static CategoryChangeSlugActionBuilder builder(final CategoryChangeSlugAction template) {
        return CategoryChangeSlugActionBuilder.of(template);
    }

    default <T> T withCategoryChangeSlugAction(Function<CategoryChangeSlugAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeSlugAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeSlugAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeSlugAction>";
            }
        };
    }
}
