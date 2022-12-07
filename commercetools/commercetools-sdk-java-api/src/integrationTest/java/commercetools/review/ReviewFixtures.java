
package commercetools.review;

import static commercetools.channel.ChannelFixtures.withChannel;
import static commercetools.customer.CustomerFixtures.*;
import static commercetools.state.StateFixtures.*;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.review.ReviewDraftBuilder;
import com.commercetools.api.models.state.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class ReviewFixtures {

    public static void withChannelReview(final Consumer<Review> consumer) {
        withChannel(channel -> withState(
            StateDraftBuilder.of().type(StateTypeEnum.REVIEW_STATE).key(CommercetoolsTestUtils.randomKey()).build(),
            state -> withCustomer(customer -> {
                Review review = createReview(customer, state, channel);
                try {
                    consumer.accept(review);
                }
                finally {
                    deleteReview(review.getId(), review.getVersion());
                }
            })));
    }

    public static void withUpdateableChannelReview(final UnaryOperator<Review> operator) {
        withChannel(channel -> withState(
            StateDraftBuilder.of().type(StateTypeEnum.REVIEW_STATE).key(CommercetoolsTestUtils.randomKey()).build(),
            state -> withCustomer(customer -> {
                Review review = createReview(customer, state, channel);
                try {
                    review = operator.apply(review);
                }
                finally {
                    deleteReview(review.getId(), review.getVersion());
                }
            })));
    }

    public static void withReview(final Consumer<Review> consumer) {
        withState(
            StateDraftBuilder.of().type(StateTypeEnum.REVIEW_STATE).key(CommercetoolsTestUtils.randomKey()).build(),
            state -> withCustomer(customer -> {
                Review review = createReview(customer, state, null);
                try {
                    consumer.accept(review);
                }
                finally {
                    deleteReview(review.getId(), review.getVersion());
                }
            }));
    }

    public static void withUpdateableReview(final UnaryOperator<Review> operator) {
        withState(
            StateDraftBuilder.of().type(StateTypeEnum.REVIEW_STATE).key(CommercetoolsTestUtils.randomKey()).build(),
            state -> withCustomer(customer -> {
                Review review = createReview(customer, state, null);
                try {
                    review = operator.apply(review);
                }
                finally {
                    deleteReview(review.getId(), review.getVersion());
                }
            }));
    }

    public static Review createReview(Customer customer, State state, Channel channel) {

        ReviewDraftBuilder reviewDraft = ReviewDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .uniquenessValue(UUID.randomUUID().toString())
                .locale("de")
                .authorName(CommercetoolsTestUtils.randomString())
                .title("review-title-1")
                .text(CommercetoolsTestUtils.randomString())
                .state(b -> b.id(state.getId()))
                .rating(50)
                .customer(b -> b.id(customer.getId()));
        if (channel != null) {
            reviewDraft.target(channel.toResourceIdentifier());
        }

        Review review = CommercetoolsTestUtils.getProjectApiRoot()
                .reviews()
                .post(reviewDraft.build())
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(review);
        Assertions.assertEquals(reviewDraft.getKey(), review.getKey());

        return review;
    }

    public static Review deleteReview(final String id, final Long version) {
        Review deletedReview = CommercetoolsTestUtils.getProjectApiRoot()
                .reviews()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(deletedReview);
        Assertions.assertEquals(deletedReview.getId(), id);

        return deletedReview;
    }

}
