
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddInheritedAssociateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddInheritedAssociateChange addInheritedAssociateChange = AddInheritedAssociateChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddInheritedAssociateChangeBuilder implements Builder<AddInheritedAssociateChange> {

    private String change;

    private com.commercetools.history.models.common.InheritedAssociate nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddInheritedAssociateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddInheritedAssociateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddInheritedAssociateChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddInheritedAssociateChangeBuilder nextValue(
            final com.commercetools.history.models.common.InheritedAssociate nextValue) {
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.InheritedAssociate getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddInheritedAssociateChange with checking for non-null required values
     * @return AddInheritedAssociateChange
     */
    public AddInheritedAssociateChange build() {
        Objects.requireNonNull(change, AddInheritedAssociateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddInheritedAssociateChange.class + ": nextValue is missing");
        return new AddInheritedAssociateChangeImpl(change, nextValue);
    }

    /**
     * builds AddInheritedAssociateChange without checking for non-null required values
     * @return AddInheritedAssociateChange
     */
    public AddInheritedAssociateChange buildUnchecked() {
        return new AddInheritedAssociateChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddInheritedAssociateChangeBuilder
     * @return builder
     */
    public static AddInheritedAssociateChangeBuilder of() {
        return new AddInheritedAssociateChangeBuilder();
    }

    /**
     * create builder for AddInheritedAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddInheritedAssociateChangeBuilder of(final AddInheritedAssociateChange template) {
        AddInheritedAssociateChangeBuilder builder = new AddInheritedAssociateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
