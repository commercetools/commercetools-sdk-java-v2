
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddInterfaceInteractionChangeBuilder {

    private String change;

    private com.commercetools.history.models.CustomFieldExpandedValue nextValue;

    public AddInterfaceInteractionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddInterfaceInteractionChangeBuilder nextValue(
            final com.commercetools.history.models.CustomFieldExpandedValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.CustomFieldExpandedValue getNextValue() {
        return this.nextValue;
    }

    public AddInterfaceInteractionChange build() {
        return new AddInterfaceInteractionChangeImpl(change, nextValue);
    }

    public static AddInterfaceInteractionChangeBuilder of() {
        return new AddInterfaceInteractionChangeBuilder();
    }

    public static AddInterfaceInteractionChangeBuilder of(final AddInterfaceInteractionChange template) {
        AddInterfaceInteractionChangeBuilder builder = new AddInterfaceInteractionChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
