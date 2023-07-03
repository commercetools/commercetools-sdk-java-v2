
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveProductSelectionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveProductSelectionChange removeProductSelectionChange = RemoveProductSelectionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveProductSelectionChangeBuilder implements Builder<RemoveProductSelectionChange> {

    private String change;

    private com.commercetools.history.models.common.ProductSelectionSetting previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveProductSelectionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveProductSelectionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveProductSelectionChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveProductSelectionChangeBuilder previousValue(
            final com.commercetools.history.models.common.ProductSelectionSetting previousValue) {
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

    public com.commercetools.history.models.common.ProductSelectionSetting getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveProductSelectionChange with checking for non-null required values
     * @return RemoveProductSelectionChange
     */
    public RemoveProductSelectionChange build() {
        Objects.requireNonNull(change, RemoveProductSelectionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveProductSelectionChange.class + ": previousValue is missing");
        return new RemoveProductSelectionChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveProductSelectionChange without checking for non-null required values
     * @return RemoveProductSelectionChange
     */
    public RemoveProductSelectionChange buildUnchecked() {
        return new RemoveProductSelectionChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveProductSelectionChangeBuilder
     * @return builder
     */
    public static RemoveProductSelectionChangeBuilder of() {
        return new RemoveProductSelectionChangeBuilder();
    }

    /**
     * create builder for RemoveProductSelectionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveProductSelectionChangeBuilder of(final RemoveProductSelectionChange template) {
        RemoveProductSelectionChangeBuilder builder = new RemoveProductSelectionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
