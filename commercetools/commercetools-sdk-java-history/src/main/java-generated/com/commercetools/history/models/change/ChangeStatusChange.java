
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.BusinessUnitStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Change Status update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStatusChange changeStatusChange = ChangeStatusChange.builder()
 *             .change("{change}")
 *             .previousValue(BusinessUnitStatus.ACTIVE)
 *             .nextValue(BusinessUnitStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeStatusChangeImpl.class)
public interface ChangeStatusChange extends Change {

    /**
     * discriminator value for ChangeStatusChange
     */
    String CHANGE_STATUS_CHANGE = "ChangeStatusChange";

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
    public BusinessUnitStatus getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public BusinessUnitStatus getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final BusinessUnitStatus previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final BusinessUnitStatus nextValue);

    /**
     * factory method
     * @return instance of ChangeStatusChange
     */
    public static ChangeStatusChange of() {
        return new ChangeStatusChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeStatusChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeStatusChange of(final ChangeStatusChange template) {
        ChangeStatusChangeImpl instance = new ChangeStatusChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeStatusChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeStatusChange deepCopy(@Nullable final ChangeStatusChange template) {
        if (template == null) {
            return null;
        }
        ChangeStatusChangeImpl instance = new ChangeStatusChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeStatusChange
     * @return builder
     */
    public static ChangeStatusChangeBuilder builder() {
        return ChangeStatusChangeBuilder.of();
    }

    /**
     * create builder for ChangeStatusChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStatusChangeBuilder builder(final ChangeStatusChange template) {
        return ChangeStatusChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeStatusChange(Function<ChangeStatusChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeStatusChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeStatusChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeStatusChange>";
            }
        };
    }
}
