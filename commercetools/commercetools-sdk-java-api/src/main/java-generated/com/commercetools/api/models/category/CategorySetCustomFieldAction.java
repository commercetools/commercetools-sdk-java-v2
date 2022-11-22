
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetCustomFieldAction categorySetCustomFieldAction = CategorySetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetCustomFieldActionImpl.class)
public interface CategorySetCustomFieldAction extends CategoryUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static CategorySetCustomFieldAction of() {
        return new CategorySetCustomFieldActionImpl();
    }

    public static CategorySetCustomFieldAction of(final CategorySetCustomFieldAction template) {
        CategorySetCustomFieldActionImpl instance = new CategorySetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CategorySetCustomFieldActionBuilder builder() {
        return CategorySetCustomFieldActionBuilder.of();
    }

    public static CategorySetCustomFieldActionBuilder builder(final CategorySetCustomFieldAction template) {
        return CategorySetCustomFieldActionBuilder.of(template);
    }

    default <T> T withCategorySetCustomFieldAction(Function<CategorySetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetCustomFieldAction>";
            }
        };
    }
}
