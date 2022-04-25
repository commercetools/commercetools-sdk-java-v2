
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryReferenceImpl.class)
public interface CategoryReference extends Reference {

    String CATEGORY = "category";

    public static CategoryReference of() {
        return new CategoryReferenceImpl();
    }

    public static CategoryReference of(final CategoryReference template) {
        CategoryReferenceImpl instance = new CategoryReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public static CategoryReferenceBuilder builder() {
        return CategoryReferenceBuilder.of();
    }

    public static CategoryReferenceBuilder builder(final CategoryReference template) {
        return CategoryReferenceBuilder.of(template);
    }

    default <T> T withCategoryReference(Function<CategoryReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryReference>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryReference>";
            }
        };
    }
}
