
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetCustomFieldActionBuilder implements Builder<MyCartSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public MyCartSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public MyCartSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public MyCartSetCustomFieldAction build() {
        Objects.requireNonNull(name, MyCartSetCustomFieldAction.class + ": name is missing");
        return new MyCartSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyCartSetCustomFieldAction without checking for non null required values
     */
    public MyCartSetCustomFieldAction buildUnchecked() {
        return new MyCartSetCustomFieldActionImpl(name, value);
    }

    public static MyCartSetCustomFieldActionBuilder of() {
        return new MyCartSetCustomFieldActionBuilder();
    }

    public static MyCartSetCustomFieldActionBuilder of(final MyCartSetCustomFieldAction template) {
        MyCartSetCustomFieldActionBuilder builder = new MyCartSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
