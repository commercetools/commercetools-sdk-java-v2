
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveFromCategoryChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveFromCategoryChange removeFromCategoryChange = RemoveFromCategoryChange.builder()
 *             .change("{change}")
 *             .category(categoryBuilder -> categoryBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
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
     *  <p>Update action for <code>addToCategory</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return category
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public Reference getCategory();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Reference> getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

    /**
     *  <p>Update action for <code>addToCategory</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set category
     * @param category value to be set
     */

    public void setCategory(final Reference category);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final Reference... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<Reference> previousValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final Reference... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<Reference> nextValue);

    /**
     * factory method
     * @return instance of RemoveFromCategoryChange
     */
    public static RemoveFromCategoryChange of() {
        return new RemoveFromCategoryChangeImpl();
    }

    /**
     * factory method to copy an instance of RemoveFromCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveFromCategoryChange of(final RemoveFromCategoryChange template) {
        RemoveFromCategoryChangeImpl instance = new RemoveFromCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setCategory(template.getCategory());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
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
