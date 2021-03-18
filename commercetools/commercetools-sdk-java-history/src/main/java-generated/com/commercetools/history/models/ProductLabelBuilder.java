
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductLabelBuilder {

    private com.commercetools.history.models.LocalizedString slug;

    private com.commercetools.history.models.LocalizedString name;

    public ProductLabelBuilder slug(final com.commercetools.history.models.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public ProductLabelBuilder name(final com.commercetools.history.models.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.history.models.LocalizedString getSlug() {
        return this.slug;
    }

    public com.commercetools.history.models.LocalizedString getName() {
        return this.name;
    }

    public ProductLabel build() {
        return new ProductLabelImpl(slug, name);
    }

    public static ProductLabelBuilder of() {
        return new ProductLabelBuilder();
    }

    public static ProductLabelBuilder of(final ProductLabel template) {
        ProductLabelBuilder builder = new ProductLabelBuilder();
        builder.slug = template.getSlug();
        builder.name = template.getName();
        return builder;
    }

}
