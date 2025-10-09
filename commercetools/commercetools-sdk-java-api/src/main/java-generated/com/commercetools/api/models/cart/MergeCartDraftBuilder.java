
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MergeCartDraftBuilder
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
public class MergeCartDraftBuilder implements Builder<MergeCartDraft> {

    @Nullable
    private com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart;

    @Nullable
    private com.commercetools.api.models.cart.CartMergeMode mergeMode;

    @Nullable
    private Boolean updateProductData;

    @Nullable
    private String anonymousId;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> to be merged. Required if <code>anonymousId</code> is not provided.</p>
     * @param builder function to build the anonymousCart value
     * @return Builder
     */

    public MergeCartDraftBuilder anonymousCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.anonymousCart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> to be merged. Required if <code>anonymousId</code> is not provided.</p>
     * @param builder function to build the anonymousCart value
     * @return Builder
     */

    public MergeCartDraftBuilder withAnonymousCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifier> builder) {
        this.anonymousCart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> to be merged. Required if <code>anonymousId</code> is not provided.</p>
     * @param anonymousCart value to be set
     * @return Builder
     */

    public MergeCartDraftBuilder anonymousCart(
            @Nullable final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart) {
        this.anonymousCart = anonymousCart;
        return this;
    }

    /**
     *  <p>Determines how to merge the anonymous Cart with the existing Customer Cart.</p>
     * @param mergeMode value to be set
     * @return Builder
     */

    public MergeCartDraftBuilder mergeMode(@Nullable final com.commercetools.api.models.cart.CartMergeMode mergeMode) {
        this.mergeMode = mergeMode;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     * @param updateProductData value to be set
     * @return Builder
     */

    public MergeCartDraftBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }

    /**
     *  <p>Assigns the Customer to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> that have the same <code>anonymousId</code>. Required if <code>anonymousCart</code> is not provided. If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, this value must match the <code>anonymousId</code> of the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public MergeCartDraftBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> to be merged. Required if <code>anonymousId</code> is not provided.</p>
     * @return anonymousCart
     */

    @Nullable
    public com.commercetools.api.models.cart.CartResourceIdentifier getAnonymousCart() {
        return this.anonymousCart;
    }

    /**
     *  <p>Determines how to merge the anonymous Cart with the existing Customer Cart.</p>
     * @return mergeMode
     */

    @Nullable
    public com.commercetools.api.models.cart.CartMergeMode getMergeMode() {
        return this.mergeMode;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     * @return updateProductData
     */

    @Nullable
    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    /**
     *  <p>Assigns the Customer to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> that have the same <code>anonymousId</code>. Required if <code>anonymousCart</code> is not provided. If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, this value must match the <code>anonymousId</code> of the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     * builds MergeCartDraft with checking for non-null required values
     * @return MergeCartDraft
     */
    public MergeCartDraft build() {
        return new MergeCartDraftImpl(anonymousCart, mergeMode, updateProductData, anonymousId);
    }

    /**
     * builds MergeCartDraft without checking for non-null required values
     * @return MergeCartDraft
     */
    public MergeCartDraft buildUnchecked() {
        return new MergeCartDraftImpl(anonymousCart, mergeMode, updateProductData, anonymousId);
    }

    /**
     * factory method for an instance of MergeCartDraftBuilder
     * @return builder
     */
    public static MergeCartDraftBuilder of() {
        return new MergeCartDraftBuilder();
    }

    /**
     * create builder for MergeCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MergeCartDraftBuilder of(final MergeCartDraft template) {
        MergeCartDraftBuilder builder = new MergeCartDraftBuilder();
        builder.anonymousCart = template.getAnonymousCart();
        builder.mergeMode = template.getMergeMode();
        builder.updateProductData = template.getUpdateProductData();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
