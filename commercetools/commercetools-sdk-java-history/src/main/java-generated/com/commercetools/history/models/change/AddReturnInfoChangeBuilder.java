
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddReturnInfoChangeBuilder implements Builder<AddReturnInfoChange> {

    private String change;

    private com.commercetools.history.models.common.ReturnInfo nextValue;

    public AddReturnInfoChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddReturnInfoChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReturnInfoBuilder, com.commercetools.history.models.common.ReturnInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReturnInfoBuilder.of()).build();
        return this;
    }

    public AddReturnInfoChangeBuilder nextValue(final com.commercetools.history.models.common.ReturnInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.ReturnInfo getNextValue() {
        return this.nextValue;
    }

    public AddReturnInfoChange build() {
        Objects.requireNonNull(change, AddReturnInfoChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddReturnInfoChange.class + ": nextValue is missing");
        return new AddReturnInfoChangeImpl(change, nextValue);
    }

    /**
     * builds AddReturnInfoChange without checking for non null required values
     */
    public AddReturnInfoChange buildUnchecked() {
        return new AddReturnInfoChangeImpl(change, nextValue);
    }

    public static AddReturnInfoChangeBuilder of() {
        return new AddReturnInfoChangeBuilder();
    }

    public static AddReturnInfoChangeBuilder of(final AddReturnInfoChange template) {
        AddReturnInfoChangeBuilder builder = new AddReturnInfoChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
