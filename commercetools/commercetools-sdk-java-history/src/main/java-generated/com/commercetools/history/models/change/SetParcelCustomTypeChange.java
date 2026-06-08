
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetParcelCustomTypeAction" rel="nofollow">Set Parcel Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetParcelCustomTypeChange setParcelCustomTypeChange = SetParcelCustomTypeChange.builder()
 *             .change("{change}")
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetParcelCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetParcelCustomTypeChangeImpl.class)
public interface SetParcelCustomTypeChange extends Change {

    /**
     * discriminator value for SetParcelCustomTypeChange
     */
    String SET_PARCEL_CUSTOM_TYPE_CHANGE = "SetParcelCustomTypeChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Information about the updated Parcel.</p>
     * @return parcel
     */
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public ParcelChangeValue getParcel();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Information about the updated Parcel.</p>
     * @param parcel value to be set
     */

    public void setParcel(final ParcelChangeValue parcel);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * factory method
     * @return instance of SetParcelCustomTypeChange
     */
    public static SetParcelCustomTypeChange of() {
        return new SetParcelCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetParcelCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetParcelCustomTypeChange of(final SetParcelCustomTypeChange template) {
        SetParcelCustomTypeChangeImpl instance = new SetParcelCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setParcel(template.getParcel());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetParcelCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetParcelCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetParcelCustomTypeChange deepCopy(@Nullable final SetParcelCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetParcelCustomTypeChangeImpl instance = new SetParcelCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setParcel(
            com.commercetools.history.models.change_value.ParcelChangeValue.deepCopy(template.getParcel()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetParcelCustomTypeChange
     * @return builder
     */
    public static SetParcelCustomTypeChangeBuilder builder() {
        return SetParcelCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetParcelCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetParcelCustomTypeChangeBuilder builder(final SetParcelCustomTypeChange template) {
        return SetParcelCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetParcelCustomTypeChange(Function<SetParcelCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetParcelCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetParcelCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetParcelCustomTypeChange>";
            }
        };
    }
}
