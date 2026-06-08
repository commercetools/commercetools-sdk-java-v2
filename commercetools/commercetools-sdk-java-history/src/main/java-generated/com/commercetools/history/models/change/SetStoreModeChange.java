
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.BusinessUnitStoreMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStoreModeChange setStoreModeChange = SetStoreModeChange.builder()
 *             .change("{change}")
 *             .previousValue(BusinessUnitStoreMode.EXPLICIT)
 *             .nextValue(BusinessUnitStoreMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetStoreModeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetStoreModeChangeImpl.class)
public interface SetStoreModeChange extends Change {

    /**
     * discriminator value for SetStoreModeChange
     */
    String SET_STORE_MODE_CHANGE = "SetStoreModeChange";

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
    public BusinessUnitStoreMode getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public BusinessUnitStoreMode getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final BusinessUnitStoreMode previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final BusinessUnitStoreMode nextValue);

    /**
     * factory method
     * @return instance of SetStoreModeChange
     */
    public static SetStoreModeChange of() {
        return new SetStoreModeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetStoreModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetStoreModeChange of(final SetStoreModeChange template) {
        SetStoreModeChangeImpl instance = new SetStoreModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetStoreModeChange copyDeep();

    /**
     * factory method to create a deep copy of SetStoreModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetStoreModeChange deepCopy(@Nullable final SetStoreModeChange template) {
        if (template == null) {
            return null;
        }
        SetStoreModeChangeImpl instance = new SetStoreModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetStoreModeChange
     * @return builder
     */
    public static SetStoreModeChangeBuilder builder() {
        return SetStoreModeChangeBuilder.of();
    }

    /**
     * create builder for SetStoreModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStoreModeChangeBuilder builder(final SetStoreModeChange template) {
        return SetStoreModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetStoreModeChange(Function<SetStoreModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetStoreModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetStoreModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetStoreModeChange>";
            }
        };
    }
}
