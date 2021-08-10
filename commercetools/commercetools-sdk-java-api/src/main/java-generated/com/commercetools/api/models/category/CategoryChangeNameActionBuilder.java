
package com.commercetools.api.models.category;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryChangeNameActionBuilder implements Builder<CategoryChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    public CategoryChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public CategoryChangeNameAction build() {
        Objects.requireNonNull(name);
        return new CategoryChangeNameActionImpl(name);
    }

    /**
     * builds CategoryChangeNameAction without checking for non null required values
     */
    public CategoryChangeNameAction buildUnchecked() {
        return new CategoryChangeNameActionImpl(name);
    }

    public static CategoryChangeNameActionBuilder of() {
        return new CategoryChangeNameActionBuilder();
    }

    public static CategoryChangeNameActionBuilder of(final CategoryChangeNameAction template) {
        CategoryChangeNameActionBuilder builder = new CategoryChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
