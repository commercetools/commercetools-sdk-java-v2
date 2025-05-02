
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleBuyerAssignableChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleBuyerAssignableChangedMessagePayloadBuilder builder) {
        AssociateRoleBuyerAssignableChangedMessagePayload associateRoleBuyerAssignableChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(associateRoleBuyerAssignableChangedMessagePayload)
                .isInstanceOf(AssociateRoleBuyerAssignableChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "buyerAssignable",
                AssociateRoleBuyerAssignableChangedMessagePayload.builder().buyerAssignable(true) } };
    }

    @Test
    public void buyerAssignable() {
        AssociateRoleBuyerAssignableChangedMessagePayload value = AssociateRoleBuyerAssignableChangedMessagePayload
                .of();
        value.setBuyerAssignable(true);
        Assertions.assertThat(value.getBuyerAssignable()).isEqualTo(true);
    }
}
