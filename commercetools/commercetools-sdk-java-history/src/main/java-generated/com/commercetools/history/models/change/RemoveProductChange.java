
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Remove Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveProductChange removeProductChange = RemoveProductChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveProductChangeImpl.class)
public interface RemoveProductChange extends Change {

    /**
     * discriminator value for RemoveProductChange
     */
    String REMOVE_PRODUCT_CHANGE = "RemoveProductChange";

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
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

    /**
     * factory method
     * @return instance of RemoveProductChange
     */
    public static RemoveProductChange of() {
        return new RemoveProductChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveProductChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveProductChange of(final RemoveProductChange template) {
        RemoveProductChangeImpl instance = new RemoveProductChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveProductChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveProductChange deepCopy(@Nullable final RemoveProductChange template) {
        if (template == null) {
            return null;
        }
        RemoveProductChangeImpl instance = new RemoveProductChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveProductChange
     * @return builder
     */
    public static RemoveProductChangeBuilder builder() {
        return RemoveProductChangeBuilder.of();
    }

    /**
     * create builder for RemoveProductChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveProductChangeBuilder builder(final RemoveProductChange template) {
        return RemoveProductChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveProductChange(Function<RemoveProductChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveProductChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveProductChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveProductChange>";
            }
        };
    }
}
