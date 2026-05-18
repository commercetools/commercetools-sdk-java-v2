
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Used for merging an anonymous Cart with a Customer Cart with the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts/customer-id={customerId}/merge:POST" rel="nofollow">Merge Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/carts/customer-id={customerId}/merge:POST" rel="nofollow">Merge Cart in Store</a> endpoints. Either <code>anonymousCart</code> or <code>anonymousId</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MergeCartDraft mergeCartDraft = MergeCartDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MergeCartDraftImpl.class)
public interface MergeCartDraft extends io.vrap.rmf.base.client.Draft<MergeCartDraft> {

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> to be merged. Required if <code>anonymousId</code> is not provided.</p>
     * @return anonymousCart
     */
    @Valid
    @JsonProperty("anonymousCart")
    public CartResourceIdentifier getAnonymousCart();

    /**
     *  <p>Determines how to merge the anonymous Cart with the existing Customer Cart.</p>
     * @return mergeMode
     */

    @JsonProperty("mergeMode")
    public CartMergeMode getMergeMode();

    /**
     *  <ul>
     *   <li>If <code>true</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     * @return updateProductData
     */

    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    /**
     *  <p>Assigns the Customer to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> that have the same <code>anonymousId</code>. Required if <code>anonymousCart</code> is not provided. If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, this value must match the <code>anonymousId</code> of the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> to be merged. Required if <code>anonymousId</code> is not provided.</p>
     * @param anonymousCart value to be set
     */

    public void setAnonymousCart(final CartResourceIdentifier anonymousCart);

    /**
     *  <p>Determines how to merge the anonymous Cart with the existing Customer Cart.</p>
     * @param mergeMode value to be set
     */

    public void setMergeMode(final CartMergeMode mergeMode);

    /**
     *  <ul>
     *   <li>If <code>true</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     * @param updateProductData value to be set
     */

    public void setUpdateProductData(final Boolean updateProductData);

    /**
     *  <p>Assigns the Customer to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> that have the same <code>anonymousId</code>. Required if <code>anonymousCart</code> is not provided. If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, this value must match the <code>anonymousId</code> of the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     * factory method
     * @return instance of MergeCartDraft
     */
    public static MergeCartDraft of() {
        return new MergeCartDraftImpl();
    }

    /**
     * factory method to create a shallow copy MergeCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MergeCartDraft of(final MergeCartDraft template) {
        MergeCartDraftImpl instance = new MergeCartDraftImpl();
        instance.setAnonymousCart(template.getAnonymousCart());
        instance.setMergeMode(template.getMergeMode());
        instance.setUpdateProductData(template.getUpdateProductData());
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public MergeCartDraft copyDeep();

    /**
     * factory method to create a deep copy of MergeCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MergeCartDraft deepCopy(@Nullable final MergeCartDraft template) {
        if (template == null) {
            return null;
        }
        MergeCartDraftImpl instance = new MergeCartDraftImpl();
        instance.setAnonymousCart(
            com.commercetools.api.models.cart.CartResourceIdentifier.deepCopy(template.getAnonymousCart()));
        instance.setMergeMode(template.getMergeMode());
        instance.setUpdateProductData(template.getUpdateProductData());
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    /**
     * builder factory method for MergeCartDraft
     * @return builder
     */
    public static MergeCartDraftBuilder builder() {
        return MergeCartDraftBuilder.of();
    }

    /**
     * create builder for MergeCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MergeCartDraftBuilder builder(final MergeCartDraft template) {
        return MergeCartDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMergeCartDraft(Function<MergeCartDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MergeCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MergeCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MergeCartDraft>";
            }
        };
    }
}
