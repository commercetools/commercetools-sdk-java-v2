
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoMethodAction" rel="nofollow">Set MethodInfoInterface</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoMethodChange setMethodInfoMethodChange = SetMethodInfoMethodChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetMethodInfoMethodChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMethodInfoMethodChangeImpl.class)
public interface SetMethodInfoMethodChange extends Change {

    /**
     * discriminator value for SetMethodInfoMethodChange
     */
    String SET_METHOD_INFO_METHOD_CHANGE = "SetMethodInfoMethodChange";

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
     * @return instance of SetMethodInfoMethodChange
     */
    public static SetMethodInfoMethodChange of() {
        return new SetMethodInfoMethodChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetMethodInfoMethodChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMethodInfoMethodChange of(final SetMethodInfoMethodChange template) {
        SetMethodInfoMethodChangeImpl instance = new SetMethodInfoMethodChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetMethodInfoMethodChange copyDeep();

    /**
     * factory method to create a deep copy of SetMethodInfoMethodChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMethodInfoMethodChange deepCopy(@Nullable final SetMethodInfoMethodChange template) {
        if (template == null) {
            return null;
        }
        SetMethodInfoMethodChangeImpl instance = new SetMethodInfoMethodChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetMethodInfoMethodChange
     * @return builder
     */
    public static SetMethodInfoMethodChangeBuilder builder() {
        return SetMethodInfoMethodChangeBuilder.of();
    }

    /**
     * create builder for SetMethodInfoMethodChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoMethodChangeBuilder builder(final SetMethodInfoMethodChange template) {
        return SetMethodInfoMethodChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMethodInfoMethodChange(Function<SetMethodInfoMethodChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoMethodChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoMethodChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMethodInfoMethodChange>";
            }
        };
    }
}
