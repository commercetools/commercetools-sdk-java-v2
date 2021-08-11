
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetLineItemCustomFieldActionBuilder implements Builder<MyCartSetLineItemCustomFieldAction> {

    private String lineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public MyCartSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public MyCartSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public MyCartSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public MyCartSetLineItemCustomFieldAction build() {
        Objects.requireNonNull(lineItemId, MyCartSetLineItemCustomFieldAction.class + ": lineItemId is missing");
        Objects.requireNonNull(name, MyCartSetLineItemCustomFieldAction.class + ": name is missing");
        return new MyCartSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    /**
     * builds MyCartSetLineItemCustomFieldAction without checking for non null required values
     */
    public MyCartSetLineItemCustomFieldAction buildUnchecked() {
        return new MyCartSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static MyCartSetLineItemCustomFieldActionBuilder of() {
        return new MyCartSetLineItemCustomFieldActionBuilder();
    }

    public static MyCartSetLineItemCustomFieldActionBuilder of(final MyCartSetLineItemCustomFieldAction template) {
        MyCartSetLineItemCustomFieldActionBuilder builder = new MyCartSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
