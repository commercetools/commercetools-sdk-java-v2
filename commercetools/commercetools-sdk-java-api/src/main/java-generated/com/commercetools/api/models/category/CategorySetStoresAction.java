
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
 *  <p>This action locks the Category and its parent Category. For details, see <span>Category tree locking</span>.</p>
 *  <p>Every direct child Category must be assigned to at least one Store in that set; otherwise, the action is rejected.</p>
 *  <ul>
 *   <li><p>When updating a Category via the <span>general endpoint</span>, all Stores can be removed as a global Category is accessible in all Stores.</p></li>
 *   <li><p>When updating a Category via the <span>Store-specific endpoint</span>, the <code>stores</code> field cannot be empty; otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p><p>If you do not have permission for every Store currently assigned to the Category, an <a href="https://docs.commercetools.com/apis/ctp:api:type:UnauthorizedError" rel="nofollow">Unauthorized</a> error is returned.</p></li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetStoresAction categorySetStoresAction = CategorySetStoresAction.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStores")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetStoresActionImpl.class)
public interface CategorySetStoresAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetStoresAction
     */
    String SET_STORES = "setStores";

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreResourceIdentifier> stores);

    /**
     * factory method
     * @return instance of CategorySetStoresAction
     */
    public static CategorySetStoresAction of() {
        return new CategorySetStoresActionImpl();
    }

    /**
     * factory method to create a shallow copy CategorySetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetStoresAction of(final CategorySetStoresAction template) {
        CategorySetStoresActionImpl instance = new CategorySetStoresActionImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    public CategorySetStoresAction copyDeep();

    /**
     * factory method to create a deep copy of CategorySetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetStoresAction deepCopy(@Nullable final CategorySetStoresAction template) {
        if (template == null) {
            return null;
        }
        CategorySetStoresActionImpl instance = new CategorySetStoresActionImpl();
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CategorySetStoresAction
     * @return builder
     */
    public static CategorySetStoresActionBuilder builder() {
        return CategorySetStoresActionBuilder.of();
    }

    /**
     * create builder for CategorySetStoresAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetStoresActionBuilder builder(final CategorySetStoresAction template) {
        return CategorySetStoresActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetStoresAction(Function<CategorySetStoresAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CategorySetStoresAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<CategorySetStoresAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetStoresAction>";
            }
        };
    }
}
