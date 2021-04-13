
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveAssetChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.Asset previousValue;

    public RemoveAssetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveAssetChangeBuilder previousValue(final com.commercetools.history.models.common.Asset previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Asset getPreviousValue() {
        return this.previousValue;
    }

    public RemoveAssetChange build() {
        return new RemoveAssetChangeImpl(change, previousValue);
    }

    public static RemoveAssetChangeBuilder of() {
        return new RemoveAssetChangeBuilder();
    }

    public static RemoveAssetChangeBuilder of(final RemoveAssetChange template) {
        RemoveAssetChangeBuilder builder = new RemoveAssetChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
