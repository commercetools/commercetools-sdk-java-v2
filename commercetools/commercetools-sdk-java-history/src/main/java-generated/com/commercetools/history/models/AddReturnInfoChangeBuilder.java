
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddReturnInfoChangeBuilder {

    private String change;

    private com.commercetools.history.models.ReturnInfo nextValue;

    public AddReturnInfoChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddReturnInfoChangeBuilder nextValue(final com.commercetools.history.models.ReturnInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.ReturnInfo getNextValue() {
        return this.nextValue;
    }

    public AddReturnInfoChange build() {
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
