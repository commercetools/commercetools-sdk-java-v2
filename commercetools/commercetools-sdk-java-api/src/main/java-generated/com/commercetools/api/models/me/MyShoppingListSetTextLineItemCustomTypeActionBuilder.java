
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListSetTextLineItemCustomTypeActionBuilder {

    private String textLineItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public MyShoppingListSetTextLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public MyShoppingListSetTextLineItemCustomTypeAction build() {
        return new MyShoppingListSetTextLineItemCustomTypeActionImpl(textLineItemId, type, fields);
    }

    public static MyShoppingListSetTextLineItemCustomTypeActionBuilder of() {
        return new MyShoppingListSetTextLineItemCustomTypeActionBuilder();
    }

    public static MyShoppingListSetTextLineItemCustomTypeActionBuilder of(
            final MyShoppingListSetTextLineItemCustomTypeAction template) {
        MyShoppingListSetTextLineItemCustomTypeActionBuilder builder = new MyShoppingListSetTextLineItemCustomTypeActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
