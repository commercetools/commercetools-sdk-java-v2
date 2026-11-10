
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
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryAddStoreAction categoryAddStoreAction = CategoryAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addStore")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryAddStoreActionImpl.class)
public interface CategoryAddStoreAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryAddStoreAction
     */
    String ADD_STORE = "addStore";

    /**
     *  <p>Value to add to the Category's <code>stores</code>.</p>
     *  <p>When called through an <span>in-Store endpoint</span>, the caller must have permission for the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Value to add to the Category's <code>stores</code>.</p>
     *  <p>When called through an <span>in-Store endpoint</span>, the caller must have permission for the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of CategoryAddStoreAction
     */
    public static CategoryAddStoreAction of() {
        return new CategoryAddStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy CategoryAddStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryAddStoreAction of(final CategoryAddStoreAction template) {
        CategoryAddStoreActionImpl instance = new CategoryAddStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public CategoryAddStoreAction copyDeep();

    /**
     * factory method to create a deep copy of CategoryAddStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryAddStoreAction deepCopy(@Nullable final CategoryAddStoreAction template) {
        if (template == null) {
            return null;
        }
        CategoryAddStoreActionImpl instance = new CategoryAddStoreActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for CategoryAddStoreAction
     * @return builder
     */
    public static CategoryAddStoreActionBuilder builder() {
        return CategoryAddStoreActionBuilder.of();
    }

    /**
     * create builder for CategoryAddStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryAddStoreActionBuilder builder(final CategoryAddStoreAction template) {
        return CategoryAddStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryAddStoreAction(Function<CategoryAddStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CategoryAddStoreAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<CategoryAddStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryAddStoreAction>";
            }
        };
    }
}
