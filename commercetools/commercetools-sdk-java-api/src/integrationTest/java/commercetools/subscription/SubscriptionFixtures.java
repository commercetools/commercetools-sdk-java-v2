
package commercetools.subscription;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.subscription.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class SubscriptionFixtures {

    public static void withSubscription(final Consumer<Subscription> consumer) {
        Subscription subscription = createSubscription();
        try {
            consumer.accept(subscription);
        }
        finally {
            deleteSubscription(subscription.getId(), subscription.getVersion());
        }
    }

    public static void withUpdateableSubscription(final UnaryOperator<Subscription> operator) {
        Subscription subscription = createSubscription();
        try {
            subscription = operator.apply(subscription);
        }
        finally {
            deleteSubscription(subscription.getId(), subscription.getVersion());
        }
    }

    public static Subscription createSubscription() {
        SubscriptionDraft subscriptionDraft = SubscriptionDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                //TODO connection string
                .destination(AzureServiceBusDestinationBuilder.of().connectionString("").build())
                .messages(Arrays.asList(MessageSubscriptionBuilder.of().resourceTypeId("review").build()))
                .build();

        Subscription subscription = CommercetoolsTestUtils.getProjectApiRoot()
                .subscriptions()
                .post(subscriptionDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(subscription);

        return subscription;
    }

    public static Subscription deleteSubscription(final String id, final Long version) {
        Subscription subscription = CommercetoolsTestUtils.getProjectApiRoot()
                .subscriptions()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(subscription);

        return subscription;
    }

}
