
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
 *   <li><p>When updating a Category via the <span>general endpoint</span>, all Stores can be removed as a global Category is accessible in all Stores.</p></li>
 *   <li><p>When updating a Category via the <span>Store-specific endpoint</span>, the <code>stores</code> field cannot be empty; otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p><p>If you do not have permission for every Store currently assigned to the Category, an <a href="https://docs.commercetools.com/apis/ctp:api:type:UnauthorizedError" rel="nofollow">Unauthorized</a> error is returned.</p></li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetStoresActionImpl implements CategorySetStoresAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategorySetStoresActionImpl(
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        this.action = SET_STORES;
    }

    /**
     * create empty instance
     */
    public CategorySetStoresActionImpl() {
        this.action = SET_STORES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    public void setStores(final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetStoresActionImpl that = (CategorySetStoresActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(stores, that.stores)
                .append(action, that.action)
                .append(stores, that.stores)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(stores).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("stores", stores)
                .build();
    }

    @Override
    public CategorySetStoresAction copyDeep() {
        return CategorySetStoresAction.deepCopy(this);
    }
}
