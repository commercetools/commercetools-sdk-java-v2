
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.commercetools.history.models.common.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Parcel Items on Orders.</li>
 *   <li>Set Parcel Items on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetParcelItemsChange setParcelItemsChange = SetParcelItemsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetParcelItemsChangeImpl.class)
public interface SetParcelItemsChange extends Change {

    /**
     * discriminator value for SetParcelItemsChange
     */
    String SET_PARCEL_ITEMS_CHANGE = "SetParcelItemsChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<DeliveryItem> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<DeliveryItem> getNextValue();

    /**
     *  <p>Information about the updated Parcel.</p>
     * @return parcel
     */
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public ParcelChangeValue getParcel();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final DeliveryItem... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<DeliveryItem> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final DeliveryItem... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<DeliveryItem> nextValue);

    /**
     *  <p>Information about the updated Parcel.</p>
     * @param parcel value to be set
     */

    public void setParcel(final ParcelChangeValue parcel);

    /**
     * factory method
     * @return instance of SetParcelItemsChange
     */
    public static SetParcelItemsChange of() {
        return new SetParcelItemsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetParcelItemsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetParcelItemsChange of(final SetParcelItemsChange template) {
        SetParcelItemsChangeImpl instance = new SetParcelItemsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setParcel(template.getParcel());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetParcelItemsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetParcelItemsChange deepCopy(@Nullable final SetParcelItemsChange template) {
        if (template == null) {
            return null;
        }
        SetParcelItemsChangeImpl instance = new SetParcelItemsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setParcel(
            com.commercetools.history.models.change_value.ParcelChangeValue.deepCopy(template.getParcel()));
        return instance;
    }

    /**
     * builder factory method for SetParcelItemsChange
     * @return builder
     */
    public static SetParcelItemsChangeBuilder builder() {
        return SetParcelItemsChangeBuilder.of();
    }

    /**
     * create builder for SetParcelItemsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetParcelItemsChangeBuilder builder(final SetParcelItemsChange template) {
        return SetParcelItemsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetParcelItemsChange(Function<SetParcelItemsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetParcelItemsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetParcelItemsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetParcelItemsChange>";
            }
        };
    }
}
