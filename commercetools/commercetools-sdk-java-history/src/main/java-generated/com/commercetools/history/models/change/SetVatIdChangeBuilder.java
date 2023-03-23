
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetVatIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVatIdChange setVatIdChange = SetVatIdChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetVatIdChangeBuilder implements Builder<SetVatIdChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setVatId</code></p>
     * @param change
     * @return Builder
     */

    public SetVatIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public SetVatIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public SetVatIdChangeBuilder nextValue(final String nextValue) {
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

    public SetVatIdChange build() {
        Objects.requireNonNull(change, SetVatIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetVatIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetVatIdChange.class + ": nextValue is missing");
        return new SetVatIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetVatIdChange without checking for non null required values
     */
    public SetVatIdChange buildUnchecked() {
        return new SetVatIdChangeImpl(change, previousValue, nextValue);
    }

    public static SetVatIdChangeBuilder of() {
        return new SetVatIdChangeBuilder();
    }

    public static SetVatIdChangeBuilder of(final SetVatIdChange template) {
        SetVatIdChangeBuilder builder = new SetVatIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
