
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set SupplyChannel update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSupplyChannelChange setSupplyChannelChange = SetSupplyChannelChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetSupplyChannelChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetSupplyChannelChangeImpl.class)
public interface SetSupplyChannelChange extends Change {

    /**
     * discriminator value for SetSupplyChannelChange
     */
    String SET_SUPPLY_CHANNEL_CHANGE = "SetSupplyChannelChange";

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
    public Reference getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of SetSupplyChannelChange
     */
    public static SetSupplyChannelChange of() {
        return new SetSupplyChannelChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetSupplyChannelChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetSupplyChannelChange of(final SetSupplyChannelChange template) {
        SetSupplyChannelChangeImpl instance = new SetSupplyChannelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetSupplyChannelChange copyDeep();

    /**
     * factory method to create a deep copy of SetSupplyChannelChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetSupplyChannelChange deepCopy(@Nullable final SetSupplyChannelChange template) {
        if (template == null) {
            return null;
        }
        SetSupplyChannelChangeImpl instance = new SetSupplyChannelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetSupplyChannelChange
     * @return builder
     */
    public static SetSupplyChannelChangeBuilder builder() {
        return SetSupplyChannelChangeBuilder.of();
    }

    /**
     * create builder for SetSupplyChannelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSupplyChannelChangeBuilder builder(final SetSupplyChannelChange template) {
        return SetSupplyChannelChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetSupplyChannelChange(Function<SetSupplyChannelChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetSupplyChannelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSupplyChannelChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSupplyChannelChange>";
            }
        };
    }
}
