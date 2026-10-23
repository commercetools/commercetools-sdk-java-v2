
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Removes a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> from the <code>stores</code> of the Category and from all of its descendant Categories.</p>
 *  <p>The Category itself doesn't need to be assigned to the Store, so that descendant Categories that still have it can be updated.</p>
 *  <p>This action is only available on the <span>general endpoint</span>.</p>
 *  <p>If this action is used on the <span>Store-specific endpoint</span>, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
 *  <p>The API records the request and responds with <code>202 Accepted</code>. The returned Category has the same <code>stores</code> as before and an incremented <code>version</code>, and the response contains a <code>warnings</code> field with a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSettingOngoingWarning" rel="nofollow">StoreSettingOngoing</a> Warning. A background process then applies the change to the Category and to all of its descendant Categories, so the change is <span>eventually consistent</span>.</p>
 *  <p>Because the background process locks the subtree while it runs, concurrent Store updates, <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeParentAction" rel="nofollow">Change Parent</a> actions, and <span>Create Category</span> requests with a <code>parent</code> for Categories in the subtree can fail and should be retried. For details, see <span>Category tree locking</span>.</p>
 *  <p>If the request contains another action that changes the <code>stores</code> of the Category, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned. Other update actions in the same request are applied immediately.</p>
 *  <p>If the Category has more than 1000 descendant Categories, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
 *  <p>The request is validated when the API receives it and again when the background process runs. If the change is no longer valid at that point, for example because the Stores of the parent Category changed or a referenced Store was deleted in the meantime, it isn't applied and no error is reported. Apart from the conditions described for <code>store</code>, the relations between Categories within the subtree aren't validated, as all of them receive the same change.</p>
 *  <p>Requests that change the Stores of the same subtree are processed in the order the background process receives them, which isn't necessarily the order they were sent in. Send the next request for the same subtree only after the previous change has been applied.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryRemoveStoreWithDescendantsActionImpl
        implements CategoryRemoveStoreWithDescendantsAction, ModelBase {

    private String action;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategoryRemoveStoreWithDescendantsActionImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        this.action = REMOVE_STORE_WITH_DESCENDANTS;
    }

    /**
     * create empty instance
     */
    public CategoryRemoveStoreWithDescendantsActionImpl() {
        this.action = REMOVE_STORE_WITH_DESCENDANTS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to remove from the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If removing the Store leaves the Category without Stores while its parent Category is assigned to Stores, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Store is the only Store of a descendant Category that would then be left without any Store while its parent Category is still assigned to Stores, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryRemoveStoreWithDescendantsActionImpl that = (CategoryRemoveStoreWithDescendantsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(store, that.store)
                .append(action, that.action)
                .append(store, that.store)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(store).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("store", store)
                .build();
    }

    @Override
    public CategoryRemoveStoreWithDescendantsAction copyDeep() {
        return CategoryRemoveStoreWithDescendantsAction.deepCopy(this);
    }
}
