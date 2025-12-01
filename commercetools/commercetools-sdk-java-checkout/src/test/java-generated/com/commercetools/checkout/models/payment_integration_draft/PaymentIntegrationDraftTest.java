
package com.commercetools.checkout.models.payment_integration_draft;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationDraftBuilder builder) {
        PaymentIntegrationDraft paymentIntegrationDraft = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationDraft).isInstanceOf(PaymentIntegrationDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PaymentIntegrationDraft.builder().key("key") },
                new Object[] { "application", PaymentIntegrationDraft.builder()
                        .application(new com.commercetools.checkout.models.application.ApplicationReferenceImpl()) },
                new Object[] { "status",
                        PaymentIntegrationDraft.builder()
                                .status(com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus
                                        .findEnum("Active")) },
                new Object[] { "type", PaymentIntegrationDraft.builder().type("type") },
                new Object[] { "name", PaymentIntegrationDraft.builder().name("name") },
                new Object[] { "predicate", PaymentIntegrationDraft.builder().predicate("predicate") },
                new Object[] { "componentType", PaymentIntegrationDraft.builder()
                        .componentType(com.commercetools.checkout.models.payment_integration.PaymentComponentType
                                .findEnum("Component")) },
                new Object[] { "connectorDeployment", PaymentIntegrationDraft.builder()
                        .connectorDeployment(
                            new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl()) },
                new Object[] { "displayInfo", PaymentIntegrationDraft.builder()
                        .displayInfo(new com.commercetools.checkout.models.payment_integration.DisplayInfoImpl()) },
                new Object[] { "sortingInfo", PaymentIntegrationDraft.builder()
                        .sortingInfo(new com.commercetools.checkout.models.payment_integration.SortingInfoImpl()) },
                new Object[] { "automatedReversalConfiguration", PaymentIntegrationDraft.builder()
                        .automatedReversalConfiguration(
                            new com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationImpl()) } };
    }

    @Test
    public void key() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void application() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setApplication(new com.commercetools.checkout.models.application.ApplicationReferenceImpl());
        Assertions.assertThat(value.getApplication())
                .isEqualTo(new com.commercetools.checkout.models.application.ApplicationReferenceImpl());
    }

    @Test
    public void status() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setStatus(
            com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(
                    com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus.findEnum("Active"));
    }

    @Test
    public void type() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void name() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void predicate() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void componentType() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setComponentType(
            com.commercetools.checkout.models.payment_integration.PaymentComponentType.findEnum("Component"));
        Assertions.assertThat(value.getComponentType())
                .isEqualTo(
                    com.commercetools.checkout.models.payment_integration.PaymentComponentType.findEnum("Component"));
    }

    @Test
    public void connectorDeployment() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setConnectorDeployment(
            new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl());
        Assertions.assertThat(value.getConnectorDeployment())
                .isEqualTo(
                    new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl());
    }

    @Test
    public void displayInfo() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setDisplayInfo(new com.commercetools.checkout.models.payment_integration.DisplayInfoImpl());
        Assertions.assertThat(value.getDisplayInfo())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.DisplayInfoImpl());
    }

    @Test
    public void sortingInfo() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setSortingInfo(new com.commercetools.checkout.models.payment_integration.SortingInfoImpl());
        Assertions.assertThat(value.getSortingInfo())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.SortingInfoImpl());
    }

    @Test
    public void automatedReversalConfiguration() {
        PaymentIntegrationDraft value = PaymentIntegrationDraft.of();
        value.setAutomatedReversalConfiguration(
            new com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationImpl());
        Assertions.assertThat(value.getAutomatedReversalConfiguration())
                .isEqualTo(
                    new com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationImpl());
    }
}
