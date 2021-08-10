
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddInterfaceInteractionChangeBuilder implements Builder<AddInterfaceInteractionChange> {

    private String change;

    private com.commercetools.history.models.change_value.CustomFieldExpandedValue nextValue;

    public AddInterfaceInteractionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddInterfaceInteractionChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.CustomFieldExpandedValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.CustomFieldExpandedValue getNextValue() {
        return this.nextValue;
    }

    public AddInterfaceInteractionChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(nextValue);
        return new AddInterfaceInteractionChangeImpl(change, nextValue);
    }

    /**
     * builds AddInterfaceInteractionChange without checking for non null required values
     */
    public AddInterfaceInteractionChange buildUnchecked() {
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
