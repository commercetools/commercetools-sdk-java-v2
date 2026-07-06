
package com.commercetools.checkout.models.payment_integration;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationBuilder builder) {
        PaymentIntegration paymentIntegration = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegration).isInstanceOf(PaymentIntegration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", PaymentIntegration.builder().id("id") },
                new Object[] { "version", PaymentIntegration.builder().version(2L) },
                new Object[] { "key", PaymentIntegration.builder().key("key") },
                new Object[] { "application", PaymentIntegration.builder()
                        .application(new com.commercetools.checkout.models.application.ApplicationReferenceImpl()) },
                new Object[] { "status",
                        PaymentIntegration.builder()
                                .status(com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus
                                        .findEnum("Active")) },
                new Object[] { "type", PaymentIntegration.builder().type("type") },
                new Object[] { "name", PaymentIntegration.builder().name("name") },
                new Object[] { "predicate", PaymentIntegration.builder().predicate("predicate") },
                new Object[] { "componentType", PaymentIntegration.builder()
                        .componentType(com.commercetools.checkout.models.payment_integration.PaymentComponentType
                                .findEnum("Component")) },
                new Object[] { "connectorDeployment", PaymentIntegration.builder()
                        .connectorDeployment(
                            new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl()) },
                new Object[] { "displayInfo", PaymentIntegration.builder()
                        .displayInfo(new com.commercetools.checkout.models.payment_integration.DisplayInfoImpl()) },
                new Object[] { "sortingInfo", PaymentIntegration.builder()
                        .sortingInfo(new com.commercetools.checkout.models.payment_integration.SortingInfoImpl()) },
                new Object[] { "automatedReversalConfiguration", PaymentIntegration.builder()
                        .automatedReversalConfiguration(
                            new com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationImpl()) },
                new Object[] { "createdAt",
                        PaymentIntegration.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "createdBy",
                        PaymentIntegration.builder()
                                .createdBy(new com.commercetools.checkout.models.payment_integration.CreatedByImpl()) },
                new Object[] { "lastModifiedAt",
                        PaymentIntegration.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        PaymentIntegration.builder()
                                .lastModifiedBy(
                                    new com.commercetools.checkout.models.payment_integration.LastModifiedByImpl()) } };
    }

    @Test
    public void id() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void application() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setApplication(new com.commercetools.checkout.models.application.ApplicationReferenceImpl());
        Assertions.assertThat(value.getApplication())
                .isEqualTo(new com.commercetools.checkout.models.application.ApplicationReferenceImpl());
    }

    @Test
    public void status() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setStatus(
            com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(
                    com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus.findEnum("Active"));
    }

    @Test
    public void type() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void name() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void predicate() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void componentType() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setComponentType(
            com.commercetools.checkout.models.payment_integration.PaymentComponentType.findEnum("Component"));
        Assertions.assertThat(value.getComponentType())
                .isEqualTo(
                    com.commercetools.checkout.models.payment_integration.PaymentComponentType.findEnum("Component"));
    }

    @Test
    public void connectorDeployment() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setConnectorDeployment(
            new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl());
        Assertions.assertThat(value.getConnectorDeployment())
                .isEqualTo(
                    new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl());
    }

    @Test
    public void displayInfo() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setDisplayInfo(new com.commercetools.checkout.models.payment_integration.DisplayInfoImpl());
        Assertions.assertThat(value.getDisplayInfo())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.DisplayInfoImpl());
    }

    @Test
    public void sortingInfo() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setSortingInfo(new com.commercetools.checkout.models.payment_integration.SortingInfoImpl());
        Assertions.assertThat(value.getSortingInfo())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.SortingInfoImpl());
    }

    @Test
    public void automatedReversalConfiguration() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setAutomatedReversalConfiguration(
            new com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationImpl());
        Assertions.assertThat(value.getAutomatedReversalConfiguration())
                .isEqualTo(
                    new com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationImpl());
    }

    @Test
    public void createdAt() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void createdBy() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setCreatedBy(new com.commercetools.checkout.models.payment_integration.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.CreatedByImpl());
    }

    @Test
    public void lastModifiedAt() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        PaymentIntegration value = PaymentIntegration.of();
        value.setLastModifiedBy(new com.commercetools.checkout.models.payment_integration.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.LastModifiedByImpl());
    }
}
