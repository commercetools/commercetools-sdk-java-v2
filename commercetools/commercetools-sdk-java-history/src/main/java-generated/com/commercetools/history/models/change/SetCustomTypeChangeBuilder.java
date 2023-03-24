
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomTypeChange setCustomTypeChange = SetCustomTypeChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomTypeChangeBuilder implements Builder<SetCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    /**
     *  <p>Update action for setting a custom type</p>
     * @param change value to be set
     * @return Builder
     */

    public SetCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomTypeChangeBuilder nextValue(final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetCustomTypeChange with checking for non-null required values
     * @return SetCustomTypeChange
     */
    public SetCustomTypeChange build() {
        Objects.requireNonNull(change, SetCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomTypeChange.class + ": previousValue is missing");
        return new SetCustomTypeChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetCustomTypeChange without checking for non-null required values
     * @return SetCustomTypeChange
     */
    public SetCustomTypeChange buildUnchecked() {
        return new SetCustomTypeChangeImpl(change, nextValue, previousValue);
    }

    public static SetCustomTypeChangeBuilder of() {
        return new SetCustomTypeChangeBuilder();
    }

    public static SetCustomTypeChangeBuilder of(final SetCustomTypeChange template) {
        SetCustomTypeChangeBuilder builder = new SetCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
