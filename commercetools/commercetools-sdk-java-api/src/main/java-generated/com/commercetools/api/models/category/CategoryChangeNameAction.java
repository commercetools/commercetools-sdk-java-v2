
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CategoryChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeNameAction categoryChangeNameAction = CategoryChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryChangeNameActionImpl.class)
public interface CategoryChangeNameAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of CategoryChangeNameAction
     */
    public static CategoryChangeNameAction of() {
        return new CategoryChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy CategoryChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryChangeNameAction of(final CategoryChangeNameAction template) {
        CategoryChangeNameActionImpl instance = new CategoryChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public CategoryChangeNameAction copyDeep();

    /**
     * factory method to create a deep copy of CategoryChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryChangeNameAction deepCopy(@Nullable final CategoryChangeNameAction template) {
        if (template == null) {
            return null;
        }
        CategoryChangeNameActionImpl instance = new CategoryChangeNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for CategoryChangeNameAction
     * @return builder
     */
    public static CategoryChangeNameActionBuilder builder() {
        return CategoryChangeNameActionBuilder.of();
    }

    /**
     * create builder for CategoryChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryChangeNameActionBuilder builder(final CategoryChangeNameAction template) {
        return CategoryChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryChangeNameAction(Function<CategoryChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeNameAction>";
            }
        };
    }
}
