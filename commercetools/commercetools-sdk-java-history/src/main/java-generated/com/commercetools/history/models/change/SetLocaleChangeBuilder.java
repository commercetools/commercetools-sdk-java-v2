
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   SetLocaleChange setLocaleChange = SetLocaleChange.builder()
           .change("{change}")
           .previousValue("{previousValue}")
           .nextValue("{nextValue}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLocaleChangeBuilder implements Builder<SetLocaleChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Update action for <code>setLocale</code> on reviews</p>
     */

    public SetLocaleChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>A locale of IETF language tag.</p>
     */

    public SetLocaleChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>A locale of IETF language tag.</p>
     */

    public SetLocaleChangeBuilder nextValue(final String nextValue) {
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

    public SetLocaleChange build() {
        Objects.requireNonNull(change, SetLocaleChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetLocaleChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLocaleChange.class + ": nextValue is missing");
        return new SetLocaleChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetLocaleChange without checking for non null required values
     */
    public SetLocaleChange buildUnchecked() {
        return new SetLocaleChangeImpl(change, previousValue, nextValue);
    }

    public static SetLocaleChangeBuilder of() {
        return new SetLocaleChangeBuilder();
    }

    public static SetLocaleChangeBuilder of(final SetLocaleChange template) {
        SetLocaleChangeBuilder builder = new SetLocaleChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
