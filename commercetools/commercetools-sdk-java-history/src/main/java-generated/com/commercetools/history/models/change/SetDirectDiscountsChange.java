
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.DirectDiscount;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetDirectDiscountsAction" rel="nofollow">Set DirectDiscounts</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDirectDiscountsChange setDirectDiscountsChange = SetDirectDiscountsChange.builder()
 *             .change("{change}")
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetDirectDiscountsChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDirectDiscountsChangeImpl.class)
public interface SetDirectDiscountsChange extends Change {

    /**
     * discriminator value for SetDirectDiscountsChange
     */
    String SET_DIRECT_DISCOUNTS_CHANGE = "SetDirectDiscountsChange";

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
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */
    @NotNull
    @Valid
    @JsonProperty("addedItems")
    public List<DirectDiscount> getAddedItems();

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */
    @NotNull
    @Valid
    @JsonProperty("removedItems")
    public List<DirectDiscount> getRemovedItems();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<DirectDiscount> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<DirectDiscount> getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    @JsonIgnore
    public void setAddedItems(final DirectDiscount... addedItems);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    public void setAddedItems(final List<DirectDiscount> addedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    @JsonIgnore
    public void setRemovedItems(final DirectDiscount... removedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    public void setRemovedItems(final List<DirectDiscount> removedItems);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final DirectDiscount... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<DirectDiscount> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final DirectDiscount... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<DirectDiscount> nextValue);

    /**
     * factory method
     * @return instance of SetDirectDiscountsChange
     */
    public static SetDirectDiscountsChange of() {
        return new SetDirectDiscountsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDirectDiscountsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDirectDiscountsChange of(final SetDirectDiscountsChange template) {
        SetDirectDiscountsChangeImpl instance = new SetDirectDiscountsChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddedItems(template.getAddedItems());
        instance.setRemovedItems(template.getRemovedItems());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetDirectDiscountsChange copyDeep();

    /**
     * factory method to create a deep copy of SetDirectDiscountsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDirectDiscountsChange deepCopy(@Nullable final SetDirectDiscountsChange template) {
        if (template == null) {
            return null;
        }
        SetDirectDiscountsChangeImpl instance = new SetDirectDiscountsChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddedItems(Optional.ofNullable(template.getAddedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.DirectDiscount::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRemovedItems(Optional.ofNullable(template.getRemovedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.DirectDiscount::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.DirectDiscount::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.DirectDiscount::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetDirectDiscountsChange
     * @return builder
     */
    public static SetDirectDiscountsChangeBuilder builder() {
        return SetDirectDiscountsChangeBuilder.of();
    }

    /**
     * create builder for SetDirectDiscountsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDirectDiscountsChangeBuilder builder(final SetDirectDiscountsChange template) {
        return SetDirectDiscountsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDirectDiscountsChange(Function<SetDirectDiscountsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDirectDiscountsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDirectDiscountsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDirectDiscountsChange>";
            }
        };
    }
}
