
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDeliveryCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryCustomFieldChange setDeliveryCustomFieldChange = SetDeliveryCustomFieldChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDeliveryCustomFieldChangeBuilder implements Builder<SetDeliveryCustomFieldChange> {

    private String change;

    private String deliveryId;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetDeliveryCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public SetDeliveryCustomFieldChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetDeliveryCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetDeliveryCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDeliveryCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDeliveryCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
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
     * builds SetDeliveryCustomFieldChange with checking for non-null required values
     * @return SetDeliveryCustomFieldChange
     */
    public SetDeliveryCustomFieldChange build() {
        Objects.requireNonNull(change, SetDeliveryCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, SetDeliveryCustomFieldChange.class + ": deliveryId is missing");
        Objects.requireNonNull(name, SetDeliveryCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetDeliveryCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue, SetDeliveryCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDeliveryCustomFieldChange.class + ": nextValue is missing");
        return new SetDeliveryCustomFieldChangeImpl(change, deliveryId, name, customTypeId, previousValue, nextValue);
    }

    /**
     * builds SetDeliveryCustomFieldChange without checking for non-null required values
     * @return SetDeliveryCustomFieldChange
     */
    public SetDeliveryCustomFieldChange buildUnchecked() {
        return new SetDeliveryCustomFieldChangeImpl(change, deliveryId, name, customTypeId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetDeliveryCustomFieldChangeBuilder
     * @return builder
     */
    public static SetDeliveryCustomFieldChangeBuilder of() {
        return new SetDeliveryCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetDeliveryCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryCustomFieldChangeBuilder of(final SetDeliveryCustomFieldChange template) {
        SetDeliveryCustomFieldChangeBuilder builder = new SetDeliveryCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
