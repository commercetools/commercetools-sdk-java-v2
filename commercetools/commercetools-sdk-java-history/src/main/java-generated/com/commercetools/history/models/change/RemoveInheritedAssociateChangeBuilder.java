
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveInheritedAssociateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveInheritedAssociateChange removeInheritedAssociateChange = RemoveInheritedAssociateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveInheritedAssociateChangeBuilder implements Builder<RemoveInheritedAssociateChange> {

    private String change;

    private com.commercetools.history.models.common.InheritedAssociate previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveInheritedAssociateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveInheritedAssociateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveInheritedAssociateChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of());
        return this;
    }

    /**
     *  <p>The value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveInheritedAssociateChangeBuilder previousValue(
            final com.commercetools.history.models.common.InheritedAssociate previousValue) {
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
     *  <p>The value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.InheritedAssociate getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveInheritedAssociateChange with checking for non-null required values
     * @return RemoveInheritedAssociateChange
     */
    public RemoveInheritedAssociateChange build() {
        Objects.requireNonNull(change, RemoveInheritedAssociateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveInheritedAssociateChange.class + ": previousValue is missing");
        return new RemoveInheritedAssociateChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveInheritedAssociateChange without checking for non-null required values
     * @return RemoveInheritedAssociateChange
     */
    public RemoveInheritedAssociateChange buildUnchecked() {
        return new RemoveInheritedAssociateChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveInheritedAssociateChangeBuilder
     * @return builder
     */
    public static RemoveInheritedAssociateChangeBuilder of() {
        return new RemoveInheritedAssociateChangeBuilder();
    }

    /**
     * create builder for RemoveInheritedAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveInheritedAssociateChangeBuilder of(final RemoveInheritedAssociateChange template) {
        RemoveInheritedAssociateChangeBuilder builder = new RemoveInheritedAssociateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
