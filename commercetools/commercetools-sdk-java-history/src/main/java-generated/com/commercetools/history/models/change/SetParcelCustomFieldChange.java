
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetParcelCustomFieldAction" rel="nofollow">Set Parcel CustomField</a> update action.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("SetParcelCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetParcelCustomFieldChangeImpl.class)
public interface SetParcelCustomFieldChange extends Change {

    /**
     * discriminator value for SetParcelCustomFieldChange
     */
    String SET_PARCEL_CUSTOM_FIELD_CHANGE = "SetParcelCustomFieldChange";

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
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

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
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     */

    public void setCustomTypeId(final String customTypeId);

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     * factory method
     * @return instance of SetParcelCustomFieldChange
     */
    public static SetParcelCustomFieldChange of() {
        return new SetParcelCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetParcelCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetParcelCustomFieldChange of(final SetParcelCustomFieldChange template) {
        SetParcelCustomFieldChangeImpl instance = new SetParcelCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setParcel(template.getParcel());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setName(template.getName());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetParcelCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetParcelCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetParcelCustomFieldChange deepCopy(@Nullable final SetParcelCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetParcelCustomFieldChangeImpl instance = new SetParcelCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setParcel(
            com.commercetools.history.models.change_value.ParcelChangeValue.deepCopy(template.getParcel()));
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setName(template.getName());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetParcelCustomFieldChange
     * @return builder
     */
    public static SetParcelCustomFieldChangeBuilder builder() {
        return SetParcelCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetParcelCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetParcelCustomFieldChangeBuilder builder(final SetParcelCustomFieldChange template) {
        return SetParcelCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetParcelCustomFieldChange(Function<SetParcelCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetParcelCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetParcelCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetParcelCustomFieldChange>";
            }
        };
    }
}
