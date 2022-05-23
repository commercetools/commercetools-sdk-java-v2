
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetInterfaceIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetInterfaceIdChange setInterfaceIdChange = SetInterfaceIdChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetInterfaceIdChangeBuilder implements Builder<SetInterfaceIdChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     <*  <p>Shape of the action for <code>setInterfaceId</code></p>>
     */

    public SetInterfaceIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     <>
     */

    public SetInterfaceIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     <>
     */

    public SetInterfaceIdChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public SetInterfaceIdChange build() {
        Objects.requireNonNull(change, SetInterfaceIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetInterfaceIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetInterfaceIdChange.class + ": nextValue is missing");
        return new SetInterfaceIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetInterfaceIdChange without checking for non null required values
     */
    public SetInterfaceIdChange buildUnchecked() {
        return new SetInterfaceIdChangeImpl(change, previousValue, nextValue);
    }

    public static SetInterfaceIdChangeBuilder of() {
        return new SetInterfaceIdChangeBuilder();
    }

    public static SetInterfaceIdChangeBuilder of(final SetInterfaceIdChange template) {
        SetInterfaceIdChangeBuilder builder = new SetInterfaceIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
