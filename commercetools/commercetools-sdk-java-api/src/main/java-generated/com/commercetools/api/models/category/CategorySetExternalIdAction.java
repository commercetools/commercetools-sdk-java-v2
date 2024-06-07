
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action sets a new ID that can be used as an additional identifier for external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetExternalIdAction categorySetExternalIdAction = CategorySetExternalIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetExternalIdActionImpl.class)
public interface CategorySetExternalIdAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetExternalIdAction
     */
    String SET_EXTERNAL_ID = "setExternalId";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     * factory method
     * @return instance of CategorySetExternalIdAction
     */
    public static CategorySetExternalIdAction of() {
        return new CategorySetExternalIdActionImpl();
    }

    /**
     * factory method to create a shallow copy CategorySetExternalIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetExternalIdAction of(final CategorySetExternalIdAction template) {
        CategorySetExternalIdActionImpl instance = new CategorySetExternalIdActionImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetExternalIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetExternalIdAction deepCopy(@Nullable final CategorySetExternalIdAction template) {
        if (template == null) {
            return null;
        }
        CategorySetExternalIdActionImpl instance = new CategorySetExternalIdActionImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    /**
     * builder factory method for CategorySetExternalIdAction
     * @return builder
     */
    public static CategorySetExternalIdActionBuilder builder() {
        return CategorySetExternalIdActionBuilder.of();
    }

    /**
     * create builder for CategorySetExternalIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetExternalIdActionBuilder builder(final CategorySetExternalIdAction template) {
        return CategorySetExternalIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetExternalIdAction(Function<CategorySetExternalIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetExternalIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetExternalIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetExternalIdAction>";
            }
        };
    }
}
