
package com.commercetools.api.models.category;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> actions;

    public CategoryUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CategoryUpdateBuilder actions(final com.commercetools.api.models.category.CategoryUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public CategoryUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> getActions() {
        return this.actions;
    }

    public CategoryUpdate build() {
        return new CategoryUpdateImpl(version, actions);
    }

    public static CategoryUpdateBuilder of() {
        return new CategoryUpdateBuilder();
    }

    public static CategoryUpdateBuilder of(final CategoryUpdate template) {
        CategoryUpdateBuilder builder = new CategoryUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
