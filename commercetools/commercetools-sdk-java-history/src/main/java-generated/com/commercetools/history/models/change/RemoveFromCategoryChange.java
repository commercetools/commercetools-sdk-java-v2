
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Remove from Category update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveFromCategoryChange removeFromCategoryChange = RemoveFromCategoryChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveFromCategoryChangeImpl.class)
public interface RemoveFromCategoryChange extends Change {

    /**
     * discriminator value for RemoveFromCategoryChange
     */
    String REMOVE_FROM_CATEGORY_CHANGE = "RemoveFromCategoryChange";

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
    public List<Reference> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

    /**
     *  <p>Category from which the Product was removed.</p>
     * @return category
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public Reference getCategory();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final Reference... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<Reference> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final Reference... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<Reference> nextValue);

    /**
     *  <p>Category from which the Product was removed.</p>
     * @param category value to be set
     */

    public void setCategory(final Reference category);

    /**
     * factory method
     * @return instance of RemoveFromCategoryChange
     */
    public static RemoveFromCategoryChange of() {
        return new RemoveFromCategoryChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveFromCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveFromCategoryChange of(final RemoveFromCategoryChange template) {
        RemoveFromCategoryChangeImpl instance = new RemoveFromCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCategory(template.getCategory());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveFromCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveFromCategoryChange deepCopy(@Nullable final RemoveFromCategoryChange template) {
        if (template == null) {
            return null;
        }
        RemoveFromCategoryChangeImpl instance = new RemoveFromCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.Reference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.Reference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCategory(com.commercetools.history.models.common.Reference.deepCopy(template.getCategory()));
        return instance;
    }

    /**
     * builder factory method for RemoveFromCategoryChange
     * @return builder
     */
    public static RemoveFromCategoryChangeBuilder builder() {
        return RemoveFromCategoryChangeBuilder.of();
    }

    /**
     * create builder for RemoveFromCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveFromCategoryChangeBuilder builder(final RemoveFromCategoryChange template) {
        return RemoveFromCategoryChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveFromCategoryChange(Function<RemoveFromCategoryChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveFromCategoryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveFromCategoryChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveFromCategoryChange>";
            }
        };
    }
}
