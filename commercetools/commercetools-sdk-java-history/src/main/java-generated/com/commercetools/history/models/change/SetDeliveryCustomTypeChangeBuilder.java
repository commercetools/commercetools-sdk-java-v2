
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDeliveryCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryCustomTypeChange setDeliveryCustomTypeChange = SetDeliveryCustomTypeChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDeliveryCustomTypeChangeBuilder implements Builder<SetDeliveryCustomTypeChange> {

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetDeliveryCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public SetDeliveryCustomTypeChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDeliveryCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDeliveryCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDeliveryCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDeliveryCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDeliveryCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDeliveryCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetDeliveryCustomTypeChange with checking for non-null required values
     * @return SetDeliveryCustomTypeChange
     */
    public SetDeliveryCustomTypeChange build() {
        Objects.requireNonNull(change, SetDeliveryCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, SetDeliveryCustomTypeChange.class + ": deliveryId is missing");
        Objects.requireNonNull(previousValue, SetDeliveryCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDeliveryCustomTypeChange.class + ": nextValue is missing");
        return new SetDeliveryCustomTypeChangeImpl(change, deliveryId, previousValue, nextValue);
    }

    /**
     * builds SetDeliveryCustomTypeChange without checking for non-null required values
     * @return SetDeliveryCustomTypeChange
     */
    public SetDeliveryCustomTypeChange buildUnchecked() {
        return new SetDeliveryCustomTypeChangeImpl(change, deliveryId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetDeliveryCustomTypeChangeBuilder
     * @return builder
     */
    public static SetDeliveryCustomTypeChangeBuilder of() {
        return new SetDeliveryCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetDeliveryCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryCustomTypeChangeBuilder of(final SetDeliveryCustomTypeChange template) {
        SetDeliveryCustomTypeChangeBuilder builder = new SetDeliveryCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
