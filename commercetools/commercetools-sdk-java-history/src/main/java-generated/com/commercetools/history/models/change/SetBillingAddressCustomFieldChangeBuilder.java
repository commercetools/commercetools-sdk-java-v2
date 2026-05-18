
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetBillingAddressCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetBillingAddressCustomFieldChange setBillingAddressCustomFieldChange = SetBillingAddressCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetBillingAddressCustomFieldChangeBuilder implements Builder<SetBillingAddressCustomFieldChange> {

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

    public SetBillingAddressCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetBillingAddressCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetBillingAddressCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetBillingAddressCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetBillingAddressCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     * builds SetBillingAddressCustomFieldChange with checking for non-null required values
     * @return SetBillingAddressCustomFieldChange
     */
    public SetBillingAddressCustomFieldChange build() {
        Objects.requireNonNull(change, SetBillingAddressCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, SetBillingAddressCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetBillingAddressCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue, SetBillingAddressCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetBillingAddressCustomFieldChange.class + ": nextValue is missing");
        return new SetBillingAddressCustomFieldChangeImpl(change, name, customTypeId, previousValue, nextValue);
    }

    /**
     * builds SetBillingAddressCustomFieldChange without checking for non-null required values
     * @return SetBillingAddressCustomFieldChange
     */
    public SetBillingAddressCustomFieldChange buildUnchecked() {
        return new SetBillingAddressCustomFieldChangeImpl(change, name, customTypeId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetBillingAddressCustomFieldChangeBuilder
     * @return builder
     */
    public static SetBillingAddressCustomFieldChangeBuilder of() {
        return new SetBillingAddressCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetBillingAddressCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetBillingAddressCustomFieldChangeBuilder of(final SetBillingAddressCustomFieldChange template) {
        SetBillingAddressCustomFieldChangeBuilder builder = new SetBillingAddressCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
