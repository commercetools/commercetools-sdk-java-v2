
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   SetValidUntilChange setValidUntilChange = SetValidUntilChange.builder()
           .change("{change}")
           .previousValue("{previousValue}")
           .nextValue("{nextValue}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetValidUntilChangeBuilder implements Builder<SetValidUntilChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setValidUntil</code></p>
     */

    public SetValidUntilChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetValidUntilChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetValidUntilChangeBuilder nextValue(final String nextValue) {
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

    public SetValidUntilChange build() {
        Objects.requireNonNull(change, SetValidUntilChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetValidUntilChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetValidUntilChange.class + ": nextValue is missing");
        return new SetValidUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetValidUntilChange without checking for non null required values
     */
    public SetValidUntilChange buildUnchecked() {
        return new SetValidUntilChangeImpl(change, previousValue, nextValue);
    }

    public static SetValidUntilChangeBuilder of() {
        return new SetValidUntilChangeBuilder();
    }

    public static SetValidUntilChangeBuilder of(final SetValidUntilChange template) {
        SetValidUntilChangeBuilder builder = new SetValidUntilChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
