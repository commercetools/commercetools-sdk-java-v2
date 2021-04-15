
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetCustomFieldActionBuilder {

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
