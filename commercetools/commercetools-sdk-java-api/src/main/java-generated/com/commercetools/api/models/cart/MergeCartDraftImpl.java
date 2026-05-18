
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Used for merging an anonymous Cart with a Customer Cart with the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts/customer-id={customerId}/merge:POST" rel="nofollow">Merge Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/carts/customer-id={customerId}/merge:POST" rel="nofollow">Merge Cart in Store</a> endpoints. Either <code>anonymousCart</code> or <code>anonymousId</code> is required.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MergeCartDraftImpl implements MergeCartDraft, ModelBase {

    private com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart;

    private com.commercetools.api.models.cart.CartMergeMode mergeMode;

    private Boolean updateProductData;

    private String anonymousId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MergeCartDraftImpl(
            @JsonProperty("anonymousCart") final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart,
            @JsonProperty("mergeMode") final com.commercetools.api.models.cart.CartMergeMode mergeMode,
            @JsonProperty("updateProductData") final Boolean updateProductData,
            @JsonProperty("anonymousId") final String anonymousId) {
        this.anonymousCart = anonymousCart;
        this.mergeMode = mergeMode;
        this.updateProductData = updateProductData;
        this.anonymousId = anonymousId;
    }

    /**
     * create empty instance
     */
    public MergeCartDraftImpl() {
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> to be merged. Required if <code>anonymousId</code> is not provided.</p>
     */

    public com.commercetools.api.models.cart.CartResourceIdentifier getAnonymousCart() {
        return this.anonymousCart;
    }

    /**
     *  <p>Determines how to merge the anonymous Cart with the existing Customer Cart.</p>
     */

    public com.commercetools.api.models.cart.CartMergeMode getMergeMode() {
        return this.mergeMode;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     */

    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    /**
     *  <p>Assigns the Customer to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> that have the same <code>anonymousId</code>. Required if <code>anonymousCart</code> is not provided. If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, this value must match the <code>anonymousId</code> of the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    public void setAnonymousCart(final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart) {
        this.anonymousCart = anonymousCart;
    }

    public void setMergeMode(final com.commercetools.api.models.cart.CartMergeMode mergeMode) {
        this.mergeMode = mergeMode;
    }

    public void setUpdateProductData(final Boolean updateProductData) {
        this.updateProductData = updateProductData;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MergeCartDraftImpl that = (MergeCartDraftImpl) o;

        return new EqualsBuilder().append(anonymousCart, that.anonymousCart)
                .append(mergeMode, that.mergeMode)
                .append(updateProductData, that.updateProductData)
                .append(anonymousId, that.anonymousId)
                .append(anonymousCart, that.anonymousCart)
                .append(mergeMode, that.mergeMode)
                .append(updateProductData, that.updateProductData)
                .append(anonymousId, that.anonymousId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(anonymousCart)
                .append(mergeMode)
                .append(updateProductData)
                .append(anonymousId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("anonymousCart", anonymousCart)
                .append("mergeMode", mergeMode)
                .append("updateProductData", updateProductData)
                .append("anonymousId", anonymousId)
                .build();
    }

    @Override
    public MergeCartDraft copyDeep() {
        return MergeCartDraft.deepCopy(this);
    }
}
