
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class RemovePropertyChangeBuilder implements Builder<RemovePropertyChange> {

    private String change;

    private String path;

    private java.lang.Object previousValue;

    public RemovePropertyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemovePropertyChangeBuilder path(final String path) {
        this.path = path;
        return this;
    }

    public RemovePropertyChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPath() {
        return this.path;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public RemovePropertyChange build() {
        Objects.requireNonNull(change, RemovePropertyChange.class + ": change is missing");
        Objects.requireNonNull(path, RemovePropertyChange.class + ": path is missing");
        Objects.requireNonNull(previousValue, RemovePropertyChange.class + ": previousValue is missing");
        return new RemovePropertyChangeImpl(change, path, previousValue);
    }

    /**
     * builds RemovePropertyChange without checking for non null required values
     */
    public RemovePropertyChange buildUnchecked() {
        return new RemovePropertyChangeImpl(change, path, previousValue);
    }

    public static RemovePropertyChangeBuilder of() {
        return new RemovePropertyChangeBuilder();
    }

    public static RemovePropertyChangeBuilder of(final RemovePropertyChange template) {
        RemovePropertyChangeBuilder builder = new RemovePropertyChangeBuilder();
        builder.change = template.getChange();
        builder.path = template.getPath();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
