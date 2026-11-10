
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>This action locks the Category and its parent Category. For details, see <span>Category tree locking</span>.</p>
 *  <p>Every direct child Category must be assigned to at least one Store in that set; otherwise, the action is rejected.</p>
 *  <ul>
 *   <li>When updating a Category via the <span>general endpoint</span>, all Stores can be removed as a global Category is accessible in all Stores.</li>
 *   <li>When updating a Category via the <span>Store-specific endpoint</span>, you can remove the last Store only if at least one Store remains; otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned. If you do not have permission for the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryRemoveStoreAction categoryRemoveStoreAction = CategoryRemoveStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeStore")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryRemoveStoreActionImpl.class)
public interface CategoryRemoveStoreAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryRemoveStoreAction
     */
    String REMOVE_STORE = "removeStore";

    /**
     *  <p>Value to remove from the Category's <code>stores</code>.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Value to remove from the Category's <code>stores</code>.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of CategoryRemoveStoreAction
     */
    public static CategoryRemoveStoreAction of() {
        return new CategoryRemoveStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy CategoryRemoveStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryRemoveStoreAction of(final CategoryRemoveStoreAction template) {
        CategoryRemoveStoreActionImpl instance = new CategoryRemoveStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public CategoryRemoveStoreAction copyDeep();

    /**
     * factory method to create a deep copy of CategoryRemoveStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryRemoveStoreAction deepCopy(@Nullable final CategoryRemoveStoreAction template) {
        if (template == null) {
            return null;
        }
        CategoryRemoveStoreActionImpl instance = new CategoryRemoveStoreActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for CategoryRemoveStoreAction
     * @return builder
     */
    public static CategoryRemoveStoreActionBuilder builder() {
        return CategoryRemoveStoreActionBuilder.of();
    }

    /**
     * create builder for CategoryRemoveStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryRemoveStoreActionBuilder builder(final CategoryRemoveStoreAction template) {
        return CategoryRemoveStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryRemoveStoreAction(Function<CategoryRemoveStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CategoryRemoveStoreAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<CategoryRemoveStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryRemoveStoreAction>";
            }
        };
    }
}
