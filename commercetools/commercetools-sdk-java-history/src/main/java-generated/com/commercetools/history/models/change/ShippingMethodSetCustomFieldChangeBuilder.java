
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetCustomFieldChange shippingMethodSetCustomFieldChange = ShippingMethodSetCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetCustomFieldChangeBuilder implements Builder<ShippingMethodSetCustomFieldChange> {

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

    public ShippingMethodSetCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShippingMethodSetCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public ShippingMethodSetCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ShippingMethodSetCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ShippingMethodSetCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
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
     * builds ShippingMethodSetCustomFieldChange with checking for non-null required values
     * @return ShippingMethodSetCustomFieldChange
     */
    public ShippingMethodSetCustomFieldChange build() {
        Objects.requireNonNull(change, ShippingMethodSetCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, ShippingMethodSetCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, ShippingMethodSetCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue, ShippingMethodSetCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ShippingMethodSetCustomFieldChange.class + ": nextValue is missing");
        return new ShippingMethodSetCustomFieldChangeImpl(change, name, customTypeId, previousValue, nextValue);
    }

    /**
     * builds ShippingMethodSetCustomFieldChange without checking for non-null required values
     * @return ShippingMethodSetCustomFieldChange
     */
    public ShippingMethodSetCustomFieldChange buildUnchecked() {
        return new ShippingMethodSetCustomFieldChangeImpl(change, name, customTypeId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ShippingMethodSetCustomFieldChangeBuilder
     * @return builder
     */
    public static ShippingMethodSetCustomFieldChangeBuilder of() {
        return new ShippingMethodSetCustomFieldChangeBuilder();
    }

    /**
     * create builder for ShippingMethodSetCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetCustomFieldChangeBuilder of(final ShippingMethodSetCustomFieldChange template) {
        ShippingMethodSetCustomFieldChangeBuilder builder = new ShippingMethodSetCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
