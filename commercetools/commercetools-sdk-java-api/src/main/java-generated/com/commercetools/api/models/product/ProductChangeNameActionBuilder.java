
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductChangeNameActionBuilder {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private Boolean staged;

    public ProductChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ProductChangeNameActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductChangeNameAction build() {
        return new ProductChangeNameActionImpl(name, staged);
    }

    public static ProductChangeNameActionBuilder of() {
        return new ProductChangeNameActionBuilder();
    }

    public static ProductChangeNameActionBuilder of(final ProductChangeNameAction template) {
        ProductChangeNameActionBuilder builder = new ProductChangeNameActionBuilder();
        builder.name = template.getName();
        builder.staged = template.getStaged();
        return builder;
    }

}
