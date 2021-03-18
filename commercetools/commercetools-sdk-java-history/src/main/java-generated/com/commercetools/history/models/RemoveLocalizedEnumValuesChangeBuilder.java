
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveLocalizedEnumValuesChangeBuilder {

    private String change;

    private String attributeName;

    private com.commercetools.history.models.LocalizedEnumValue previousValue;

    public RemoveLocalizedEnumValuesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveLocalizedEnumValuesChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public RemoveLocalizedEnumValuesChangeBuilder previousValue(
            final com.commercetools.history.models.LocalizedEnumValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.LocalizedEnumValue getPreviousValue() {
        return this.previousValue;
    }

    public RemoveLocalizedEnumValuesChange build() {
        return new RemoveLocalizedEnumValuesChangeImpl(change, attributeName, previousValue);
    }

    public static RemoveLocalizedEnumValuesChangeBuilder of() {
        return new RemoveLocalizedEnumValuesChangeBuilder();
    }

    public static RemoveLocalizedEnumValuesChangeBuilder of(final RemoveLocalizedEnumValuesChange template) {
        RemoveLocalizedEnumValuesChangeBuilder builder = new RemoveLocalizedEnumValuesChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
