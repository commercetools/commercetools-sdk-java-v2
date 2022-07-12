
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>Expected version of the Category on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Category.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CategoryUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final CategoryUpdateAction... actions);

    public void setActions(final List<CategoryUpdateAction> actions);

    public static CategoryUpdate of() {
        return new CategoryUpdateImpl();
    }

    public static CategoryUpdate of(final CategoryUpdate template) {
        CategoryUpdateImpl instance = new CategoryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static CategoryUpdateBuilder builder() {
        return CategoryUpdateBuilder.of();
    }

    public static CategoryUpdateBuilder builder(final CategoryUpdate template) {
        return CategoryUpdateBuilder.of(template);
    }

    default <T> T withCategoryUpdate(Function<CategoryUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryUpdate>";
            }
        };
    }
}
