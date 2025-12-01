
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetConnectorDeploymentUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetConnectorDeploymentUpdateActionBuilder builder) {
        SetConnectorDeploymentUpdateAction setConnectorDeploymentUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setConnectorDeploymentUpdateAction)
                .isInstanceOf(SetConnectorDeploymentUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "connectorDeployment", SetConnectorDeploymentUpdateAction.builder()
                .connectorDeployment(
                    new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl()) } };
    }

    @Test
    public void connectorDeployment() {
        SetConnectorDeploymentUpdateAction value = SetConnectorDeploymentUpdateAction.of();
        value.setConnectorDeployment(
            new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl());
        Assertions.assertThat(value.getConnectorDeployment())
                .isEqualTo(
                    new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl());
    }
}
