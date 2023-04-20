
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveFromCategoryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveFromCategoryChange removeFromCategoryChange = RemoveFromCategoryChange.builder()
 *             .change("{change}")
 *             .category(categoryBuilder -> categoryBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveFromCategoryChangeBuilder implements Builder<RemoveFromCategoryChange> {

    private String change;

    private com.commercetools.history.models.common.Reference category;

    private java.util.List<com.commercetools.history.models.common.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reference> nextValue;

    /**
     *  <p>Update action for <code>addToCategory</code></p>
     * @param change value to be set
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the category using the builder function
     * @param builder function to build the category value
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder category(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.category = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the category using the builder function
     * @param builder function to build the category value
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder withCategory(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.category = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the category
     * @param category value to be set
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder category(final com.commercetools.history.models.common.Reference category) {
        this.category = category;
        return this;
    }

    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Reference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()));
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()));
    }

    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Reference> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.Reference... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()));
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveFromCategoryChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()));
    }

    /**
     *  <p>Update action for <code>addToCategory</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of category}
     * @return category
     */

    public com.commercetools.history.models.common.Reference getCategory() {
        return this.category;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds RemoveFromCategoryChange with checking for non-null required values
     * @return RemoveFromCategoryChange
     */
    public RemoveFromCategoryChange build() {
        Objects.requireNonNull(change, RemoveFromCategoryChange.class + ": change is missing");
        Objects.requireNonNull(category, RemoveFromCategoryChange.class + ": category is missing");
        Objects.requireNonNull(previousValue, RemoveFromCategoryChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveFromCategoryChange.class + ": nextValue is missing");
        return new RemoveFromCategoryChangeImpl(change, category, previousValue, nextValue);
    }

    /**
     * builds RemoveFromCategoryChange without checking for non-null required values
     * @return RemoveFromCategoryChange
     */
    public RemoveFromCategoryChange buildUnchecked() {
        return new RemoveFromCategoryChangeImpl(change, category, previousValue, nextValue);
    }

    /**
     * factory method for an instance of RemoveFromCategoryChangeBuilder
     * @return builder
     */
    public static RemoveFromCategoryChangeBuilder of() {
        return new RemoveFromCategoryChangeBuilder();
    }

    /**
     * create builder for RemoveFromCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveFromCategoryChangeBuilder of(final RemoveFromCategoryChange template) {
        RemoveFromCategoryChangeBuilder builder = new RemoveFromCategoryChangeBuilder();
        builder.change = template.getChange();
        builder.category = template.getCategory();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
