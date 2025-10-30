
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ReturnInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetReturnInfoAction" rel="nofollow">Set ReturnInfo</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnInfoChange setReturnInfoChange = SetReturnInfoChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetReturnInfoChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetReturnInfoChangeImpl.class)
public interface SetReturnInfoChange extends Change {

    /**
     * discriminator value for SetReturnInfoChange
     */
    String SET_RETURN_INFO_CHANGE = "SetReturnInfoChange";

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
    public ReturnInfo getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ReturnInfo getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ReturnInfo previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ReturnInfo nextValue);

    /**
     * factory method
     * @return instance of SetReturnInfoChange
     */
    public static SetReturnInfoChange of() {
        return new SetReturnInfoChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetReturnInfoChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetReturnInfoChange of(final SetReturnInfoChange template) {
        SetReturnInfoChangeImpl instance = new SetReturnInfoChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetReturnInfoChange copyDeep();

    /**
     * factory method to create a deep copy of SetReturnInfoChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetReturnInfoChange deepCopy(@Nullable final SetReturnInfoChange template) {
        if (template == null) {
            return null;
        }
        SetReturnInfoChangeImpl instance = new SetReturnInfoChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.ReturnInfo.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.ReturnInfo.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetReturnInfoChange
     * @return builder
     */
    public static SetReturnInfoChangeBuilder builder() {
        return SetReturnInfoChangeBuilder.of();
    }

    /**
     * create builder for SetReturnInfoChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnInfoChangeBuilder builder(final SetReturnInfoChange template) {
        return SetReturnInfoChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetReturnInfoChange(Function<SetReturnInfoChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetReturnInfoChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetReturnInfoChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetReturnInfoChange>";
            }
        };
    }
}
