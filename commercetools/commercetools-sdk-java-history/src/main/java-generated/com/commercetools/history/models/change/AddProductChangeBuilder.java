
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddProductChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddProductChange addProductChange = AddProductChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .variantSelection(variantSelectionBuilder -> variantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddProductChangeBuilder implements Builder<AddProductChange> {

    private String change;

    private com.commercetools.history.models.common.Reference nextValue;

    private com.commercetools.history.models.common.ProductVariantSelection variantSelection;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddProductChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddProductChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddProductChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddProductChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>The Product Variants included in the Product Selection.</p>
     * @param builder function to build the variantSelection value
     * @return Builder
     */

    public AddProductChangeBuilder variantSelection(
            Function<com.commercetools.history.models.common.ProductVariantSelectionBuilder, com.commercetools.history.models.common.ProductVariantSelectionBuilder> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.history.models.common.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Product Variants included in the Product Selection.</p>
     * @param builder function to build the variantSelection value
     * @return Builder
     */

    public AddProductChangeBuilder withVariantSelection(
            Function<com.commercetools.history.models.common.ProductVariantSelectionBuilder, com.commercetools.history.models.common.ProductVariantSelection> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.history.models.common.ProductVariantSelectionBuilder.of());
        return this;
    }

    /**
     *  <p>The Product Variants included in the Product Selection.</p>
     * @param variantSelection value to be set
     * @return Builder
     */

    public AddProductChangeBuilder variantSelection(
            final com.commercetools.history.models.common.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
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

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>The Product Variants included in the Product Selection.</p>
     * @return variantSelection
     */

    public com.commercetools.history.models.common.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     * builds AddProductChange with checking for non-null required values
     * @return AddProductChange
     */
    public AddProductChange build() {
        Objects.requireNonNull(change, AddProductChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddProductChange.class + ": nextValue is missing");
        Objects.requireNonNull(variantSelection, AddProductChange.class + ": variantSelection is missing");
        return new AddProductChangeImpl(change, nextValue, variantSelection);
    }

    /**
     * builds AddProductChange without checking for non-null required values
     * @return AddProductChange
     */
    public AddProductChange buildUnchecked() {
        return new AddProductChangeImpl(change, nextValue, variantSelection);
    }

    /**
     * factory method for an instance of AddProductChangeBuilder
     * @return builder
     */
    public static AddProductChangeBuilder of() {
        return new AddProductChangeBuilder();
    }

    /**
     * create builder for AddProductChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddProductChangeBuilder of(final AddProductChange template) {
        AddProductChangeBuilder builder = new AddProductChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.variantSelection = template.getVariantSelection();
        return builder;
    }

}
