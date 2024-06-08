
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change Associate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAssociateChange changeAssociateChange = ChangeAssociateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeAssociateChangeImpl.class)
public interface ChangeAssociateChange extends Change {

    /**
     * discriminator value for ChangeAssociateChange
     */
    String CHANGE_ASSOCIATE_CHANGE = "ChangeAssociateChange";

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
    public Associate getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Associate getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Associate previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Associate nextValue);

    /**
     * factory method
     * @return instance of ChangeAssociateChange
     */
    public static ChangeAssociateChange of() {
        return new ChangeAssociateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAssociateChange of(final ChangeAssociateChange template) {
        ChangeAssociateChangeImpl instance = new ChangeAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeAssociateChange deepCopy(@Nullable final ChangeAssociateChange template) {
        if (template == null) {
            return null;
        }
        ChangeAssociateChangeImpl instance = new ChangeAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Associate.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Associate.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeAssociateChange
     * @return builder
     */
    public static ChangeAssociateChangeBuilder builder() {
        return ChangeAssociateChangeBuilder.of();
    }

    /**
     * create builder for ChangeAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAssociateChangeBuilder builder(final ChangeAssociateChange template) {
        return ChangeAssociateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAssociateChange(Function<ChangeAssociateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAssociateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAssociateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAssociateChange>";
            }
        };
    }
}
