
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StorefrontTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StorefrontBuilder builder) {
        Storefront storefront = builder.buildUnchecked();
        Assertions.assertThat(storefront).isInstanceOf(Storefront.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "checkoutUrlTemplate", Storefront.builder().checkoutUrlTemplate("checkoutUrlTemplate") },
                new Object[] { "orderUrlTemplate", Storefront.builder().orderUrlTemplate("orderUrlTemplate") },
                new Object[] { "termsOfServiceUrl", Storefront.builder().termsOfServiceUrl("termsOfServiceUrl") },
                new Object[] { "privacyPolicyUrl", Storefront.builder().privacyPolicyUrl("privacyPolicyUrl") },
                new Object[] { "refundPolicyUrl", Storefront.builder().refundPolicyUrl("refundPolicyUrl") },
                new Object[] { "shippingPolicyUrl", Storefront.builder().shippingPolicyUrl("shippingPolicyUrl") },
                new Object[] { "cookiePolicyUrl", Storefront.builder().cookiePolicyUrl("cookiePolicyUrl") },
                new Object[] { "imprintUrl", Storefront.builder().imprintUrl("imprintUrl") },
                new Object[] { "faqUrl", Storefront.builder().faqUrl("faqUrl") },
                new Object[] { "contactUrl", Storefront.builder().contactUrl("contactUrl") } };
    }

    @Test
    public void checkoutUrlTemplate() {
        Storefront value = Storefront.of();
        value.setCheckoutUrlTemplate("checkoutUrlTemplate");
        Assertions.assertThat(value.getCheckoutUrlTemplate()).isEqualTo("checkoutUrlTemplate");
    }

    @Test
    public void orderUrlTemplate() {
        Storefront value = Storefront.of();
        value.setOrderUrlTemplate("orderUrlTemplate");
        Assertions.assertThat(value.getOrderUrlTemplate()).isEqualTo("orderUrlTemplate");
    }

    @Test
    public void termsOfServiceUrl() {
        Storefront value = Storefront.of();
        value.setTermsOfServiceUrl("termsOfServiceUrl");
        Assertions.assertThat(value.getTermsOfServiceUrl()).isEqualTo("termsOfServiceUrl");
    }

    @Test
    public void privacyPolicyUrl() {
        Storefront value = Storefront.of();
        value.setPrivacyPolicyUrl("privacyPolicyUrl");
        Assertions.assertThat(value.getPrivacyPolicyUrl()).isEqualTo("privacyPolicyUrl");
    }

    @Test
    public void refundPolicyUrl() {
        Storefront value = Storefront.of();
        value.setRefundPolicyUrl("refundPolicyUrl");
        Assertions.assertThat(value.getRefundPolicyUrl()).isEqualTo("refundPolicyUrl");
    }

    @Test
    public void shippingPolicyUrl() {
        Storefront value = Storefront.of();
        value.setShippingPolicyUrl("shippingPolicyUrl");
        Assertions.assertThat(value.getShippingPolicyUrl()).isEqualTo("shippingPolicyUrl");
    }

    @Test
    public void cookiePolicyUrl() {
        Storefront value = Storefront.of();
        value.setCookiePolicyUrl("cookiePolicyUrl");
        Assertions.assertThat(value.getCookiePolicyUrl()).isEqualTo("cookiePolicyUrl");
    }

    @Test
    public void imprintUrl() {
        Storefront value = Storefront.of();
        value.setImprintUrl("imprintUrl");
        Assertions.assertThat(value.getImprintUrl()).isEqualTo("imprintUrl");
    }

    @Test
    public void faqUrl() {
        Storefront value = Storefront.of();
        value.setFaqUrl("faqUrl");
        Assertions.assertThat(value.getFaqUrl()).isEqualTo("faqUrl");
    }

    @Test
    public void contactUrl() {
        Storefront value = Storefront.of();
        value.setContactUrl("contactUrl");
        Assertions.assertThat(value.getContactUrl()).isEqualTo("contactUrl");
    }
}
