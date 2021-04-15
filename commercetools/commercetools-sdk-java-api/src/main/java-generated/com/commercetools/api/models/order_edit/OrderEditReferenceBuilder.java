
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.order_edit.OrderEdit obj;

    public OrderEditReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderEditReferenceBuilder obj(@Nullable final com.commercetools.api.models.order_edit.OrderEdit obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.order_edit.OrderEdit getObj() {
        return this.obj;
    }

    public OrderEditReference build() {
        return new OrderEditReferenceImpl(id, obj);
    }

    public static OrderEditReferenceBuilder of() {
        return new OrderEditReferenceBuilder();
    }

    public static OrderEditReferenceBuilder of(final OrderEditReference template) {
        OrderEditReferenceBuilder builder = new OrderEditReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
