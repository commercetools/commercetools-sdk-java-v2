
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomFieldChange setCustomFieldChange = SetCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomFieldChangeBuilder implements Builder<SetCustomFieldChange> {

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    private String name;

    private String customTypeId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
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

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     * builds SetCustomFieldChange with checking for non-null required values
     * @return SetCustomFieldChange
     */
    public SetCustomFieldChange build() {
        Objects.requireNonNull(change, SetCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(name, SetCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetCustomFieldChange.class + ": customTypeId is missing");
        return new SetCustomFieldChangeImpl(change, previousValue, nextValue, name, customTypeId);
    }

    /**
     * builds SetCustomFieldChange without checking for non-null required values
     * @return SetCustomFieldChange
     */
    public SetCustomFieldChange buildUnchecked() {
        return new SetCustomFieldChangeImpl(change, previousValue, nextValue, name, customTypeId);
    }

    /**
     * factory method for an instance of SetCustomFieldChangeBuilder
     * @return builder
     */
    public static SetCustomFieldChangeBuilder of() {
        return new SetCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomFieldChangeBuilder of(final SetCustomFieldChange template) {
        SetCustomFieldChangeBuilder builder = new SetCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        return builder;
    }

}
