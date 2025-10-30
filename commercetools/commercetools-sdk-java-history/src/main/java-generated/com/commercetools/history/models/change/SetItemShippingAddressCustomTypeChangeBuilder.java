
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetItemShippingAddressCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetItemShippingAddressCustomTypeChange setItemShippingAddressCustomTypeChange = SetItemShippingAddressCustomTypeChange.builder()
 *             .change("{change}")
 *             .addressId("{addressId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetItemShippingAddressCustomTypeChangeBuilder implements Builder<SetItemShippingAddressCustomTypeChange> {

    private String change;

    private String addressId;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetItemShippingAddressCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a>.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public SetItemShippingAddressCustomTypeChangeBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetItemShippingAddressCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetItemShippingAddressCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetItemShippingAddressCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetItemShippingAddressCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetItemShippingAddressCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetItemShippingAddressCustomTypeChangeBuilder nextValue(
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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a>.</p>
     * @return addressId
     */

    public String getAddressId() {
        return this.addressId;
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
     * builds SetItemShippingAddressCustomTypeChange with checking for non-null required values
     * @return SetItemShippingAddressCustomTypeChange
     */
    public SetItemShippingAddressCustomTypeChange build() {
        Objects.requireNonNull(change, SetItemShippingAddressCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(addressId, SetItemShippingAddressCustomTypeChange.class + ": addressId is missing");
        Objects.requireNonNull(previousValue,
            SetItemShippingAddressCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetItemShippingAddressCustomTypeChange.class + ": nextValue is missing");
        return new SetItemShippingAddressCustomTypeChangeImpl(change, addressId, previousValue, nextValue);
    }

    /**
     * builds SetItemShippingAddressCustomTypeChange without checking for non-null required values
     * @return SetItemShippingAddressCustomTypeChange
     */
    public SetItemShippingAddressCustomTypeChange buildUnchecked() {
        return new SetItemShippingAddressCustomTypeChangeImpl(change, addressId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetItemShippingAddressCustomTypeChangeBuilder
     * @return builder
     */
    public static SetItemShippingAddressCustomTypeChangeBuilder of() {
        return new SetItemShippingAddressCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetItemShippingAddressCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetItemShippingAddressCustomTypeChangeBuilder of(
            final SetItemShippingAddressCustomTypeChange template) {
        SetItemShippingAddressCustomTypeChangeBuilder builder = new SetItemShippingAddressCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.addressId = template.getAddressId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
