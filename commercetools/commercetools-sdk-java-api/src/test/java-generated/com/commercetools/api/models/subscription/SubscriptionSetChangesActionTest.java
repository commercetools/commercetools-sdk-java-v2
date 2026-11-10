
package com.commercetools.api.models.subscription;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubscriptionSetChangesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SubscriptionSetChangesActionBuilder builder) {
        SubscriptionSetChangesAction subscriptionSetChangesAction = builder.buildUnchecked();
        Assertions.assertThat(subscriptionSetChangesAction).isInstanceOf(SubscriptionSetChangesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "changes",
                SubscriptionSetChangesAction.builder()
                        .changes(Collections.singletonList(
                            new com.commercetools.api.models.subscription.ChangeSubscriptionImpl())) } };
    }

    @Test
    public void changes() {
        SubscriptionSetChangesAction value = SubscriptionSetChangesAction.of();
        value.setChanges(
            Collections.singletonList(new com.commercetools.api.models.subscription.ChangeSubscriptionImpl()));
        Assertions.assertThat(value.getChanges())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.ChangeSubscriptionImpl()));
    }
}
