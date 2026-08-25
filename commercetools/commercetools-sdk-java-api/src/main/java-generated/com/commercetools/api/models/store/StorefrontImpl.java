
package com.commercetools.api.models.store;

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
 *  <p>Customer-facing URLs and policy links for the Store's storefront. All fields are optional and only present when set.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StorefrontImpl implements Storefront, ModelBase {

    private String checkoutUrlTemplate;

    private String orderUrlTemplate;

    private String termsOfServiceUrl;

    private String privacyPolicyUrl;

    private String refundPolicyUrl;

    private String shippingPolicyUrl;

    private String cookiePolicyUrl;

    private String imprintUrl;

    private String faqUrl;

    private String contactUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StorefrontImpl(@JsonProperty("checkoutUrlTemplate") final String checkoutUrlTemplate,
            @JsonProperty("orderUrlTemplate") final String orderUrlTemplate,
            @JsonProperty("termsOfServiceUrl") final String termsOfServiceUrl,
            @JsonProperty("privacyPolicyUrl") final String privacyPolicyUrl,
            @JsonProperty("refundPolicyUrl") final String refundPolicyUrl,
            @JsonProperty("shippingPolicyUrl") final String shippingPolicyUrl,
            @JsonProperty("cookiePolicyUrl") final String cookiePolicyUrl,
            @JsonProperty("imprintUrl") final String imprintUrl, @JsonProperty("faqUrl") final String faqUrl,
            @JsonProperty("contactUrl") final String contactUrl) {
        this.checkoutUrlTemplate = checkoutUrlTemplate;
        this.orderUrlTemplate = orderUrlTemplate;
        this.termsOfServiceUrl = termsOfServiceUrl;
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.refundPolicyUrl = refundPolicyUrl;
        this.shippingPolicyUrl = shippingPolicyUrl;
        this.cookiePolicyUrl = cookiePolicyUrl;
        this.imprintUrl = imprintUrl;
        this.faqUrl = faqUrl;
        this.contactUrl = contactUrl;
    }

    /**
     * create empty instance
     */
    public StorefrontImpl() {
    }

    /**
     *  <p><span>RFC 6570</span> URI template for the customer-facing checkout page. Must contain the <code>checkoutId</code> variable, for example <code>https://example.com/checkout/{checkoutId}</code>.</p>
     */

    public String getCheckoutUrlTemplate() {
        return this.checkoutUrlTemplate;
    }

    /**
     *  <p><span>RFC 6570</span> URI template for the customer-facing order status page. Must contain the <code>orderId</code> variable, for example <code>https://example.com/orders/{orderId}</code>.</p>
     */

    public String getOrderUrlTemplate() {
        return this.orderUrlTemplate;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's terms of service page.</p>
     */

    public String getTermsOfServiceUrl() {
        return this.termsOfServiceUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's privacy policy page.</p>
     */

    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's refund policy page.</p>
     */

    public String getRefundPolicyUrl() {
        return this.refundPolicyUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's shipping policy page.</p>
     */

    public String getShippingPolicyUrl() {
        return this.shippingPolicyUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's cookie policy page.</p>
     */

    public String getCookiePolicyUrl() {
        return this.cookiePolicyUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's imprint (legal notice) page.</p>
     */

    public String getImprintUrl() {
        return this.imprintUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's FAQ page.</p>
     */

    public String getFaqUrl() {
        return this.faqUrl;
    }

    /**
     *  <p>Absolute <code>https</code> URL of the storefront's contact page.</p>
     */

    public String getContactUrl() {
        return this.contactUrl;
    }

    public void setCheckoutUrlTemplate(final String checkoutUrlTemplate) {
        this.checkoutUrlTemplate = checkoutUrlTemplate;
    }

    public void setOrderUrlTemplate(final String orderUrlTemplate) {
        this.orderUrlTemplate = orderUrlTemplate;
    }

    public void setTermsOfServiceUrl(final String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public void setPrivacyPolicyUrl(final String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    public void setRefundPolicyUrl(final String refundPolicyUrl) {
        this.refundPolicyUrl = refundPolicyUrl;
    }

    public void setShippingPolicyUrl(final String shippingPolicyUrl) {
        this.shippingPolicyUrl = shippingPolicyUrl;
    }

    public void setCookiePolicyUrl(final String cookiePolicyUrl) {
        this.cookiePolicyUrl = cookiePolicyUrl;
    }

    public void setImprintUrl(final String imprintUrl) {
        this.imprintUrl = imprintUrl;
    }

    public void setFaqUrl(final String faqUrl) {
        this.faqUrl = faqUrl;
    }

    public void setContactUrl(final String contactUrl) {
        this.contactUrl = contactUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StorefrontImpl that = (StorefrontImpl) o;

        return new EqualsBuilder().append(checkoutUrlTemplate, that.checkoutUrlTemplate)
                .append(orderUrlTemplate, that.orderUrlTemplate)
                .append(termsOfServiceUrl, that.termsOfServiceUrl)
                .append(privacyPolicyUrl, that.privacyPolicyUrl)
                .append(refundPolicyUrl, that.refundPolicyUrl)
                .append(shippingPolicyUrl, that.shippingPolicyUrl)
                .append(cookiePolicyUrl, that.cookiePolicyUrl)
                .append(imprintUrl, that.imprintUrl)
                .append(faqUrl, that.faqUrl)
                .append(contactUrl, that.contactUrl)
                .append(checkoutUrlTemplate, that.checkoutUrlTemplate)
                .append(orderUrlTemplate, that.orderUrlTemplate)
                .append(termsOfServiceUrl, that.termsOfServiceUrl)
                .append(privacyPolicyUrl, that.privacyPolicyUrl)
                .append(refundPolicyUrl, that.refundPolicyUrl)
                .append(shippingPolicyUrl, that.shippingPolicyUrl)
                .append(cookiePolicyUrl, that.cookiePolicyUrl)
                .append(imprintUrl, that.imprintUrl)
                .append(faqUrl, that.faqUrl)
                .append(contactUrl, that.contactUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(checkoutUrlTemplate)
                .append(orderUrlTemplate)
                .append(termsOfServiceUrl)
                .append(privacyPolicyUrl)
                .append(refundPolicyUrl)
                .append(shippingPolicyUrl)
                .append(cookiePolicyUrl)
                .append(imprintUrl)
                .append(faqUrl)
                .append(contactUrl)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("checkoutUrlTemplate", checkoutUrlTemplate)
                .append("orderUrlTemplate", orderUrlTemplate)
                .append("termsOfServiceUrl", termsOfServiceUrl)
                .append("privacyPolicyUrl", privacyPolicyUrl)
                .append("refundPolicyUrl", refundPolicyUrl)
                .append("shippingPolicyUrl", shippingPolicyUrl)
                .append("cookiePolicyUrl", cookiePolicyUrl)
                .append("imprintUrl", imprintUrl)
                .append("faqUrl", faqUrl)
                .append("contactUrl", contactUrl)
                .build();
    }

    @Override
    public Storefront copyDeep() {
        return Storefront.deepCopy(this);
    }
}
