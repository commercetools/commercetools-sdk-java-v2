
package com.commercetools.checkout.models.application;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicationBuilder builder) {
        Application application = builder.buildUnchecked();
        Assertions.assertThat(application).isInstanceOf(Application.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Application.builder().id("id") },
                new Object[] { "version", Application.builder().version(2) },
                new Object[] { "key", Application.builder().key("key") },
                new Object[] { "status",
                        Application.builder()
                                .status(com.commercetools.checkout.models.application.ApplicationStatus
                                        .findEnum("Active")) },
                new Object[] { "name", Application.builder().name("name") },
                new Object[] { "description", Application.builder().description("description") },
                new Object[] { "logo",
                        Application.builder()
                                .logo(new com.commercetools.checkout.models.application.ApplicationLogoImpl()) },
                new Object[] { "countries", Application.builder().countries(Collections.singletonList("countries")) },
                new Object[] { "allowedOrigins", Application.builder()
                        .allowedOrigins(new com.commercetools.checkout.models.application.AllowedOriginsImpl()) },
                new Object[] { "mode",
                        Application.builder()
                                .mode(com.commercetools.checkout.models.application.ApplicationMode
                                        .findEnum("CompleteFlow")) },
                new Object[] { "paymentsConfiguration",
                        Application.builder()
                                .paymentsConfiguration(
                                    new com.commercetools.checkout.models.application.PaymentsConfigurationImpl()) },
                new Object[] { "agreements",
                        Application.builder()
                                .agreements(Collections.singletonList(
                                    new com.commercetools.checkout.models.application.ApplicationAgreementImpl())) },
                new Object[] { "discountsConfiguration",
                        Application.builder()
                                .discountsConfiguration(
                                    new com.commercetools.checkout.models.application.DiscountsConfigurationImpl()) },
                new Object[] { "createdAt", Application.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "createdBy",
                        Application.builder()
                                .createdBy(new com.commercetools.checkout.models.payment_integration.CreatedByImpl()) },
                new Object[] { "lastModifiedAt",
                        Application.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Application.builder()
                                .lastModifiedBy(
                                    new com.commercetools.checkout.models.payment_integration.LastModifiedByImpl()) } };
    }

    @Test
    public void id() {
        Application value = Application.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Application value = Application.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void key() {
        Application value = Application.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void status() {
        Application value = Application.of();
        value.setStatus(com.commercetools.checkout.models.application.ApplicationStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationStatus.findEnum("Active"));
    }

    @Test
    public void name() {
        Application value = Application.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        Application value = Application.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void logo() {
        Application value = Application.of();
        value.setLogo(new com.commercetools.checkout.models.application.ApplicationLogoImpl());
        Assertions.assertThat(value.getLogo())
                .isEqualTo(new com.commercetools.checkout.models.application.ApplicationLogoImpl());
    }

    @Test
    public void countries() {
        Application value = Application.of();
        value.setCountries(Collections.singletonList("countries"));
        Assertions.assertThat(value.getCountries()).isEqualTo(Collections.singletonList("countries"));
    }

    @Test
    public void allowedOrigins() {
        Application value = Application.of();
        value.setAllowedOrigins(new com.commercetools.checkout.models.application.AllowedOriginsImpl());
        Assertions.assertThat(value.getAllowedOrigins())
                .isEqualTo(new com.commercetools.checkout.models.application.AllowedOriginsImpl());
    }

    @Test
    public void mode() {
        Application value = Application.of();
        value.setMode(com.commercetools.checkout.models.application.ApplicationMode.findEnum("CompleteFlow"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationMode.findEnum("CompleteFlow"));
    }

    @Test
    public void paymentsConfiguration() {
        Application value = Application.of();
        value.setPaymentsConfiguration(new com.commercetools.checkout.models.application.PaymentsConfigurationImpl());
        Assertions.assertThat(value.getPaymentsConfiguration())
                .isEqualTo(new com.commercetools.checkout.models.application.PaymentsConfigurationImpl());
    }

    @Test
    public void agreements() {
        Application value = Application.of();
        value.setAgreements(
            Collections.singletonList(new com.commercetools.checkout.models.application.ApplicationAgreementImpl()));
        Assertions.assertThat(value.getAgreements())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.checkout.models.application.ApplicationAgreementImpl()));
    }

    @Test
    public void discountsConfiguration() {
        Application value = Application.of();
        value.setDiscountsConfiguration(new com.commercetools.checkout.models.application.DiscountsConfigurationImpl());
        Assertions.assertThat(value.getDiscountsConfiguration())
                .isEqualTo(new com.commercetools.checkout.models.application.DiscountsConfigurationImpl());
    }

    @Test
    public void createdAt() {
        Application value = Application.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void createdBy() {
        Application value = Application.of();
        value.setCreatedBy(new com.commercetools.checkout.models.payment_integration.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.CreatedByImpl());
    }

    @Test
    public void lastModifiedAt() {
        Application value = Application.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Application value = Application.of();
        value.setLastModifiedBy(new com.commercetools.checkout.models.payment_integration.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.LastModifiedByImpl());
    }
}
