
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeSubscriptionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeSubscriptionBuilder builder) {
        ChangeSubscription changeSubscription = builder.buildUnchecked();
        Assertions.assertThat(changeSubscription).isInstanceOf(ChangeSubscription.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resourceTypeId",
                ChangeSubscription.builder()
                        .resourceTypeId(com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId
                                .findEnum("approval-flow")) } };
    }

    @Test
    public void resourceTypeId() {
        ChangeSubscription value = ChangeSubscription.of();
        value.setResourceTypeId(
            com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getResourceTypeId())
                .isEqualTo(com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId
                        .findEnum("approval-flow"));
    }
}
