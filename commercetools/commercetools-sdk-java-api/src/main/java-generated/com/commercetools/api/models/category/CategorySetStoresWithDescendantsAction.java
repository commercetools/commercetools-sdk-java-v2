
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the <code>stores</code> of the Category and propagates the same set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> to all of its descendant Categories, replacing the entire set of Stores assigned to each affected Category in the subtree. Set an empty array to make the Category and its descendants global and accessible in all Stores.</p>
 *  <p>This action is only available on the <span>general endpoint</span>.</p>
 *  <p>If this action is used on the <span>Store-specific endpoint</span>, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
 *  <p>The API records the request and responds with <code>202 Accepted</code>. The returned Category has the same <code>stores</code> as before and an incremented <code>version</code>, and the response contains a <code>warnings</code> field with a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSettingOngoingWarning" rel="nofollow">StoreSettingOngoing</a> Warning. A background process then applies the change to the Category and to all of its descendant Categories, so the change is <span>eventually consistent</span>.</p>
 *  <p>Because the background process locks the subtree while it runs, concurrent Store updates, <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeParentAction" rel="nofollow">Change Parent</a> actions, and <span>Create Category</span> requests with a <code>parent</code> for Categories in the subtree can fail and should be retried. For details, see <span>Category tree locking</span>.</p>
 *  <p>If the request contains another action that changes the <code>stores</code> of the Category, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned. Other update actions in the same request are applied immediately.</p>
 *  <p>If the Category has more than 1000 descendant Categories, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
 *  <p>The request is validated when the API receives it and again when the background process runs. If the change is no longer valid at that point, for example because the Stores of the parent Category changed or a referenced Store was deleted in the meantime, it isn't applied and no error is reported. All Categories in the subtree receive the same <code>stores</code>, so only the relation between the Category and its parent is validated.</p>
 *  <p>Requests that change the Stores of the same subtree are processed in the order the background process receives them, which isn't necessarily the order they were sent in. Send the next request for the same subtree only after the previous change has been applied.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetStoresWithDescendantsAction categorySetStoresWithDescendantsAction = CategorySetStoresWithDescendantsAction.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStoresWithDescendants")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetStoresWithDescendantsActionImpl.class)
public interface CategorySetStoresWithDescendantsAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetStoresWithDescendantsAction
     */
    String SET_STORES_WITH_DESCENDANTS = "setStoresWithDescendants";

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreResourceIdentifier> stores);

    /**
     * factory method
     * @return instance of CategorySetStoresWithDescendantsAction
     */
    public static CategorySetStoresWithDescendantsAction of() {
        return new CategorySetStoresWithDescendantsActionImpl();
    }

    /**
     * factory method to create a shallow copy CategorySetStoresWithDescendantsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetStoresWithDescendantsAction of(final CategorySetStoresWithDescendantsAction template) {
        CategorySetStoresWithDescendantsActionImpl instance = new CategorySetStoresWithDescendantsActionImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    public CategorySetStoresWithDescendantsAction copyDeep();

    /**
     * factory method to create a deep copy of CategorySetStoresWithDescendantsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetStoresWithDescendantsAction deepCopy(
            @Nullable final CategorySetStoresWithDescendantsAction template) {
        if (template == null) {
            return null;
        }
        CategorySetStoresWithDescendantsActionImpl instance = new CategorySetStoresWithDescendantsActionImpl();
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CategorySetStoresWithDescendantsAction
     * @return builder
     */
    public static CategorySetStoresWithDescendantsActionBuilder builder() {
        return CategorySetStoresWithDescendantsActionBuilder.of();
    }

    /**
     * create builder for CategorySetStoresWithDescendantsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetStoresWithDescendantsActionBuilder builder(
            final CategorySetStoresWithDescendantsAction template) {
        return CategorySetStoresWithDescendantsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetStoresWithDescendantsAction(
            Function<CategorySetStoresWithDescendantsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CategorySetStoresWithDescendantsAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<CategorySetStoresWithDescendantsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetStoresWithDescendantsAction>";
            }
        };
    }
}
