
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeProductSelectionActiveChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeProductSelectionActiveChange changeProductSelectionActiveChange = ChangeProductSelectionActiveChange.builder()
 *             .change("{change}")
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeProductSelectionActiveChangeBuilder implements Builder<ChangeProductSelectionActiveChange> {

    private String change;

    private com.commercetools.history.models.common.Reference productSelection;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeProductSelectionActiveChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Reference to the Product Selection which was changed.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public ChangeProductSelectionActiveChangeBuilder productSelection(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.productSelection = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product Selection which was changed.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public ChangeProductSelectionActiveChangeBuilder withProductSelection(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.productSelection = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product Selection which was changed.</p>
     * @param productSelection value to be set
     * @return Builder
     */

    public ChangeProductSelectionActiveChangeBuilder productSelection(
            final com.commercetools.history.models.common.Reference productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeProductSelectionActiveChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeProductSelectionActiveChangeBuilder nextValue(final Boolean nextValue) {
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
     *  <p>Reference to the Product Selection which was changed.</p>
     * @return productSelection
     */

    public com.commercetools.history.models.common.Reference getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeProductSelectionActiveChange with checking for non-null required values
     * @return ChangeProductSelectionActiveChange
     */
    public ChangeProductSelectionActiveChange build() {
        Objects.requireNonNull(change, ChangeProductSelectionActiveChange.class + ": change is missing");
        Objects.requireNonNull(productSelection,
            ChangeProductSelectionActiveChange.class + ": productSelection is missing");
        Objects.requireNonNull(previousValue, ChangeProductSelectionActiveChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeProductSelectionActiveChange.class + ": nextValue is missing");
        return new ChangeProductSelectionActiveChangeImpl(change, productSelection, previousValue, nextValue);
    }

    /**
     * builds ChangeProductSelectionActiveChange without checking for non-null required values
     * @return ChangeProductSelectionActiveChange
     */
    public ChangeProductSelectionActiveChange buildUnchecked() {
        return new ChangeProductSelectionActiveChangeImpl(change, productSelection, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeProductSelectionActiveChangeBuilder
     * @return builder
     */
    public static ChangeProductSelectionActiveChangeBuilder of() {
        return new ChangeProductSelectionActiveChangeBuilder();
    }

    /**
     * create builder for ChangeProductSelectionActiveChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeProductSelectionActiveChangeBuilder of(final ChangeProductSelectionActiveChange template) {
        ChangeProductSelectionActiveChangeBuilder builder = new ChangeProductSelectionActiveChangeBuilder();
        builder.change = template.getChange();
        builder.productSelection = template.getProductSelection();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
