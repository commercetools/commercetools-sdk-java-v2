
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StorefrontBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Storefront storefront = Storefront.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StorefrontBuilder implements Builder<Storefront> {

    @Nullable
    private String checkoutUrlTemplate;

    @Nullable
    private String orderUrlTemplate;

    @Nullable
    private String termsOfServiceUrl;

    @Nullable
    private String privacyPolicyUrl;

    @Nullable
    private String refundPolicyUrl;

    @Nullable
    private String shippingPolicyUrl;

    @Nullable
    private String cookiePolicyUrl;

    @Nullable
    private String imprintUrl;

    @Nullable
    private String faqUrl;

    @Nullable
    private String contactUrl;

    /**
     *  <p><span>RFC 6570</span> URI template for the customer-facing checkout page. Must contain the <code>checkoutId</code> variable, for example <code>https://example.com/checkout/{checkoutId}</code>.</p>
     * @param checkoutUrlTemplate value to be set
     * @return Builder
     */

    public StorefrontBuilder checkoutUrlTemplate(@Nullable final String checkoutUrlTemplate) {
        this.checkoutUrlTemplate = checkoutUrlTemplate;
        return this;
    }

    /**
     *  <p><span>RFC 6570</span> URI template for the customer-facing order status page. Must contain the <code>orderId</code> variable, for example <code>https://example.com/orders/{orderId}</code>.</p>
     * @param orderUrlTemplate value to be set
     * @return Builder
     */

    public StorefrontBuilder orderUrlTemplate(@Nullable final String orderUrlTemplate) {
        this.orderUrlTemplate = orderUrlTemplate;
        return this;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's terms of service page.</p>
     * @param termsOfServiceUrl value to be set
     * @return Builder
     */

    public StorefrontBuilder termsOfServiceUrl(@Nullable final String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
        return this;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's privacy policy page.</p>
     * @param privacyPolicyUrl value to be set
     * @return Builder
     */

    public StorefrontBuilder privacyPolicyUrl(@Nullable final String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        return this;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's refund policy page.</p>
     * @param refundPolicyUrl value to be set
     * @return Builder
     */

    public StorefrontBuilder refundPolicyUrl(@Nullable final String refundPolicyUrl) {
        this.refundPolicyUrl = refundPolicyUrl;
        return this;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's shipping policy page.</p>
     * @param shippingPolicyUrl value to be set
     * @return Builder
     */

    public StorefrontBuilder shippingPolicyUrl(@Nullable final String shippingPolicyUrl) {
        this.shippingPolicyUrl = shippingPolicyUrl;
        return this;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's cookie policy page.</p>
     * @param cookiePolicyUrl value to be set
     * @return Builder
     */

    public StorefrontBuilder cookiePolicyUrl(@Nullable final String cookiePolicyUrl) {
        this.cookiePolicyUrl = cookiePolicyUrl;
        return this;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's imprint (legal notice) page.</p>
     * @param imprintUrl value to be set
     * @return Builder
     */

    public StorefrontBuilder imprintUrl(@Nullable final String imprintUrl) {
        this.imprintUrl = imprintUrl;
        return this;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's FAQ page.</p>
     * @param faqUrl value to be set
     * @return Builder
     */

    public StorefrontBuilder faqUrl(@Nullable final String faqUrl) {
        this.faqUrl = faqUrl;
        return this;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's contact page.</p>
     * @param contactUrl value to be set
     * @return Builder
     */

    public StorefrontBuilder contactUrl(@Nullable final String contactUrl) {
        this.contactUrl = contactUrl;
        return this;
    }

    /**
     *  <p><span>RFC 6570</span> URI template for the customer-facing checkout page. Must contain the <code>checkoutId</code> variable, for example <code>https://example.com/checkout/{checkoutId}</code>.</p>
     * @return checkoutUrlTemplate
     */

    @Nullable
    public String getCheckoutUrlTemplate() {
        return this.checkoutUrlTemplate;
    }

    /**
     *  <p><span>RFC 6570</span> URI template for the customer-facing order status page. Must contain the <code>orderId</code> variable, for example <code>https://example.com/orders/{orderId}</code>.</p>
     * @return orderUrlTemplate
     */

    @Nullable
    public String getOrderUrlTemplate() {
        return this.orderUrlTemplate;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's terms of service page.</p>
     * @return termsOfServiceUrl
     */

    @Nullable
    public String getTermsOfServiceUrl() {
        return this.termsOfServiceUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's privacy policy page.</p>
     * @return privacyPolicyUrl
     */

    @Nullable
    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's refund policy page.</p>
     * @return refundPolicyUrl
     */

    @Nullable
    public String getRefundPolicyUrl() {
        return this.refundPolicyUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's shipping policy page.</p>
     * @return shippingPolicyUrl
     */

    @Nullable
    public String getShippingPolicyUrl() {
        return this.shippingPolicyUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's cookie policy page.</p>
     * @return cookiePolicyUrl
     */

    @Nullable
    public String getCookiePolicyUrl() {
        return this.cookiePolicyUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's imprint (legal notice) page.</p>
     * @return imprintUrl
     */

    @Nullable
    public String getImprintUrl() {
        return this.imprintUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's FAQ page.</p>
     * @return faqUrl
     */

    @Nullable
    public String getFaqUrl() {
        return this.faqUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's contact page.</p>
     * @return contactUrl
     */

    @Nullable
    public String getContactUrl() {
        return this.contactUrl;
    }

    /**
     * builds Storefront with checking for non-null required values
     * @return Storefront
     */
    public Storefront build() {
        return new StorefrontImpl(checkoutUrlTemplate, orderUrlTemplate, termsOfServiceUrl, privacyPolicyUrl,
            refundPolicyUrl, shippingPolicyUrl, cookiePolicyUrl, imprintUrl, faqUrl, contactUrl);
    }

    /**
     * builds Storefront without checking for non-null required values
     * @return Storefront
     */
    public Storefront buildUnchecked() {
        return new StorefrontImpl(checkoutUrlTemplate, orderUrlTemplate, termsOfServiceUrl, privacyPolicyUrl,
            refundPolicyUrl, shippingPolicyUrl, cookiePolicyUrl, imprintUrl, faqUrl, contactUrl);
    }

    /**
     * factory method for an instance of StorefrontBuilder
     * @return builder
     */
    public static StorefrontBuilder of() {
        return new StorefrontBuilder();
    }

    /**
     * create builder for Storefront instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StorefrontBuilder of(final Storefront template) {
        StorefrontBuilder builder = new StorefrontBuilder();
        builder.checkoutUrlTemplate = template.getCheckoutUrlTemplate();
        builder.orderUrlTemplate = template.getOrderUrlTemplate();
        builder.termsOfServiceUrl = template.getTermsOfServiceUrl();
        builder.privacyPolicyUrl = template.getPrivacyPolicyUrl();
        builder.refundPolicyUrl = template.getRefundPolicyUrl();
        builder.shippingPolicyUrl = template.getShippingPolicyUrl();
        builder.cookiePolicyUrl = template.getCookiePolicyUrl();
        builder.imprintUrl = template.getImprintUrl();
        builder.faqUrl = template.getFaqUrl();
        builder.contactUrl = template.getContactUrl();
        return builder;
    }

}
