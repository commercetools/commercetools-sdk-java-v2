
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetStatusInterfaceTextAction" rel="nofollow">Set StatusInterfaceText</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStatusInterfaceTextChange setStatusInterfaceTextChange = SetStatusInterfaceTextChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetStatusInterfaceTextChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetStatusInterfaceTextChangeImpl.class)
public interface SetStatusInterfaceTextChange extends Change {

    /**
     * discriminator value for SetStatusInterfaceTextChange
     */
    String SET_STATUS_INTERFACE_TEXT_CHANGE = "SetStatusInterfaceTextChange";

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
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of SetStatusInterfaceTextChange
     */
    public static SetStatusInterfaceTextChange of() {
        return new SetStatusInterfaceTextChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetStatusInterfaceTextChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetStatusInterfaceTextChange of(final SetStatusInterfaceTextChange template) {
        SetStatusInterfaceTextChangeImpl instance = new SetStatusInterfaceTextChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetStatusInterfaceTextChange copyDeep();

    /**
     * factory method to create a deep copy of SetStatusInterfaceTextChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetStatusInterfaceTextChange deepCopy(@Nullable final SetStatusInterfaceTextChange template) {
        if (template == null) {
            return null;
        }
        SetStatusInterfaceTextChangeImpl instance = new SetStatusInterfaceTextChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetStatusInterfaceTextChange
     * @return builder
     */
    public static SetStatusInterfaceTextChangeBuilder builder() {
        return SetStatusInterfaceTextChangeBuilder.of();
    }

    /**
     * create builder for SetStatusInterfaceTextChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStatusInterfaceTextChangeBuilder builder(final SetStatusInterfaceTextChange template) {
        return SetStatusInterfaceTextChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetStatusInterfaceTextChange(Function<SetStatusInterfaceTextChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetStatusInterfaceTextChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetStatusInterfaceTextChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetStatusInterfaceTextChange>";
            }
        };
    }
}
