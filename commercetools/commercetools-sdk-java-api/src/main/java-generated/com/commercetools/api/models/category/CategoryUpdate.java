
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CategoryUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryUpdate categoryUpdate = CategoryUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryUpdateImpl.class)
public interface CategoryUpdate extends
        com.commercetools.api.models.ResourceUpdate<CategoryUpdate, CategoryUpdateAction, CategoryUpdateBuilder> {

    /**
     *  <p>Expected version of the Category on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Category.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CategoryUpdateAction> getActions();

    /**
     *  <p>Expected version of the Category on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Category.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final CategoryUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Category.</p>
     * @param actions values to be set
     */

    public void setActions(final List<CategoryUpdateAction> actions);

    /**
     * factory method
     * @return instance of CategoryUpdate
     */
    public static CategoryUpdate of() {
        return new CategoryUpdateImpl();
    }

    /**
     * factory method to create a shallow copy CategoryUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryUpdate of(final CategoryUpdate template) {
        CategoryUpdateImpl instance = new CategoryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryUpdate deepCopy(@Nullable final CategoryUpdate template) {
        if (template == null) {
            return null;
        }
        CategoryUpdateImpl instance = new CategoryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.category.CategoryUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CategoryUpdate
     * @return builder
     */
    public static CategoryUpdateBuilder builder() {
        return CategoryUpdateBuilder.of();
    }

    /**
     * create builder for CategoryUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryUpdateBuilder builder(final CategoryUpdate template) {
        return CategoryUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryUpdate(Function<CategoryUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryUpdate>";
            }
        };
    }
}
