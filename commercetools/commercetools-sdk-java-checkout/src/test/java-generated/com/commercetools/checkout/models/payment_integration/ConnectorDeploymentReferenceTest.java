
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ConnectorDeploymentReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ConnectorDeploymentReferenceBuilder builder) {
        ConnectorDeploymentReference connectorDeploymentReference = builder.buildUnchecked();
        Assertions.assertThat(connectorDeploymentReference).isInstanceOf(ConnectorDeploymentReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ConnectorDeploymentReference.builder().id("id") },
                new Object[] { "typeId", ConnectorDeploymentReference.builder().typeId("typeId") } };
    }

    @Test
    public void id() {
        ConnectorDeploymentReference value = ConnectorDeploymentReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void typeId() {
        ConnectorDeploymentReference value = ConnectorDeploymentReference.of();
        value.setTypeId("typeId");
        Assertions.assertThat(value.getTypeId()).isEqualTo("typeId");
    }
}
