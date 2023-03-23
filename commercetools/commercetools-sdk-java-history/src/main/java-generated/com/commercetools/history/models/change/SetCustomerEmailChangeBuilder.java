
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerEmailChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerEmailChange setCustomerEmailChange = SetCustomerEmailChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomerEmailChangeBuilder implements Builder<SetCustomerEmailChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setCustomerEmail</code></p>
     * @param change
     * @return Builder
     */

    public SetCustomerEmailChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public SetCustomerEmailChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public SetCustomerEmailChangeBuilder nextValue(final String nextValue) {
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

    public SetCustomerEmailChange build() {
        Objects.requireNonNull(change, SetCustomerEmailChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomerEmailChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomerEmailChange.class + ": nextValue is missing");
        return new SetCustomerEmailChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCustomerEmailChange without checking for non null required values
     */
    public SetCustomerEmailChange buildUnchecked() {
        return new SetCustomerEmailChangeImpl(change, previousValue, nextValue);
    }

    public static SetCustomerEmailChangeBuilder of() {
        return new SetCustomerEmailChangeBuilder();
    }

    public static SetCustomerEmailChangeBuilder of(final SetCustomerEmailChange template) {
        SetCustomerEmailChangeBuilder builder = new SetCustomerEmailChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
