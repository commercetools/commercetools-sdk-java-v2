
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.InheritedAssociate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This change is initiated by background processes after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action is performed (if <span>Associates are inherited</span>).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetInheritedAssociatesChange setInheritedAssociatesChange = SetInheritedAssociatesChange.builder()
 *             .change("{change}")
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetInheritedAssociatesChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetInheritedAssociatesChangeImpl.class)
public interface SetInheritedAssociatesChange extends Change {

    /**
     * discriminator value for SetInheritedAssociatesChange
     */
    String SET_INHERITED_ASSOCIATES_CHANGE = "SetInheritedAssociatesChange";

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
    public List<InheritedAssociate> getAddedItems();

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */
    @NotNull
    @Valid
    @JsonProperty("removedItems")
    public List<InheritedAssociate> getRemovedItems();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<InheritedAssociate> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<InheritedAssociate> getNextValue();

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
    public void setAddedItems(final InheritedAssociate... addedItems);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    public void setAddedItems(final List<InheritedAssociate> addedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    @JsonIgnore
    public void setRemovedItems(final InheritedAssociate... removedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    public void setRemovedItems(final List<InheritedAssociate> removedItems);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final InheritedAssociate... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<InheritedAssociate> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final InheritedAssociate... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<InheritedAssociate> nextValue);

    /**
     * factory method
     * @return instance of SetInheritedAssociatesChange
     */
    public static SetInheritedAssociatesChange of() {
        return new SetInheritedAssociatesChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetInheritedAssociatesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetInheritedAssociatesChange of(final SetInheritedAssociatesChange template) {
        SetInheritedAssociatesChangeImpl instance = new SetInheritedAssociatesChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddedItems(template.getAddedItems());
        instance.setRemovedItems(template.getRemovedItems());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetInheritedAssociatesChange copyDeep();

    /**
     * factory method to create a deep copy of SetInheritedAssociatesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetInheritedAssociatesChange deepCopy(@Nullable final SetInheritedAssociatesChange template) {
        if (template == null) {
            return null;
        }
        SetInheritedAssociatesChangeImpl instance = new SetInheritedAssociatesChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddedItems(Optional.ofNullable(template.getAddedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.InheritedAssociate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRemovedItems(Optional.ofNullable(template.getRemovedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.InheritedAssociate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.InheritedAssociate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.InheritedAssociate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetInheritedAssociatesChange
     * @return builder
     */
    public static SetInheritedAssociatesChangeBuilder builder() {
        return SetInheritedAssociatesChangeBuilder.of();
    }

    /**
     * create builder for SetInheritedAssociatesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetInheritedAssociatesChangeBuilder builder(final SetInheritedAssociatesChange template) {
        return SetInheritedAssociatesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetInheritedAssociatesChange(Function<SetInheritedAssociatesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetInheritedAssociatesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetInheritedAssociatesChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetInheritedAssociatesChange>";
            }
        };
    }
}
