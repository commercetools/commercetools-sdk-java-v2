
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListSetDeleteDaysAfterLastModificationAction" rel="nofollow">Set DeleteDaysAfterLastModification</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeleteDaysAfterLastModificationChange setDeleteDaysAfterLastModificationChange = SetDeleteDaysAfterLastModificationChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetDeleteDaysAfterLastModificationChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDeleteDaysAfterLastModificationChangeImpl.class)
public interface SetDeleteDaysAfterLastModificationChange extends Change {

    /**
     * discriminator value for SetDeleteDaysAfterLastModificationChange
     */
    String SET_DELETE_DAYS_AFTER_LAST_MODIFICATION_CHANGE = "SetDeleteDaysAfterLastModificationChange";

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
    public Integer getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     * factory method
     * @return instance of SetDeleteDaysAfterLastModificationChange
     */
    public static SetDeleteDaysAfterLastModificationChange of() {
        return new SetDeleteDaysAfterLastModificationChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDeleteDaysAfterLastModificationChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDeleteDaysAfterLastModificationChange of(final SetDeleteDaysAfterLastModificationChange template) {
        SetDeleteDaysAfterLastModificationChangeImpl instance = new SetDeleteDaysAfterLastModificationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetDeleteDaysAfterLastModificationChange copyDeep();

    /**
     * factory method to create a deep copy of SetDeleteDaysAfterLastModificationChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDeleteDaysAfterLastModificationChange deepCopy(
            @Nullable final SetDeleteDaysAfterLastModificationChange template) {
        if (template == null) {
            return null;
        }
        SetDeleteDaysAfterLastModificationChangeImpl instance = new SetDeleteDaysAfterLastModificationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetDeleteDaysAfterLastModificationChange
     * @return builder
     */
    public static SetDeleteDaysAfterLastModificationChangeBuilder builder() {
        return SetDeleteDaysAfterLastModificationChangeBuilder.of();
    }

    /**
     * create builder for SetDeleteDaysAfterLastModificationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeleteDaysAfterLastModificationChangeBuilder builder(
            final SetDeleteDaysAfterLastModificationChange template) {
        return SetDeleteDaysAfterLastModificationChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDeleteDaysAfterLastModificationChange(
            Function<SetDeleteDaysAfterLastModificationChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDeleteDaysAfterLastModificationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeleteDaysAfterLastModificationChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeleteDaysAfterLastModificationChange>";
            }
        };
    }
}
