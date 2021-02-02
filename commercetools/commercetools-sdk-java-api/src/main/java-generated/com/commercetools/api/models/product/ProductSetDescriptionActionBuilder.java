
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetDescriptionActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private Boolean staged;

    public ProductSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public ProductSetDescriptionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetDescriptionAction build() {
        return new ProductSetDescriptionActionImpl(description, staged);
    }

    public static ProductSetDescriptionActionBuilder of() {
        return new ProductSetDescriptionActionBuilder();
    }

    public static ProductSetDescriptionActionBuilder of(final ProductSetDescriptionAction template) {
        ProductSetDescriptionActionBuilder builder = new ProductSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        builder.staged = template.getStaged();
        return builder;
    }

}
