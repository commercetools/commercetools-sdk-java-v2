
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
 *  <p>This change is initiated by background processes after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountSetValidFromAction" rel="nofollow">Set Valid From</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountSetValidUntilAction" rel="nofollow">Set Valid Until</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action is performed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetIsValidChange setIsValidChange = SetIsValidChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetIsValidChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetIsValidChangeImpl.class)
public interface SetIsValidChange extends Change {

    /**
     * discriminator value for SetIsValidChange
     */
    String SET_IS_VALID_CHANGE = "SetIsValidChange";

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
    public Boolean getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Boolean previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Boolean nextValue);

    /**
     * factory method
     * @return instance of SetIsValidChange
     */
    public static SetIsValidChange of() {
        return new SetIsValidChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetIsValidChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetIsValidChange of(final SetIsValidChange template) {
        SetIsValidChangeImpl instance = new SetIsValidChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetIsValidChange copyDeep();

    /**
     * factory method to create a deep copy of SetIsValidChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetIsValidChange deepCopy(@Nullable final SetIsValidChange template) {
        if (template == null) {
            return null;
        }
        SetIsValidChangeImpl instance = new SetIsValidChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetIsValidChange
     * @return builder
     */
    public static SetIsValidChangeBuilder builder() {
        return SetIsValidChangeBuilder.of();
    }

    /**
     * create builder for SetIsValidChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetIsValidChangeBuilder builder(final SetIsValidChange template) {
        return SetIsValidChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetIsValidChange(Function<SetIsValidChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetIsValidChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetIsValidChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetIsValidChange>";
            }
        };
    }
}
