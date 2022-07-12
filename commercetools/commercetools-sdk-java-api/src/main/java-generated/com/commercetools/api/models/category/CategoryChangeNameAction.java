
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryChangeNameActionImpl.class)
public interface CategoryChangeNameAction extends CategoryUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static CategoryChangeNameAction of() {
        return new CategoryChangeNameActionImpl();
    }

    public static CategoryChangeNameAction of(final CategoryChangeNameAction template) {
        CategoryChangeNameActionImpl instance = new CategoryChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static CategoryChangeNameActionBuilder builder() {
        return CategoryChangeNameActionBuilder.of();
    }

    public static CategoryChangeNameActionBuilder builder(final CategoryChangeNameAction template) {
        return CategoryChangeNameActionBuilder.of(template);
    }

    default <T> T withCategoryChangeNameAction(Function<CategoryChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeNameAction>";
            }
        };
    }
}
