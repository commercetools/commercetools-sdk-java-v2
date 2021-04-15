
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetCustomFieldActionBuilder {

    private String name;

    @Nullable
    private java.lang.Object value;

    public ReviewSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ReviewSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public ReviewSetCustomFieldAction build() {
        return new ReviewSetCustomFieldActionImpl(name, value);
    }

    public static ReviewSetCustomFieldActionBuilder of() {
        return new ReviewSetCustomFieldActionBuilder();
    }

    public static ReviewSetCustomFieldActionBuilder of(final ReviewSetCustomFieldAction template) {
        ReviewSetCustomFieldActionBuilder builder = new ReviewSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
