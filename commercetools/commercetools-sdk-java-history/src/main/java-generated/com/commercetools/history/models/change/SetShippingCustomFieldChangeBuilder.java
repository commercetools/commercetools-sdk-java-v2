
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingCustomFieldChange setShippingCustomFieldChange = SetShippingCustomFieldChange.builder()
 *             .change("{change}")
 *             .shippingKey("{shippingKey}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingCustomFieldChangeBuilder implements Builder<SetShippingCustomFieldChange> {

    private String change;

    private String shippingKey;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShippingCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p><code>shippingKey</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a>.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public SetShippingCustomFieldChangeBuilder shippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetShippingCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetShippingCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     *  <p><code>shippingKey</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a>.</p>
     * @return shippingKey
     */

    public String getShippingKey() {
        return this.shippingKey;
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
     * builds SetShippingCustomFieldChange with checking for non-null required values
     * @return SetShippingCustomFieldChange
     */
    public SetShippingCustomFieldChange build() {
        Objects.requireNonNull(change, SetShippingCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(shippingKey, SetShippingCustomFieldChange.class + ": shippingKey is missing");
        Objects.requireNonNull(name, SetShippingCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetShippingCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue, SetShippingCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShippingCustomFieldChange.class + ": nextValue is missing");
        return new SetShippingCustomFieldChangeImpl(change, shippingKey, name, customTypeId, previousValue, nextValue);
    }

    /**
     * builds SetShippingCustomFieldChange without checking for non-null required values
     * @return SetShippingCustomFieldChange
     */
    public SetShippingCustomFieldChange buildUnchecked() {
        return new SetShippingCustomFieldChangeImpl(change, shippingKey, name, customTypeId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetShippingCustomFieldChangeBuilder
     * @return builder
     */
    public static SetShippingCustomFieldChangeBuilder of() {
        return new SetShippingCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetShippingCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingCustomFieldChangeBuilder of(final SetShippingCustomFieldChange template) {
        SetShippingCustomFieldChangeBuilder builder = new SetShippingCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.shippingKey = template.getShippingKey();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
