
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCustomFieldActionBuilder implements Builder<StagedOrderSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StagedOrderSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public StagedOrderSetCustomFieldAction build() {
        Objects.requireNonNull(name, StagedOrderSetCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds StagedOrderSetCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetCustomFieldAction buildUnchecked() {
        return new StagedOrderSetCustomFieldActionImpl(name, value);
    }

    public static StagedOrderSetCustomFieldActionBuilder of() {
        return new StagedOrderSetCustomFieldActionBuilder();
    }

    public static StagedOrderSetCustomFieldActionBuilder of(final StagedOrderSetCustomFieldAction template) {
        StagedOrderSetCustomFieldActionBuilder builder = new StagedOrderSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
