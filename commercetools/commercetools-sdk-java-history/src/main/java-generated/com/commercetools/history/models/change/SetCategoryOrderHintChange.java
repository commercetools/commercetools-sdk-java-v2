
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CategoryOrderHints;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCategoryOrderHintChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCategoryOrderHintChange setCategoryOrderHintChange = SetCategoryOrderHintChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .categoryId("{categoryId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCategoryOrderHintChangeImpl.class)
public interface SetCategoryOrderHintChange extends Change {

    /**
     * discriminator value for SetCategoryOrderHintChange
     */
    String SET_CATEGORY_ORDER_HINT_CHANGE = "SetCategoryOrderHintChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setCategoryOrderHint</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     *
     * @return categoryId
     */
    @NotNull
    @JsonProperty("categoryId")
    public String getCategoryId();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CategoryOrderHints getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CategoryOrderHints getNextValue();

    /**
     *  <p>Update action for <code>setCategoryOrderHint</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set catalogData
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     * set categoryId
     * @param categoryId value to be set
     */

    public void setCategoryId(final String categoryId);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CategoryOrderHints previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final CategoryOrderHints nextValue);

    /**
     * factory method
     * @return instance of SetCategoryOrderHintChange
     */
    public static SetCategoryOrderHintChange of() {
        return new SetCategoryOrderHintChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCategoryOrderHintChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCategoryOrderHintChange of(final SetCategoryOrderHintChange template) {
        SetCategoryOrderHintChangeImpl instance = new SetCategoryOrderHintChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setCategoryId(template.getCategoryId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCategoryOrderHintChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCategoryOrderHintChange deepCopy(@Nullable final SetCategoryOrderHintChange template) {
        if (template == null) {
            return null;
        }
        SetCategoryOrderHintChangeImpl instance = new SetCategoryOrderHintChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setCategoryId(template.getCategoryId());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.CategoryOrderHints::deepCopy)
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.CategoryOrderHints::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetCategoryOrderHintChange
     * @return builder
     */
    public static SetCategoryOrderHintChangeBuilder builder() {
        return SetCategoryOrderHintChangeBuilder.of();
    }

    /**
     * create builder for SetCategoryOrderHintChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCategoryOrderHintChangeBuilder builder(final SetCategoryOrderHintChange template) {
        return SetCategoryOrderHintChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCategoryOrderHintChange(Function<SetCategoryOrderHintChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCategoryOrderHintChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCategoryOrderHintChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCategoryOrderHintChange>";
            }
        };
    }
}
