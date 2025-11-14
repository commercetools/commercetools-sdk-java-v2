
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddStateRolesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddStateRolesChange addStateRolesChange = AddStateRolesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class AddStateRolesChangeBuilder implements Builder<AddStateRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.StateRoleEnum> previousValue;

    private java.util.List<com.commercetools.history.models.common.StateRoleEnum> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddStateRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public AddStateRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.StateRoleEnum... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public AddStateRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.StateRoleEnum> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public AddStateRolesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.StateRoleEnum... previousValue) {
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

    public AddStateRolesChangeBuilder nextValue(
            final com.commercetools.history.models.common.StateRoleEnum... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddStateRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.StateRoleEnum> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddStateRolesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.StateRoleEnum... nextValue) {
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

    public java.util.List<com.commercetools.history.models.common.StateRoleEnum> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.StateRoleEnum> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddStateRolesChange with checking for non-null required values
     * @return AddStateRolesChange
     */
    public AddStateRolesChange build() {
        Objects.requireNonNull(change, AddStateRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddStateRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddStateRolesChange.class + ": nextValue is missing");
        return new AddStateRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddStateRolesChange without checking for non-null required values
     * @return AddStateRolesChange
     */
    public AddStateRolesChange buildUnchecked() {
        return new AddStateRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of AddStateRolesChangeBuilder
     * @return builder
     */
    public static AddStateRolesChangeBuilder of() {
        return new AddStateRolesChangeBuilder();
    }

    /**
     * create builder for AddStateRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddStateRolesChangeBuilder of(final AddStateRolesChange template) {
        AddStateRolesChangeBuilder builder = new AddStateRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
