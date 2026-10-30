
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
 *  <p>Adds a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to the <code>stores</code> of the Category and to all of its descendant Categories.</p>
 *  <p>This action is only available on the <span>general endpoint</span>.</p>
 *  <p>If this action is used on the <span>Store-specific endpoint</span>, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
 *  <p>The API records the request and responds with <code>202 Accepted</code>. The returned Category has the same <code>stores</code> as before and an incremented <code>version</code>, and the response contains a <code>warnings</code> field with a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSettingOngoingWarning" rel="nofollow">StoreSettingOngoing</a> Warning. A background process then applies the change to the Category and to all of its descendant Categories, so the change is <span>eventually consistent</span>.</p>
 *  <p>Because the background process locks the subtree while it runs, concurrent Store updates, <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeParentAction" rel="nofollow">Change Parent</a> actions, and <span>Create Category</span> requests with a <code>parent</code> for Categories in the subtree can fail and should be retried. For details, see <span>Category tree locking</span>.</p>
 *  <p>If the request contains another action that changes the <code>stores</code> of the Category, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned. Other update actions in the same request are applied immediately.</p>
 *  <p>If the Category has more than 1000 descendant Categories, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
 *  <p>The request is validated when the API receives it and again when the background process runs. If the change is no longer valid at that point, for example because the Stores of the parent Category changed or a referenced Store was deleted in the meantime, it isn't applied and no error is reported. Apart from the conditions described for <code>store</code>, the relations between Categories within the subtree aren't validated, as all of them receive the same change.</p>
 *  <p>Requests that change the Stores of the same subtree are processed in the order the background process receives them, which isn't necessarily the order they were sent in. Send the next request for the same subtree only after the previous change has been applied.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryAddStoreWithDescendantsAction categoryAddStoreWithDescendantsAction = CategoryAddStoreWithDescendantsAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addStoreWithDescendants")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryAddStoreWithDescendantsActionImpl.class)
public interface CategoryAddStoreWithDescendantsAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryAddStoreWithDescendantsAction
     */
    String ADD_STORE_WITH_DESCENDANTS = "addStoreWithDescendants";

    /**
     *  <p>Value to add to the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and the Store isn't one of them, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category isn't assigned to any Store and one of its descendant Categories is assigned to a different Store, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Value to add to the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and the Store isn't one of them, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category isn't assigned to any Store and one of its descendant Categories is assigned to a different Store, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of CategoryAddStoreWithDescendantsAction
     */
    public static CategoryAddStoreWithDescendantsAction of() {
        return new CategoryAddStoreWithDescendantsActionImpl();
    }

    /**
     * factory method to create a shallow copy CategoryAddStoreWithDescendantsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryAddStoreWithDescendantsAction of(final CategoryAddStoreWithDescendantsAction template) {
        CategoryAddStoreWithDescendantsActionImpl instance = new CategoryAddStoreWithDescendantsActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public CategoryAddStoreWithDescendantsAction copyDeep();

    /**
     * factory method to create a deep copy of CategoryAddStoreWithDescendantsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryAddStoreWithDescendantsAction deepCopy(
            @Nullable final CategoryAddStoreWithDescendantsAction template) {
        if (template == null) {
            return null;
        }
        CategoryAddStoreWithDescendantsActionImpl instance = new CategoryAddStoreWithDescendantsActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for CategoryAddStoreWithDescendantsAction
     * @return builder
     */
    public static CategoryAddStoreWithDescendantsActionBuilder builder() {
        return CategoryAddStoreWithDescendantsActionBuilder.of();
    }

    /**
     * create builder for CategoryAddStoreWithDescendantsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryAddStoreWithDescendantsActionBuilder builder(
            final CategoryAddStoreWithDescendantsAction template) {
        return CategoryAddStoreWithDescendantsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryAddStoreWithDescendantsAction(Function<CategoryAddStoreWithDescendantsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CategoryAddStoreWithDescendantsAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<CategoryAddStoreWithDescendantsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryAddStoreWithDescendantsAction>";
            }
        };
    }
}
