
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeParentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeParentAction categoryChangeParentAction = CategoryChangeParentAction.builder()
 *             .parent(parentBuilder -> parentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryChangeParentActionImpl.class)
public interface CategoryChangeParentAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryChangeParentAction
     */
    String CHANGE_PARENT = "changeParent";

    /**
     *  <p>New value to set as parent.</p>
     * @return parent
     */
    @NotNull
    @Valid
    @JsonProperty("parent")
    public CategoryResourceIdentifier getParent();

    /**
     *  <p>New value to set as parent.</p>
     * @param parent value to be set
     */

    public void setParent(final CategoryResourceIdentifier parent);

    /**
     * factory method
     * @return instance of CategoryChangeParentAction
     */
    public static CategoryChangeParentAction of() {
        return new CategoryChangeParentActionImpl();
    }

    /**
     * factory method to create a shallow copy CategoryChangeParentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryChangeParentAction of(final CategoryChangeParentAction template) {
        CategoryChangeParentActionImpl instance = new CategoryChangeParentActionImpl();
        instance.setParent(template.getParent());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryChangeParentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryChangeParentAction deepCopy(@Nullable final CategoryChangeParentAction template) {
        if (template == null) {
            return null;
        }
        CategoryChangeParentActionImpl instance = new CategoryChangeParentActionImpl();
        instance.setParent(
            com.commercetools.api.models.category.CategoryResourceIdentifier.deepCopy(template.getParent()));
        return instance;
    }

    /**
     * builder factory method for CategoryChangeParentAction
     * @return builder
     */
    public static CategoryChangeParentActionBuilder builder() {
        return CategoryChangeParentActionBuilder.of();
    }

    /**
     * create builder for CategoryChangeParentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryChangeParentActionBuilder builder(final CategoryChangeParentAction template) {
        return CategoryChangeParentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryChangeParentAction(Function<CategoryChangeParentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeParentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeParentAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeParentAction>";
            }
        };
    }
}
