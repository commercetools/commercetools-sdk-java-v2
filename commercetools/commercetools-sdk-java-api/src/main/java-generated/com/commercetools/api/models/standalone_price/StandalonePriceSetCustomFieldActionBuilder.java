
package com.commercetools.api.models.standalone_price;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StandalonePriceSetCustomFieldActionBuilder implements Builder<StandalonePriceSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public StandalonePriceSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StandalonePriceSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public StandalonePriceSetCustomFieldAction build() {
        Objects.requireNonNull(name, StandalonePriceSetCustomFieldAction.class + ": name is missing");
        return new StandalonePriceSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds StandalonePriceSetCustomFieldAction without checking for non null required values
     */
    public StandalonePriceSetCustomFieldAction buildUnchecked() {
        return new StandalonePriceSetCustomFieldActionImpl(name, value);
    }

    public static StandalonePriceSetCustomFieldActionBuilder of() {
        return new StandalonePriceSetCustomFieldActionBuilder();
    }

    public static StandalonePriceSetCustomFieldActionBuilder of(final StandalonePriceSetCustomFieldAction template) {
        StandalonePriceSetCustomFieldActionBuilder builder = new StandalonePriceSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
