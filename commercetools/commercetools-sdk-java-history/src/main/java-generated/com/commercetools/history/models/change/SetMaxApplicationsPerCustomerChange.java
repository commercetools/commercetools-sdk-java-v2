
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
 *  <p>Change triggered by the Set Max Applications Per Customer update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMaxApplicationsPerCustomerChange setMaxApplicationsPerCustomerChange = SetMaxApplicationsPerCustomerChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMaxApplicationsPerCustomerChangeImpl.class)
public interface SetMaxApplicationsPerCustomerChange extends Change {

    /**
     * discriminator value for SetMaxApplicationsPerCustomerChange
     */
    String SET_MAX_APPLICATIONS_PER_CUSTOMER_CHANGE = "SetMaxApplicationsPerCustomerChange";

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
     * @return instance of SetMaxApplicationsPerCustomerChange
     */
    public static SetMaxApplicationsPerCustomerChange of() {
        return new SetMaxApplicationsPerCustomerChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetMaxApplicationsPerCustomerChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMaxApplicationsPerCustomerChange of(final SetMaxApplicationsPerCustomerChange template) {
        SetMaxApplicationsPerCustomerChangeImpl instance = new SetMaxApplicationsPerCustomerChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetMaxApplicationsPerCustomerChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMaxApplicationsPerCustomerChange deepCopy(
            @Nullable final SetMaxApplicationsPerCustomerChange template) {
        if (template == null) {
            return null;
        }
        SetMaxApplicationsPerCustomerChangeImpl instance = new SetMaxApplicationsPerCustomerChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetMaxApplicationsPerCustomerChange
     * @return builder
     */
    public static SetMaxApplicationsPerCustomerChangeBuilder builder() {
        return SetMaxApplicationsPerCustomerChangeBuilder.of();
    }

    /**
     * create builder for SetMaxApplicationsPerCustomerChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMaxApplicationsPerCustomerChangeBuilder builder(
            final SetMaxApplicationsPerCustomerChange template) {
        return SetMaxApplicationsPerCustomerChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMaxApplicationsPerCustomerChange(Function<SetMaxApplicationsPerCustomerChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetMaxApplicationsPerCustomerChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMaxApplicationsPerCustomerChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMaxApplicationsPerCustomerChange>";
            }
        };
    }
}
