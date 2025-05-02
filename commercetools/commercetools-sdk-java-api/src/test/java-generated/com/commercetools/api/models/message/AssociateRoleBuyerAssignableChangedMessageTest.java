
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleBuyerAssignableChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleBuyerAssignableChangedMessageBuilder builder) {
        AssociateRoleBuyerAssignableChangedMessage associateRoleBuyerAssignableChangedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(associateRoleBuyerAssignableChangedMessage)
                .isInstanceOf(AssociateRoleBuyerAssignableChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "buyerAssignable",
                AssociateRoleBuyerAssignableChangedMessage.builder().buyerAssignable(true) } };
    }

    @Test
    public void buyerAssignable() {
        AssociateRoleBuyerAssignableChangedMessage value = AssociateRoleBuyerAssignableChangedMessage.of();
        value.setBuyerAssignable(true);
        Assertions.assertThat(value.getBuyerAssignable()).isEqualTo(true);
    }
}
