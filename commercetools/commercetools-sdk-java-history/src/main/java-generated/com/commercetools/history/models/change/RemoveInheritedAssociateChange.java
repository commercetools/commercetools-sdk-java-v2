
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
 *  <p>Change triggered by the Remove Associate update action on a parent of a Business Unit in cases where inheritance applies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveInheritedAssociateChange removeInheritedAssociateChange = RemoveInheritedAssociateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RemoveInheritedAssociateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveInheritedAssociateChangeImpl.class)
public interface RemoveInheritedAssociateChange extends Change {

    /**
     * discriminator value for RemoveInheritedAssociateChange
     */
    String REMOVE_INHERITED_ASSOCIATE_CHANGE = "RemoveInheritedAssociateChange";

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
     *  <p>The value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public InheritedAssociate getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>The value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final InheritedAssociate previousValue);

    /**
     * factory method
     * @return instance of RemoveInheritedAssociateChange
     */
    public static RemoveInheritedAssociateChange of() {
        return new RemoveInheritedAssociateChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveInheritedAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveInheritedAssociateChange of(final RemoveInheritedAssociateChange template) {
        RemoveInheritedAssociateChangeImpl instance = new RemoveInheritedAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public RemoveInheritedAssociateChange copyDeep();

    /**
     * factory method to create a deep copy of RemoveInheritedAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveInheritedAssociateChange deepCopy(@Nullable final RemoveInheritedAssociateChange template) {
        if (template == null) {
            return null;
        }
        RemoveInheritedAssociateChangeImpl instance = new RemoveInheritedAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.InheritedAssociate.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveInheritedAssociateChange
     * @return builder
     */
    public static RemoveInheritedAssociateChangeBuilder builder() {
        return RemoveInheritedAssociateChangeBuilder.of();
    }

    /**
     * create builder for RemoveInheritedAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveInheritedAssociateChangeBuilder builder(final RemoveInheritedAssociateChange template) {
        return RemoveInheritedAssociateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveInheritedAssociateChange(Function<RemoveInheritedAssociateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveInheritedAssociateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveInheritedAssociateChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveInheritedAssociateChange>";
            }
        };
    }
}
