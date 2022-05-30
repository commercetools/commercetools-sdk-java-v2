
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

    String CHANGE_PARENT = "changeParent";

    /**
     *  <p>New value to set as parent.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("parent")
    public CategoryResourceIdentifier getParent();

    public void setParent(final CategoryResourceIdentifier parent);

    public static CategoryChangeParentAction of() {
        return new CategoryChangeParentActionImpl();
    }

    public static CategoryChangeParentAction of(final CategoryChangeParentAction template) {
        CategoryChangeParentActionImpl instance = new CategoryChangeParentActionImpl();
        instance.setParent(template.getParent());
        return instance;
    }

    public static CategoryChangeParentActionBuilder builder() {
        return CategoryChangeParentActionBuilder.of();
    }

    public static CategoryChangeParentActionBuilder builder(final CategoryChangeParentAction template) {
        return CategoryChangeParentActionBuilder.of(template);
    }

    default <T> T withCategoryChangeParentAction(Function<CategoryChangeParentAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeParentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeParentAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeParentAction>";
            }
        };
    }
}
