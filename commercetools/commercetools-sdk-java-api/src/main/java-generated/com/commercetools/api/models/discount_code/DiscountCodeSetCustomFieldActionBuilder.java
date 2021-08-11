
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetCustomFieldActionBuilder implements Builder<DiscountCodeSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public DiscountCodeSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public DiscountCodeSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public DiscountCodeSetCustomFieldAction build() {
        Objects.requireNonNull(name, DiscountCodeSetCustomFieldAction.class + ": name is missing");
        return new DiscountCodeSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds DiscountCodeSetCustomFieldAction without checking for non null required values
     */
    public DiscountCodeSetCustomFieldAction buildUnchecked() {
        return new DiscountCodeSetCustomFieldActionImpl(name, value);
    }

    public static DiscountCodeSetCustomFieldActionBuilder of() {
        return new DiscountCodeSetCustomFieldActionBuilder();
    }

    public static DiscountCodeSetCustomFieldActionBuilder of(final DiscountCodeSetCustomFieldAction template) {
        DiscountCodeSetCustomFieldActionBuilder builder = new DiscountCodeSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
