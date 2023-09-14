
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveAssociateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAssociateChange removeAssociateChange = RemoveAssociateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveAssociateChangeBuilder implements Builder<RemoveAssociateChange> {

    private String change;

    private com.commercetools.history.models.common.Associate previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveAssociateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveAssociateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveAssociateChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssociateBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveAssociateChangeBuilder previousValue(
            final com.commercetools.history.models.common.Associate previousValue) {
        this.previousValue = previousValue;
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

    public com.commercetools.history.models.common.Associate getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveAssociateChange with checking for non-null required values
     * @return RemoveAssociateChange
     */
    public RemoveAssociateChange build() {
        Objects.requireNonNull(change, RemoveAssociateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveAssociateChange.class + ": previousValue is missing");
        return new RemoveAssociateChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveAssociateChange without checking for non-null required values
     * @return RemoveAssociateChange
     */
    public RemoveAssociateChange buildUnchecked() {
        return new RemoveAssociateChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveAssociateChangeBuilder
     * @return builder
     */
    public static RemoveAssociateChangeBuilder of() {
        return new RemoveAssociateChangeBuilder();
    }

    /**
     * create builder for RemoveAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveAssociateChangeBuilder of(final RemoveAssociateChange template) {
        RemoveAssociateChangeBuilder builder = new RemoveAssociateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
