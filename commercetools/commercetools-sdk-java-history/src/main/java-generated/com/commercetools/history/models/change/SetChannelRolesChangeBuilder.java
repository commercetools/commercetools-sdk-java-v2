
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetChannelRolesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetChannelRolesChange setChannelRolesChange = SetChannelRolesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetChannelRolesChangeBuilder implements Builder<SetChannelRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.ChannelRoleEnum> previousValue;

    private java.util.List<com.commercetools.history.models.common.ChannelRoleEnum> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetChannelRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetChannelRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.ChannelRoleEnum... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetChannelRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.ChannelRoleEnum> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetChannelRolesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.ChannelRoleEnum... previousValue) {
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

    public SetChannelRolesChangeBuilder nextValue(
            final com.commercetools.history.models.common.ChannelRoleEnum... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetChannelRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ChannelRoleEnum> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetChannelRolesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.ChannelRoleEnum... nextValue) {
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

    public java.util.List<com.commercetools.history.models.common.ChannelRoleEnum> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.ChannelRoleEnum> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetChannelRolesChange with checking for non-null required values
     * @return SetChannelRolesChange
     */
    public SetChannelRolesChange build() {
        Objects.requireNonNull(change, SetChannelRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetChannelRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetChannelRolesChange.class + ": nextValue is missing");
        return new SetChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetChannelRolesChange without checking for non-null required values
     * @return SetChannelRolesChange
     */
    public SetChannelRolesChange buildUnchecked() {
        return new SetChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetChannelRolesChangeBuilder
     * @return builder
     */
    public static SetChannelRolesChangeBuilder of() {
        return new SetChannelRolesChangeBuilder();
    }

    /**
     * create builder for SetChannelRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetChannelRolesChangeBuilder of(final SetChannelRolesChange template) {
        SetChannelRolesChangeBuilder builder = new SetChannelRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
