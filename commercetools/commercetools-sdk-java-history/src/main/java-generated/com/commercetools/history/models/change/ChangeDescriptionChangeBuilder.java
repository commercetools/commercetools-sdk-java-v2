
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ChangeDescriptionChange changeDescriptionChange = ChangeDescriptionChange.builder()
           .change("{change}")
           .previousValue("{previousValue}")
           .nextValue("{nextValue}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeDescriptionChangeBuilder implements Builder<ChangeDescriptionChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>changeDescription</code></p>
     */

    public ChangeDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeDescriptionChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeDescriptionChangeBuilder nextValue(final String nextValue) {
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

    public ChangeDescriptionChange build() {
        Objects.requireNonNull(change, ChangeDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeDescriptionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeDescriptionChange.class + ": nextValue is missing");
        return new ChangeDescriptionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeDescriptionChange without checking for non null required values
     */
    public ChangeDescriptionChange buildUnchecked() {
        return new ChangeDescriptionChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeDescriptionChangeBuilder of() {
        return new ChangeDescriptionChangeBuilder();
    }

    public static ChangeDescriptionChangeBuilder of(final ChangeDescriptionChange template) {
        ChangeDescriptionChangeBuilder builder = new ChangeDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
