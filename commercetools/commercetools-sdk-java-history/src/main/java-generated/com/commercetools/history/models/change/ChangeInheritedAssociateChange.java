
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.InheritedAssociate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change Associate update action on a parent of a Business Unit in cases where inheritance applies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeInheritedAssociateChange changeInheritedAssociateChange = ChangeInheritedAssociateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeInheritedAssociateChangeImpl.class)
public interface ChangeInheritedAssociateChange extends Change {

    /**
     * discriminator value for ChangeInheritedAssociateChange
     */
    String CHANGE_INHERITED_ASSOCIATE_CHANGE = "ChangeInheritedAssociateChange";

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
    public InheritedAssociate getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public InheritedAssociate getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final InheritedAssociate previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final InheritedAssociate nextValue);

    /**
     * factory method
     * @return instance of ChangeInheritedAssociateChange
     */
    public static ChangeInheritedAssociateChange of() {
        return new ChangeInheritedAssociateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeInheritedAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeInheritedAssociateChange of(final ChangeInheritedAssociateChange template) {
        ChangeInheritedAssociateChangeImpl instance = new ChangeInheritedAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeInheritedAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeInheritedAssociateChange deepCopy(@Nullable final ChangeInheritedAssociateChange template) {
        if (template == null) {
            return null;
        }
        ChangeInheritedAssociateChangeImpl instance = new ChangeInheritedAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.InheritedAssociate.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.InheritedAssociate.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeInheritedAssociateChange
     * @return builder
     */
    public static ChangeInheritedAssociateChangeBuilder builder() {
        return ChangeInheritedAssociateChangeBuilder.of();
    }

    /**
     * create builder for ChangeInheritedAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeInheritedAssociateChangeBuilder builder(final ChangeInheritedAssociateChange template) {
        return ChangeInheritedAssociateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeInheritedAssociateChange(Function<ChangeInheritedAssociateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeInheritedAssociateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeInheritedAssociateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeInheritedAssociateChange>";
            }
        };
    }
}
