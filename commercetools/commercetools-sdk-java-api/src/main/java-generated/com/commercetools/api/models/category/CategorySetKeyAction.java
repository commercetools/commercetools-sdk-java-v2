
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategorySetKeyActionImpl.class)
public interface CategorySetKeyAction extends CategoryUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>User-defined unique identifier for the category.
    *  Keys can only contain alphanumeric characters (<code>a-Z, 0-9</code>), underscores and hyphens (<code>-, _</code>) and be between 2 and 256 characters.
    *  If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static CategorySetKeyAction of() {
        return new CategorySetKeyActionImpl();
    }

    public static CategorySetKeyAction of(final CategorySetKeyAction template) {
        CategorySetKeyActionImpl instance = new CategorySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CategorySetKeyActionBuilder builder() {
        return CategorySetKeyActionBuilder.of();
    }

    public static CategorySetKeyActionBuilder builder(final CategorySetKeyAction template) {
        return CategorySetKeyActionBuilder.of(template);
    }

    default <T> T withCategorySetKeyAction(Function<CategorySetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
