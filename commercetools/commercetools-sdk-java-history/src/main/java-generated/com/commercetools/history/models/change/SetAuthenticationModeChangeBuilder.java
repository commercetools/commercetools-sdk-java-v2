
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
     *  <p>Update action for <code>setAuthenticationMode</code></p>
     */

    public SetAuthenticationModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetAuthenticationModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.AuthenticationMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetAuthenticationModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.AuthenticationMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.AuthenticationMode getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.AuthenticationMode getNextValue() {
        return this.nextValue;
    }

    public SetAuthenticationModeChange build() {
        Objects.requireNonNull(change, SetAuthenticationModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetAuthenticationModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAuthenticationModeChange.class + ": nextValue is missing");
        return new SetAuthenticationModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetAuthenticationModeChange without checking for non null required values
     */
    public SetAuthenticationModeChange buildUnchecked() {
        return new SetAuthenticationModeChangeImpl(change, previousValue, nextValue);
    }

    public static SetAuthenticationModeChangeBuilder of() {
        return new SetAuthenticationModeChangeBuilder();
    }

    public static SetAuthenticationModeChangeBuilder of(final SetAuthenticationModeChange template) {
        SetAuthenticationModeChangeBuilder builder = new SetAuthenticationModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
