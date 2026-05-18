
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetParcelCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetParcelCustomFieldChange setParcelCustomFieldChange = SetParcelCustomFieldChange.builder()
 *             .change("{change}")
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .customTypeId("{customTypeId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetParcelCustomFieldChangeBuilder implements Builder<SetParcelCustomFieldChange> {

    private String change;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    private String customTypeId;

    private String name;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetParcelCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Information about the updated Parcel.</p>
     * @param builder function to build the parcel value
     * @return Builder
     */

    public SetParcelCustomFieldChangeBuilder parcel(
            Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValueBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Information about the updated Parcel.</p>
     * @param builder function to build the parcel value
     * @return Builder
     */

    public SetParcelCustomFieldChangeBuilder withParcel(
            Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValue> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Information about the updated Parcel.</p>
     * @param parcel value to be set
     * @return Builder
     */

    public SetParcelCustomFieldChangeBuilder parcel(
            final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetParcelCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetParcelCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetParcelCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetParcelCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     *  <p>Information about the updated Parcel.</p>
     * @return parcel
     */

    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel() {
        return this.parcel;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
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
     * builds SetParcelCustomFieldChange with checking for non-null required values
     * @return SetParcelCustomFieldChange
     */
    public SetParcelCustomFieldChange build() {
        Objects.requireNonNull(change, SetParcelCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(parcel, SetParcelCustomFieldChange.class + ": parcel is missing");
        Objects.requireNonNull(customTypeId, SetParcelCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(name, SetParcelCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(previousValue, SetParcelCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetParcelCustomFieldChange.class + ": nextValue is missing");
        return new SetParcelCustomFieldChangeImpl(change, parcel, customTypeId, name, previousValue, nextValue);
    }

    /**
     * builds SetParcelCustomFieldChange without checking for non-null required values
     * @return SetParcelCustomFieldChange
     */
    public SetParcelCustomFieldChange buildUnchecked() {
        return new SetParcelCustomFieldChangeImpl(change, parcel, customTypeId, name, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetParcelCustomFieldChangeBuilder
     * @return builder
     */
    public static SetParcelCustomFieldChangeBuilder of() {
        return new SetParcelCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetParcelCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetParcelCustomFieldChangeBuilder of(final SetParcelCustomFieldChange template) {
        SetParcelCustomFieldChangeBuilder builder = new SetParcelCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.parcel = template.getParcel();
        builder.customTypeId = template.getCustomTypeId();
        builder.name = template.getName();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
