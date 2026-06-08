
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.BusinessUnitAssociateMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeAssociateModeAction" rel="nofollow">Change Associate Mode</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAssociateModeChange changeAssociateModeChange = ChangeAssociateModeChange.builder()
 *             .change("{change}")
 *             .previousValue(BusinessUnitAssociateMode.EXPLICIT)
 *             .nextValue(BusinessUnitAssociateMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeAssociateModeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeAssociateModeChangeImpl.class)
public interface ChangeAssociateModeChange extends Change {

    /**
     * discriminator value for ChangeAssociateModeChange
     */
    String CHANGE_ASSOCIATE_MODE_CHANGE = "ChangeAssociateModeChange";

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
    public BusinessUnitAssociateMode getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public BusinessUnitAssociateMode getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final BusinessUnitAssociateMode previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final BusinessUnitAssociateMode nextValue);

    /**
     * factory method
     * @return instance of ChangeAssociateModeChange
     */
    public static ChangeAssociateModeChange of() {
        return new ChangeAssociateModeChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeAssociateModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAssociateModeChange of(final ChangeAssociateModeChange template) {
        ChangeAssociateModeChangeImpl instance = new ChangeAssociateModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeAssociateModeChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeAssociateModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeAssociateModeChange deepCopy(@Nullable final ChangeAssociateModeChange template) {
        if (template == null) {
            return null;
        }
        ChangeAssociateModeChangeImpl instance = new ChangeAssociateModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeAssociateModeChange
     * @return builder
     */
    public static ChangeAssociateModeChangeBuilder builder() {
        return ChangeAssociateModeChangeBuilder.of();
    }

    /**
     * create builder for ChangeAssociateModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAssociateModeChangeBuilder builder(final ChangeAssociateModeChange template) {
        return ChangeAssociateModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAssociateModeChange(Function<ChangeAssociateModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAssociateModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAssociateModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAssociateModeChange>";
            }
        };
    }
}
