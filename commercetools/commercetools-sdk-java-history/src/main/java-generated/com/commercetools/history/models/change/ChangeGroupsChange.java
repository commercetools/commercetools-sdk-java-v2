
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeChangeGroupsAction" rel="nofollow">Change Groups</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeGroupsChange changeGroupsChange = ChangeGroupsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeGroupsChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeGroupsChangeImpl.class)
public interface ChangeGroupsChange extends Change {

    /**
     * discriminator value for ChangeGroupsChange
     */
    String CHANGE_GROUPS_CHANGE = "ChangeGroupsChange";

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
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();

    /**
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */
    @NotNull
    @JsonProperty("addedItems")
    public List<String> getAddedItems();

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */
    @NotNull
    @JsonProperty("removedItems")
    public List<String> getRemovedItems();

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
    public void setPreviousValue(final String... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<String> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<String> nextValue);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    @JsonIgnore
    public void setAddedItems(final String... addedItems);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    public void setAddedItems(final List<String> addedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    @JsonIgnore
    public void setRemovedItems(final String... removedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    public void setRemovedItems(final List<String> removedItems);

    /**
     * factory method
     * @return instance of ChangeGroupsChange
     */
    public static ChangeGroupsChange of() {
        return new ChangeGroupsChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeGroupsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeGroupsChange of(final ChangeGroupsChange template) {
        ChangeGroupsChangeImpl instance = new ChangeGroupsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAddedItems(template.getAddedItems());
        instance.setRemovedItems(template.getRemovedItems());
        return instance;
    }

    public ChangeGroupsChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeGroupsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeGroupsChange deepCopy(@Nullable final ChangeGroupsChange template) {
        if (template == null) {
            return null;
        }
        ChangeGroupsChangeImpl instance = new ChangeGroupsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue()).map(ArrayList::new).orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue()).map(ArrayList::new).orElse(null));
        instance.setAddedItems(Optional.ofNullable(template.getAddedItems()).map(ArrayList::new).orElse(null));
        instance.setRemovedItems(Optional.ofNullable(template.getRemovedItems()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeGroupsChange
     * @return builder
     */
    public static ChangeGroupsChangeBuilder builder() {
        return ChangeGroupsChangeBuilder.of();
    }

    /**
     * create builder for ChangeGroupsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeGroupsChangeBuilder builder(final ChangeGroupsChange template) {
        return ChangeGroupsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeGroupsChange(Function<ChangeGroupsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeGroupsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeGroupsChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeGroupsChange>";
            }
        };
    }
}
