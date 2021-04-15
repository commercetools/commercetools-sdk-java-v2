
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditResourceIdentifierBuilder {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public OrderEditResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public OrderEditResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public OrderEditResourceIdentifier build() {
        return new OrderEditResourceIdentifierImpl(id, key);
    }

    public static OrderEditResourceIdentifierBuilder of() {
        return new OrderEditResourceIdentifierBuilder();
    }

    public static OrderEditResourceIdentifierBuilder of(final OrderEditResourceIdentifier template) {
        OrderEditResourceIdentifierBuilder builder = new OrderEditResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
