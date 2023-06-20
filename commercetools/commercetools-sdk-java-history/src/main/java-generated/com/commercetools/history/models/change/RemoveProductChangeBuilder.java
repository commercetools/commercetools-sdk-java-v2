
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveProductChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveProductChange removeProductChange = RemoveProductChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveProductChangeBuilder implements Builder<RemoveProductChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveProductChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveProductChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveProductChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveProductChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
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

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveProductChange with checking for non-null required values
     * @return RemoveProductChange
     */
    public RemoveProductChange build() {
        Objects.requireNonNull(change, RemoveProductChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveProductChange.class + ": previousValue is missing");
        return new RemoveProductChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveProductChange without checking for non-null required values
     * @return RemoveProductChange
     */
    public RemoveProductChange buildUnchecked() {
        return new RemoveProductChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveProductChangeBuilder
     * @return builder
     */
    public static RemoveProductChangeBuilder of() {
        return new RemoveProductChangeBuilder();
    }

    /**
     * create builder for RemoveProductChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveProductChangeBuilder of(final RemoveProductChange template) {
        RemoveProductChangeBuilder builder = new RemoveProductChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
