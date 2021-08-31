
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetCustomFieldActionBuilder implements Builder<CategorySetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public CategorySetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CategorySetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CategorySetCustomFieldAction build() {
        Objects.requireNonNull(name, CategorySetCustomFieldAction.class + ": name is missing");
        return new CategorySetCustomFieldActionImpl(name, value);
    }

    /**
     * builds CategorySetCustomFieldAction without checking for non null required values
     */
    public CategorySetCustomFieldAction buildUnchecked() {
        return new CategorySetCustomFieldActionImpl(name, value);
    }

    public static CategorySetCustomFieldActionBuilder of() {
        return new CategorySetCustomFieldActionBuilder();
    }

    public static CategorySetCustomFieldActionBuilder of(final CategorySetCustomFieldAction template) {
        CategorySetCustomFieldActionBuilder builder = new CategorySetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
