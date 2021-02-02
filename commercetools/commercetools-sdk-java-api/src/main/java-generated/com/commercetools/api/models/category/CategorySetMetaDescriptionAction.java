
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategorySetMetaDescriptionActionImpl.class)
public interface CategorySetMetaDescriptionAction extends CategoryUpdateAction {

    String SET_META_DESCRIPTION = "setMetaDescription";

    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    public void setMetaDescription(final LocalizedString metaDescription);

    public static CategorySetMetaDescriptionAction of() {
        return new CategorySetMetaDescriptionActionImpl();
    }

    public static CategorySetMetaDescriptionAction of(final CategorySetMetaDescriptionAction template) {
        CategorySetMetaDescriptionActionImpl instance = new CategorySetMetaDescriptionActionImpl();
        instance.setMetaDescription(template.getMetaDescription());
        return instance;
    }

    public static CategorySetMetaDescriptionActionBuilder builder() {
        return CategorySetMetaDescriptionActionBuilder.of();
    }

    public static CategorySetMetaDescriptionActionBuilder builder(final CategorySetMetaDescriptionAction template) {
        return CategorySetMetaDescriptionActionBuilder.of(template);
    }

    default <T> T withCategorySetMetaDescriptionAction(Function<CategorySetMetaDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
