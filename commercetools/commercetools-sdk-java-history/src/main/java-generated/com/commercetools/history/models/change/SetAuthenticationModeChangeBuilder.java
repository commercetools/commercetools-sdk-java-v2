
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAuthenticationModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAuthenticationModeChange setAuthenticationModeChange = SetAuthenticationModeChange.builder()
 *             .change("{change}")
 *             .previousValue(AuthenticationMode.PASSWORD)
 *             .nextValue(AuthenticationMode.PASSWORD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAuthenticationModeChangeBuilder implements Builder<SetAuthenticationModeChange> {

    private String change;

    private com.commercetools.history.models.common.AuthenticationMode previousValue;

    private com.commercetools.history.models.common.AuthenticationMode nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetAuthenticationModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAuthenticationModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.AuthenticationMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAuthenticationModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.AuthenticationMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.AuthenticationMode getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.AuthenticationMode getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetAuthenticationModeChange with checking for non-null required values
     * @return SetAuthenticationModeChange
     */
    public SetAuthenticationModeChange build() {
        Objects.requireNonNull(change, SetAuthenticationModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetAuthenticationModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAuthenticationModeChange.class + ": nextValue is missing");
        return new SetAuthenticationModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetAuthenticationModeChange without checking for non-null required values
     * @return SetAuthenticationModeChange
     */
    public SetAuthenticationModeChange buildUnchecked() {
        return new SetAuthenticationModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetAuthenticationModeChangeBuilder
     * @return builder
     */
    public static SetAuthenticationModeChangeBuilder of() {
        return new SetAuthenticationModeChangeBuilder();
    }

    /**
     * create builder for SetAuthenticationModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAuthenticationModeChangeBuilder of(final SetAuthenticationModeChange template) {
        SetAuthenticationModeChangeBuilder builder = new SetAuthenticationModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
