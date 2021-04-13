
package commercetools.subscription;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.subscription.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class SubscriptionFixtures {

    public static void withSubscription(final Consumer<Subscription> consumer) {
        Subscription subscription = createSubscription();
        consumer.accept(subscription);
        deleteSubscription(subscription.getId(), subscription.getVersion());
    }

    public static void withUpdateableSubscription(final UnaryOperator<Subscription> operator) {
        Subscription subscription = createSubscription();
        subscription = operator.apply(subscription);
        deleteSubscription(subscription.getId(), subscription.getVersion());
    }

    public static Subscription createSubscription() {
        SubscriptionDraft subscriptionDraft = SubscriptionDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                //TODO connection string
                .destination(AzureServiceBusDestinationBuilder.of().connectionString("").build())
                .messages(Arrays.asList(MessageSubscriptionBuilder.of().resourceTypeId("review").build()))
                .build();

        Subscription subscription = CommercetoolsTestUtils.getProjectRoot()
                .subscriptions()
                .post(subscriptionDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(subscription);

        return subscription;
    }

    public static Subscription deleteSubscription(final String id, final Long version) {
        Subscription subscription = CommercetoolsTestUtils.getProjectRoot()
                .subscriptions()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(subscription);

        return subscription;
    }

}
