
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Customer-facing URLs and policy links for the Store's storefront. All fields are optional and only present when set.</p>
 *
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
@JsonDeserialize(as = StorefrontImpl.class)
public interface Storefront {

    /**
     *  <p><span>RFC 6570</span> URI template for the customer-facing checkout page. Must contain the <code>checkoutId</code> variable, for example <code>https://example.com/checkout/{checkoutId}</code>.</p>
     * @return checkoutUrlTemplate
     */

    @JsonProperty("checkoutUrlTemplate")
    public String getCheckoutUrlTemplate();

    /**
     *  <p><span>RFC 6570</span> URI template for the customer-facing order status page. Must contain the <code>orderId</code> variable, for example <code>https://example.com/orders/{orderId}</code>.</p>
     * @return orderUrlTemplate
     */

    @JsonProperty("orderUrlTemplate")
    public String getOrderUrlTemplate();

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's terms of service page.</p>
     * @return termsOfServiceUrl
     */

    @JsonProperty("termsOfServiceUrl")
    public String getTermsOfServiceUrl();

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's privacy policy page.</p>
     * @return privacyPolicyUrl
     */

    @JsonProperty("privacyPolicyUrl")
    public String getPrivacyPolicyUrl();

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's refund policy page.</p>
     * @return refundPolicyUrl
     */

    @JsonProperty("refundPolicyUrl")
    public String getRefundPolicyUrl();

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's shipping policy page.</p>
     * @return shippingPolicyUrl
     */

    @JsonProperty("shippingPolicyUrl")
    public String getShippingPolicyUrl();

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's cookie policy page.</p>
     * @return cookiePolicyUrl
     */

    @JsonProperty("cookiePolicyUrl")
    public String getCookiePolicyUrl();

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's imprint (legal notice) page.</p>
     * @return imprintUrl
     */

    @JsonProperty("imprintUrl")
    public String getImprintUrl();

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's FAQ page.</p>
     * @return faqUrl
     */

    @JsonProperty("faqUrl")
    public String getFaqUrl();

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's contact page.</p>
     * @return contactUrl
     */

    @JsonProperty("contactUrl")
    public String getContactUrl();

    /**
     *  <p><span>RFC 6570</span> URI template for the customer-facing checkout page. Must contain the <code>checkoutId</code> variable, for example <code>https://example.com/checkout/{checkoutId}</code>.</p>
     * @param checkoutUrlTemplate value to be set
     */

    public void setCheckoutUrlTemplate(final String checkoutUrlTemplate);

    /**
     *  <p><span>RFC 6570</span> URI template for the customer-facing order status page. Must contain the <code>orderId</code> variable, for example <code>https://example.com/orders/{orderId}</code>.</p>
     * @param orderUrlTemplate value to be set
     */

    public void setOrderUrlTemplate(final String orderUrlTemplate);

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's terms of service page.</p>
     * @param termsOfServiceUrl value to be set
     */

    public void setTermsOfServiceUrl(final String termsOfServiceUrl);

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's privacy policy page.</p>
     * @param privacyPolicyUrl value to be set
     */

    public void setPrivacyPolicyUrl(final String privacyPolicyUrl);

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's refund policy page.</p>
     * @param refundPolicyUrl value to be set
     */

    public void setRefundPolicyUrl(final String refundPolicyUrl);

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's shipping policy page.</p>
     * @param shippingPolicyUrl value to be set
     */

    public void setShippingPolicyUrl(final String shippingPolicyUrl);

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's cookie policy page.</p>
     * @param cookiePolicyUrl value to be set
     */

    public void setCookiePolicyUrl(final String cookiePolicyUrl);

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's imprint (legal notice) page.</p>
     * @param imprintUrl value to be set
     */

    public void setImprintUrl(final String imprintUrl);

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's FAQ page.</p>
     * @param faqUrl value to be set
     */

    public void setFaqUrl(final String faqUrl);

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's contact page.</p>
     * @param contactUrl value to be set
     */

    public void setContactUrl(final String contactUrl);

    /**
     * factory method
     * @return instance of Storefront
     */
    public static Storefront of() {
        return new StorefrontImpl();
    }

    /**
     * factory method to create a shallow copy Storefront
     * @param template instance to be copied
     * @return copy instance
     */
    public static Storefront of(final Storefront template) {
        StorefrontImpl instance = new StorefrontImpl();
        instance.setCheckoutUrlTemplate(template.getCheckoutUrlTemplate());
        instance.setOrderUrlTemplate(template.getOrderUrlTemplate());
        instance.setTermsOfServiceUrl(template.getTermsOfServiceUrl());
        instance.setPrivacyPolicyUrl(template.getPrivacyPolicyUrl());
        instance.setRefundPolicyUrl(template.getRefundPolicyUrl());
        instance.setShippingPolicyUrl(template.getShippingPolicyUrl());
        instance.setCookiePolicyUrl(template.getCookiePolicyUrl());
        instance.setImprintUrl(template.getImprintUrl());
        instance.setFaqUrl(template.getFaqUrl());
        instance.setContactUrl(template.getContactUrl());
        return instance;
    }

    public Storefront copyDeep();

    /**
     * factory method to create a deep copy of Storefront
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Storefront deepCopy(@Nullable final Storefront template) {
        if (template == null) {
            return null;
        }
        StorefrontImpl instance = new StorefrontImpl();
        instance.setCheckoutUrlTemplate(template.getCheckoutUrlTemplate());
        instance.setOrderUrlTemplate(template.getOrderUrlTemplate());
        instance.setTermsOfServiceUrl(template.getTermsOfServiceUrl());
        instance.setPrivacyPolicyUrl(template.getPrivacyPolicyUrl());
        instance.setRefundPolicyUrl(template.getRefundPolicyUrl());
        instance.setShippingPolicyUrl(template.getShippingPolicyUrl());
        instance.setCookiePolicyUrl(template.getCookiePolicyUrl());
        instance.setImprintUrl(template.getImprintUrl());
        instance.setFaqUrl(template.getFaqUrl());
        instance.setContactUrl(template.getContactUrl());
        return instance;
    }

    /**
     * builder factory method for Storefront
     * @return builder
     */
    public static StorefrontBuilder builder() {
        return StorefrontBuilder.of();
    }

    /**
     * create builder for Storefront instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StorefrontBuilder builder(final Storefront template) {
        return StorefrontBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStorefront(Function<Storefront, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<Storefront> typeReference() {
        return new tools.jackson.core.type.TypeReference<Storefront>() {
            @Override
            public String toString() {
                return "TypeReference<Storefront>";
            }
        };
    }
}
