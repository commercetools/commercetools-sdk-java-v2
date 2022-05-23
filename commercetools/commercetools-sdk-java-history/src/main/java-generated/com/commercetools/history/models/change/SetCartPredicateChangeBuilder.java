
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCartPredicateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCartPredicateChange setCartPredicateChange = SetCartPredicateChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCartPredicateChangeBuilder implements Builder<SetCartPredicateChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     <*  <p>Shape of the action for <code>setCartPredicate</code></p>>
     */

    public SetCartPredicateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     <>
     */

    public SetCartPredicateChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     <>
     */

    public SetCartPredicateChangeBuilder nextValue(final String nextValue) {
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

    public SetCartPredicateChange build() {
        Objects.requireNonNull(change, SetCartPredicateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCartPredicateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCartPredicateChange.class + ": nextValue is missing");
        return new SetCartPredicateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCartPredicateChange without checking for non null required values
     */
    public SetCartPredicateChange buildUnchecked() {
        return new SetCartPredicateChangeImpl(change, previousValue, nextValue);
    }

    public static SetCartPredicateChangeBuilder of() {
        return new SetCartPredicateChangeBuilder();
    }

    public static SetCartPredicateChangeBuilder of(final SetCartPredicateChange template) {
        SetCartPredicateChangeBuilder builder = new SetCartPredicateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
