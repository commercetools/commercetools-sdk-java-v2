
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeCartPredicateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeCartPredicateChange changeCartPredicateChange = ChangeCartPredicateChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeCartPredicateChangeBuilder implements Builder<ChangeCartPredicateChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>changeCartPredicate</code></p>
     */

    public ChangeCartPredicateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public ChangeCartPredicateChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public ChangeCartPredicateChangeBuilder nextValue(final String nextValue) {
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

    public ChangeCartPredicateChange build() {
        Objects.requireNonNull(change, ChangeCartPredicateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeCartPredicateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeCartPredicateChange.class + ": nextValue is missing");
        return new ChangeCartPredicateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeCartPredicateChange without checking for non null required values
     */
    public ChangeCartPredicateChange buildUnchecked() {
        return new ChangeCartPredicateChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeCartPredicateChangeBuilder of() {
        return new ChangeCartPredicateChangeBuilder();
    }

    public static ChangeCartPredicateChangeBuilder of(final ChangeCartPredicateChange template) {
        ChangeCartPredicateChangeBuilder builder = new ChangeCartPredicateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
