
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ProductSelectionSetting;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Remove Product Selection update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveProductSelectionChange removeProductSelectionChange = RemoveProductSelectionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RemoveProductSelectionChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveProductSelectionChangeImpl.class)
public interface RemoveProductSelectionChange extends Change {

    /**
     * discriminator value for RemoveProductSelectionChange
     */
    String REMOVE_PRODUCT_SELECTION_CHANGE = "RemoveProductSelectionChange";

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
    public ProductSelectionSetting getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ProductSelectionSetting previousValue);

    /**
     * factory method
     * @return instance of RemoveProductSelectionChange
     */
    public static RemoveProductSelectionChange of() {
        return new RemoveProductSelectionChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveProductSelectionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveProductSelectionChange of(final RemoveProductSelectionChange template) {
        RemoveProductSelectionChangeImpl instance = new RemoveProductSelectionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public RemoveProductSelectionChange copyDeep();

    /**
     * factory method to create a deep copy of RemoveProductSelectionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveProductSelectionChange deepCopy(@Nullable final RemoveProductSelectionChange template) {
        if (template == null) {
            return null;
        }
        RemoveProductSelectionChangeImpl instance = new RemoveProductSelectionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.ProductSelectionSetting.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveProductSelectionChange
     * @return builder
     */
    public static RemoveProductSelectionChangeBuilder builder() {
        return RemoveProductSelectionChangeBuilder.of();
    }

    /**
     * create builder for RemoveProductSelectionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveProductSelectionChangeBuilder builder(final RemoveProductSelectionChange template) {
        return RemoveProductSelectionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveProductSelectionChange(Function<RemoveProductSelectionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveProductSelectionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveProductSelectionChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveProductSelectionChange>";
            }
        };
    }
}
