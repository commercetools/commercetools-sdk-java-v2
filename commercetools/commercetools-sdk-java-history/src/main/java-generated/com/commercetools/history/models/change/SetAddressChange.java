
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelSetAddressAction" rel="nofollow">Set Address</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAddressChange setAddressChange = SetAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetAddressChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAddressChangeImpl.class)
public interface SetAddressChange extends Change {

    /**
     * discriminator value for SetAddressChange
     */
    String SET_ADDRESS_CHANGE = "SetAddressChange";

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
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Address getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Address previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Address nextValue);

    /**
     * factory method
     * @return instance of SetAddressChange
     */
    public static SetAddressChange of() {
        return new SetAddressChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAddressChange of(final SetAddressChange template) {
        SetAddressChangeImpl instance = new SetAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetAddressChange copyDeep();

    /**
     * factory method to create a deep copy of SetAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAddressChange deepCopy(@Nullable final SetAddressChange template) {
        if (template == null) {
            return null;
        }
        SetAddressChangeImpl instance = new SetAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Address.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Address.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetAddressChange
     * @return builder
     */
    public static SetAddressChangeBuilder builder() {
        return SetAddressChangeBuilder.of();
    }

    /**
     * create builder for SetAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAddressChangeBuilder builder(final SetAddressChange template) {
        return SetAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAddressChange(Function<SetAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAddressChange>";
            }
        };
    }
}
