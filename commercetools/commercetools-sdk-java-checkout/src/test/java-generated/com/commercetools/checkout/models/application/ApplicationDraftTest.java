
package com.commercetools.checkout.models.application;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicationDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicationDraftBuilder builder) {
        ApplicationDraft applicationDraft = builder.buildUnchecked();
        Assertions.assertThat(applicationDraft).isInstanceOf(ApplicationDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ApplicationDraft.builder().key("key") }, new Object[] { "status",
                ApplicationDraft.builder()
                        .status(com.commercetools.checkout.models.application.ApplicationStatus.findEnum("Active")) },
                new Object[] { "name", ApplicationDraft.builder().name("name") },
                new Object[] { "description", ApplicationDraft.builder().description("description") },
                new Object[] { "logo",
                        ApplicationDraft.builder()
                                .logo(new com.commercetools.checkout.models.application.ApplicationLogoImpl()) },
                new Object[] { "countries",
                        ApplicationDraft.builder().countries(Collections.singletonList("countries")) },
                new Object[] { "allowedOrigins", ApplicationDraft.builder()
                        .allowedOrigins(new com.commercetools.checkout.models.application.AllowedOriginsImpl()) },
                new Object[] { "mode",
                        ApplicationDraft.builder()
                                .mode(com.commercetools.checkout.models.application.ApplicationMode
                                        .findEnum("CompleteFlow")) },
                new Object[] { "paymentsConfiguration",
                        ApplicationDraft.builder()
                                .paymentsConfiguration(
                                    new com.commercetools.checkout.models.application.PaymentsConfigurationImpl()) },
                new Object[] { "agreements",
                        ApplicationDraft.builder()
                                .agreements(Collections.singletonList(
                                    new com.commercetools.checkout.models.application.ApplicationAgreementImpl())) },
                new Object[] { "discountsConfiguration",
                        ApplicationDraft.builder()
                                .discountsConfiguration(
                                    new com.commercetools.checkout.models.application.DiscountsConfigurationImpl()) } };
    }

    @Test
    public void key() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void status() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setStatus(com.commercetools.checkout.models.application.ApplicationStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationStatus.findEnum("Active"));
    }

    @Test
    public void name() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void logo() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setLogo(new com.commercetools.checkout.models.application.ApplicationLogoImpl());
        Assertions.assertThat(value.getLogo())
                .isEqualTo(new com.commercetools.checkout.models.application.ApplicationLogoImpl());
    }

    @Test
    public void countries() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setCountries(Collections.singletonList("countries"));
        Assertions.assertThat(value.getCountries()).isEqualTo(Collections.singletonList("countries"));
    }

    @Test
    public void allowedOrigins() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setAllowedOrigins(new com.commercetools.checkout.models.application.AllowedOriginsImpl());
        Assertions.assertThat(value.getAllowedOrigins())
                .isEqualTo(new com.commercetools.checkout.models.application.AllowedOriginsImpl());
    }

    @Test
    public void mode() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setMode(com.commercetools.checkout.models.application.ApplicationMode.findEnum("CompleteFlow"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationMode.findEnum("CompleteFlow"));
    }

    @Test
    public void paymentsConfiguration() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setPaymentsConfiguration(new com.commercetools.checkout.models.application.PaymentsConfigurationImpl());
        Assertions.assertThat(value.getPaymentsConfiguration())
                .isEqualTo(new com.commercetools.checkout.models.application.PaymentsConfigurationImpl());
    }

    @Test
    public void agreements() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setAgreements(
            Collections.singletonList(new com.commercetools.checkout.models.application.ApplicationAgreementImpl()));
        Assertions.assertThat(value.getAgreements())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.checkout.models.application.ApplicationAgreementImpl()));
    }

    @Test
    public void discountsConfiguration() {
        ApplicationDraft value = ApplicationDraft.of();
        value.setDiscountsConfiguration(new com.commercetools.checkout.models.application.DiscountsConfigurationImpl());
        Assertions.assertThat(value.getDiscountsConfiguration())
                .isEqualTo(new com.commercetools.checkout.models.application.DiscountsConfigurationImpl());
    }
}
