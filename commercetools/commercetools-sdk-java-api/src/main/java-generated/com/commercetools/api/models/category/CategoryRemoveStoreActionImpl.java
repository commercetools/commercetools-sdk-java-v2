
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
 *  <p>This action locks the Category and its parent Category. For details, see <span>Category tree locking</span>.</p>
 *  <p>Every direct child Category must be assigned to at least one Store in that set; otherwise, the action is rejected.</p>
 *  <ul>
 *   <li>When updating a Category via the <span>general endpoint</span>, all Stores can be removed as a global Category is accessible in all Stores.</li>
 *   <li>When updating a Category via the <span>Store-specific endpoint</span>, you can remove the last Store only if at least one Store remains; otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned. If you do not have permission for the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryRemoveStoreActionImpl implements CategoryRemoveStoreAction, ModelBase {

    private String action;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategoryRemoveStoreActionImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        this.action = REMOVE_STORE;
    }

    /**
     * create empty instance
     */
    public CategoryRemoveStoreActionImpl() {
        this.action = REMOVE_STORE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to remove from the Category's <code>stores</code>.</p>
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

        CategoryRemoveStoreActionImpl that = (CategoryRemoveStoreActionImpl) o;

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
    public CategoryRemoveStoreAction copyDeep() {
        return CategoryRemoveStoreAction.deepCopy(this);
    }
}
