
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomerGroupAssignment;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerGroupAssignmentsChange setCustomerGroupAssignmentsChange = SetCustomerGroupAssignmentsChange.builder()
 *             .change("{change}")
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetCustomerGroupAssignmentsChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomerGroupAssignmentsChangeImpl.class)
public interface SetCustomerGroupAssignmentsChange extends Change {

    /**
     * discriminator value for SetCustomerGroupAssignmentsChange
     */
    String SET_CUSTOMER_GROUP_ASSIGNMENTS_CHANGE = "SetCustomerGroupAssignmentsChange";

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
    public List<CustomerGroupAssignment> getAddedItems();

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */
    @NotNull
    @Valid
    @JsonProperty("removedItems")
    public List<CustomerGroupAssignment> getRemovedItems();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<CustomerGroupAssignment> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<CustomerGroupAssignment> getNextValue();

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
    public void setAddedItems(final CustomerGroupAssignment... addedItems);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    public void setAddedItems(final List<CustomerGroupAssignment> addedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    @JsonIgnore
    public void setRemovedItems(final CustomerGroupAssignment... removedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    public void setRemovedItems(final List<CustomerGroupAssignment> removedItems);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final CustomerGroupAssignment... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<CustomerGroupAssignment> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final CustomerGroupAssignment... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<CustomerGroupAssignment> nextValue);

    /**
     * factory method
     * @return instance of SetCustomerGroupAssignmentsChange
     */
    public static SetCustomerGroupAssignmentsChange of() {
        return new SetCustomerGroupAssignmentsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomerGroupAssignmentsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomerGroupAssignmentsChange of(final SetCustomerGroupAssignmentsChange template) {
        SetCustomerGroupAssignmentsChangeImpl instance = new SetCustomerGroupAssignmentsChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddedItems(template.getAddedItems());
        instance.setRemovedItems(template.getRemovedItems());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetCustomerGroupAssignmentsChange copyDeep();

    /**
     * factory method to create a deep copy of SetCustomerGroupAssignmentsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomerGroupAssignmentsChange deepCopy(
            @Nullable final SetCustomerGroupAssignmentsChange template) {
        if (template == null) {
            return null;
        }
        SetCustomerGroupAssignmentsChangeImpl instance = new SetCustomerGroupAssignmentsChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddedItems(Optional.ofNullable(template.getAddedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.CustomerGroupAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRemovedItems(Optional.ofNullable(template.getRemovedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.CustomerGroupAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.CustomerGroupAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.CustomerGroupAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetCustomerGroupAssignmentsChange
     * @return builder
     */
    public static SetCustomerGroupAssignmentsChangeBuilder builder() {
        return SetCustomerGroupAssignmentsChangeBuilder.of();
    }

    /**
     * create builder for SetCustomerGroupAssignmentsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerGroupAssignmentsChangeBuilder builder(final SetCustomerGroupAssignmentsChange template) {
        return SetCustomerGroupAssignmentsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomerGroupAssignmentsChange(Function<SetCustomerGroupAssignmentsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomerGroupAssignmentsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomerGroupAssignmentsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomerGroupAssignmentsChange>";
            }
        };
    }
}
