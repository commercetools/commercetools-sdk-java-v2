
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PriceBuilder {

    private String id;

    private com.commercetools.history.models.Money value;

    public PriceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public PriceBuilder value(final com.commercetools.history.models.Money value) {
        this.value = value;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.Money getValue() {
        return this.value;
    }

    public Price build() {
        return new PriceImpl(id, value);
    }

    public static PriceBuilder of() {
        return new PriceBuilder();
    }

    public static PriceBuilder of(final Price template) {
        PriceBuilder builder = new PriceBuilder();
        builder.id = template.getId();
        builder.value = template.getValue();
        return builder;
    }

}
