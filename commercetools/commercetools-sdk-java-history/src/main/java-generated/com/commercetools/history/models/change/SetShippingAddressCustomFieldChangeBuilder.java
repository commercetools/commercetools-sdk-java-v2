
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingAddressCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingAddressCustomFieldChange setShippingAddressCustomFieldChange = SetShippingAddressCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingAddressCustomFieldChangeBuilder implements Builder<SetShippingAddressCustomFieldChange> {

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

    public SetShippingAddressCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetShippingAddressCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetShippingAddressCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingAddressCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingAddressCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     * builds SetShippingAddressCustomFieldChange with checking for non-null required values
     * @return SetShippingAddressCustomFieldChange
     */
    public SetShippingAddressCustomFieldChange build() {
        Objects.requireNonNull(change, SetShippingAddressCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, SetShippingAddressCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetShippingAddressCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue, SetShippingAddressCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShippingAddressCustomFieldChange.class + ": nextValue is missing");
        return new SetShippingAddressCustomFieldChangeImpl(change, name, customTypeId, previousValue, nextValue);
    }

    /**
     * builds SetShippingAddressCustomFieldChange without checking for non-null required values
     * @return SetShippingAddressCustomFieldChange
     */
    public SetShippingAddressCustomFieldChange buildUnchecked() {
        return new SetShippingAddressCustomFieldChangeImpl(change, name, customTypeId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetShippingAddressCustomFieldChangeBuilder
     * @return builder
     */
    public static SetShippingAddressCustomFieldChangeBuilder of() {
        return new SetShippingAddressCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetShippingAddressCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingAddressCustomFieldChangeBuilder of(final SetShippingAddressCustomFieldChange template) {
        SetShippingAddressCustomFieldChangeBuilder builder = new SetShippingAddressCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
