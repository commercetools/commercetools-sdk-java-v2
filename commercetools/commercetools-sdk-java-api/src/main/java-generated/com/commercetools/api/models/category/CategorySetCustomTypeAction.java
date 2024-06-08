
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * CategorySetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetCustomTypeAction categorySetCustomTypeAction = CategorySetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetCustomTypeActionImpl.class)
public interface CategorySetCustomTypeAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Category with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Category.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Category.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the Category with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Category.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Category.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of CategorySetCustomTypeAction
     */
    public static CategorySetCustomTypeAction of() {
        return new CategorySetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy CategorySetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetCustomTypeAction of(final CategorySetCustomTypeAction template) {
        CategorySetCustomTypeActionImpl instance = new CategorySetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetCustomTypeAction deepCopy(@Nullable final CategorySetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        CategorySetCustomTypeActionImpl instance = new CategorySetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for CategorySetCustomTypeAction
     * @return builder
     */
    public static CategorySetCustomTypeActionBuilder builder() {
        return CategorySetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for CategorySetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetCustomTypeActionBuilder builder(final CategorySetCustomTypeAction template) {
        return CategorySetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetCustomTypeAction(Function<CategorySetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetCustomTypeAction>";
            }
        };
    }
}
