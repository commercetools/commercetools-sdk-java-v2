
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRoleChangeBuyerAssignableAction" rel="nofollow">Change BuyerAssignable</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeBuyerAssignableChange changeBuyerAssignableChange = ChangeBuyerAssignableChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeBuyerAssignableChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeBuyerAssignableChangeImpl.class)
public interface ChangeBuyerAssignableChange extends Change {

    /**
     * discriminator value for ChangeBuyerAssignableChange
     */
    String CHANGE_BUYER_ASSIGNABLE_CHANGE = "ChangeBuyerAssignableChange";

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
     * @return instance of ChangeBuyerAssignableChange
     */
    public static ChangeBuyerAssignableChange of() {
        return new ChangeBuyerAssignableChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeBuyerAssignableChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeBuyerAssignableChange of(final ChangeBuyerAssignableChange template) {
        ChangeBuyerAssignableChangeImpl instance = new ChangeBuyerAssignableChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeBuyerAssignableChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeBuyerAssignableChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeBuyerAssignableChange deepCopy(@Nullable final ChangeBuyerAssignableChange template) {
        if (template == null) {
            return null;
        }
        ChangeBuyerAssignableChangeImpl instance = new ChangeBuyerAssignableChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeBuyerAssignableChange
     * @return builder
     */
    public static ChangeBuyerAssignableChangeBuilder builder() {
        return ChangeBuyerAssignableChangeBuilder.of();
    }

    /**
     * create builder for ChangeBuyerAssignableChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeBuyerAssignableChangeBuilder builder(final ChangeBuyerAssignableChange template) {
        return ChangeBuyerAssignableChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeBuyerAssignableChange(Function<ChangeBuyerAssignableChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeBuyerAssignableChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeBuyerAssignableChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeBuyerAssignableChange>";
            }
        };
    }
}
