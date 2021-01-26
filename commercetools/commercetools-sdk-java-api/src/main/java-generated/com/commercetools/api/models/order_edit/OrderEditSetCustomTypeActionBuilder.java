
package com.commercetools.api.models.order_edit;

import java.lang.Object;
import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.order_edit.OrderEditSetCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetCustomTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private java.lang.Object fields;

    public OrderEditSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public OrderEditSetCustomTypeActionBuilder fields(@Nullable final java.lang.Object fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public java.lang.Object getFields() {
        return this.fields;
    }

    public OrderEditSetCustomTypeAction build() {
        return new OrderEditSetCustomTypeActionImpl(type, fields);
    }

    public static OrderEditSetCustomTypeActionBuilder of() {
        return new OrderEditSetCustomTypeActionBuilder();
    }

    public static OrderEditSetCustomTypeActionBuilder of(final OrderEditSetCustomTypeAction template) {
        OrderEditSetCustomTypeActionBuilder builder = new OrderEditSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
