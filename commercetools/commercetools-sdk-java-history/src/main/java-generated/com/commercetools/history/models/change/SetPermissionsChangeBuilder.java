
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPermissionsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPermissionsChange setPermissionsChange = SetPermissionsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPermissionsChangeBuilder implements Builder<SetPermissionsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Permission> previousValue;

    private java.util.List<com.commercetools.history.models.common.Permission> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetPermissionsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetPermissionsChangeBuilder previousValue(
            final com.commercetools.history.models.common.Permission... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetPermissionsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Permission> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetPermissionsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Permission... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetPermissionsChangeBuilder nextValue(
            final com.commercetools.history.models.common.Permission... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetPermissionsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Permission> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetPermissionsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.Permission... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
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

    public java.util.List<com.commercetools.history.models.common.Permission> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.Permission> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetPermissionsChange with checking for non-null required values
     * @return SetPermissionsChange
     */
    public SetPermissionsChange build() {
        Objects.requireNonNull(change, SetPermissionsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetPermissionsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetPermissionsChange.class + ": nextValue is missing");
        return new SetPermissionsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetPermissionsChange without checking for non-null required values
     * @return SetPermissionsChange
     */
    public SetPermissionsChange buildUnchecked() {
        return new SetPermissionsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetPermissionsChangeBuilder
     * @return builder
     */
    public static SetPermissionsChangeBuilder of() {
        return new SetPermissionsChangeBuilder();
    }

    /**
     * create builder for SetPermissionsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPermissionsChangeBuilder of(final SetPermissionsChange template) {
        SetPermissionsChangeBuilder builder = new SetPermissionsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
