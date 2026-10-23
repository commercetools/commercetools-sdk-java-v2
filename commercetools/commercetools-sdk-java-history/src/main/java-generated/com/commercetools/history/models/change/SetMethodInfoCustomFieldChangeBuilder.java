
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMethodInfoCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoCustomFieldChange setMethodInfoCustomFieldChange = SetMethodInfoCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMethodInfoCustomFieldChangeBuilder implements Builder<SetMethodInfoCustomFieldChange> {

    private String change;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetMethodInfoCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetMethodInfoCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetMethodInfoCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetMethodInfoCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetMethodInfoCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     * builds SetMethodInfoCustomFieldChange with checking for non-null required values
     * @return SetMethodInfoCustomFieldChange
     */
    public SetMethodInfoCustomFieldChange build() {
        Objects.requireNonNull(change, SetMethodInfoCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, SetMethodInfoCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetMethodInfoCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue, SetMethodInfoCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMethodInfoCustomFieldChange.class + ": nextValue is missing");
        return new SetMethodInfoCustomFieldChangeImpl(change, name, customTypeId, previousValue, nextValue);
    }

    /**
     * builds SetMethodInfoCustomFieldChange without checking for non-null required values
     * @return SetMethodInfoCustomFieldChange
     */
    public SetMethodInfoCustomFieldChange buildUnchecked() {
        return new SetMethodInfoCustomFieldChangeImpl(change, name, customTypeId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetMethodInfoCustomFieldChangeBuilder
     * @return builder
     */
    public static SetMethodInfoCustomFieldChangeBuilder of() {
        return new SetMethodInfoCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetMethodInfoCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoCustomFieldChangeBuilder of(final SetMethodInfoCustomFieldChange template) {
        SetMethodInfoCustomFieldChangeBuilder builder = new SetMethodInfoCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
