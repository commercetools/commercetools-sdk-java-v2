
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryOrderHintsImpl.class)
public interface CategoryOrderHints {

    @NotNull
    @JsonAnyGetter
    public Map<String, String> values();

    @JsonAnySetter
    public void setValue(String key, String value);

    public static CategoryOrderHints of() {
        return new CategoryOrderHintsImpl();
    }

    public static CategoryOrderHints of(final CategoryOrderHints template) {
        CategoryOrderHintsImpl instance = new CategoryOrderHintsImpl();
        return instance;
    }

    public static CategoryOrderHintsBuilder builder() {
        return CategoryOrderHintsBuilder.of();
    }

    public static CategoryOrderHintsBuilder builder(final CategoryOrderHints template) {
        return CategoryOrderHintsBuilder.of(template);
    }

    default <T> T withCategoryOrderHints(Function<CategoryOrderHints, T> helper) {
        return helper.apply(this);
    }
}
