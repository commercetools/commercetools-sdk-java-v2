
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ProductSelectionSetting;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetProductSelectionsAction" rel="nofollow">Set Product Selections</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductSelectionsChange setProductSelectionsChange = SetProductSelectionsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetProductSelectionsChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetProductSelectionsChangeImpl.class)
public interface SetProductSelectionsChange extends Change {

    /**
     * discriminator value for SetProductSelectionsChange
     */
    String SET_PRODUCT_SELECTIONS_CHANGE = "SetProductSelectionsChange";

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
    public List<ProductSelectionSetting> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<ProductSelectionSetting> getNextValue();

    /**
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */
    @NotNull
    @Valid
    @JsonProperty("addedItems")
    public List<ProductSelectionSetting> getAddedItems();

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */
    @NotNull
    @Valid
    @JsonProperty("removedItems")
    public List<ProductSelectionSetting> getRemovedItems();

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
    public void setPreviousValue(final ProductSelectionSetting... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<ProductSelectionSetting> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final ProductSelectionSetting... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<ProductSelectionSetting> nextValue);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    @JsonIgnore
    public void setAddedItems(final ProductSelectionSetting... addedItems);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    public void setAddedItems(final List<ProductSelectionSetting> addedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    @JsonIgnore
    public void setRemovedItems(final ProductSelectionSetting... removedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    public void setRemovedItems(final List<ProductSelectionSetting> removedItems);

    /**
     * factory method
     * @return instance of SetProductSelectionsChange
     */
    public static SetProductSelectionsChange of() {
        return new SetProductSelectionsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetProductSelectionsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetProductSelectionsChange of(final SetProductSelectionsChange template) {
        SetProductSelectionsChangeImpl instance = new SetProductSelectionsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAddedItems(template.getAddedItems());
        instance.setRemovedItems(template.getRemovedItems());
        return instance;
    }

    public SetProductSelectionsChange copyDeep();

    /**
     * factory method to create a deep copy of SetProductSelectionsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetProductSelectionsChange deepCopy(@Nullable final SetProductSelectionsChange template) {
        if (template == null) {
            return null;
        }
        SetProductSelectionsChangeImpl instance = new SetProductSelectionsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.ProductSelectionSetting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.ProductSelectionSetting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAddedItems(Optional.ofNullable(template.getAddedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.ProductSelectionSetting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRemovedItems(Optional.ofNullable(template.getRemovedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.ProductSelectionSetting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetProductSelectionsChange
     * @return builder
     */
    public static SetProductSelectionsChangeBuilder builder() {
        return SetProductSelectionsChangeBuilder.of();
    }

    /**
     * create builder for SetProductSelectionsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductSelectionsChangeBuilder builder(final SetProductSelectionsChange template) {
        return SetProductSelectionsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetProductSelectionsChange(Function<SetProductSelectionsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetProductSelectionsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetProductSelectionsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetProductSelectionsChange>";
            }
        };
    }
}
